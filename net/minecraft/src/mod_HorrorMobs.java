package net.minecraft.src;

import java.awt.Color;
import java.io.File;
import java.util.Map;
import java.util.Random;

import tyler15555.HMProxies.ClientProxy;
import tyler15555.HMProxies.CommonProxy;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.asm.SideOnly;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = "HorrorMod", name = "Horror Mobs", version = "General Release v2.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false, packetHandler = HMPacketHandler.class, channels = "HM-Mobs")
public class mod_HorrorMobs {

	@SidedProxy(clientSide = "tyler15555.HMProxies.ClientProxy", serverSide = "tyler15555.HMProxies.CommonProxy")
	public static CommonProxy proxy = new CommonProxy();
	@Instance("HorrorMod")
	public static mod_HorrorMobs instance = new mod_HorrorMobs();

	
	 //Adds armor Enums to make them not suck
	static EnumArmorMaterial reaperArmor = EnumHelper.addArmorMaterial("REAPER", 30, new int[] {3, 7, 5, 3}, 25);
	
	//Adds tool enums
	static EnumToolMaterial reaperTool = EnumHelper.addToolMaterial("REAPER", 5, 650, 7.0F, 3, 10);
	static EnumToolMaterial graveCobbleTool = EnumHelper.addToolMaterial("GRAVECOBBLE", 2, 150, 4.5F, 2, 10);
	
	//Config Declaration
	static File configFile = new File(FMLClientHandler.instance().getClient().getMinecraftDir(), "/config/HorrorMobs.cfg");
	static Configuration config = new Configuration(configFile);
	
	//Config Block ID's
	static int idDeadGrass = config.getOrCreateBlockIdProperty("DeadGrass", 238).getInt();
	static int idRotLog = config.getOrCreateBlockIdProperty("RottenLog", 239).getInt();
	static int idGraveCobble = config.getOrCreateBlockIdProperty("GraveCobble", 240).getInt();
	static int idSumTable = config.getOrCreateBlockIdProperty("SummoningTable", 241).getInt();
	
	//Config Item ID's
	static int idThingLung = config.getOrCreateIntProperty("ThingsLung", Configuration.CATEGORY_ITEM, 801).getInt();
	static int idThingHeart = config.getOrCreateIntProperty("ThingsHeart", Configuration.CATEGORY_ITEM, 802).getInt();
	static int idSoulBottle = config.getOrCreateIntProperty("SoulBottle", Configuration.CATEGORY_ITEM, 803).getInt();
	static int idCursedFruit = config.getOrCreateIntProperty("CursedFruit", Configuration.CATEGORY_ITEM, 804).getInt();
	static int idTwinBrain = config.getOrCreateIntProperty("TwinBrain", Configuration.CATEGORY_ITEM, 805).getInt();
	static int idCookedFlesh = config.getOrCreateIntProperty("CookedFlesh", Configuration.CATEGORY_ITEM, 806).getInt();
	static int idReaperBone = config.getOrCreateIntProperty("ReaperBone", Configuration.CATEGORY_ITEM, 807).getInt();
	static int idReaperHelm = config.getOrCreateIntProperty("ReaperHelmet", Configuration.CATEGORY_ITEM, 808).getInt();
	static int idReaperChest = config.getOrCreateIntProperty("ReaperChestPlate", Configuration.CATEGORY_ITEM, 809).getInt();
	static int idReaperLegs = config.getOrCreateIntProperty("ReaperLeggings", Configuration.CATEGORY_ITEM, 810).getInt();
	static int idReaperBoots = config.getOrCreateIntProperty("ReaperBoots", Configuration.CATEGORY_ITEM, 811).getInt();
	static int idReaperSword = config.getOrCreateIntProperty("ReaperSword", Configuration.CATEGORY_ITEM, 812).getInt();
	static int idGraveSword = config.getOrCreateIntProperty("GraveScythe", Configuration.CATEGORY_ITEM, 813).getInt();
	static int idReaperScythe = config.getOrCreateIntProperty("ReaperScythe", Configuration.CATEGORY_ITEM, 814).getInt();
	static int idGraveScythe = config.getOrCreateIntProperty("GraveScythe", Configuration.CATEGORY_ITEM, 815).getInt();
	static int idIronScythe = config.getOrCreateIntProperty("IronScythe", Configuration.CATEGORY_ITEM, 816).getInt();
	
