package quantum.src.items.singularities;

import net.minecraft.item.Item;
import quantum.src.main.info;
import quantum.src.main.mainclass;

public class singularityGravy extends Item
{
	public singularityGravy()
	{
        super();
        this.setCreativeTab(mainclass.tabQuantumMain);
        this.setTextureName(info.ID + ":simgularityGravy");
	}
}