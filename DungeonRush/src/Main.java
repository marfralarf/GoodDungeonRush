import java.util.ArrayList;
import java.util.Scanner;
import java.io.Console;
public class Main
{
    public static void main(String[] args)
    {
    Prompts.intro();

    int diff = Prompts.difficulty();

    Character[] party = Prompts.buildParty(diff);

    Enemy[] gauntlet = Enemy.buildGauntlet();

    for (int i = 0; i < gauntlet.length; i++)
    {
        System.out.println(gauntlet[i].name);
    }
    }
}
