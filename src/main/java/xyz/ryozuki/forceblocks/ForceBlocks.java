package xyz.ryozuki.forceblocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import xyz.ryozuki.forceblocks.proxy.IProxy;
import xyz.ryozuki.forceblocks.tabs.ForceBlocksTab;

@Mod(modid = ForceBlocks.MODID, name = ForceBlocks.NAME, version = ForceBlocks.VERSION,
        acceptedMinecraftVersions = ForceBlocks.MC_VERSION)
public class ForceBlocks {
    public static final String MODID = "forceblocks";
    public static final String NAME = "Force Blocks";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12.2]";
    public static final String CLIENT_PROXY = "xyz.ryozuki.forceblocks.proxy.ClientProxy";
    public static final String SERVER_PROXY = "xyz.ryozuki.forceblocks.proxy.ServerProxy";

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static IProxy proxy;

    public static Logger logger;

    public static final CreativeTabs FORCEBLOCKS_TAB = new ForceBlocksTab("tabForceBlocks");

    public static String getUnlocalizedName(String name) {
        return ForceBlocks.MODID + "." + name;
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
