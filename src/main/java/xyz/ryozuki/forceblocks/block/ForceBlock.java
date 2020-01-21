package xyz.ryozuki.forceblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ForceBlock extends Block {
    public enum ForceBlockType {
        SPEED,
        JUMP,
        SPEED_JUMP
    }

    private ForceBlockType forceBlockType;

    public ForceBlock(ForceBlockType forceBlockType) {
        super(Block.Properties.create(Material.ROCK));
        this.forceBlockType = forceBlockType;
    }

    public ForceBlockType getForceBlockType() {
        return forceBlockType;
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        super.onEntityWalk(worldIn, pos, entityIn);
        Vec3d forward = entityIn.getForward();

        switch (forceBlockType) {
            case JUMP:
                entityIn.addVelocity(0, 1.25, 0);
                break;
            case SPEED:
                entityIn.addVelocity(forward.x * 1.5, 0, forward.z * 1.5);
                break;
            case SPEED_JUMP:
                entityIn.addVelocity(forward.x * 1.5, 0.75, forward.z * 1.5);
                break;
        }
    }
}
