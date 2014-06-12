package com.ironman;


import com.ironman.block.IMBlock;
import com.ironman.entity.IMEntityRegistry;
import com.ironman.item.IMCraftingRegistry;
import com.ironman.item.IMItemRegistryOld;
import com.ironman.world.IMWorldRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MODID, name = Constants.name, version = Constants.version)

public class IronMan{

    @SidedProxy(clientSide = "com.ironman.main.ClientProxy", serverSide = "com.ironman.main.ServerProxy")
    public static ServerProxy proxy;




    @Instance(Constants.MODID)
    public static IronMan modInstance;



    /**
     * Loads before
     * @param PreEvent
     */
    @EventHandler
    public static void PreLoad(FMLPreInitializationEvent PreEvent){
        IMItemRegistryOld.registerAll();
        IMBlock.mainclass();
        IMWorldRegistry.initialiseWorldGen();
        IMEntityRegistry.registerEntities();
        IMCraftingRegistry.addAll();


        proxy.registerRenderThings();

        proxy.registerTileEntities();

    }






    /**
     * Loads during
     * @param event
     */
    @EventHandler
    public static void load(FMLInitializationEvent event){
        proxy.registerNetworkStuff();
    }

    /*
     * Loads after
     * @param PostEvent
     */
    @EventHandler
    public static void PostLoad(FMLPostInitializationEvent PostEvent){
    }


}
