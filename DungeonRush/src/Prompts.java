import java.util.ArrayList;
import java.util.Scanner;
public class Prompts
{
public static void intro()
{
    String[] profile = { "The Rogue does quadruple damage on a crit. Few can match that!",
            "The Barbarian has the highest bonus to attack roles. Consistent critting!",
            "The Soldier is a tactical expert who boosts the attacks of the frontline hero. So put your best man up front!",
            "The Dragoon is on a quest to slay the awful dragon and no one can strike true against this iron-scaled behemoth!",
            "The Priest blesses the next person in the initiative and enhances their attack rolls.",
            "The Wizard reduces the defenses of his target and makes crits easier for everyone.",
            "Press Enter to Select Your Difficulty!" };

    int selected = 0;
    while (selected != 7)
    {
        System.out.println("Take your time to familiarize yourself with each hero.\n" +
                                "Type in the number for the hero you'd like to learn about\n" +
                                "1. The Rogue \n" +
                                "2. The Barbarian \n" +
                                "3. The Soldier \n" +
                                "4. The Dragoon \n" +
                                "5. The Priest \n" +
                                "6. or The Wizard? \n" +
                                "7. I am ready to choose my adventuring party!");

        Scanner select = new Scanner(System.in);
        selected = select.nextInt();

        System.out.println(profile[selected - 1] + "\n Press Enter to return to the menu");

        Scanner advance = new Scanner(System.in);
        String advanced = advance.nextLine();
        }
    }
    public static int difficulty()
    {
        System.out.println("Choose Your Difficulty. Enter the number next to your choice. \n" +
                "1. Easy (6 party members) \n2. Medium (5 party members) \n3. Hard (4 party members)");

        int difficulty = 0;

        Scanner choice = new Scanner(System.in);
        int intChoice = choice.nextInt();
        if (intChoice < 4) {
            difficulty = 7 - intChoice;
        } else {
            difficulty = intChoice;
        }
        return difficulty;
    }

    public static Character[] buildParty(int partySize)
    {
        Character[] party = new Character[partySize];
        String[] order = { "first", "second", "third", "fourth", "fifth", "sixth" };

        for (int i = 0; i < partySize; i++) {
            System.out.println("Who will be " + order[i] + " in your party to vanquish the evils" +
                    "that lurk in the dungeon below? \n" +
                    "Enter the number next to your choice \n" +
                    "1. The Rogue \n" +
                    "2. The Barbarian \n" +
                    "3. The Soldier \n" +
                    "4. The Dragoon \n" +
                    "5. The Priest \n" +
                    "6. or The Wizard? \n");

            int choiceNum;

            Scanner choice = new Scanner(System.in);
            choiceNum = choice.nextInt();

            Character member = Character.buildChar(partySize, choiceNum);
            party[i] = member;

            System.out.println("Your party:");
            for (int k = 0; k <= i; k++)
            {
                System.out.println((k + 1) + ". " + party[k].name);
            }

            System.out.println("Press Enter to select your next character.");
            Scanner advance = new Scanner(System.in);
            String advanced = advance.nextLine();

        }
        return party;

    }
}

