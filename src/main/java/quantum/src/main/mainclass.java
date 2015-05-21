package quantum.src.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import quantum.src.register.blocks;
import quantum.src.register.items;
import quantum.src.tabs.tabQuantumMain;

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
