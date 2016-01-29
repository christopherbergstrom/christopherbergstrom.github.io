package warriorProject;
import java.util.ArrayList;
import java.util.Scanner;
public class WeaponShop extends Player
{
	private String choiceWeaponType, choiceHand, choiceRange, choiceShield, choicePowerUp, choiceMagic;
	static String playerHandWeapon = "Shortsword", playerRangeWeapon = "Long Bow", playerShield = "Wood Shield", playerPowerUp = "", playerMagic = "";
//	public String playerHandWeapon, playerRangeWeapon, playerShield, playerPowerUp = "", playerMagic = "";
	
	ArrayList<String> purchasedWeapons = new ArrayList<>();
	public void weaponShop()
	{
		purchasedWeapons.add("Shortsword");
		purchasedWeapons.add("Long Bow");
		purchasedWeapons.add("Wood Shield");
		Scanner input = new Scanner(System.in);
		City city = new City();
		System.out.println("\n\n* * * * * * *\n Weapon Shop\n* * * * * * *\n");
		System.out.println("Gold: "+City.gold);
		System.out.println("Level: "+City.level+"\n");
		
		System.out.println("Hand Weapons      Level 1 Damage   Level 2 Damage   Level 3 Damage   Level 4 Damage   Level 5 Damage   Level 6 Damage   Cost in Gold");
		System.out.println("Shortsword             4-6              7-9             10-12            13-15            16-18            19-21              0");
		System.out.println("War Hammer             7-9             10-12            13-15            16-18            19-21            22-24             10");
		System.out.println("Spear                 10-12            13-15            16-18            19-21            22-24            25-27             20");
		System.out.println("Mystical Sword        15-40                                                                                                  25");
		System.out.println("Mace                  13-15            16-18            19-21            22-24            25-27            28-30             30");
		System.out.println("Battle Axe            16-18            19-21            22-24            25-27            28-30            31-33             40");
		System.out.println("Broadsword            19-21            22-24            25-27            28-30            31-33            34-36             50");
		System.out.println();
		System.out.println("Range Weapons     Level 1 Damage   Level 2 Damage   Level 3 Damage   Level 4 Damage   Level 5 Damage   Level 6 Damage");
		System.out.println("Long Bow               2-3              4-5              6-7             8-9              10-11            12-13              0");
		System.out.println("Throwing Knives        4-5              6-7              8-9            10-11             12-13            14-15              5");
		System.out.println("Mystical Bow           5-20                                                                                                  10");
		System.out.println("Crossbow               6-7              8-9             10-11           12-13             14-15            16-17             15");
		System.out.println();
		System.out.println("Shields           Level 1 Damage   Level 2 Damage   Level 3 Damage   Level 4 Damage   Level 5 Damage   Level 6 Damage");
		System.out.println("Wood Shield            1-3              4-6              7-9             10-12            13-15            16-18              0");
		System.out.println("Steel Shield           4-6              7-9             10-12            13-15            16-18            19-21             15");
		System.out.println("Mystical Shield       10-30                                                                                                  20");
		System.out.println("Gold Shield            7-9             10-12            13-15            16-18            19-21            22-24             25");
		System.out.println();
		System.out.println("Power Ups         Level 1 Damage   Level 2 Damage   Level 3 Damage   Level 4 Damage   Level 5 Damage   Level 6 Damage");		
		System.out.println("Ice                     +2                                                                                                   10");
		System.out.println("Fire                    +5                                                                                                   25");
		System.out.println("Lightning              +10                                                                                                   50");
		System.out.println();
		System.out.println("Magic Attacks     Level 1 Damage   Level 2 Damage   Level 3 Damage   Level 4 Damage   Level 5 Damage   Level 6 Damage");
		System.out.println("Ice Blast              5-10            10-15            15-20            20-25            25-30            30-35             35");
		System.out.println("Fire Blast            15-20            20-25            25-30            30-35            35-40            40-45             45");
		System.out.println("Lightning Blast       25-30            30-35            35-40            40-45            45-50            50-55             55");
		
		do
		{
			System.out.println("\n\nGold: "+City.gold);
			System.out.println("\n(1) Hand Weapons");
			System.out.println("(2) Range Weapons");
			System.out.println("(3) Shields");
			System.out.println("(4) Power Ups");
			System.out.println("(5) Magic Attacks");
			System.out.println("(6) Current Loadout");
			System.out.println("(7) Display Available Weapons");			
			System.out.println("(8) Exit");
			choiceWeaponType = input.next();
			if (choiceWeaponType.equals("1"))
			{
				System.out.println("(1) Shortsword      0 Gold");
				System.out.println("(2) War Hammer     10 Gold");
				System.out.println("(3) Spear          20 Gold");
				System.out.println("(4) Mystical Sword 25 Gold");
				System.out.println("(5) Mace           30 Gold");
				System.out.println("(6) Battle Axe     40 Gold");
				System.out.println("(7) Broadsword     50 Gold");
				choiceHand = input.next();
				if (choiceHand.equals("1"))
				{
					if (purchasedWeapons.contains("Shortsword"))
					{
						playerHandWeapon = "Shortsword";
						System.out.println(playerHandWeapon+" selected");
					}
					else
					{
						if (City.gold < 0)
						{
							System.out.println("Not enough gold");
							System.out.println("0 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHandWeapon = "Shortsword";
							purchasedWeapons.add(playerHandWeapon);
							City.gold -= 0;
							System.out.println(playerHandWeapon+" selected");
						}
					}
				}
				if (choiceHand.equals("2"))
				{
					if (purchasedWeapons.contains("War Hammer"))
					{
						playerHandWeapon = "War Hammer";
						System.out.println(playerHandWeapon+" selected");
					}
					else
					{
						if (City.gold < 10)
						{
							System.out.println("Not enough gold");
							System.out.println("10 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHandWeapon = "War Hammer";
							purchasedWeapons.add(playerHandWeapon);
							City.gold -= 10;
							System.out.println(playerHandWeapon+" selected");
						}
					}
				}
				if (choiceHand.equals("3"))
				{
					if (purchasedWeapons.contains("Spear"))
					{
						playerHandWeapon = "Spear";
						System.out.println(playerHandWeapon+" selected");
					}
					else
					{
						if (City.gold < 20)
						{
							System.out.println("Not enough gold");
							System.out.println("20 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHandWeapon = "Spear";
							purchasedWeapons.add(playerHandWeapon);
							City.gold -= 20;
							System.out.println(playerHandWeapon+" selected");
						}
					}
				}
				if (choiceHand.equals("4"))
				{
					if (purchasedWeapons.contains("Mystical Sword"))
					{
						playerHandWeapon = "Mystical Sword";
						System.out.println(playerHandWeapon+" selected");
					}
					else
					{
						if (City.gold < 25)
						{
							System.out.println("Not enough gold");
							System.out.println("25 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHandWeapon = "Mystical Sword";
							purchasedWeapons.add(playerHandWeapon);
							City.gold -= 25;
							System.out.println(playerHandWeapon+" selected");
						}
					}
				}
				if (choiceHand.equals("5"))
				{
					if (purchasedWeapons.contains("Mace"))
					{
						playerHandWeapon = "Mace";
						System.out.println(playerHandWeapon+" selected");
					}
					else
					{
						if (City.gold < 30)
						{
							System.out.println("Not enough gold");
							System.out.println("30 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHandWeapon = "Mace";
							purchasedWeapons.add(playerHandWeapon);
							City.gold -= 30;
							System.out.println(playerHandWeapon+" selected");
						}
					}
				}
				if (choiceHand.equals("6"))
				{
					if (purchasedWeapons.contains("Battle Axe"))
					{
						playerHandWeapon = "Battle Axe";
						System.out.println(playerHandWeapon+" selected");
					}
					else
					{
						if (City.gold < 40)
						{
							System.out.println("Not enough gold");
							System.out.println("40 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHandWeapon = "Battle Axe";
							purchasedWeapons.add(playerHandWeapon);
							City.gold -= 40;
							System.out.println(playerHandWeapon+" selected");
						}
					}
				}
				if (choiceHand.equals("7"))
				{
					if (purchasedWeapons.contains("Broadsword"))
					{
						playerHandWeapon = "Broadsword";
						System.out.println(playerHandWeapon+" selected");
					}
					else
					{
						if (City.gold < 50)
						{
							System.out.println("Not enough gold");
							System.out.println("50 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerHandWeapon = "Broadsword";
							purchasedWeapons.add(playerHandWeapon);
							City.gold -= 50;
							System.out.println(playerHandWeapon+" selected");
						}
					}
				}
			}
			if (choiceWeaponType.equals("2"))
			{
				System.out.println("(1) Long Bow        0 Gold");
				System.out.println("(2) Throwing Knives 5 Gold");
				System.out.println("(3) Mystical Bow   10 Gold");
				System.out.println("(4) Crossbow       15 Gold");
				choiceRange = input.next();
				if (choiceRange.equals("1"))
				{
					if (purchasedWeapons.contains("Long Bow"))
					{
						playerRangeWeapon = "Long Bow";
						System.out.println(playerRangeWeapon+" selected");
					}
					else
					{
						if (City.gold < 0)
						{
							System.out.println("Not enough gold");
							System.out.println("0 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerRangeWeapon = "Long Bow";
							purchasedWeapons.add(playerRangeWeapon);
							City.gold -= 0;
							System.out.println(playerRangeWeapon+" selected");
						}
					}
				}
				if (choiceRange.equals("2"))
				{
					if (purchasedWeapons.contains("Throwing Knives"))
					{
						playerRangeWeapon = "Throwing Knives";
						System.out.println(playerRangeWeapon+" selected");
					}
					else
					{
						if (City.gold < 5)
						{
							System.out.println("Not enough gold");
							System.out.println("5 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerRangeWeapon = "Throwing Knives";
							purchasedWeapons.add(playerRangeWeapon);
							City.gold -= 5;
							System.out.println(playerRangeWeapon+" selected");
						}
					}
				}
				if (choiceRange.equals("3"))
				{
					if (purchasedWeapons.contains("Mystical Bow"))
					{
						playerRangeWeapon = "Mystical Bow";
						System.out.println(playerRangeWeapon+" selected");
					}
					else
					{
						if (City.gold < 10)
						{
							System.out.println("Not enough gold");
							System.out.println("10 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerRangeWeapon = "Mystical Bow";
							purchasedWeapons.add(playerRangeWeapon);
							City.gold -= 10;
							System.out.println(playerRangeWeapon+" selected");
						}
					}
				}
				if (choiceRange.equals("4"))
				{
					if (purchasedWeapons.contains("Crossbow"))
					{
						playerRangeWeapon = "Crossbow";
						System.out.println(playerRangeWeapon+" selected");
					}
					else
					{
						if (City.gold < 15)
						{
							System.out.println("Not enough gold");
							System.out.println("15 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerRangeWeapon = "Crossbow";
							purchasedWeapons.add(playerRangeWeapon);
							City.gold -= 15;
							System.out.println(playerRangeWeapon+" selected");
						}
					}
				}
			}
			if (choiceWeaponType.equals("3"))
			{
				System.out.println("(1) Wood Shield      0 Gold");
				System.out.println("(2) Steel Shield    15 Gold");
				System.out.println("(3) Mystical Shield 20 Gold");
				System.out.println("(4) Gold Shield     25 Gold");
				choiceShield = input.next();
				if (choiceShield.equals("1"))
				{
					if (purchasedWeapons.contains("Wood Shield"))
					{
						playerShield = "Wood Shield";
						System.out.println(playerShield+" selected");
					}
					else
					{
						if (City.gold < 0)
						{
							System.out.println("Not enough gold");
							System.out.println("0 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerShield = "Wood Shield";
							purchasedWeapons.add(playerShield);
							City.gold -= 0;
							System.out.println(playerShield+" selected");
						}
					}
				}
				if (choiceShield.equals("2"))
				{
					if (purchasedWeapons.contains("Steel Shield"))
					{
						playerShield = "Steel Shield";
						System.out.println(playerShield+" selected");
					}
					else
					{
						if (City.gold < 15)
						{
							System.out.println("Not enough gold");
							System.out.println("15 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerShield = "Steel Shield";
							purchasedWeapons.add(playerShield);
							City.gold -= 15;
							System.out.println(playerShield+" selected");
						}
					}
				}
				if (choiceShield.equals("3"))
				{
					if (purchasedWeapons.contains("Mystical Shield"))
					{
						playerShield = "Mystical Shield";
						System.out.println(playerShield+" selected");
					}
					else
					{
						if (City.gold < 20)
						{
							System.out.println("Not enough gold");
							System.out.println("20 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerShield = "Mystical Shield";
							purchasedWeapons.add(playerShield);
							City.gold -= 20;
							System.out.println(playerShield+" selected");
						}
					}
				}
				if (choiceShield.equals("4"))
				{
					if (purchasedWeapons.contains("Gold Shield"))
					{
						playerShield = "Gold Shield";
						System.out.println(playerShield+" selected");
					}
					else
					{
						if (City.gold < 25)
						{
							System.out.println("Not enough gold");
							System.out.println("25 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerShield = "Gold Shield";
							purchasedWeapons.add(playerShield);
							City.gold -= 25;
							System.out.println(playerShield+" selected");
						}
					}
				}
			}
			if (choiceWeaponType.equals("4"))
			{
				System.out.println("(1) Ice       10 Gold");
				System.out.println("(2) Fire      25 Gold");
				System.out.println("(3) Lightning 50 Gold");
				choicePowerUp = input.next();
				if (choicePowerUp.equals("1"))
				{
					if (purchasedWeapons.contains("Ice"))
					{
						playerPowerUp = "Ice";
						System.out.println(playerPowerUp+" Power Up selected");
					}
					else
					{
						if (City.gold < 10)
						{
							System.out.println("Not enough gold");
							System.out.println("10 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerPowerUp = "Ice";
							purchasedWeapons.add(playerPowerUp);
							City.gold -= 10;
							System.out.println(playerPowerUp+" Power Up selected");
						}
					}
				}
				if (choicePowerUp.equals("2"))
				{
					if (purchasedWeapons.contains("Fire"))
					{
						playerPowerUp = "Fire";
						System.out.println(playerPowerUp+" Power Up selected");
					}
					else
					{
						if (City.gold < 25)
						{
							System.out.println("Not enough gold");
							System.out.println("25 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerPowerUp = "Fire";
							purchasedWeapons.add(playerPowerUp);
							City.gold -= 25;
							System.out.println(playerPowerUp+" Power Up selected");
						}
					}
				}
				if (choicePowerUp.equals("3"))
				{
					if (purchasedWeapons.contains("Lightning"))
					{
						playerPowerUp = "Lightning";
						System.out.println(playerPowerUp+" Power Up selected");
					}
					else
					{
						if (City.gold < 50)
						{
							System.out.println("Not enough gold");
							System.out.println("50 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerPowerUp = "Lightning";
							purchasedWeapons.add(playerPowerUp);
							City.gold -= 50;
							System.out.println(playerPowerUp+" Power Up selected");
						}
					}
				}
			}
			if (choiceWeaponType.equals("5"))
			{
				System.out.println("(1) Ice Blast       35 Gold");
				System.out.println("(2) Fire Blast      45 Gold");
				System.out.println("(3) Lightning Blast 55 Gold");
				choiceMagic = input.next();
				if (choiceMagic.equals("1"))
				{
					if (purchasedWeapons.contains("Ice Blast"))
					{
						playerMagic = "Ice Blast";
						System.out.println(playerMagic+" selected");
					}
					else
					{
						if (City.gold < 35)
						{
							System.out.println("Not enough gold");
							System.out.println("35 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerMagic = "Ice Blast";
							purchasedWeapons.add(playerMagic);
							City.gold -= 35;
							System.out.println(playerMagic+" selected");
						}
					}
				}
				if (choiceMagic.equals("2"))
				{
					if (purchasedWeapons.contains("Fire Blast"))
					{
						playerMagic = "Fire Blast";
						System.out.println(playerMagic+" selected");
					}
					else
					{
						if (City.gold < 45)
						{
							System.out.println("Not enough gold");
							System.out.println("45 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerMagic = "Fire Blast";
							purchasedWeapons.add(playerMagic);
							City.gold -= 45;
							System.out.println(playerMagic+" selected");
						}
					}
				}
				if (choiceMagic.equals("3"))
				{
					if (purchasedWeapons.contains("Lightning Blast"))
					{
						playerMagic = "Lightning Blast";
						System.out.println(playerMagic+" selected");
					}
					else
					{
						if (City.gold < 55)
						{
							System.out.println("Not enough gold");
							System.out.println("55 Gold needed");
							System.out.println("Gold: "+City.gold);
						}
						else
						{
							playerMagic = "Lightning Blast";
							purchasedWeapons.add(playerMagic);
							City.gold -= 55;
							System.out.println(playerMagic+" selected");
						}
					}
				}
			}			
			if (choiceWeaponType.equals("6"))
			{
				System.out.println("Hand Weapon: "+playerHandWeapon);
				System.out.println("Range Weapon: "+playerRangeWeapon);
				System.out.println("Shield: "+playerShield);
				System.out.println("Power Up: "+playerPowerUp);
				System.out.println("Magic: "+playerMagic);
			}
			if (choiceWeaponType.equals("7"))
			{
				System.out.println("\n\n* * * * * * *\n Weapon Shop\n* * * * * * *\n");
				System.out.println("Gold: "+City.gold);
				System.out.println("Level: "+City.level+"\n");
				System.out.println("Hand Weapons      Level 1 Damage   Level 2 Damage   Level 3 Damage   Level 4 Damage   Level 5 Damage   Level 6 Damage   Cost in Gold");
				System.out.println("Shortsword             4-6              7-9             10-12            13-15            16-18            19-21              0");
				System.out.println("War Hammer             7-9             10-12            13-15            16-18            19-21            22-24             10");
				System.out.println("Spear                 10-12            13-15            16-18            19-21            22-24            25-27             20");
				System.out.println("Mystical Sword        15-40                                                                                                  25");
				System.out.println("Mace                  13-15            16-18            19-21            22-24            25-27            28-30             30");
				System.out.println("Battle Axe            16-18            19-21            22-24            25-27            28-30            31-33             40");
				System.out.println("Broadsword            19-21            22-24            25-27            28-30            31-33            34-36             50");
				System.out.println();
				System.out.println("Range Weapons     Level 1 Damage   Level 2 Damage   Level 3 Damage   Level 4 Damage   Level 5 Damage   Level 6 Damage");
				System.out.println("Long Bow               2-3              4-5              6-7             8-9              10-11            12-13              0");
				System.out.println("Throwing Knives        4-5              6-7              8-9            10-11             12-13            14-15              5");
				System.out.println("Mystical Bow           5-20                                                                                                  10");
				System.out.println("Crossbow               6-7              8-9             10-11           12-13             14-15            16-17             15");
				System.out.println();
				System.out.println("Shields           Level 1 Damage   Level 2 Damage   Level 3 Damage   Level 4 Damage   Level 5 Damage   Level 6 Damage");
				System.out.println("Wood Shield            1-3              4-6              7-9             10-12            13-15            16-18              0");
				System.out.println("Steel Shield           4-6              7-9             10-12            13-15            16-18            19-21             15");
				System.out.println("Mystical Shield       10-30                                                                                                  20");
				System.out.println("Gold Shield            7-9             10-12            13-15            16-18            19-21            22-24             25");
				System.out.println();
				System.out.println("Power Ups         Level 1 Damage   Level 2 Damage   Level 3 Damage   Level 4 Damage   Level 5 Damage   Level 6 Damage");		
				System.out.println("Ice                     +2                                                                                                   10");
				System.out.println("Fire                    +5                                                                                                   25");
				System.out.println("Lightning              +10                                                                                                   50");
				System.out.println();
				System.out.println("Magic Attacks     Level 1 Damage   Level 2 Damage   Level 3 Damage   Level 4 Damage   Level 5 Damage   Level 6 Damage");
				System.out.println("Ice Blast              5-10            10-15            15-20            20-25            25-30            30-35             35");
				System.out.println("Fire Blast            15-20            20-25            25-30            30-35            35-40            40-45             45");
				System.out.println("Lightning Blast       25-30            30-35            35-40            40-45            45-50            50-55             55");
			}
			if (choiceWeaponType.equals("8"))
				city.city();
//			System.out.println(purchasedWeapons.toString());
		} while (!choiceWeaponType.equals("8"));
	}
}
