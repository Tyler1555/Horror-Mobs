package net.minecraft.src;

import java.util.Map;
import java.util.Random;

public class mod_HorrorMobs extends BaseMod {

	@Override
	public String getVersion() {
		return "Horror Mobs version 1.0 by tyler15555";
	}

	@Override
	public void load() {
		//Name register
		ModLoader.addName(ThingHeart, "The Thing's Heart");
		ModLoader.addName(ThingLung, "The Thing's Lung");
		ModLoader.addName(SoulBottle, "Bottle of souls");
		ModLoader.addName(DeadGrass, "Dead Grass");
		ModLoader.addName(GraveCobble, "Grave CobbleStone");
		ModLoader.addName(RottenLog, "Rotted Log");
		ModLoader.addName(CursedFruit, "Cursed Fruit");
		ModLoader.addName(TwinBrain, "Twin's Brain");
		ModLoader.addName(CookedFlesh, "Cooked flesh");
		ModLoader.addName(ReaperBone, "Reaper's Bone");
		ModLoader.addName(ReaperHelmet, "Reaper Helmet");
		ModLoader.addName(ReaperChest, "Reaper Chestplate");
		ModLoader.addName(ReaperLegs, "Reaper Leggings");
		ModLoader.addName(ReaperBoots, "Reaper Boots");
		ModLoader.addName(ReaperSword, "Reaper's Blade");
		ModLoader.addName(GraveSword, "Grave Cobblestone Sword");
		ModLoader.addName(IronScythe, "Iron Scythe");
		ModLoader.addName(ReaperScythe, "Reaper Scythe");
		ModLoader.addName(GraveScythe, "Grave Cobblestone Scythe");
		
		
		
		//Mob register
		ModLoader.registerEntityID(net.minecraft.src.EntityTheThing.class, "The Thing", ModLoader.getUniqueEntityId());
		ModLoader.registerEntityID(net.minecraft.src.EntityGhoul.class, "CryptGhoul", ModLoader.getUniqueEntityId());
		ModLoader.registerEntityID(net.minecraft.src.EntitySeaDweller.class, "SeaDweller", ModLoader.getUniqueEntityId());
		ModLoader.registerEntityID(net.minecraft.src.EntityShadowLurker.class, "ShadowLurker", ModLoader.getUniqueEntityId());
		ModLoader.registerEntityID(net.minecraft.src.EntityBurnedZombie.class, "Burned Zombie", ModLoader.getUniqueEntityId());
		ModLoader.registerEntityID(net.minecraft.src.EntityTwin.class, "Twin", ModLoader.getUniqueEntityId());
		ModLoader.registerEntityID(net.minecraft.src.EntityReaper.class, "Reaper", ModLoader.getUniqueEntityId());
		
		//Mob Spawning
		ModLoader.addSpawn(net.minecraft.src.EntityTheThing.class, 6, 1, 3, EnumCreatureType.monster);
		ModLoader.addSpawn(net.minecraft.src.EntityGhoul.class, 15, 1, 5, EnumCreatureType.monster);
		ModLoader.addSpawn(net.minecraft.src.EntitySeaDweller.class, 10, 1, 2, EnumCreatureType.waterCreature);
		ModLoader.addSpawn(net.minecraft.src.EntityShadowLurker.class, 8, 1, 2, EnumCreatureType.monster);
		ModLoader.addSpawn(net.minecraft.src.EntityBurnedZombie.class, 20, 1, 6, EnumCreatureType.creature);
		ModLoader.addSpawn(net.minecraft.src.EntityTwin.class, 6, 1, 2, EnumCreatureType.monster);
		ModLoader.addSpawn(net.minecraft.src.EntityReaper.class, 10, 1, 1, EnumCreatureType.monster);
		
		//Block stuff
		ModLoader.registerBlock(DeadGrass);
		ModLoader.registerBlock(GraveCobble);
		ModLoader.registerBlock(RottenLog);
		
		
		//Biome register
		ModLoader.addBiome(HauntedForest);
		
		//Declaration for Trade Items
		TradeEntry tradeScytheIron = (new TradeEntry(this.IronScythe.shiftedIndex, 100F, true, 1, 1));
		
		//Adds items to trade list
		ModLoader.addTrade(1, tradeScytheIron);
		
		
		
		//Other
		ThingHeart.setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/thingheart.png"));
		SoulBottle.setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/soulbottle.png"));
		CursedFruit.setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/cursedfruit.png"));
		TwinBrain.setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/brain.png"));
		
		//Multi-textured blocks
		grasstop = ModLoader.addOverride("/terrain.png", "/horrormod/grasstop.png");
		grasstexture = ModLoader.addOverride("/terrain.png", "/horrormod/grasstexture.png");
		
		//Test Recipies
		
		
		//Actual Recipes
		ModLoader.addRecipe(new ItemStack(this.CursedFruit), new Object[] {
			"eee",
			"eae",
			"eee", Character.valueOf('e'), Item.enderPearl, Character.valueOf('a'), Item.appleRed
		});
		ModLoader.addShapelessRecipe(new ItemStack(this.GhostGlass), new Object[] {
			Block.glass, this.SoulBottle
		});
		ModLoader.addRecipe(new ItemStack(this.ReaperHelmet), new Object[] {
			"rrr",
			"r r",
			"   ", Character.valueOf('r'), this.ReaperBone
		});
		ModLoader.addRecipe(new ItemStack(this.ReaperChest), new Object[] {
			"r r",
			"rrr",
			"rrr", Character.valueOf('r'), this.ReaperBone
		});
		ModLoader.addRecipe(new ItemStack(this.ReaperLegs), new Object[] {
			"rrr",
			"r r",
			"r r", Character.valueOf('r'), this.ReaperBone
		});
		ModLoader.addRecipe(new ItemStack(this.ReaperBoots), new Object[] {
			
			"r r",
			"r r", Character.valueOf('r'), this.ReaperBone
		});
		ModLoader.addRecipe(new ItemStack(this.ReaperSword), new Object[] {
		" r ",
		" r ",
		" s ", Character.valueOf('r'), this.ReaperBone, Character.valueOf('s'), Item.stick
		});
		ModLoader.addRecipe(new ItemStack(this.GraveSword), new Object[] {
			" g ",
			" g ",
			" s ", Character.valueOf('g'), this.GraveCobble, Character.valueOf('s'), Item.stick
		});
		ModLoader.addRecipe(new ItemStack(this.ReaperScythe), new Object[] {
			"srr",
			"s  ",
			"s  ", Character.valueOf('s'), Item.stick, Character.valueOf('r'), this.ReaperBone
		});
		ModLoader.addRecipe(new ItemStack(this.IronScythe), new Object[] {
			"sii",
			"s  ",
			"s  ", Character.valueOf('s'), Item.stick, Character.valueOf('i'), Item.ingotIron
		});
		ModLoader.addRecipe(new ItemStack(this.GraveScythe), new Object[] {
			"sgg",
			"s  ",
			"s  ", Character.valueOf('s'), Item.stick, Character.valueOf('g'), this.GraveCobble
		});
		
		//Smelting Recipies + Cooking recipies
		ModLoader.addSmelting(Item.rottenFlesh.shiftedIndex, new ItemStack(mod_HorrorMobs.CookedFlesh), 1.0F);
		
		//Achievement Register
		ModLoader.addAchievementDesc(reaper, "Don't fear the reaper", "Collect a reaper bone");
		
		
		
		
	}
	
