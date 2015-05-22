package quantum.src.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class tabQuantumMain extends CreativeTabs {
	
	public tabQuantumMain(int position, String tabID)
	{
		super(position, tabID);
	}

	@SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(Blocks.brick_block);
    }

	public String getTranslatedTabLabel()
	{
		return "Quantum";
	}
}