package xyz.ryozuki.forceblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import xyz.ryozuki.forceblocks.ForceBlocks;

public class BlockBasic extends Block {
    public BlockBasic(Material material, String unlocalizedName, String registryName) {
        this(material, SoundType.STONE, unlocalizedName, registryName);
    }

    public BlockBasic(Material material, SoundType sound, String unlocalizedName, String registryName) {
        super(material);
        setUnlocalizedName(ForceBlocks.getUnlocalizedName(unlocalizedName));
        setRegistryName(registryName);
        setCreativeTab(ForceBlocks.FORCEBLOCKS_TAB);
        setSoundType(sound);
    }
}