	//Item Declaration
	public static final Item ThingLung = (new ItemFood(801, 0, 0.5F, false).setAlwaysEdible().setPotionEffect(Potion.waterBreathing.id, 10, 60, 0.5F).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/thinglung.png")).setItemName("Lung"));
	public static final Item ThingHeart = (new ItemFood(802, 0, 0.5F, false)).setAlwaysEdible().setPotionEffect(Potion.damageBoost.id, 10, 30, 0.5F).setItemName("Heart");
	public static final Item SoulBottle = (new ItemFood(803, 0, 0.5F, false)).setAlwaysEdible().setPotionEffect(Potion.invisibility.id, 30, 60, 0.5F).setItemName("Soul Bottle");
	public static final Item CursedFruit = (new ItemFood(804, 6, 0.5F, false)).setAlwaysEdible().setPotionEffect(Potion.resistance.id, 10, 60, 0.5F).setItemName("fruit");
	public static final Item TwinBrain = (new ItemFood(805, 0, 0.5F, false)).setAlwaysEdible().setPotionEffect(Potion.moveSpeed.id, 30, 60, 0.5F).setItemName("Brain");
	public static final Item CookedFlesh = (new ItemFood(806, 5, 0.5F, true)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/cookedflesh.png")).setItemName("Cooked Flesh");
	public static final Item ReaperBone = (new ReaperBone(807)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/reaperbone.png")).setItemName("Reaper Bone");
	public static final Item ReaperHelmet = (new HorrorModArmor(808, HorrorModMaterial.Reaper, ModLoader.addArmor("reaper"), 0)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/reaperhelmet.png")).setItemName("Reaper Helmet");
	public static final Item ReaperChest = (new HorrorModArmor(809, HorrorModMaterial.Reaper, ModLoader.addArmor("reaper"), 1)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/reaperchest.png")).setItemName("Reaper Chest");
	public static final Item ReaperLegs = (new HorrorModArmor(8010, HorrorModMaterial.Reaper, ModLoader.addArmor("reaper"), 2)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/reaperlegs.png")).setItemName("Reaper Leggings");
	public static final Item ReaperBoots = (new HorrorModArmor(811, HorrorModMaterial.Reaper, ModLoader.addArmor("reaper"), 3)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/reaperboots.png")).setItemName("Reaper Boots");
	public static final Item ReaperSword = (new HorrorModSword(812, HorrorModToolMaterial.REAPER)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/reapersword.png")).setItemName("ReaperSword");
	public static final Item GraveSword = (new HorrorModSword(813, HorrorModToolMaterial.GRAVECOBBLE)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/gravesword.png")).setItemName("Grave Sword");
	public static final Item ReaperScythe = (new HorrorModScythe(814, HorrorModToolMaterial.REAPER)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/reaperscythe.png")).setItemName("Reaper Scythe");
	public static final Item IronScythe = (new HorrorModScythe(815,HorrorModToolMaterial.IRON)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/ironscythe.png")).setItemName("Iron Scythe");
	public static final Item GraveScythe = (new HorrorModScythe(816, HorrorModToolMaterial.GRAVECOBBLE)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/gravescythe.png")).setItemName("Grave Scythe");
	
	
	 //Block Declaration
     public static final Block DeadGrass = (new DeadGrass(238).setHardness(0.12F).setResistance(1.0F).setBlockName("DeadGrass"));;
     public static final Block RottenLog = (new RottenLog(239, ModLoader.addOverride("/terrain.png", "/horrormod/rotlog.png")).setHardness(0.21F).setResistance(2.2F).setBlockName("RottenLog"));
	 public static final Block GraveCobble = (new GraveCobble(240, ModLoader.addOverride("/terrain.png", "/horrormod/gravecobble.png")).setHardness(0.35F).setResistance(7.5F).setBlockName("GraveCobble"));
	 public static final Block GhostGlass = (new GhostGlass(241, ModLoader.addOverride("/terrain.png", "/horrormod/ghostglass.png")).setResistance(0.05F).setHardness(0.01F).setBlockName("GhostGlass"));
	 
	
	//Biome Declaration
	public static final BiomeGenBase HauntedForest = (new BiomeGenHaunted(37)).setBiomeName("Haunted Forest");
	
	
	
	
	//Achievement Stuff
	public static final Achievement reaper = (new Achievement(1000, "reaper", 5, 5, mod_HorrorMobs.ReaperBone, null)).registerAchievement();
	
	
	
	//More mob spawning stuff
	public void addRenderer(Map map) {
		map.put(EntityTheThing.class, new RenderTheThing(new ModelTheThing(), 0.5F));
		map.put(EntityGhoul.class, new RenderBiped(new ModelBiped(), 0.5F));
		map.put(EntitySeaDweller.class, new RenderBiped(new ModelBiped(), 0.5F));
		map.put(EntityShadowLurker.class, new RenderShadowLurker(new ModelShadowLurker(), 0.5F));
		map.put(EntityBurnedZombie.class, new RenderBiped(new ModelZombie(), 0.5F));
		map.put(EntityTwin.class, new RenderTwin(new ModelTwin(), 0.5F));
		map.put(EntityReaper.class, new RenderReaper(new ModelReaper(), 0.5F));
	}
	
	//Multi-textured blocks
	public static int grasstop;
	public static int grasstexture;
	
	//Achivement Listener
	public void OnItemPickup(EntityPlayer entityplayer, ItemStack itemstack) 
    { 
    if(itemstack.itemID == this.ReaperBone.shiftedIndex) 
    { 
         entityplayer.addStat(reaper, 1); 
    } 
                     
}
	
	/*
	  World world;
	int BaseX;
	int BaseZ;
	Random random;
	BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(BaseX, BaseZ);
	WorldGenHauntedTree tree = new WorldGenHauntedTree(true);
	if(biome instanceof BiomeGenHaunted) {
		for(int x = 0; x < 1; x++) {
			int Xcoord = BaseX + random.nextInt(14);
			int Zcoord = BaseZ + random.nextInt(16);
			int i = world.getHeightValue(Xcoord, Zcoord);
			tree.generate(world, random, Xcoord, i, Zcoord);
		}
	}
	 */
	
}
