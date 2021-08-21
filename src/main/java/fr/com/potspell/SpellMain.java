package fr.com.potspell;

import fr.com.potspell.proxy.CommonProxy;
import fr.com.potspell.utils.References;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name =References.NAME , version =References.VERSION )

public class SpellMain {

    @Mod.Instance(References.MODID)
    public static SpellMain instance;

    @SidedProxy(clientSide = References.CP,serverSide = References.SP)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){
        proxy.postInit();
    }
}
