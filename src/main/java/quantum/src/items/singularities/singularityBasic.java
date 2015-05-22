package quantum.src.items.singularities;

import net.minecraft.item.Item;
import quantum.src.main.info;
import quantum.src.main.mainclass;

public class singularityBasic extends Item
{
	public singularityBasic()
	{
        super();
        this.setCreativeTab(mainclass.tabQuantumMain);
        this.setTextureName(info.ID + ":singularityBasic");
	}
}