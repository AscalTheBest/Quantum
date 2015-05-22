package quantum.src.register;

import net.minecraft.item.Item;
import quantum.src.items.singularities.singularityBasic;
import quantum.src.items.singularities.singularityBasicUnstable;
import quantum.src.items.singularities.singularityGravy;
import quantum.src.items.singularities.singularityGravyUnstable;
import quantum.src.items.singularities.singularityQuant;
import quantum.src.items.singularities.singularityQuantUnstable;
import cpw.mods.fml.common.registry.GameRegistry;

public class items {
	//Создание предметов
	public static Item singularityBasic;
	public static Item singularityBasicUnstable;
	public static Item singularityGravy;
	public static Item singularityGravyUnstable;
	public static Item singularityQuant;
	public static Item singularityQuantUnstable;
	
	public static void register()
	{
		//Инициализация
		singularityBasic = new singularityBasic().setUnlocalizedName("singularityBasic");
		singularityBasicUnstable = new singularityBasicUnstable().setUnlocalizedName("singularityBasicUnstable");
		singularityGravy = new singularityGravy().setUnlocalizedName("singularityGravy");
		singularityGravyUnstable = new singularityGravyUnstable().setUnlocalizedName("singularityGravyUnstable");
		singularityQuant = new singularityQuant().setUnlocalizedName("singularityQuant");
		singularityQuantUnstable = new singularityQuantUnstable().setUnlocalizedName("singularityQuantUnstable");
		
		//Регистрация
		GameRegistry.registerItem(singularityBasic, "singularityBasic");
		GameRegistry.registerItem(singularityBasicUnstable, "singularityBasicUnstable");
		GameRegistry.registerItem(singularityGravy, "singularityGravy");
		GameRegistry.registerItem(singularityGravyUnstable, "singularityGravyUnstable");
		GameRegistry.registerItem(singularityQuant, "singularityQuant");
		GameRegistry.registerItem(singularityQuantUnstable, "singularityQuantUnstable");
	}
}
