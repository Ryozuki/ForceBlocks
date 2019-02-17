package xyz.ryozuki.forceblocks.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xyz.ryozuki.forceblocks.ForceBlocks;
import xyz.ryozuki.forceblocks.init.ForceBlocksBlocks;

public class ForceBlocksTab extends CreativeTabs {
    public ForceBlocksTab(String label) {
        super(ForceBlocks.MODID + "." + label);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(ForceBlocksBlocks.SPEED_JUMP_BLOCK));
    }
}
