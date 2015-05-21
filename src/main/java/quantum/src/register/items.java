package quantum.src.register;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import quantum.src.items.singularities.singularityBasic;

public class items {
	//Создание предметов
	public static Item singularityBasic;
	
	public static void register()
	{
		//Инициализация
		singularityBasic = new singularityBasic().setUnlocalizedName("singularityBasic");
		
		//Регистрация
		GameRegistry.registerItem(singularityBasic, "singularityBasic");
	}
}
