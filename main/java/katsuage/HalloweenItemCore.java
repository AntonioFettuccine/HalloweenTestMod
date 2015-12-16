package katsuage;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid="halloweenItem", name="KatsuageMod", version="1.0")
public class HalloweenItemCore
{
	public static Item katsuage;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

		katsuage = new HalloweenItem()		//インスタンス生成
		.setCreativeTab(CreativeTabs.tabTools)		//アイテムの内容
		.setUnlocalizedName("Trick or trade")
		.setTextureName("antoniofettuccine:Test")
		.setMaxStackSize(32);
		GameRegistry.registerItem(katsuage, "Trick or trade");

        GameRegistry.addRecipe(new ItemStack(HalloweenItemCore.katsuage),		//レシピ
                " Y ",
                " XZ",
                'X',Items.stick,
                'Y',Items.iron_ingot,
                'Z',Items.emerald
        );



	}
}