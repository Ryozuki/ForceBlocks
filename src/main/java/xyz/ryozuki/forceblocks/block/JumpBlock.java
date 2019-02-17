package xyz.ryozuki.forceblocks.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class JumpBlock extends BlockBasic {
    public JumpBlock(Material material, String unlocalizedName, String registryName) {
        super(material, unlocalizedName, registryName);
    }

    public JumpBlock(Material material, SoundType sound, String unlocalizedName, String registryName) {
        super(material, sound, unlocalizedName, registryName);
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        entityIn.addVelocity(0, 1.25, 0);
    }
}
