package quantum.src.items.singularities;

import net.minecraft.item.Item;
import quantum.src.main.info;
import quantum.src.main.mainclass;

public class singularityGravyUnstable extends Item
{
	public singularityGravyUnstable()
	{
        super();
        this.setCreativeTab(mainclass.tabQuantumMain);
        this.setTextureName(info.ID + ":singularityGravyUnstable");
	}
}