import java.util.ArrayList;
import java.util.Scanner;

public class Character
{
    String name;
    String weapon;
    int bonus;
    int damage;
    int special;
    public static String[] charName = {"Rogue", "Barbarian", "Soldier", "Dragoon", "Priest", "Wizard"};
    public static String[] charWeap = {"Dagger", "Broadsword", "Glaive", "Halberd", "Sceptor", "Wand"};
    public static Integer[] charDamage = { 8, 10, 15, 18, 6, 4 };
    public static Integer[] charBonus = { 8, 10, 7, 6, 4, 3 };
    public static Integer[] charSpecial = { 4, 2, 2, 2, 2, 3 };
    public Character(String initName, String initWeapon, int initBonus, int initDamage, int initSpecial)
    {
        name = initName;
        weapon = initWeapon;
        bonus = initBonus;
        damage = initDamage;
        special = initSpecial;
    }
    public static Character buildChar(int diff, int select) {
        Character member = new Character(charName[select - 1], charWeap[select - 1], charDamage[select - 1], charBonus[select - 1], charSpecial[select - 1]);
        return member;
    }

}
