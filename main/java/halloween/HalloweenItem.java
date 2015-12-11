package halloween;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid="HalloweenItemCore", name="Halloween Item", version="1.0")

public class HalloweenItem
{
	public static Item katsuage;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

		katsuage = new HalloweenItemCore()
		.setCreativeTab(CreativeTabs.tabTools)
		.setUnlocalizedName("Trick or trade")
		.setTextureName("samplemod:sample_item")
		.setMaxStackSize(16);
		GameRegistry.registerItem(katsuage, "Trick or trade");

        GameRegistry.addRecipe(new ItemStack(HalloweenItem.katsuage),
                "XXX",
                "XYX",
                "XXX",
                'X',Blocks.pumpkin,
                'Y',Items.emerald
        );



	}
}