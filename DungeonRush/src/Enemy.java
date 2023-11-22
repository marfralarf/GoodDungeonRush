public class Enemy
{
    String name;
    Integer ac;
    Integer hp;

    public Enemy(String initName, Integer initAc, Integer initHp) {
        name = initName;
        ac = initAc;
        hp = initHp;
    }
    public static Enemy[] buildGauntlet()
    {
        Enemy[] gauntlet = new Enemy[6];

        for (int i = 0; i < gauntlet.length; i++) {
            gauntlet[i] = createEnemy(i);
        }
        return gauntlet;
    }
    public static Enemy createEnemy(int i) {

        String[] enemyName = { "Walking Shroom", "Goblin", "Skeleton", "Kobold Pack",
                "Orc", "Evil Horse", "Mandrake", "Dire Wolf",
                "Assassin", "Dark Wizard", "Cave Troll", "Dragon" };
        Integer[] enemyAc = { 8, 12, 18, 8,
                15, 10, 8, 30,
                20, 16, 14, 20 };
        Integer[] enemyHp = { 8, 13, 16, 30,
                20, 25, 50, 15,
                15, 10, 50, 40 };
        Integer[] level = { 0, 0, 0, 0,
                1, 1, 1, 1,
                2, 2, 2, 2 };

        int spawn = (int) ((Math.random() * 4));
        int floor = level[2 * i] * 4;
        int selectEnemy = spawn + floor;
        Enemy gauntlet = new Enemy(enemyName[selectEnemy], enemyAc[selectEnemy], enemyHp[selectEnemy]);
        return gauntlet;
    }
}
