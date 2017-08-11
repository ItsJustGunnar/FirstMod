package itsjustgunnar.firstmod;

import itsjustgunnar.firstmod.itsjustgunnar.firstmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.Mod_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MINECRAFT_VERSIONS )

public class FirstMod {
    @Mod.Instance
    public static FirstMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        System.out.println("Pre Init");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Init");
    }
    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
        System.out.println("Post Init");
    }
}
