package mc.gorongames.us.magicjoemod.entity.ai;

import java.util.Random;

import mc.gorongames.us.magicjoemod.entity.EntitySheepTest;
import net.minecraft.entity.ai.EntityAIBase;

public class sheepTestAIWander extends EntityAIBase{

	private EntitySheepTest theEntity;
	private double xPosition;
	private double yPosition;
	private double zPosition;
	private boolean proceed;
	
	public sheepTestAIWander(EntitySheepTest entity) {
		
		this.theEntity = entity;
		this.setMutexBits(1);
		
	}
	
	public boolean shouldExecute() {
		
		if(!this.theEntity.onGround || this.theEntity.isInWater()) {
			
			return false;
			
		}
		
		
		if(!this.proceed) {
			
			if(this.theEntity.getRNG().nextInt(15) != 0) {
				
				return false;
				
			}
			
		}
		
		Random random = this.theEntity.getRNG();

		double randx = this.theEntity.posX + (double)((random.nextFloat() * 2.0f - 1.0f) * 8.0f);
		double randy = this.theEntity.posY + (double)((random.nextFloat() * 2.0f - 1.0f) * 5.0f);
		double randz = this.theEntity.posZ + (double)((random.nextFloat() * 2.0f - 1.0f) * 8.0f);
		
		this.xPosition = randx;
		this.yPosition = randy;
		this.zPosition = randz;
		this.proceed = false;
		return true;		
		
	}
	
	public boolean continueExecuting() {
		
		return false;
		
	}
	
	
	public void startExecuting() {
		
		this.theEntity.getNavigator().tryMoveToXYZ(this.xPosition, this.yPosition, this.zPosition, 1.0D);
		
	}
	
	public void func_179480_f() {
		
		this.proceed = true;
		
	}
	
}
