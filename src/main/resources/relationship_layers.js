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

                // Have we already found the EdgeBiomeLayer output?
                var foundEdgeBiomeLayer = false;

                for (var insn = instructions.getFirst();
                     insn != null;
                     insn = insn.getNext()) {

                    // Look for:
                    // EdgeBiomeLayer.INSTANCE.apply(...)
                    if (!foundEdgeBiomeLayer &&
                        insn.getOpcode() == Opcodes.INVOKEVIRTUAL &&
                        insn.owner == "net/minecraft/world/gen/layer/EdgeBiomeLayer" &&
                        insn.name == "apply") {

                        foundEdgeBiomeLayer = true;
                        continue;
                    }

                    // The resulting IAreaFactory is immediately stored in local 7.
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

                        // LongFunction (parameter #3)
                        inject.add(new VarInsnNode(
                            Opcodes.ALOAD,
                            3
                        ));

                        // Seed used by RelationshipLayer
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

                        // Current biome layer
                        inject.add(new VarInsnNode(
                            Opcodes.ALOAD,
                            7
                        ));

                        // IAreaTransformer1.apply(...)
                        inject.add(new MethodInsnNode(
                            Opcodes.INVOKEINTERFACE,
                            "net/minecraft/world/gen/layer/traits/IAreaTransformer1",
                            "apply",
                            "(Lnet/minecraft/world/gen/IExtendedNoiseRandom;Lnet/minecraft/world/gen/area/IAreaFactory;)Lnet/minecraft/world/gen/area/IAreaFactory;",
                            true
                        ));

                        // Replace local 7 with the transformed layer
                        inject.add(new VarInsnNode(
                            Opcodes.ASTORE,
                            7
                        ));

                        instructions.insert(insn, inject);

                        print("[CaioCesarBiomes] Injected RelationshipLayer after EdgeBiomeLayer.");

                        break;
                    }
                }

                return method;
            }
        }
    };
}