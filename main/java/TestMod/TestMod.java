package TestMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = TestMod.MODID, version = TestMod.VERSION)
public class TestMod
{
    public static final String MODID = "TestMod";
    public static final String VERSION = "1.0";
    
    @Instance(value = "GenericModID")
    public static TestMod instance;
    
    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="TestMod.Client.ClientProxy", serverSide="TestMod.CommonProxy")
    public static CommonProxy proxy;


    
    
    
    public static CreativeTabs MoCrates = new CreativeTabs("MoCrates") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(TestMod.Block_Crate);
        }
    };
    
    
    public static Block Block_Crate;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	
    	Block_Crate = new Block_Crate(Material.rock);
    	
    	Block_Crate.setCreativeTab(TestMod.MoCrates);
    	
    	GameRegistry.registerBlock(Block_Crate, "Block_Crate");
    	
    	
    }
    
    
    
    
    
  //This Is Initialization
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		
    }
    //This Is Post-Initialization
    @EventHandler
    public void init(FMLPostInitializationEvent event)
    {
		
    }
    
    
}
