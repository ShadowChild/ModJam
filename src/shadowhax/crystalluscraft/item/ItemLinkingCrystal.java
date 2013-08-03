package shadowhax.crystalluscraft.item;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import shadowhax.crystalluscraft.CrystallusCraft;
import shadowhax.crystalluscraft.block.Blocks;

import java.util.List;

public class ItemLinkingCrystal extends Item{

	public ItemLinkingCrystal(int id) {
		super(id);
		this.setCreativeTab(CrystallusCraft.tab);
		this.hasSubtypes = true;
		this.setMaxStackSize(1);
	}
	
    private Icon[] icons = new Icon[256];
    public static String[] types = new String[] {"linked", "unlinked"};
    
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
    	
    	if (stack.getItemDamage() == 1) {
    		
    		int posX = stack.stackTagCompound.getInteger("linkX");
    		int posY = stack.stackTagCompound.getInteger("linkY");
    		int posZ = stack.stackTagCompound.getInteger("linkZ");
    		
    		if(world.getBlockId(posX, posY, posZ) == Blocks.warpBlock.blockID){
    			world.playSoundEffect(player.posX, player.posY, player.posZ, "mob.endermen.portal", 1.0F, 1.0F);
    			player.setPositionAndUpdate(posX, posY, posZ);
    			world.playSoundEffect(posX, posY, posZ, "mob.endermen.portal", 1.0F, 1.0F);
    			--stack.stackSize;
    		}
    	}
    	return stack;
    }
    
    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {   	
    	
    	onItemRightClick(stack, world, player);
    	
    	if (stack.getItemDamage() == 0){        	
        	if (world.getBlockId(x, y, z) == Blocks.warpBlock.blockID) {
                if (player.capabilities.isCreativeMode) {
                	if (!world.isRemote) {
                	    sendChat();
                	}
                }
                
            	stack.setTagCompound(new NBTTagCompound());
            	stack.stackTagCompound.setInteger("linkX", x);
            	stack.stackTagCompound.setInteger("linkY", y);
            	stack.stackTagCompound.setInteger("linkZ", z);      
            	stack.setItemDamage(1);
        	}
    	}
    	
        return true;
    }
    
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
    	if (stack.getItemDamage() == 0) {
    		
    		list.add("\u00a75Right click on a warp block");
    		list.add("\u00a75to tune this crystal to it.");
    	}
    	
    	if (stack.getItemDamage() == 1) {
    		
    		list.add("Right click to be warped to ");
    		list.add("x value of " + stack.stackTagCompound.getInteger("linkX"));
    		list.add("y value of " + stack.stackTagCompound.getInteger("linkY"));
    		list.add("z value of " + stack.stackTagCompound.getInteger("linkZ"));
    		list.add("Will Be Consumed On Use");
    	}
    }
    
    @Override
    public void registerIcons(IconRegister ir) {
    	
    	this.icons[1] = ir.registerIcon("crystalluscraft:linked");
    	this.icons[0] = ir.registerIcon("crystalluscraft:unlinked");
    }
    
    @Override
    public Icon getIconFromDamage(int damage) {
    	
    	return icons[damage];
    }
    
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack) {
        return stack.getItemDamage() > 0;
    }
    
    @SideOnly(Side.CLIENT)
    public static void sendChat() {
    	FMLClientHandler.instance().getClient().thePlayer.sendChatToPlayer(new ChatMessageComponent().func_111077_e("\u00a74Warning: This effect will not work in creative mode!"));
    }
    
    @Override
    public String getItemDisplayName(ItemStack stack) {
    	
    	switch(stack.getItemDamage()) {
    	
    	case 0: {
    		
    		return "Unlinked Crystal";
    	}
    	
    	default: {
    		
    		return "Linked Crystal";
    	}
    	}
    }
}
