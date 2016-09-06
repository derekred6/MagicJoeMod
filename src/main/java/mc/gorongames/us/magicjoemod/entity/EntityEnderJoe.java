package mc.gorongames.us.magicjoemod.entity;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityEnderJoe extends EntitySheep {
	
	public EntityEnderJoe(World WorldIn) {
		
		super(WorldIn);
	    ((PathNavigateGround)this.getNavigator()).func_179690_a(true); //use for land only
//	    this.tasks.addTask(0, new sheepTestAISwimming(this));
//	    this.tasks.addTask(1, new sheepTestAIWander(this));
	    this.tasks.addTask(0, new EntityAISwimming(this));
	    this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
	    this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
	    this.tasks.addTask(3, new EntityAITempt(this, 1.1D, Items.wheat, false));
//	    this.tasks.addTask(4, new EntityAIFollowParent(this, 1.1D));
	    this.tasks.addTask(4, this.entityAIEatGrass);
	    this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
	    this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	    this.tasks.addTask(6, new EntityAILookIdle(this));
//	    this.inventoryCrafting.setInventorySlotContents(0, new ItemStack(Items.dye, 1, 0));
//	    this.inventoryCrafting.setInventorySlotContents(1, new ItemStack(Items.dye, 1, 0));
	    
	    ((PathNavigateGround)this.getNavigator()).func_179693_d(true); //use for land and water this.richie messed up
	    this.moveHelper = new EntityEnderJoe.sheepTestMoveHelper();		
	}
	
	private void setCreativeTab(CreativeTabs tabmagicjoe) {
		// TODO Auto-generated method stub
		
	}

	protected void ApplyEntityAttributes() {
		
		super.applyEntityAttributes();
		
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8D);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(16.0D);
		
	}
	
	protected boolean isAIEnabled() {
		
		return true;
		
	}

	public String getLivingSound() {
		
		return "mob.sheep.say";
		
	}
	
	public String getHurtSound() {
		
		return "mob.sheep.say";
		
	}
	
	public String getDeathSound() {
		
		return "mob.sheep.say";
		
	}
	
//    /**
//     * Used to control movement as well as wool regrowth. Set to 40 on handleHealthUpdate and counts down with each
//     * tick.
//     */
    private int sheepTimer;
    private EntityAIEatGrass entityAIEatGrass = new EntityAIEatGrass(this);
    
    protected void updateAITasks()
    {
        this.sheepTimer = this.entityAIEatGrass.getEatingGrassTimer();
        super.updateAITasks();
    }

	//water based
    public boolean canBreathUnderWater() {
    	
    	return true;
    			
    }
//    
//	water based
    public boolean isPushedbyWater() {
    	
    	return false;
    	
    }
//    
    public void onLivingUpdate() {
    	
    	super.onLivingUpdate();
    	
    	if (this.isInWater()) {
    		
    		this.setAir(300);
    		this.limbSwingAmount = 0;
    		this.limbSwing = 0;
    		this.prevLimbSwingAmount = this.limbSwingAmount;
    		
    	}
    }

    public class sheepTestMoveHelper extends EntityMoveHelper {

		private EntityEnderJoe entity = EntityEnderJoe.this;
		private int randcounter;
		
		public sheepTestMoveHelper() {
			
			super(EntityEnderJoe.this);
			
		}
		
		public void onUpdateMoveHelper() {
			
			if(entity.isInWater()) {
				
				if(this.update) {
					
					if(this.randcounter-- <= 0) {
						
						this.randcounter += this.entity.getRNG().nextInt(5) + 10;

						double dirX = this.posX - this.entity.posX;
						double dirY = this.posY - this.entity.posY;
						double dirZ = this.posZ - this.entity.posZ;
						
						double destDistance = dirX * dirX + dirY * dirY + dirZ * dirZ;
						
						destDistance = (double)MathHelper.sqrt_double(destDistance);
								
						if(!this.checkCollision(this.posX, this.posY, this.posZ, destDistance)) {

							this.entity.motionX += dirX / destDistance * 0.1D;
							this.entity.motionY += dirY / destDistance * 0.1D;
							this.entity.motionZ += dirZ / destDistance * 0.1D;
							
						} else {
							
							this.update = false;
							double aboveBlockLocY = MathHelper.floor_double(this.posY) + 1;
							Block blockAboveSelf = worldObj.getBlockState(new BlockPos(MathHelper.floor_double(this.entity.posX), MathHelper.floor_double(aboveBlockLocY), MathHelper.floor_double(this.entity.posZ))).getBlock();
							Block destBlock = this.entity.worldObj.getBlockState(new BlockPos(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ))).getBlock();
							
							double Ydiff = MathHelper.floor_double(this.posY) - MathHelper.floor_double(this.entity.posY);
							
							if(Ydiff == 1.0 && blockAboveSelf == Blocks.air && destBlock != Blocks.water && destDistance <= 3) {
								
								this.entity.motionX = dirX / destDistance * 0.3D;
								this.entity.motionY = 0.4D;
								this.entity.motionZ = dirZ / destDistance * 0.3D;
								this.entity.getJumpHelper().setJumping();
								
							}
							
						}
						
						this.UpdateYaw(motionX, motionZ);
						
					}
					
				}
				
			} else {
				
				super.onUpdateMoveHelper();
				
			}
			
		}
    	
		public void UpdateYaw(double dirX, double dirZ) {
			
			renderYawOffset = rotationYaw = -((float)Math.atan2(dirX, dirZ)) * 180f / (float)Math.PI;
			
		}
		
		private boolean checkCollision(double posX, double posY, double posZ, double distance) {

			double dirX = (posX - this.entity.posX / distance);
			double dirY = (posY - this.entity.posY / distance);
			double dirZ = (posZ - this.entity.posZ / distance);
			AxisAlignedBB collisionBox = this.entity.getEntityBoundingBox();
			
			for (int i=1; (double)i < distance; ++i) {
				
				collisionBox = collisionBox.offset(dirX, dirY, dirZ);
				
				if(!this.entity.worldObj.getCollidingBoundingBoxes(this.entity, collisionBox).isEmpty()) {
					
					return true;
					
				}
				
			}
			
			return false;
			
		}

		public double getPosX() {
			
			return this.posX;
			
		}
		
		public double getPosY() {
			
			return this.posY;
			
		}
		
		public double getPosZ() {
			
			return this.posZ;
			
		}
    }

}