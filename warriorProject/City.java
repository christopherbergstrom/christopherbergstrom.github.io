package warriorProject;
import java.util.Scanner;
public class City
{
	static int gold = 0;	
	static int level = 1;
	static int health = 100;
	public void city()
	{
		Scanner input = new Scanner(System.in);
		String menu, quit;
		Fight1 fight1 = new Fight1();
		Fight2 fight2 = new Fight2();
		Fight3 fight3 = new Fight3();
		Fight4 fight4 = new Fight4();
		Fight5 fight5 = new Fight5();
		FightBoss fightBoss = new FightBoss();
		WeaponShop weaponShop = new WeaponShop();
		PracticeArena practice = new PracticeArena();
		do
		{
		System.out.println("\n\n* * * * * * * *\n City of Berg\n* * * * * * * *\n");
		System.out.println("Gold: "+gold);
		System.out.println("Level: "+level+"\n");
		if (level >= 1)
			System.out.println("(1) Level One");
		if (level >= 2)
			System.out.println("(2) Level Two");
		if (level >= 3)
			System.out.println("(3) Level Three");
		if (level >= 4)
			System.out.println("(4) Level Four");
		if (level >= 5)
			System.out.println("(5) Level Five");
		if (level >= 6)
			System.out.println("(6) Level Six");
		if (level >= 7)
			System.out.println("(7) Level Seven");
		if (level >= 8)
			System.out.println("(8) Level Eight");
		if (level >= 9)
			System.out.println("(9) Level Nine");
		if (level >= 10)
			System.out.println("(10) Level Ten");
			
		System.out.println("(11) Weapon Shop");
		System.out.println("(12) Practice Arena");
		System.out.println("(13) Quit");
		menu = input.next();
			if (menu.equals("1") && level >= 1)
				fight1.fight1();
			if (menu.equals("2") && level >= 2)
				fight2.fight2();
			if (menu.equals("3") && level >= 3)
				fight3.fight3();
			if (menu.equals("4") && level >= 4)
				fight4.fight4();
			if (menu.equals("5") && level >= 5)
				fight5.fight5();
//			if (menu.equals("6") && level >= 6)
//				fight6.fight6();
//			if (menu.equals("7") && level >= 7)
//				fight7.fight7();
//			if (menu.equals("8") && level >= 8)
//				fight8.fight8();
//			if (menu.equals("9") && level >= 9)
//				fight9.fight9();
			if (menu.equals("10") && level >= 10)
				fightBoss.fightBoss();
			if (menu.equals("11"))
				weaponShop.weaponShop();
			if (menu.equals("12"))
				practice.practiceArena();
			while (menu.equals("13"))
			{
				System.out.println("Are you sure you want to quit?");
				System.out.println("(1) Keep playing");
				System.out.println("(2) Quit");
				quit = input.next();
				if (quit.equals("1"))
					break;
				if (quit.equals("2"))
					System.exit(0);
			}
//			else
//				System.out.println("Wrong number");
		} while (true);
	}
}
