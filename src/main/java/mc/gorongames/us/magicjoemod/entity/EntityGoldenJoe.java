package mc.gorongames.us.magicjoemod.entity;

import java.util.Map;

import com.google.common.collect.Maps;

import mc.gorongames.us.magicjoemod.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityGoldenJoe extends EntityAnimal implements net.minecraftforge.common.IShearable {
	
    private static final Map field_175514_bm = Maps.newEnumMap(EnumDyeColor.class);
    /**
     * Used to control movement as well as wool regrowth. Set to 40 on handleHealthUpdate and counts down with each
     * tick.
     */
    private int sheepTimer;
    private EntityAIEatGrass entityAIEatGrass = new EntityAIEatGrass(this);
    private static final String __OBFID = "CL_00001648";
    
	public EntityGoldenJoe(World WorldIn) {
		
		super(WorldIn);
//	    ((PathNavigateGround)this.getNavigator()).func_179690_a(true); //use for land only
//	    this.tasks.addTask(0, new sheepTestAISwimming(this));
//	    this.tasks.addTask(1, new sheepTestAIWander(this));
//	    this.tasks.addTask(0, new EntityAISwimming(this));
//	    this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
//	    this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
//	    this.tasks.addTask(3, new EntityAITempt(this, 1.1D, Items.wheat, false));
//	    this.tasks.addTask(4, new EntityAIFollowParent(this, 1.1D));
//	    this.tasks.addTask(4, this.entityAIEatGrass);
//	    this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
//	    this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
//	    this.tasks.addTask(6, new EntityAILookIdle(this));
//	    this.inventoryCrafting.setInventorySlotContents(0, new ItemStack(Items.dye, 1, 0));
//	    this.inventoryCrafting.setInventorySlotContents(1, new ItemStack(Items.dye, 1, 0));

        ((PathNavigateGround)this.getNavigator()).func_179690_a(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.1D, Items.wheat, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.1D));
        this.tasks.addTask(5, this.entityAIEatGrass);
        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        
//	    ((PathNavigateGround)this.getNavigator()).func_179693_d(true); //use for land and water this.richie messed up
//	    this.moveHelper = new EntityGoldenJoe.sheepTestMoveHelper();		
	}
    
    protected void updateAITasks()
    {
        this.sheepTimer = this.entityAIEatGrass.getEatingGrassTimer();
        super.updateAITasks();
    }
    
    public void onLivingUpdate() {
        if (this.worldObj.isRemote) {
            this.sheepTimer = Math.max(0, this.sheepTimer - 1);
        }
        super.onLivingUpdate();
    }

	protected void ApplyEntityAttributes() {
		
		super.applyEntityAttributes();
		
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
//		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8D);
//		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(16.0D);
		
	}
	
	protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
    }
	

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        if (!this.getSheared())
        {
            this.entityDropItem(new ItemStack(ModItems.goldenfleecefabricItem), 0.0f);
        }

        int j = this.rand.nextInt(2) + 1 + this.rand.nextInt(1 + p_70628_2_);

        for (int k = 0; k < j; ++k)
        {
            if (this.isBurning())
            {
                this.dropItem(Items.cooked_mutton, 1);
            }
            else
            {
                this.dropItem(Items.mutton, 1);
            }
        }
    }

    protected Item getDropItem()
    {
        return ModItems.goldenfleecefabricItem;
    }

    @SideOnly(Side.CLIENT)
    public void handleHealthUpdate(byte p_70103_1_)
    {
        if (p_70103_1_ == 10)
        {
            this.sheepTimer = 40;
        }
        else
        {
            super.handleHealthUpdate(p_70103_1_);
        }
    }
    


    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    @SuppressWarnings("unused")
    public boolean interact(EntityPlayer player)
    {
        ItemStack itemstack = player.inventory.getCurrentItem();

        if (false && itemstack != null && itemstack.getItem() == Items.shears && !this.getSheared() && !this.isChild()) //Forge: Moved to onSheared
        {
            if (!this.worldObj.isRemote)
            {
                this.setSheared(true);
                int i = 1 + this.rand.nextInt(3);

                for (int j = 0; j < i; ++j)
                {
                    EntityItem entityitem = this.entityDropItem(new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, this.getFleeceColor().getMetadata()), 1.0F);
                    entityitem.motionY += (double)(this.rand.nextFloat() * 0.05F);
                    entityitem.motionX += (double)((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F);
                    entityitem.motionZ += (double)((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F);
                }
            }

            itemstack.damageItem(1, player);
            this.playSound("mob.sheep.shear", 1.0F, 1.0F);
        }

        return super.interact(player);
    }
    
//
//    /**
//     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
//     */
//    @SuppressWarnings("unused")
//    public boolean interact(EntityPlayer player)
//    {
//        ItemStack itemstack = player.inventory.getCurrentItem();
//
//        if (false && itemstack != null && itemstack.getItem() == Items.shears && !this.getSheared() && !this.isChild()) //Forge: Moved to onSheared
//        {
//            if (!this.worldObj.isRemote)
//            {
//                this.setSheared(true);
//                int i = 1 + this.rand.nextInt(3);
//
//                for (int j = 0; j < i; ++j)
//                {
//                    EntityItem entityitem = this.entityDropItem(new ItemStack(ModItems.goldenfleecefabricItem), 1.0F);
//                    entityitem.motionY += (double)(this.rand.nextFloat() * 0.05F);
//                    entityitem.motionX += (double)((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F);
//                    entityitem.motionZ += (double)((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F);
//                }
//            }
//
//            itemstack.damageItem(1, player);
//            this.playSound("mob.sheep.shear", 1.0F, 1.0F);
//        }
//
//        return super.interact(player);
//    }
	
	private EnumDyeColor getFleeceColor() {
		// TODO Auto-generated method stub
		return null;
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
    
    @SideOnly(Side.CLIENT)
    public float getHeadRotationPointY(float p_70894_1_) {
        return this.sheepTimer <= 0 ? 0.0F : (this.sheepTimer >= 4 && this.sheepTimer <= 36 ? 1.0F : (this.sheepTimer < 4 ? ((float)this.sheepTimer - p_70894_1_) / 4.0F : -((float)(this.sheepTimer - 40) - p_70894_1_) / 4.0F));
    }

    @SideOnly(Side.CLIENT)
    public float getHeadRotationAngleX(float p_70890_1_) {
        if (this.sheepTimer > 4 && this.sheepTimer <= 36)
        {
            float f1 = ((float)(this.sheepTimer - 4) - p_70890_1_) / 32.0F;
            return ((float)Math.PI / 5F) + ((float)Math.PI * 7F / 100F) * MathHelper.sin(f1 * 28.7F);
        } else {
            return this.sheepTimer > 0 ? ((float)Math.PI / 5F) : this.rotationPitch / (180F / (float)Math.PI);
        }
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound tagCompound) {
        super.writeEntityToNBT(tagCompound);
        tagCompound.setBoolean("Sheared", this.getSheared());
//        tagCompound.setByte("Color", (byte)this.getFleeceColor().getMetadata());
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound tagCompund)
    {
        super.readEntityFromNBT(tagCompund);
        this.setSheared(tagCompund.getBoolean("Sheared"));
//        this.setFleeceColor(EnumDyeColor.byMetadata(tagCompund.getByte("Color")));
    }

	//water based
//    public boolean canBreathUnderWater() {
//    	
//    	return true;
//    			
//    }
    
    /**
     * returns true if a sheeps wool has been sheared
     */
    public boolean getSheared()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 16) != 0;
    }
    
    /**
     * make a sheep sheared if set to true
     */
    public void setSheared(boolean p_70893_1_)
    {
        byte b0 = this.dataWatcher.getWatchableObjectByte(16);

        if (p_70893_1_)
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 | 16)));
        }
        else
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 & -17)));
        }
        
    }

    public EntityGoldenJoe func_180491_b(EntityAgeable p_180491_1_)
    {
        EntityGoldenJoe entitygoldenjoe = (EntityGoldenJoe)p_180491_1_;
        EntityGoldenJoe entitygoldenjoe1 = new EntityGoldenJoe(this.worldObj);
//        entitysheep1.setFleeceColor(this.func_175511_a(this, entitysheep));
        return entitygoldenjoe1;
    }
    
    public IEntityLivingData func_180482_a(DifficultyInstance p_180482_1_, IEntityLivingData p_180482_2_)
    {
        p_180482_2_ = super.func_180482_a(p_180482_1_, p_180482_2_);
//        this.setFleeceColor(func_175510_a(this.worldObj.rand));
        return p_180482_2_;
    }
    
    public float getEyeHeight()
    {
        return 0.95F * this.height;
    }

    public EntityAgeable createChild(EntityAgeable ageable)
    {
        return this.func_180491_b(ageable);
    }

    public boolean isShearable(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos){ return !this.getSheared() && !this.isChild(); }
    public java.util.List<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        this.setSheared(true);
        int i = 1 + this.rand.nextInt(3);

        java.util.List<ItemStack> ret = new java.util.ArrayList<ItemStack>();
        for (int j = 0; j < i; ++j)
            ret.add(new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, this.getFleeceColor().getMetadata()));

        this.playSound("mob.sheep.shear", 1.0F, 1.0F);
        return ret;
    }
    
    public class sheepTestMoveHelper extends EntityMoveHelper {

		private EntityGoldenJoe entity = EntityGoldenJoe.this;
		private int randcounter;
		
		public sheepTestMoveHelper() {
			
			super(EntityGoldenJoe.this);
			
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
//    }
//
//	@Override
//	public EntityAgeable createChild(EntityAgeable ageable) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
}
