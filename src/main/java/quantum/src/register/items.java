package quantum.src.register;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import quantum.src.items.singularities.singularityBasic;

public class items {
	//�������� ���������
	public static Item singularityBasic;
	
	public static void register()
	{
		//�������������
		singularityBasic = new singularityBasic().setUnlocalizedName("singularityBasic");
		
		//�����������
		GameRegistry.registerItem(singularityBasic, "singularityBasic");
	}
}
