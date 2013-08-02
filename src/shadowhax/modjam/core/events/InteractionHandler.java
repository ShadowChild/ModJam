package shadowhax.modjam.core.events;

import shadowhax.modjam.block.Blocks;
import shadowhax.modjam.item.Items;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;

public class InteractionHandler {

	@ForgeSubscribe
	public void interactEvent(PlayerInteractEvent event) {

		if (event.useItem != null) {

			EntityPlayer player = event.entityPlayer;
			ItemStack stack = event.entityPlayer.getHeldItem();

			if (stack.itemID == Items.unlinkedCrystal.itemID && event.entityPlayer.worldObj.getBlockId(event.x, event.y, event.z) == Blocks.warpBlock.blockID){
				stack.stackTagCompound.setInteger("linkX", event.x);
				stack.stackTagCompound.setInteger("linkY", event.y);
				stack.stackTagCompound.setInteger("linkz", event.z);
				
				--stack.stackSize
			}
		}
	}
}