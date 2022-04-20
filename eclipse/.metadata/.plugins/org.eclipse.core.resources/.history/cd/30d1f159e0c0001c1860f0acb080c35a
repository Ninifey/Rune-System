package ru.zxter.rpi.register;

import minefantasy.mf2.api.armour.ArmourDesign;
import minefantasy.mf2.api.armour.CustomArmourEntry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import ru.zxter.rpi.armor.*;
import ru.zxter.rpi.main;

public class ArmorReg {
    private static final String MODID = main.MODID;
    //Knight
    public static Item eliteknighthelmet, eliteknightplate, eliteknightpants, eliteknightboots;
    //Mercenary
    public static Item mercenaryhelmet, mercenaryplate, mercenarypants, mercenaryboots;
    //Wanderer
    public static Item wandererhelmet, wandererplate, wandererpants, wandererboots;
    //Wizard
    public static Item wizardhelmet, wizardplate, wizardpants, wizardboots;
    //Pyromancer
    public static Item pyromancerhelmet, pyromancerplate, pyromancerpants, pyromancerboots;
    //Cleric
    public static Item clerichelmet, clericplate, clericpants, clericboots;
    //PilgrimArmor
    public static Item pilgrimhelmet, pilgrimplate, pilgrimpants, pilgrimboots;


    public static final ItemArmor.ArmorMaterial eliteСhainMail = EnumHelper.addArmorMaterial("eliteСhainMail", 45, new int[]{3, 5, 4, 2}, 30);
    public static final ItemArmor.ArmorMaterial mercenarymaterial = EnumHelper.addArmorMaterial("mercenarymaterial", 43, new int[]{2, 5, 3, 2}, 30);
    public static final ItemArmor.ArmorMaterial materialthetraveler = EnumHelper.addArmorMaterial("materialthetraveler", 39, new int[]{1, 4, 3, 2}, 30);
    public static final ItemArmor.ArmorMaterial thematerialwizard = EnumHelper.addArmorMaterial("thematerialwizard", 37, new int[]{1, 3, 3, 1}, 30);
    public static final ItemArmor.ArmorMaterial thematerialofthepyromancer = EnumHelper.addArmorMaterial("thematerialofthepyromancer", 39, new int[]{1, 3, 2, 2}, 30);
    public static final ItemArmor.ArmorMaterial thematerialofthecleric = EnumHelper.addArmorMaterial("thematerialofthecleric", 41, new int[]{5, 2, 2, 2}, 30);

