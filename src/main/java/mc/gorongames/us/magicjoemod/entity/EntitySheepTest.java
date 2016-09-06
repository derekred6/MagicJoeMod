package mc.gorongames.us.magicjoemod.entity;



import mc.gorongames.us.magicjoemod.entity.ai.sheepTestAISwimming;
import mc.gorongames.us.magicjoemod.entity.ai.sheepTestAIWander;
import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAITempt;
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

public class EntitySheepTest extends EntitySheep implements net.minecraftforge.common.IShearable {
	
	public EntitySheepTest(World WorldIn) {
		
		super(WorldIn);
//	    ((PathNavigateGround)this.getNavigator()).func_179690_a(true); /use for land only
	    this.tasks.addTask(0, new sheepTestAISwimming(this));
	    this.tasks.addTask(1, new sheepTestAIWander(this));
//	    this.tasks.addTask(0, new EntityAISwimming(this));
//	    this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
	    this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
	    this.tasks.addTask(3, new EntityAITempt(this, 1.1D, Items.wheat, false));
//	    this.tasks.addTask(4, new EntityAIFollowParent(this, 1.1D));
//	    this.tasks.addTask(4, this.entityAIEatGrass);
//	    this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
	    this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	    this.tasks.addTask(6, new EntityAILookIdle(this));
//	    this.inventoryCrafting.setInventorySlotContents(0, new ItemStack(Items.dye, 1, 0));
//	    this.inventoryCrafting.setInventorySlotContents(1, new ItemStack(Items.dye, 1, 0));
	    
	    ((PathNavigateGround)this.getNavigator()).func_179693_d(true); //use for land and water this.richie messed up
	    this.moveHelper = new EntitySheepTest.sheepTestMoveHelper();		
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
	
//	protected void setupAI() {
//		
//	}
//	
//	protected void clearAITasks() {
//		
//		tasks.taskEntries.clear();
//		targetTasks.taskEntries.clear();
//		
//	}
//    /**
//     * Internal crafting inventory used to check the result of mixing dyes corresponding to the fleece color when
//     * breeding sheep.
//     */
//    private final InventoryCrafting inventoryCrafting = new InventoryCrafting(new Container()
//    {
//        
//        public boolean canInteractWith(EntityPlayer playerIn)
//        {
//            return false;
//        }
//    }, 2, 1);
//    private static final Map field_175514_bm = Maps.newEnumMap(EnumDyeColor.class);
//    
//    /**
//     * Used to control movement as well as wool regrowth. Set to 40 on handleHealthUpdate and counts down with each
//     * tick.
//     */
//    private int sheepTimer;
//    private EntityAIEatGrass entityAIEatGrass = new EntityAIEatGrass(this);
//    private static final String __OBFID = "CL_00001648";
//
//    public static float[] func_175513_a(EnumDyeColor p_175513_0_)
//    {
//        return (float[])field_175514_bm.get(p_175513_0_);
//    }
//
//    protected void updateAITasks()
//    {
//        this.sheepTimer = this.entityAIEatGrass.getEatingGrassTimer();
//        super.updateAITasks();
//    }
//
//    /**
//     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
//     * use this to react to sunlight and start to burn.
//     */
//    public void onLivingUpdate()
//    {
//        if (this.worldObj.isRemote)
//        {
//            this.sheepTimer = Math.max(0, this.sheepTimer - 1);
//        }
//
//        super.onLivingUpdate();
//    }
//
//    protected void applyEntityAttributes() {
//    	
//        super.applyEntityAttributes();
//        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0D);
//        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
//    
//    }
//
//    public boolean isBreedingItem(ItemStack itemstack) {
//    	
//    	return itemstack == null ? false :itemstack.getItem() == Items.wheat;
//    	
//    }
//    
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
//    
//    protected void entityInit()
//    {
//        super.entityInit();
//        this.dataWatcher.addObject(16, new Byte((byte)0));
//    }
//
//    /**
//     * Drop 0-2 items of this living's type
//     */
//    protected void dropFewItems(boolean recentlyhit, int modifier)
//    {
////        if (!this.getSheared())
////        {
////            this.entityDropItem(new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, this.getFleeceColor().getMetadata()), 0.0F);
////        }
////
////        int j = this.rand.nextInt(2) + 1 + this.rand.nextInt(1 + p_70628_2_);
////
////        for (int k = 0; k < j; ++k)
////        {
////            if (this.isBurning())
////            {
////                this.dropItem(Items.cooked_mutton, 1);
////            }
////            else
////            {
////                this.dropItem(Items.mutton, 1);
////            }
////        }
//    }
//
//    protected Item getDropItem()
//    {
//        return Item.getItemFromBlock(Blocks.wool);
//    }
//
//    @SideOnly(Side.CLIENT)
//    public void handleHealthUpdate(byte p_70103_1_)
//    {
//        if (p_70103_1_ == 10)
//        {
//            this.sheepTimer = 40;
//        }
//        else
//        {
//            super.handleHealthUpdate(p_70103_1_);
//        }
//    }
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
//                    EntityItem entityitem = this.entityDropItem(new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, this.getFleeceColor().getMetadata()), 1.0F);
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
//
//    @SideOnly(Side.CLIENT)
//    public float getHeadRotationPointY(float p_70894_1_)
//    {
//        return this.sheepTimer <= 0 ? 0.0F : (this.sheepTimer >= 4 && this.sheepTimer <= 36 ? 1.0F : (this.sheepTimer < 4 ? ((float)this.sheepTimer - p_70894_1_) / 4.0F : -((float)(this.sheepTimer - 40) - p_70894_1_) / 4.0F));
//    }
//
//    @SideOnly(Side.CLIENT)
//    public float getHeadRotationAngleX(float p_70890_1_)
//    {
//        if (this.sheepTimer > 4 && this.sheepTimer <= 36)
//        {
//            float f1 = ((float)(this.sheepTimer - 4) - p_70890_1_) / 32.0F;
//            return ((float)Math.PI / 5F) + ((float)Math.PI * 7F / 100F) * MathHelper.sin(f1 * 28.7F);
//        }
//        else
//        {
//            return this.sheepTimer > 0 ? ((float)Math.PI / 5F) : this.rotationPitch / (180F / (float)Math.PI);
//        }
//    }
//
//    /**
//     * (abstract) Protected helper method to write subclass entity data to NBT.
//     */
//    public void writeEntityToNBT(NBTTagCompound tagCompound)
//    {
//        super.writeEntityToNBT(tagCompound);
//        tagCompound.setBoolean("Sheared", this.getSheared());
//        tagCompound.setByte("Color", (byte)this.getFleeceColor().getMetadata());
//    }
//
//    /**
//     * (abstract) Protected helper method to read subclass entity data from NBT.
//     */
//    public void readEntityFromNBT(NBTTagCompound tagCompund)
//    {
//        super.readEntityFromNBT(tagCompund);
//        this.setSheared(tagCompund.getBoolean("Sheared"));
//        this.setFleeceColor(EnumDyeColor.byMetadata(tagCompund.getByte("Color")));
//    }
//
//    /**
//     * Returns the sound this mob makes while it's alive.
//     */
//    protected String getLivingSound()
//    {
//        return "mob.sheep.say";
//    }
//
//    /**
//     * Returns the sound this mob makes when it is hurt.
//     */
//    protected String getHurtSound()
//    {
//        return "mob.sheep.say";
//    }
//
//    /**
//     * Returns the sound this mob makes on death.
//     */
//    protected String getDeathSound()
//    {
//        return "mob.sheep.say";
//    }
//
//    protected void playStepSound(BlockPos p_180429_1_, Block p_180429_2_)
//    {
//        this.playSound("mob.sheep.step", 0.15F, 1.0F);
//    }
//
//    /**
//     * Gets the wool color of this sheep.
//     */
//    public EnumDyeColor getFleeceColor()
//    {
//        return EnumDyeColor.byMetadata(this.dataWatcher.getWatchableObjectByte(16) & 15);
//    }
//
//    /**
//     * Sets the wool color of this sheep
//     *  
//     * @param color The color to make the wool
//     */
//    public void setFleeceColor(EnumDyeColor color)
//    {
//        byte b0 = this.dataWatcher.getWatchableObjectByte(16);
//        this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 & 240 | color.getMetadata() & 15)));
//    }
//
//    /**
//     * returns true if a sheeps wool has been sheared
//     */
//    public boolean getSheared()
//    {
//        return (this.dataWatcher.getWatchableObjectByte(16) & 16) != 0;
//    }
//
//    /**
//     * make a sheep sheared if set to true
//     */
//    public void setSheared(boolean p_70893_1_)
//    {
//        byte b0 = this.dataWatcher.getWatchableObjectByte(16);
//
//        if (p_70893_1_)
//        {
//            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 | 16)));
//        }
//        else
//        {
//            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 & -17)));
//        }
//    }
//
//    public static EnumDyeColor func_175510_a(Random p_175510_0_)
//    {
//        int i = p_175510_0_.nextInt(100);
//        return i < 5 ? EnumDyeColor.BLACK : (i < 10 ? EnumDyeColor.GRAY : (i < 15 ? EnumDyeColor.SILVER : (i < 18 ? EnumDyeColor.BROWN : (p_175510_0_.nextInt(500) == 0 ? EnumDyeColor.PINK : EnumDyeColor.WHITE))));
//    }
//
//    public EntitySheep func_180491_b(EntityAgeable p_180491_1_)
//    {
//        EntitySheep entitysheep = (EntitySheep)p_180491_1_;
//        EntitySheep entitysheep1 = new EntitySheep(this.worldObj);
//        entitysheep1.setFleeceColor(this.func_175511_a(this, entitysheep));
//        return entitysheep1;
//    }
//
//    /**
//     * This function applies the benefits of growing back wool and faster growing up to the acting entity. (This
//     * function is used in the AIEatGrass)
//     */
//    public void eatGrassBonus()
//    {
//        this.setSheared(false);
//
//        if (this.isChild())
//        {
//            this.addGrowth(60);
//        }
//    }
//
//    public IEntityLivingData func_180482_a(DifficultyInstance p_180482_1_, IEntityLivingData p_180482_2_)
//    {
//        p_180482_2_ = super.func_180482_a(p_180482_1_, p_180482_2_);
//        this.setFleeceColor(func_175510_a(this.worldObj.rand));
//        return p_180482_2_;
//    }
//
//    private EnumDyeColor func_175511_a(EntityAnimal p_175511_1_, EntityAnimal p_175511_2_)
//    {
//        int i = ((EntitySheep)p_175511_1_).getFleeceColor().getDyeDamage();
//        int j = ((EntitySheep)p_175511_2_).getFleeceColor().getDyeDamage();
//        this.inventoryCrafting.getStackInSlot(0).setItemDamage(i);
//        this.inventoryCrafting.getStackInSlot(1).setItemDamage(j);
//        ItemStack itemstack = CraftingManager.getInstance().findMatchingRecipe(this.inventoryCrafting, ((EntitySheep)p_175511_1_).worldObj);
//        int k;
//
//        if (itemstack != null && itemstack.getItem() == Items.dye)
//        {
//            k = itemstack.getMetadata();
//        }
//        else
//        {
//            k = this.worldObj.rand.nextBoolean() ? i : j;
//        }
//
//        return EnumDyeColor.byDyeDamage(k);
//    }
//
//    public float getEyeHeight()
//    {
//        return 0.95F * this.height;
//    }
//    
//    public boolean getCanSpawnHere() {
//    	
//    	return super.getCanSpawnHere();
//    	
//    }
//    
//    public void moveEntityWithHeading(float x, float z) {
//    	
//    	if(this.isInWater()) {
//    		
//    		this.moveFlying(x, x, 0.1f);
//    		this.moveEntity(this.motionX, this.motionY, this.motionZ);
//    		this.motionX *= 0.8D;
//    		this.motionY *= 0.8D;
//    		this.motionZ *= 0.8D;
//    		
//    		
//    	} else {
//    		
//    		super.moveEntityWithHeading(x, z);
//    		
//    	}
//    	
//    }
//
//    public EntityAgeable createChild(EntityAgeable ageable)
//    {
//        return this.func_180491_b(ageable);
//    }
//
//    static
//    {
//        field_175514_bm.put(EnumDyeColor.WHITE, new float[] {1.0F, 1.0F, 1.0F});
//        field_175514_bm.put(EnumDyeColor.ORANGE, new float[] {0.85F, 0.5F, 0.2F});
//        field_175514_bm.put(EnumDyeColor.MAGENTA, new float[] {0.7F, 0.3F, 0.85F});
//        field_175514_bm.put(EnumDyeColor.LIGHT_BLUE, new float[] {0.4F, 0.6F, 0.85F});
//        field_175514_bm.put(EnumDyeColor.YELLOW, new float[] {0.9F, 0.9F, 0.2F});
//        field_175514_bm.put(EnumDyeColor.LIME, new float[] {0.5F, 0.8F, 0.1F});
//        field_175514_bm.put(EnumDyeColor.PINK, new float[] {0.95F, 0.5F, 0.65F});
//        field_175514_bm.put(EnumDyeColor.GRAY, new float[] {0.3F, 0.3F, 0.3F});
//        field_175514_bm.put(EnumDyeColor.SILVER, new float[] {0.6F, 0.6F, 0.6F});
//        field_175514_bm.put(EnumDyeColor.CYAN, new float[] {0.3F, 0.5F, 0.6F});
//        field_175514_bm.put(EnumDyeColor.PURPLE, new float[] {0.5F, 0.25F, 0.7F});
//        field_175514_bm.put(EnumDyeColor.BLUE, new float[] {0.2F, 0.3F, 0.7F});
//        field_175514_bm.put(EnumDyeColor.BROWN, new float[] {0.4F, 0.3F, 0.2F});
//        field_175514_bm.put(EnumDyeColor.GREEN, new float[] {0.4F, 0.5F, 0.2F});
//        field_175514_bm.put(EnumDyeColor.RED, new float[] {0.6F, 0.2F, 0.2F});
//        field_175514_bm.put(EnumDyeColor.BLACK, new float[] {0.1F, 0.1F, 0.1F});
//    }
//
//    @Override public boolean isShearable(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos){ return !this.getSheared() && !this.isChild(); }
//    @Override
//    public java.util.List<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
//    {
//        this.setSheared(true);
//        int i = 1 + this.rand.nextInt(3);
//
//        java.util.List<ItemStack> ret = new java.util.ArrayList<ItemStack>();
//        for (int j = 0; j < i; ++j)
//            ret.add(new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, this.getFleeceColor().getMetadata()));
//
//        this.playSound("mob.sheep.shear", 1.0F, 1.0F);
//        return ret;
//    }
//    
    public class sheepTestMoveHelper extends EntityMoveHelper {

		private EntitySheepTest entity = EntitySheepTest.this;
		private int randcounter;
		
		public sheepTestMoveHelper() {
			
			super(EntitySheepTest.this);
			
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