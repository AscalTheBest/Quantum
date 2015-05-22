package quantum.src.main;

import net.minecraft.creativetab.CreativeTabs;
import quantum.src.register.blocks;
import quantum.src.register.items;
import quantum.src.tabs.tabQuantumMain;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = info.ID, version = info.V, name = info.N)
public class mainclass {
	public static CreativeTabs tabQuantumMain = new tabQuantumMain(CreativeTabs.getNextID(),"Quantum");
	
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
        blocks.register();
        items.register();
    }
}
