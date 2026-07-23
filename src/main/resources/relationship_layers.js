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

                var foundEdgeBiomeLayer = false;

                for (var insn = instructions.getFirst();
                     insn != null;
                     insn = insn.getNext()) {

                    // Debug: print every method invocation in setupOverworldLayer
                    if (insn.getOpcode() == Opcodes.INVOKEVIRTUAL
                        || insn.getOpcode() == Opcodes.INVOKEINTERFACE
                        || insn.getOpcode() == Opcodes.INVOKESTATIC
                        || insn.getOpcode() == Opcodes.INVOKESPECIAL) {

                        print(
                            "[CCB] "
                            + insn.getOpcode()
                            + " "
                            + insn.owner
                            + "."
                            + insn.name
                            + " "
                            + insn.desc
                        );
                    }

                    // Look for EdgeBiomeLayer.apply(...)
                    if (!foundEdgeBiomeLayer
                        && insn.getOpcode() == Opcodes.INVOKEVIRTUAL
                        && insn.owner == "net/minecraft/world/gen/layer/EdgeBiomeLayer"
                        && insn.name == "apply") {

                        foundEdgeBiomeLayer = true;
                        continue;
                    }

                    // First ASTORE 7 after EdgeBiomeLayer
                    if (foundEdgeBiomeLayer
                        && insn.getOpcode() == Opcodes.ASTORE
                        && insn.var == 7) {

                        print("[CaioCesarBiomes] Found EdgeBiomeLayer output.");

                        var inject = new InsnList();

                        inject.add(new FieldInsnNode(
                            Opcodes.GETSTATIC,
                            "com/caiocesarmods/caiocesarbiomes/World/worldgen/Biomes/Util/Layers/RelationshipLayer",
                            "INSTANCE",
                            "Lcom/caiocesarmods/caiocesarbiomes/World/worldgen/Biomes/Util/Layers/RelationshipLayer;"
                        ));

                        inject.add(new VarInsnNode(
                            Opcodes.ALOAD,
                            3
                        ));

                        inject.add(new LdcInsnNode(
                            java.lang.Long.valueOf(201)
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

                        inject.add(new VarInsnNode(
                            Opcodes.ALOAD,
                            7
                        ));

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

                        print("[CaioCesarBiomes] Injected RelationshipLayer after EdgeBiomeLayer.");

                        break;
                    }
                }

                return method;
            }
        }
    };
}