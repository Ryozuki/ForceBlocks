package xyz.ryozuki.forceblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistryEntry;
import xyz.ryozuki.forceblocks.block.ForceBlock;
import xyz.ryozuki.forceblocks.init.ModBlocks;
import xyz.ryozuki.forceblocks.init.ModItemGroups;

@Mod.EventBusSubscriber(modid = ForceBlocks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                setup(new BlockItem(ModBlocks.SPEED_JUMP_BLOCK, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)),
                        ModBlocks.SPEED_JUMP_BLOCK.getRegistryName()),
                setup(new BlockItem(ModBlocks.JUMP_BLOCK, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)),
                        ModBlocks.JUMP_BLOCK.getRegistryName()),
                setup(new BlockItem(ModBlocks.SPEED_BLOCK, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)),
                        ModBlocks.SPEED_BLOCK.getRegistryName())
        );
    }


    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                setup(new ForceBlock(ForceBlock.ForceBlockType.SPEED_JUMP), "speed_jump_block"),
                setup(new ForceBlock(ForceBlock.ForceBlockType.JUMP), "jump_block"),
                setup(new ForceBlock(ForceBlock.ForceBlockType.SPEED), "speed_block")
        );
    }


    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(ForceBlocks.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }

}
