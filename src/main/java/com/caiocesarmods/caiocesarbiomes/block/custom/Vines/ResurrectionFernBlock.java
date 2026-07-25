package com.caiocesarmods.caiocesarbiomes.block.custom.Vines;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.IForgeShearable;
import net.minecraftforge.common.PlantType;

public class ResurrectionFernBlock extends Block implements IForgeShearable {
    public static final BooleanProperty NORTH = BlockStateProperties.NORTH;
    public static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;
    public static final BooleanProperty EAST  = BlockStateProperties.EAST;
    public static final BooleanProperty WEST  = BlockStateProperties.WEST;

    public ResurrectionFernBlock(Properties properties) {
        super(properties);

        this.setDefaultState(this.stateContainer.getBaseState()
                .with(NORTH, false)
                .with(SOUTH, false)
                .with(EAST, false)
                .with(WEST, false));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(NORTH, SOUTH, EAST, WEST);
    }

    @Override
    public BlockState updatePostPlacement(BlockState state,
                                          Direction facing,
                                          BlockState facingState,
                                          IWorld world,
                                          BlockPos currentPos,
                                          BlockPos facingPos) {

        if (!isValidPosition(state, world, currentPos)) {
            return Blocks.AIR.getDefaultState();
        }

        return state;
    }

    @Override
    public boolean isValidPosition(BlockState state,
                                   IWorldReader world,
                                   BlockPos pos) {

        if (state.get(NORTH) &&
                canAttach(world.getBlockState(pos.north())))
            return true;

        if (state.get(SOUTH) &&
                canAttach(world.getBlockState(pos.south())))
            return true;

        if (state.get(EAST) &&
                canAttach(world.getBlockState(pos.east())))
            return true;

        if (state.get(WEST) &&
                canAttach(world.getBlockState(pos.west())))
            return true;

        return false;
    }

    private boolean canAttach(BlockState state) {
        return state.isIn(BlockTags.LOGS);
    }

    private static final VoxelShape NORTH_SHAPE =
            Block.makeCuboidShape(0, 0, 15, 16, 16, 16);

    private static final VoxelShape SOUTH_SHAPE =
            Block.makeCuboidShape(0, 0, 0, 16, 16, 1);

    private static final VoxelShape EAST_SHAPE =
            Block.makeCuboidShape(0, 0, 0, 1, 16, 16);

    private static final VoxelShape WEST_SHAPE =
            Block.makeCuboidShape(15, 0, 0, 16, 16, 16);

    @Override
    public VoxelShape getShape(BlockState state,
                               IBlockReader world,
                               BlockPos pos,
                               ISelectionContext context) {

        VoxelShape shape = VoxelShapes.empty();

        if (state.get(NORTH))
            shape = VoxelShapes.or(shape, NORTH_SHAPE);

        if (state.get(SOUTH))
            shape = VoxelShapes.or(shape, SOUTH_SHAPE);

        if (state.get(EAST))
            shape = VoxelShapes.or(shape, EAST_SHAPE);

        if (state.get(WEST))
            shape = VoxelShapes.or(shape, WEST_SHAPE);

        return shape;
    }

    @Override
    public boolean isReplaceable(BlockState state, BlockItemUseContext useContext) {
        ItemStack stack = useContext.getItem();

        // Only allow replacement if the player is holding another resurrection fern
        if (!stack.getItem().equals(this.asItem())) {
            return false;
        }

        Direction face = useContext.getFace();

        switch (face) {
            case NORTH:
                return !state.get(SOUTH);

            case SOUTH:
                return !state.get(NORTH);

            case EAST:
                return !state.get(WEST);

            case WEST:
                return !state.get(EAST);

            default:
                return false;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockPos pos = context.getPos();
        BlockState existing = context.getWorld().getBlockState(pos);

        if (existing.getBlock() == this) {
            Direction face = context.getFace();

            switch (face) {
                case NORTH:
                    return existing.with(SOUTH, true);

                case SOUTH:
                    return existing.with(NORTH, true);

                case EAST:
                    return existing.with(WEST, true);

                case WEST:
                    return existing.with(EAST, true);

                default:
                    return existing;
            }
        }

        BlockState state = this.getDefaultState();

        switch (context.getFace()) {
            case NORTH:
                return state.with(SOUTH, true);

            case SOUTH:
                return state.with(NORTH, true);

            case EAST:
                return state.with(WEST, true);

            case WEST:
                return state.with(EAST, true);

            default:
                return null;
        }
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 90;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 85;
    }

    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.CAVE;
    }
}


