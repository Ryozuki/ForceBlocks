package xyz.ryozuki.forceblocks.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class SpeedBlock extends BlockBasic {
    public SpeedBlock(Material material, String unlocalizedName, String registryName) {
        super(material, unlocalizedName, registryName);
    }

    public SpeedBlock(Material material, SoundType sound, String unlocalizedName, String registryName) {
        super(material, sound, unlocalizedName, registryName);
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        Vec3d forward = entityIn.getForward();
        entityIn.addVelocity(forward.x * 1.50, 0, forward.z * 1.50);
    }
}
