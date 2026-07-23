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

                for (var insn = instructions.getFirst();
                     insn != null;
                     insn = insn.getNext()) {

                    if (insn.getOpcode() == Opcodes.GETSTATIC
                        && insn.owner == "net/minecraft/world/gen/layer/AddBambooForestLayer"
                        && insn.name == "INSTANCE") {

                        print("[CaioCesarBiomes] Found AddBambooForestLayer!");

                        break;
                    }
                }

                return method;
            }
        }
    };
}