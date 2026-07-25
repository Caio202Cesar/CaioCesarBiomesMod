package com.caiocesarmods.caiocesarbiomes.entity.goals;

import com.caiocesarmods.caiocesarbiomes.block.ModWood;
import net.minecraft.block.Block;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

import java.util.EnumSet;

public class AvoidCamphorGoal extends Goal {

    protected final CreatureEntity mob;
    protected final double walkSpeedModifier;
    protected final double sprintSpeedModifier;
    protected final PathNavigator navigation;

    protected Path path;
    protected BlockPos camphorPos;

    private final int searchRadius;
    private final int verticalRadius;


    public AvoidCamphorGoal(CreatureEntity mob,
                            double walkSpeedModifier,
                            double sprintSpeedModifier) {

        this(mob, walkSpeedModifier, sprintSpeedModifier, 6, 2);
    }

    public AvoidCamphorGoal(CreatureEntity mob,
                            double walkSpeedModifier,
                            double sprintSpeedModifier,
                            int searchRadius,
                            int verticalRadius) {

        this.mob = mob;
        this.walkSpeedModifier = walkSpeedModifier;
        this.sprintSpeedModifier = sprintSpeedModifier;
        this.searchRadius = searchRadius;
        this.verticalRadius = verticalRadius;

        this.navigation = mob.getNavigator();

        this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
    }

    @Override
    public boolean shouldExecute() {
        camphorPos = findNearestCamphor();

        if (camphorPos == null)
            return false;

        Vector3d target = RandomPositionGenerator.func_223548_b(
                mob,
                16,
                7,
                Vector3d.atCenterOf(camphorPos));

        if (target == null)
            return false;

        // Make sure we're actually moving farther away.

        double currentDistance = mob.position().distanceToSqr(Vector3d.atCenterOf(camphorPos));
        double targetDistance = target.distanceToSqr(Vector3d.atCenterOf(camphorPos));

        if (targetDistance <= currentDistance)
            return false;

        path = navigation.pathfind(target.x, target.y, target.z, 0);

        return path != null;
    }

    @Override
    public void tick() {

        if (camphorPos == null)
            return;

        double distance = mob.position().distanceToSqr(Vector3d.atCenterOf(camphorPos));

        if (distance < 36.0D) {
            navigation.setSpeedModifier(sprintSpeedModifier);
        } else {
            navigation.setSpeedModifier(walkSpeedModifier);
        }
    }

    protected BlockPos findNearestCamphor() {

        BlockPos center = mob.blockPosition();

        BlockPos.Mutable mutable = new BlockPos.Mutable();

        BlockPos nearest = null;
        double nearestDistance = Double.MAX_VALUE;

        for (int x = -searchRadius; x <= searchRadius; x++) {

            for (int y = -verticalRadius; y <= verticalRadius; y++) {

                for (int z = -searchRadius; z <= searchRadius; z++) {

                    mutable.set(
                            center.getX() + x,
                            center.getY() + y,
                            center.getZ() + z);

                    Block block = mob.level.getBlockState(mutable).getBlock();

                    if (isCamphorBlock(block)) {

                        double dist = mutable.distSqr(center);

                        if (dist < nearestDistance) {

                            nearestDistance = dist;
                            nearest = mutable.immutable();
                        }
                    }
                }
            }
        }

        return nearest;
    }

    protected boolean isCamphorBlock(Block block) {

        return block == ModWood.CAMPHOR_PLANKS.get();
    }
}