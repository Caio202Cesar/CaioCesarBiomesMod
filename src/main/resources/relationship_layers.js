function initializeCoreMod() {
    return {
        "RelationshipLayers": {
            target: {
                type: "METHOD",
                class: "net.minecraft.world.gen.layer.LayerUtil",
                methodName: "setupOverworldLayer",
                methodDesc: "(ZIILjava/util/function/LongFunction;)Lnet/minecraft/world/gen/area/IAreaFactory;"
            },

            transformer: function(method) {

                var instructions = method.instructions;

                var foundBiomeEdgeLayer = false;

                for (var insn = instructions.getFirst();
                     insn != null;
                     insn = insn.getNext()) {

                    // Find EdgeBiomeLayer.apply(...)
                    if (!foundEdgeBiomeLayer &&
                        insn.getOpcode() == Opcodes.INVOKEVIRTUAL &&
                        insn.owner == "net/minecraft/world/gen/layer/EdgeBiomeLayer" &&
                        insn.name == "apply") {

                        foundEdgeBiomeLayer = true;
                        continue;
                    }

                    // Find the ASTORE 7 immediately afterwards
                    if (foundEdgeBiomeLayer &&
                        insn.getOpcode() == Opcodes.ASTORE &&
                        insn.var == 7) {

                        print("[CaioCesarBiomes] Found EdgeBiomeLayer output.");

                        var inject = new InsnList();

                        // RelationshipLayer.INSTANCE
                        inject.add(new FieldInsnNode(
                            Opcodes.GETSTATIC,
                            "com/caiocesarmods/caiocesarbiomes/World/worldgen/Biomes/Util/Layers/RelationshipLayer",
                            "INSTANCE",
                            "Lcom/caiocesarmods/caiocesarbiomes/World/worldgen/Biomes/Util/Layers/RelationshipLayer;"
                        ));

                        // LongFunction
                        inject.add(new VarInsnNode(
                            Opcodes.ALOAD,
                            3
                        ));

                        // Seed
                        inject.add(new LdcInsnNode(
                            java.lang.Long.valueOf(201L)
                        ));

                        inject.add(new MethodInsnNode(
                            Opcodes.INVOKEINTERFACE,
                            "java/util/function/LongFunction",
                            "apply",
                            "(J)Ljava/lang/Object;",
                            true
                        ));

                        inject.add(new TypeInsnNode(
                            Opcodes.CHECKCAST,
                            "net/minecraft/world/gen/IExtendedNoiseRandom"
                        ));

                        // Current biome factory
                        inject.add(new VarInsnNode(
                            Opcodes.ALOAD,
                            7
                        ));

                        // RelationshipLayer.apply(...)
                        inject.add(new MethodInsnNode(
                            Opcodes.INVOKEINTERFACE,
                            "net/minecraft/world/gen/layer/traits/IAreaTransformer1",
                            "apply",
                            "(Lnet/minecraft/world/gen/IExtendedNoiseRandom;Lnet/minecraft/world/gen/area/IAreaFactory;)Lnet/minecraft/world/gen/area/IAreaFactory;",
                            true
                        ));

                        inject.add(new VarInsnNode(
                            Opcodes.ASTORE,
                            7
                        ));

                        instructions.insert(insn, inject);

                        print("[CaioCesarBiomes] Injected RelationshipLayer.");

                        break;
                    }
                }

                return method;
            }
        }
    };
}