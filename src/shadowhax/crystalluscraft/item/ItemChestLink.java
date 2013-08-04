package shadowhax.crystalluscraft.item;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import shadowhax.crystalluscraft.CrystallusCraft;
import shadowhax.crystalluscraft.block.Blocks;
import shadowhax.crystalluscraft.block.tile.TileEntityCrystalChest;

import java.util.List;

public class ItemChestLink extends Item{

	public ItemChestLink(int id) {
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
    		
    		if(world.getBlockId(posX, posY, posZ) == Blocks.crystalChest.blockID){
    		
    			IInventory iinventory = this.getInventory(world, posX, posY, posZ);

    			if (iinventory != null) {
    	                player.displayGUIChest(iinventory);
    			}
    		}
    	}
		return stack;
    }
    
    public IInventory getInventory(World par1World, int par2, int par3, int par4)
    {
        IInventory object = (TileEntityCrystalChest)par1World.getBlockTileEntity(par2, par3, par4);

        if (object == null) {
            return null;
        }
        else {
            return (IInventory)object;
        }
    }
    
    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {   	
    	
    	onItemRightClick(stack, world, player);
    	
    	if (stack.getItemDamage() == 0){        	
        	if (world.getBlockId(x, y, z) == Blocks.crystalChest.blockID) {
                
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
    		
    	}
    	
    	if (stack.getItemDamage() == 1) {
    		
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
    
    @Override
    public String getItemDisplayName(ItemStack stack) {
    	
    	switch(stack.getItemDamage()) {
    	
    	case 0: {
    		
    		return "Unlinked Chest Crystal";
    	}
    	
    	default: {
    		
    		return "Linked Chest Crystal";
    	}
    	}
    }
}
