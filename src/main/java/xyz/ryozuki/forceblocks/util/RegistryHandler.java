package xyz.ryozuki.forceblocks.util;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import xyz.ryozuki.forceblocks.block.JumpBlock;
import xyz.ryozuki.forceblocks.block.SpeedBlock;
import xyz.ryozuki.forceblocks.block.SpeedJumpBlock;
import xyz.ryozuki.forceblocks.init.ForceBlocksBlocks;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final Item[] itemBlocks = {
                new ItemBlock(ForceBlocksBlocks.SPEED_JUMP_BLOCK)
                        .setRegistryName(ForceBlocksBlocks.SPEED_JUMP_BLOCK.getRegistryName()),
                new ItemBlock(ForceBlocksBlocks.SPEED_BLOCK)
                        .setRegistryName(ForceBlocksBlocks.SPEED_BLOCK.getRegistryName()),
                new ItemBlock(ForceBlocksBlocks.JUMP_BLOCK)
                        .setRegistryName(ForceBlocksBlocks.JUMP_BLOCK.getRegistryName())
        };
        event.getRegistry().registerAll(itemBlocks);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        final Block[] blocks = {
                new SpeedJumpBlock(Material.ROCK, "speedJumpBlock", "speed_jump_block"),
                new JumpBlock(Material.ROCK, "jumpBlock", "jump_block"),
                new SpeedBlock(Material.ROCK, "speedBlock", "speed_block")
        };
        event.getRegistry().registerAll(blocks);
    }
}
