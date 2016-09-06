package mc.gorongames.us.magicjoemod.entity.ai;

import java.util.Random;

import mc.gorongames.us.magicjoemod.entity.EntitySheepTest;
import mc.gorongames.us.magicjoemod.entity.EntitySheepTest.sheepTestMoveHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class sheepTestAISwimming extends EntityAIBase {
	
	private EntitySheepTest theEntity;
	
	public sheepTestAISwimming(EntitySheepTest entity) {
		
		this.theEntity = entity;
		this.setMutexBits(1);
		
	}
	
	public boolean shouldExecute() {
		
		if(!this.theEntity.isInWater()) {
			
			return false;
			
		}
		
		EntitySheepTest.sheepTestMoveHelper mh = (sheepTestMoveHelper)this.theEntity.getMoveHelper();
		
		if(!mh.isUpdating()) {
			
			if(this.theEntity.getRNG().nextInt(15) != 0) {
				
				return false;
				
			}
			
			return true;
			
		} else {

			double dirX = mh.getPosX() - this.theEntity.posX;
			double dirY = mh.getPosY() - this.theEntity.posY;
			double dirZ = mh.getPosZ() - this.theEntity.posZ;
			
			double destDistance = dirX * dirX + dirY * dirY + dirZ * dirZ;
			destDistance = (double)MathHelper.sqrt_double(destDistance);
			
			if(destDistance < 0.5D) {
				
				return true;
				
			} else {
				
				return false;
				
			}
			
		}
		
	}

	public boolean continueExecuting() {
		
		return false;
		
	}
	
	public void startExecuting() {
		
		Random random = this.theEntity.getRNG();

		double randx = this.theEntity.posX + (double)((random.nextFloat() * 2.0f - 1.0f) * 3.0f);
		double randy = this.theEntity.posY + (double)((random.nextFloat() * 2.0f - 1.0f) * 3.0f);
		double randz = this.theEntity.posZ + (double)((random.nextFloat() * 2.0f - 1.0f) * 3.0f);
		
		BlockPos DestBlockPos = new BlockPos(MathHelper.floor_double(randx), MathHelper.floor_double(randy), MathHelper.floor_double(randz));
		Block destBlock = this.theEntity.worldObj.getBlockState(DestBlockPos).getBlock();
		Block underDestBlock = this.theEntity.worldObj.getBlockState(DestBlockPos.offset(EnumFacing.DOWN)).getBlock();
		
		if(destBlock == Blocks.water || (destBlock == Blocks.air && underDestBlock != Blocks.water && underDestBlock != Blocks.air)) {
			
			this.theEntity.getMoveHelper().setMoveTo(randx, randy, randz, 1.0D);
			
		}
				
	}
	
	
}