    public static void ArmorReg() {
        //KnightArmor
        eliteknighthelmet = new EliteKnigArmor(eliteСhainMail, 0, 0, "eliteknighthelmet", "eliteknighthelmet").setTextureName(MODID + ":" + "eliteknighthelmet");
        eliteknightplate = new EliteKnigArmor(eliteСhainMail, 0, 1, "eliteknightplate", "eliteknightplate").setTextureName(MODID + ":" + "eliteknightplate");
        eliteknightpants = new EliteKnigArmor(eliteСhainMail, 0, 2, "eliteknightpants", "eliteknightpants").setTextureName(MODID + ":" + "eliteknightpants");
        eliteknightboots = new EliteKnigArmor(eliteСhainMail, 0, 3, "eliteknightboots", "eliteknightboots").setTextureName(MODID + ":" + "eliteknightboots");

        //MercenaryArmor
        mercenaryhelmet = new MercenaryArmor(mercenarymaterial, 0, 0, "mercenaryhelmet", "mercenaryhelmet").setTextureName(MODID + ":" + "mercenaryhelmet");
        mercenaryplate = new MercenaryArmor(mercenarymaterial, 0, 1, "mercenaryplate", "mercenaryplate").setTextureName(MODID + ":" + "mercenaryplate");
        mercenarypants = new MercenaryArmor(mercenarymaterial, 0, 2, "mercenarypants", "mercenarypants").setTextureName(MODID + ":" + "mercenarypants");
        mercenaryboots = new MercenaryArmor(mercenarymaterial, 0, 3, "mercenaryboots", "mercenaryboots").setTextureName(MODID + ":" + "mercenaryboots");

        //WandererArmor
        wandererhelmet = new WandererArmor(materialthetraveler, 0, 0, "wandererhelmet", "wandererhelmet").setTextureName(MODID + ":" + "wandererhelmet");
        wandererplate = new WandererArmor(materialthetraveler, 0, 1, "wandererplate", "wandererplate").setTextureName(MODID + ":" + "wandererplate");
        wandererpants = new WandererArmor(materialthetraveler, 0, 2, "wandererpants", "wandererpants").setTextureName(MODID + ":" + "wandererpants");
        wandererboots = new WandererArmor(materialthetraveler, 0, 3, "wandererboots", "wandererboots").setTextureName(MODID + ":" + "wandererboots");

        //WizardArmor
        wizardhelmet = new WizardArmor(thematerialwizard, 0, 0, "wizardhelmet", "wizardhelmet").setTextureName(MODID + ":" + "wizardhelmet");
        wizardplate = new WizardArmor(thematerialwizard, 0, 1, "wizardplate", "wizardplate").setTextureName(MODID + ":" + "wizardplate");
        wizardpants = new WizardArmor(thematerialwizard, 0, 2, "wizardpants", "wizardpants").setTextureName(MODID + ":" + "wizardpants");
        wizardboots = new WizardArmor(thematerialwizard, 0, 3, "wizardboots", "wizardboots").setTextureName(MODID + ":" + "wizardboots");

        //PyromancerArmor
        pyromancerhelmet = new PyromancerArmor(thematerialofthepyromancer, 0, 0, "pyromancerhelmet", "pyromancerhelmet").setTextureName(MODID + ":" + "pyromancerhelmet");
        pyromancerplate = new PyromancerArmor(thematerialofthepyromancer, 0, 1, "pyromancerplate", "pyromancerplate").setTextureName(MODID + ":" + "pyromancerplate");
        pyromancerpants = new PyromancerArmor(thematerialofthepyromancer, 0, 2, "pyromancerpants", "pyromancerpants").setTextureName(MODID + ":" + "pyromancerpants");
        pyromancerboots = new PyromancerArmor(thematerialofthepyromancer, 0, 3, "pyromancerboots", "pyromancerboots").setTextureName(MODID + ":" + "pyromancerboots");

        //ClericArmor
        clerichelmet = new ClericArmor(thematerialofthecleric, 0, 0, "clerichelmet", "clerichelmet").setTextureName(MODID + ":" + "clerichelmet");
        clericplate = new ClericArmor(thematerialofthecleric, 0, 1, "clericplate", "clericplate").setTextureName(MODID + ":" + "clericplate");
        clericpants = new ClericArmor(thematerialofthecleric, 0, 2, "clericpants", "clericpants").setTextureName(MODID + ":" + "clericpants");
        clericboots = new ClericArmor(thematerialofthecleric, 0, 3, "clericboots", "clericboots").setTextureName(MODID + ":" + "clericboots");

        //PilgrimArmor
        pilgrimhelmet = new PilgrimArmor(thematerialofthecleric, 0, 0, "moonhelmet", "moonhelmet").setTextureName(MODID + ":" + "moonhelmet");
        pilgrimplate = new PilgrimArmor(thematerialofthecleric, 0, 1, "pilgrimrobes", "pilgrimrobes").setTextureName(MODID + ":" + "pilgrimrobes");
        pilgrimpants = new PilgrimArmor(thematerialofthecleric, 0, 2, "pilgrimskirt", "pilgrimskirt").setTextureName(MODID + ":" + "pilgrimskirt");
        pilgrimboots = new PilgrimArmor(thematerialofthecleric, 0, 3, "pilgrimshackles", "pilgrimshackles").setTextureName(MODID + ":" + "pilgrimshackles");
    }

   // public static void ArmorStatsReg() {
   //     CustomArmourEntry.registerItem(ArmorReg.clerichelmet, ArmourDesign.CHAINMAIL, 100.5F, "medium");
   // }
}