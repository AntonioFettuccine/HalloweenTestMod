package halloween;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HalloweenItemCore extends Item {
    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
    {
    	System.out.println("Happy Halloween!!");
    	 if (entity != null && entity instanceof EntityVillager)
         {
         	if (stack.getItemDamage() == 0)
         	{
         		ItemStack dropItem = new ItemStack(Items.emerald);
         		EntityItem drop = entity.entityDropItem(dropItem, 2.0F);
         		drop.motionY += itemRand.nextFloat() * 0.05F;
                 drop.motionX += (itemRand.nextFloat() - itemRand.nextFloat()) * 0.1F;
                 drop.motionZ += (itemRand.nextFloat() - itemRand.nextFloat()) * 0.1F;

                 if (!player.capabilities.isCreativeMode && --stack.stackSize <= 0)
                 {
                     player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                 }
                 player.worldObj.playSoundAtEntity(player, "random.pop", 0.4F, 1.8F);
                 entity.setDead();
                 return true;
         	}
         }
        return false;
    }
 }