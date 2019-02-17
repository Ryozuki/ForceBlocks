package xyz.ryozuki.forceblocks.util;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import xyz.ryozuki.forceblocks.init.ForceBlocksBlocks;

import java.util.Objects;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(Item.getItemFromBlock(ForceBlocksBlocks.SPEED_JUMP_BLOCK));
        registerModel(Item.getItemFromBlock(ForceBlocksBlocks.JUMP_BLOCK));
        registerModel(Item.getItemFromBlock(ForceBlocksBlocks.SPEED_BLOCK));
    }

    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }
}
