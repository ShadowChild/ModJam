package shadowhax.modjam.core.helpers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3Pool;
import net.minecraft.world.World;

public class RayTraceHelper {
	
  public static MovingObjectPosition rayTrace(World world, EntityPlayer player, int distance) {
	  
    Vec3 var1 = world.getWorldVec3Pool().getVecFromPool(player.posX, player.posY + player.getEyeHeight(), player.posZ);
    Vec3 var2 = player.getLookVec();
    Vec3 var3 = var1.addVector(var2.xCoord * distance, var2.yCoord * distance, var2.zCoord * distance);
    return world.rayTraceBlocks_do_do(var1, var2, true, true);
  }
}