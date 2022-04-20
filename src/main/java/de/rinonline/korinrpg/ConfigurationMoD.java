package de.rinonline.korinrpg;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationMoD {

//ore attempt
public static boolean dropchancered;
public static boolean explosionbreakblock;
public static boolean explosionbreakEntitys;
public static boolean cantakeheartsAsitem;
public static boolean dropchancerblue;
public static boolean dropchanceblack;
public static boolean dropchancewhite;
public static boolean renderArmourbarBackground;
public static boolean renderhealthbar;
public static boolean modthinkersContruct;
public static boolean saveHeartsondeathe;
public static boolean renderarmorbar;
public static boolean losewhitehearts;
public static boolean OnlydropByPlayer;

//	

//ID attempt
public static double DROPCHANCE_REDHEARTS,DROPCHANCE_BLUEHEARTS,DROPCHANCE_BLACKHEARTS,DROPCHANCE_WHITEHEARTS,WHITEHEART_TIME,MAXHEARTS,MAXHEARTSBLUE,MAXHEARTSBLACK,MAXHEARTSWHITE,MAXHEARTSREDWHITE;


public static final boolean RENDER_ARMOUR_BACKGROUND = true;
public static final String 	RENDER_ARMOUR_BACKGROUND_DES = "This Option enable the rendering of the Armourbar Background. true/false";
public static final boolean RENDER_ARMOUR_BAR = false;
public static final String 	RENDER_ARMOUR_BAR_DES = "This Option enable the rendering of the modded Armourbar. true/false";
public static final boolean RENDER_VANILLA_HEALTH = false;
public static final String 	RENDER_VANILLA_HEALTH_DES = "Should the Healthbar be hidden?(for modsupport). frue/false";
public static final boolean DROP_HALF_HEARTS_DEFAULT = false;
public static final String 	DROP_HALF_HEARTS_DEFAULT_DES = "This Option enable the dropping of half Hearts. true/false";
public static final boolean explosion_should_break_Blocks = false;
public static final String 	explosion_should_break_Blocks_DES = "This Option will set the boolean for blackheart block breaking Explosion. true/false";
public static final boolean explosion_break_Entitys = false;
public static final String 	explosion_break_Entitys_DES = "This Option will set the boolean for blackheart Entity breaking Explosion. true/false";
public static final boolean Player_can_take_Hearts = false;
public static final String 	Player_can_take_Hearts_DES = "This Option will let the Player take the Hearts as Item, so they have to use it to get the Heart. true/false";
public static final boolean mod_thinkers_Contruct = false;
public static final String 	mod_thinkers_Contruct_DES = "Enable this to make the Mod compitable with Thinkers Construct";
public static final boolean saveHeartsondeath = false;
public static final String 	saveHeartsondeath_DES = "Enable this to save the hearts when the player dies";
public static final boolean losewhiteheartsd = false;
public static final String 	losewhitehearts_DES = "Do the players lose the red hearts gained by whitehearts on death?";
public static final boolean OnlydropByPlayerd = false;
public static final String 	OnlydropByPlayer_DES = "Hearts only drop by Playerkills";




public static void loadConfig(){
	FMLCommonHandler.instance().bus().register(RINMAIN.instance);
	  
	final String CATEGORY_HEARTMOD = RINMAIN.config.CATEGORY_GENERAL + RINMAIN.config.CATEGORY_SPLITTER + "Binding of Isaac Heart Mod DROPCHANCES";
	RINMAIN.config.addCustomCategoryComment(CATEGORY_HEARTMOD, "DROPCHANCES");
	DROPCHANCE_REDHEARTS = RINMAIN.config.get(CATEGORY_HEARTMOD, "Redheart dropchance in percent 100 = 100%", 0.00).getDouble();  
	DROPCHANCE_BLUEHEARTS = RINMAIN.config.get(CATEGORY_HEARTMOD, "Blueheart dropchance in percent 100 = 100%", 2.00).getDouble();  
	DROPCHANCE_BLACKHEARTS = RINMAIN.config.get(CATEGORY_HEARTMOD, "Blackheart dropchance in percent 100 = 100%", 1.00).getDouble();  
	DROPCHANCE_WHITEHEARTS = RINMAIN.config.get(CATEGORY_HEARTMOD, "Whiteheart dropchance in percent 100 = 100%", 0.50).getDouble();  
	final String CATEGORY_HEARTMOD2 = RINMAIN.config.CATEGORY_GENERAL + RINMAIN.config.CATEGORY_SPLITTER + "Binding of Isaac Heart Mod GENERAL";
	RINMAIN.config.addCustomCategoryComment(CATEGORY_HEARTMOD2, "GENERAL");
	dropchancered = RINMAIN.config.get(CATEGORY_HEARTMOD2, DROP_HALF_HEARTS_DEFAULT_DES, DROP_HALF_HEARTS_DEFAULT).getBoolean(DROP_HALF_HEARTS_DEFAULT);
	explosionbreakblock = RINMAIN.config.get(CATEGORY_HEARTMOD2, explosion_should_break_Blocks_DES, explosion_should_break_Blocks).getBoolean(explosion_should_break_Blocks);
	explosionbreakEntitys = RINMAIN.config.get(CATEGORY_HEARTMOD2, explosion_break_Entitys_DES, explosion_break_Entitys).getBoolean(explosion_break_Entitys);
	cantakeheartsAsitem = RINMAIN.config.get(CATEGORY_HEARTMOD2, Player_can_take_Hearts_DES, Player_can_take_Hearts).getBoolean(Player_can_take_Hearts);
	saveHeartsondeathe = RINMAIN.config.get(CATEGORY_HEARTMOD2, saveHeartsondeath_DES, saveHeartsondeath).getBoolean(saveHeartsondeath);
	WHITEHEART_TIME = RINMAIN.config.get(CATEGORY_HEARTMOD2, "Whiteheart time to get to a Redheart in secounds", 360).getDouble();  
	MAXHEARTS = RINMAIN.config.get(CATEGORY_HEARTMOD2, "Max Redhearts the player could get.", 20).getInt();  
	MAXHEARTSBLUE = RINMAIN.config.get(CATEGORY_HEARTMOD2, "Max Bluehearts the player could get.", 20).getInt();  
	MAXHEARTSBLACK = RINMAIN.config.get(CATEGORY_HEARTMOD2, "Max Blackhearts the player could get.", 20).getInt();  
	MAXHEARTSWHITE = RINMAIN.config.get(CATEGORY_HEARTMOD2, "Max Whitehearts the player could get.", 20).getInt();  
	MAXHEARTSREDWHITE = RINMAIN.config.get(CATEGORY_HEARTMOD2, "Max Redhearts gained by Whitehearts the player could get.", 10).getInt();  
	losewhitehearts = RINMAIN.config.get(CATEGORY_HEARTMOD2, losewhitehearts_DES, losewhiteheartsd).getBoolean(losewhiteheartsd);
	final String CATEGORY_HEARTMOD3 = RINMAIN.config.CATEGORY_GENERAL + RINMAIN.config.CATEGORY_SPLITTER + "Binding of Isaac Heart Mod Interface";
	RINMAIN.config.addCustomCategoryComment(CATEGORY_HEARTMOD3, "Interface");
	renderArmourbarBackground = RINMAIN.config.get(CATEGORY_HEARTMOD3, RENDER_ARMOUR_BACKGROUND_DES, RENDER_ARMOUR_BACKGROUND).getBoolean(RENDER_ARMOUR_BACKGROUND);
	renderhealthbar = RINMAIN.config.get(CATEGORY_HEARTMOD3, RENDER_VANILLA_HEALTH_DES, RENDER_VANILLA_HEALTH).getBoolean(RENDER_VANILLA_HEALTH);
	RINMAIN.config.addCustomCategoryComment(CATEGORY_HEARTMOD3, "Mod compitable");
	modthinkersContruct = RINMAIN.config.get(CATEGORY_HEARTMOD3, mod_thinkers_Contruct_DES, mod_thinkers_Contruct).getBoolean(mod_thinkers_Contruct);
	OnlydropByPlayer = RINMAIN.config.get(CATEGORY_HEARTMOD3, OnlydropByPlayer_DES, OnlydropByPlayerd).getBoolean(OnlydropByPlayerd);
	


	if(RINMAIN.config.hasChanged()){

		RINMAIN.config.save();
		}
	}

}