	@PreInit
	public void preLoad(FMLPreInitializationEvent event) {
		try {
			config.load();
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			config.save();
		}
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		//Name register
		LanguageRegistry.addName(ThingHeart, "The Thing's Heart");
		LanguageRegistry.addName(ThingLung, "The Thing's Lung");
		LanguageRegistry.addName(SoulBottle, "Bottle of souls");
		LanguageRegistry.addName(DeadGrass, "Dead Grass");
		LanguageRegistry.addName(GraveCobble, "Grave CobbleStone");
		LanguageRegistry.addName(RottenLog, "Rotted Log");
		LanguageRegistry.addName(CursedFruit, "Cursed Fruit");
		LanguageRegistry.addName(TwinBrain, "Twin's Brain");
		LanguageRegistry.addName(CookedFlesh, "Cooked flesh");
		LanguageRegistry.addName(ReaperBone, "Reaper's Bone");
		LanguageRegistry.addName(ReaperHelmet, "Reaper Helmet");
		LanguageRegistry.addName(ReaperChest, "Reaper Chestplate");
		LanguageRegistry.addName(ReaperLegs, "Reaper Leggings");
		LanguageRegistry.addName(ReaperBoots, "Reaper Boots");
		LanguageRegistry.addName(ReaperSword, "Reaper's Blade");
		LanguageRegistry.addName(GraveSword, "Grave Cobblestone Sword");
		LanguageRegistry.addName(IronScythe, "Iron Scythe");
		LanguageRegistry.addName(ReaperScythe, "Reaper Scythe");
		LanguageRegistry.addName(GraveScythe, "Grave Cobblestone Scythe");
		LanguageRegistry.addName(sumTable, "Summoning Table");
		
		
		//Mob register
		EntityRegistry.registerGlobalEntityID(EntityTheThing.class, "The Thing", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerGlobalEntityID(EntityGhoul.class, "CryptGhoul", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerGlobalEntityID(EntitySeaDweller.class, "SeaDweller", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerGlobalEntityID(EntityShadowLurker.class, "ShadowLurker", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerGlobalEntityID(EntityBurnedZombie.class, "Burned Zombie", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerGlobalEntityID(EntityTwin.class, "Twin", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerGlobalEntityID(EntityReaper.class, "Reaper", EntityRegistry.findGlobalUniqueEntityId());
		
		//Mob Spawning
		EntityRegistry.addSpawn(EntityTheThing.class, 50, 1, 3, EnumCreatureType.monster);
		EntityRegistry.addSpawn(EntityGhoul.class, 50, 1, 5, EnumCreatureType.monster);
		EntityRegistry.addSpawn(EntitySeaDweller.class, 50, 1, 2, EnumCreatureType.waterCreature);
		EntityRegistry.addSpawn(EntityShadowLurker.class, 50, 1, 2, EnumCreatureType.monster);
		EntityRegistry.addSpawn(EntityBurnedZombie.class, 50, 1, 6, EnumCreatureType.creature);
		EntityRegistry.addSpawn(EntityTwin.class, 50, 1, 2, EnumCreatureType.monster);
		EntityRegistry.addSpawn(EntityReaper.class, 50, 1, 1, EnumCreatureType.monster);
		
		//Block stuff
		GameRegistry.registerBlock(DeadGrass);
		GameRegistry.registerBlock(GraveCobble);
		GameRegistry.registerBlock(RottenLog);
		GameRegistry.registerBlock(sumTable);
		
		
		//Biome register
		GameRegistry.addBiome(HauntedForest);
		
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
		GameRegistry.addRecipe(new ItemStack(this.CursedFruit), new Object[] {
			"eee",
			"eae",
			"eee", Character.valueOf('e'), Item.enderPearl, Character.valueOf('a'), Item.appleRed
		});
		GameRegistry.addShapelessRecipe(new ItemStack(this.GhostGlass), new Object[] {
			Block.glass, this.SoulBottle
		});
		GameRegistry.addRecipe(new ItemStack(this.ReaperHelmet), new Object[] {
			"rrr",
			"r r",
			"   ", Character.valueOf('r'), this.ReaperBone
		});
		GameRegistry.addRecipe(new ItemStack(this.ReaperChest), new Object[] {
			"r r",
			"rrr",
			"rrr", Character.valueOf('r'), this.ReaperBone
		});
		GameRegistry.addRecipe(new ItemStack(this.ReaperLegs), new Object[] {
			"rrr",
			"r r",
			"r r", Character.valueOf('r'), this.ReaperBone
		});
		GameRegistry.addRecipe(new ItemStack(this.ReaperBoots), new Object[] {
			
			"r r",
			"r r", Character.valueOf('r'), this.ReaperBone
		});
		GameRegistry.addRecipe(new ItemStack(this.ReaperSword), new Object[] {
		" r ",
		" r ",
		" s ", Character.valueOf('r'), this.ReaperBone, Character.valueOf('s'), Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(this.GraveSword), new Object[] {
			" g ",
			" g ",
			" s ", Character.valueOf('g'), this.GraveCobble, Character.valueOf('s'), Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(this.ReaperScythe), new Object[] {
			"srr",
			"s  ",
			"s  ", Character.valueOf('s'), Item.stick, Character.valueOf('r'), this.ReaperBone
		});
		GameRegistry.addRecipe(new ItemStack(this.IronScythe), new Object[] {
			"sii",
			"s  ",
			"s  ", Character.valueOf('s'), Item.stick, Character.valueOf('i'), Item.ingotIron
		});
		GameRegistry.addRecipe(new ItemStack(this.GraveScythe), new Object[] {
			"sgg",
			"s  ",
			"s  ", Character.valueOf('s'), Item.stick, Character.valueOf('g'), this.GraveCobble
		});
		
		//Smelting Recipies + Cooking recipies
		GameRegistry.addSmelting(Item.rottenFlesh.shiftedIndex, new ItemStack(mod_HorrorMobs.CookedFlesh), 1.0F);
		
		//Achievement Register
		ModLoader.addAchievementDesc(reaper, "Don't fear the reaper", "Collect a reaper bone");
		
		//Mods Dungeons
		DungeonHooks.addDungeonMob("The Thing", 95);
		DungeonHooks.addDungeonMob("CryptGhoul", 150);
		DungeonHooks.addDungeonMob("Twin", 100);
		DungeonHooks.addDungeonMob("Reaper", 100);
		DungeonHooks.addDungeonLoot(new ItemStack(this.ReaperBone), (int)0.5, 1, 5);
		DungeonHooks.addDungeonLoot(new ItemStack(this.GraveCobble), 1, 1, 64);
		
		//Registers this Mod's event handler
		MinecraftForge.EVENT_BUS.register(new HMEventHandler());
		
		//Handles GUIs server-side
		NetworkRegistry.instance().registerGuiHandler(this, new CommonProxy());
		
		//Generates Structures
		GameRegistry.registerWorldGenerator(new HMWorldGenerator());
		
		//Loads Mob Model Rendering - With this Mod's sided proxy is should only occur client side
		proxy.registerRenderers();
		
	}
	
	@PostInit
	public void postLoad(FMLPostInitializationEvent event) {
		System.out.print("Horror Mobs in the Mod-State" + event.getModState());
	}

	
	//Item Declaration
	public static final Item ThingLung = (new ItemFood(idThingLung, 0, 0.5F, false).setAlwaysEdible().setPotionEffect(Potion.waterBreathing.id, 10, 60, 0.5F).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/thinglung.png")).setItemName("Lung"));
	public static final Item ThingHeart = (new ItemFood(idThingHeart, 0, 0.5F, false)).setAlwaysEdible().setPotionEffect(Potion.damageBoost.id, 10, 30, 0.5F).setItemName("Heart");
	public static final Item SoulBottle = (new ItemFood(idSoulBottle, 0, 0.5F, false)).setAlwaysEdible().setPotionEffect(Potion.invisibility.id, 30, 60, 0.5F).setItemName("Soul Bottle");
	public static final Item CursedFruit = (new ItemFood(idCursedFruit, 6, 0.5F, false)).setAlwaysEdible().setPotionEffect(Potion.resistance.id, 10, 60, 0.5F).setItemName("fruit");
	public static final Item TwinBrain = (new ItemFood(idTwinBrain, 0, 0.5F, false)).setAlwaysEdible().setPotionEffect(Potion.moveSpeed.id, 30, 60, 0.5F).setItemName("Brain");
	public static final Item CookedFlesh = (new ItemFood(idCookedFlesh, 5, 0.5F, true)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/cookedflesh.png")).setItemName("Cooked Flesh");
	public static final Item ReaperBone = (new Item(idReaperBone)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/reaperbone.png")).setItemName("Reaper Bone");
	public static final Item ReaperHelmet = (new HorrorModArmor(idReaperHelm, reaperArmor, ModLoader.addArmor("reaper"), 0)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/reaperhelmet.png")).setItemName("Reaper Helmet");
	public static final Item ReaperChest = (new HorrorModArmor(idReaperChest, reaperArmor, ModLoader.addArmor("reaper"), 1)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/reaperchest.png")).setItemName("Reaper Chest");
	public static final Item ReaperLegs = (new HorrorModArmor(idReaperLegs, reaperArmor, ModLoader.addArmor("reaper"), 2)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/reaperlegs.png")).setItemName("Reaper Leggings");
	public static final Item ReaperBoots = (new HorrorModArmor(idReaperBoots, reaperArmor, ModLoader.addArmor("reaper"), 3)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/reaperboots.png")).setItemName("Reaper Boots");
	public static final Item ReaperSword = (new HorrorModSword(idReaperSword, reaperTool)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/reapersword.png")).setItemName("ReaperSword");
	public static final Item GraveSword = (new HorrorModSword(idGraveSword, graveCobbleTool)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/gravesword.png")).setItemName("Grave Sword");
	public static final Item ReaperScythe = (new HorrorModScythe(idReaperScythe, reaperTool).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/reaperscythe.png")).setItemName("Reaper Scythe"));
	public static final Item IronScythe = (new HorrorModScythe(idIronScythe, EnumToolMaterial.IRON).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/ironscythe.png")).setItemName("Iron Scythe"));
	public static final Item GraveScythe = (new HorrorModScythe(idGraveScythe, graveCobbleTool)).setIconIndex(ModLoader.addOverride("/gui/items.png", "/horrormod/gravescythe.png")).setItemName("Grave Scythe");
	
	
	 //Block Declaration
     public static final Block DeadGrass = (new DeadGrass(idDeadGrass).setHardness(0.12F).setResistance(1.0F).setBlockName("DeadGrass"));;
     public static final Block RottenLog = (new RottenLog(idRotLog, ModLoader.addOverride("/terrain.png", "/horrormod/rotlog.png")).setHardness(0.21F).setResistance(2.2F).setBlockName("RottenLog"));
	 public static final Block GraveCobble = (new GraveCobble(idGraveCobble, ModLoader.addOverride("/terrain.png", "/horrormod/gravecobble.png")).setHardness(0.35F).setResistance(7.5F).setBlockName("GraveCobble"));
	 public static final Block GhostGlass = (new GhostGlass(800, ModLoader.addOverride("/terrain.png", "/horrormod/ghostglass.png")).setResistance(0.05F).setHardness(0.01F).setBlockName("GhostGlass"));
	 public static final Block sumTable = (new SummoningTable(idSumTable, 1)).setResistance(0.5F).setHardness(5F);
	 
	
	//Biome Declaration
	public static final BiomeGenBase HauntedForest = (new BiomeGenHaunted(37)).setBiomeName("Haunted Forest");
	
	
	
	
	//Achievement Stuff
	public static final Achievement reaper = (new Achievement(1000, "reaper", 5, 5, mod_HorrorMobs.ReaperBone, null)).registerAchievement();
	
	//Multi-textured blocks
	public static int grasstop;
	public static int grasstexture;
	
	//Achivement Listener
	public void onItemPickup(EntityPlayer entityplayer, ItemStack itemstack) 
    { 
    if(itemstack.itemID == this.ReaperBone.shiftedIndex) 
    { 
         entityplayer.addStat(reaper, 1); 
    } 
                     
}
	
}
