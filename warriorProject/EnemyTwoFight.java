package warriorProject;
import java.util.Scanner;
public class EnemyTwoFight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, enemyDodgeMaybe;
	Player player = new Player(WeaponShop.playerHandWeapon, WeaponShop.playerRangeWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Enemy2 enemy2 = new Enemy2(); 
	static int gold = 0;
	public void enemyTwoFight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		
		System.out.println("Level 2: Harpy\n");
		System.out.println("Your stats:");
		System.out.println("Level: "+City.level);
		System.out.println("Health: "+player.getHealth());
		System.out.println(player.getHandWeapon()+" damage: "+player.getHandWeaponDamageRange());
		System.out.println(player.getRangeWeapon()+" damage: "+player.getRangeWeaponDamageRange());
		System.out.println(player.getShield()+" block damage: "+player.getShieldDamageRange());
		System.out.println("Power Up damage: "+player.getPowerUp()+player.getPowerUpRange());
		System.out.println("Magic damage: "+player.getMagic()+player.getMagicDamageRange());
		System.out.println("Dodge percentage: 50%");
		System.out.println("\nEnemy stats:");
		System.out.println("Health: "+enemy2.getEnemyTwoHealth());
		System.out.println("Claws damage: 8-10");
		System.out.println("Acid Spit damage: 6-7");
		System.out.println("Dodge percentage: 5%\n");
		Scanner input = new Scanner(System.in);
		int magicCount = 2;
		int doubleDamageVar;
		int doubleRangeVar;
		boolean magicAttack = false;
		do
		{
			int doubleDamage = (1+(int)(Math.random()*10)); 
			int doubleRange = (1+(int)(Math.random()*10)); 
			int halfDamage = (1+(int)(Math.random()*10));
			int doubleGold = (1+(int)(Math.random()*10));
			int critical = (1+(int)(Math.random()*10));
			int dropGold = (1+(int)(Math.random()*10));
			int goldAmount = (1+(int)(Math.random()*5));
			if (magicAttack == false)
				magicCount++;			
			if (magicCount % 3 == 0 && !player.getMagic().equals(""))
				magicAttack = true;
			if (doubleDamage == 1)
				System.out.println("Double Damage Dealing Round!");
			if (doubleRange == 1)
				System.out.println("Double Fire Range Weapon Round!");
			if (halfDamage == 1)
				System.out.println("Half Damage Taking Round!");
			if (doubleGold == 1)
				System.out.println("Double Gold Dropped Round!");
			System.out.println("(1) Attack with "+player.getPowerUp()+player.getRangeWeapon());
			if (magicAttack == true)
				System.out.println("(2) Attack with "+player.getPowerUp()+player.getMagic());
			choiceAttack = input.next();
			if (choiceAttack.equals("1"))
			{
				System.out.println("You attack with "+player.getPowerUp()+player.getRangeWeapon()+".");
				enemyDodgeMaybe = enemy2.enemyTwoDodge();
				if (enemyDodgeMaybe == true)
				{
					System.out.println("The Harpy successfully dodged your attack");
					enemy2.setEnemyTwoDamageReceived(0);
				}
				else
				{
					System.out.println("The Harpy unsuccessfully dodged your attack");
					if (doubleDamage == 1 && doubleRange == 1)
					{
						if (critical == 1)
						{
							critical = player.attackRangeWeapon()*8;
							System.out.println("Critical Hit!");
							enemy2.setEnemyTwoDamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackRangeWeapon()*4;
							enemy2.setEnemyTwoDamageReceived(doubleDamageVar);
						}
					}
					else if (doubleRange == 1)
					{
						if (critical == 1)
						{
							critical = player.attackRangeWeapon()*4;
							System.out.println("Critical Hit!");
							enemy2.setEnemyTwoDamageReceived(critical);
						}
						else
						{
							doubleRangeVar = player.attackRangeWeapon()*2;
							enemy2.setEnemyTwoDamageReceived(doubleRangeVar);
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackRangeWeapon()*4;
							System.out.println("Critical Hit!");
							enemy2.setEnemyTwoDamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackRangeWeapon()*2;
							enemy2.setEnemyTwoDamageReceived(doubleDamageVar);
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackRangeWeapon()*2;
							System.out.println("Critical Hit!");
							enemy2.setEnemyTwoDamageReceived(critical);
						}
						else
						{
							player.attackRangeWeapon();
							enemy2.setEnemyTwoDamageReceived(player.getRangeDamage());
						}
					}
				}
			}
			else if (magicAttack == true && choiceAttack.equals("2"))
			{
				magicAttack = false;
				if (doubleDamage == 1)
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*4;
						System.out.println("Critical Hit!");
						enemy2.setEnemyTwoDamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						enemy2.setEnemyTwoDamageReceived(doubleDamageVar);
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("Critical Hit!");
						enemy2.setEnemyTwoDamageReceived(critical);
					}
					else
					{
						player.attackMagic();
						enemy2.setEnemyTwoDamageReceived(player.getMagicDamage());
					}
				}
				System.out.println("You attack with "+player.getPowerUp()+player.getMagic());
			}
			enemy2.setEnemyTwoHealth(enemy2.getEnemyTwoHealth(), enemy2.getEnemyTwoDamageReceived());
			System.out.println("You do "+enemy2.getEnemyTwoDamageReceived()+" damage to the Harpy.");
			if (enemyDodgeMaybe == false)
			{
				dropGold = (1+(int)(Math.random()*10));
				if (dropGold == 1)
				{
					if (doubleGold == 1)
					{
						goldAmount = (1+(int)(Math.random()*5));
						goldAmount = goldAmount*2;
						gold += goldAmount;
						System.out.println("The Harpy drops "+goldAmount+" gold");					
					}
					else
					{
						goldAmount = (1+(int)(Math.random()*5));
						gold += goldAmount;
						System.out.println("The Harpy drops "+goldAmount+" gold");					
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nHarpy health: "+enemy2.getEnemyTwoHealth()+"\n");
			if (enemy2.getEnemyTwoHealth() <= 0)
				break;
			int enemy2AttackChoice = (1+(int)(Math.random()*2));
			critical = (1+(int)(Math.random()*10));
			if (enemy2AttackChoice == 1)
			{
				enemy2.setEnemyTwoClawDamage();
				System.out.println("The Harpy dives towards you and attacks with claws.\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getHandWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy2.getEnemyTwoClawDamage()/2, player.getDamageBlocked());						
					}
					else
					{
						player.setDamageReceived(enemy2.getEnemyTwoClawDamage(), player.getDamageBlocked());						
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield()+".");
					System.out.println("You take "+player.getDamageReceived()+" damage from the Harpy.");
					player.calculateHealth();
				}
				else if (choiceDefense.equals("2"))
				{
					dodgeMaybe = player.dodge();
					if (dodgeMaybe == true)
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*4;
								System.out.println("Critical Hit!");
								enemy2.setEnemyTwoDamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								enemy2.setEnemyTwoDamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								enemy2.setEnemyTwoDamageReceived(critical);
							}
							else
							{
								player.attackHandWeapon();
								enemy2.setEnemyTwoDamageReceived(player.getHandDamage());
							}
						}
						enemy2.setEnemyTwoHealth(enemy2.getEnemyTwoHealth(), enemy2.getEnemyTwoDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack.");
						System.out.println("You do "+enemy2.getEnemyTwoDamageReceived()+" damage to the Harpy.");
						System.out.println("You take 0 damage from the Harpy.");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*4;
								System.out.println("Critical Hit!");
								enemy2.setEnemyTwoDamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								enemy2.setEnemyTwoDamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								enemy2.setEnemyTwoDamageReceived(critical);
							}
							else
							{
								player.attackHandWeapon();
								enemy2.setEnemyTwoDamageReceived(player.getHandDamage());
							}
						}
						enemy2.setEnemyTwoHealth(enemy2.getEnemyTwoHealth(), enemy2.getEnemyTwoDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy2.getEnemyTwoClawDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy2.getEnemyTwoClawDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack.");
						System.out.println("You do "+enemy2.getEnemyTwoDamageReceived()+" damage to the Harpy.");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Harpy.");
						player.calculateHealth();
					}
					dropGold = (1+(int)(Math.random()*10));
					if (dropGold == 1)
					{
						if (doubleGold == 1)
						{
							goldAmount = (1+(int)(Math.random()*5));
							goldAmount = goldAmount*2;
							gold += goldAmount;
							System.out.println("The Harpy drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("The Harpy drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (enemy2AttackChoice == 2)
			{
				enemy2.setEnemyTwoAcidDamage();
				System.out.println("Harpy attacks with acid spit.\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getRangeWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy2.getEnemyTwoAcidDamage()/2, player.getDamageBlocked());						
					}
					else
					{
						player.setDamageReceived(enemy2.getEnemyTwoAcidDamage(), player.getDamageBlocked());						
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield()+".");
					System.out.println("You take "+player.getDamageReceived()+" damage from the Harpy.");
					player.calculateHealth();
				}
				else if (choiceDefense.equals("2"))
				{
					dodgeMaybe = player.dodge();
					if (dodgeMaybe == true)
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*4;
								System.out.println("Critical Hit!");
								enemy2.setEnemyTwoDamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								enemy2.setEnemyTwoDamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								enemy2.setEnemyTwoDamageReceived(critical);
							}
							else
							{
								player.attackRangeWeapon();
								enemy2.setEnemyTwoDamageReceived(player.getRangeDamage());
							}
						}
						enemy2.setEnemyTwoHealth(enemy2.getEnemyTwoHealth(), enemy2.getEnemyTwoDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack.");
						System.out.println("You do "+enemy2.getEnemyTwoDamageReceived()+" damage to the Harpy.");
						System.out.println("You take 0 damage from the Harpy.");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*4;
								System.out.println("Critical Hit!");
								enemy2.setEnemyTwoDamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								enemy2.setEnemyTwoDamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								enemy2.setEnemyTwoDamageReceived(critical);
							}
							else
							{
								player.attackRangeWeapon();
								enemy2.setEnemyTwoDamageReceived(player.getRangeDamage());
							}
						}
						enemy2.setEnemyTwoHealth(enemy2.getEnemyTwoHealth(), enemy2.getEnemyTwoDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy2.getEnemyTwoAcidDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy2.getEnemyTwoAcidDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack.");
						System.out.println("You do "+enemy2.getEnemyTwoDamageReceived()+" damage to the Harpy.");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Harpy.");
						player.calculateHealth();
					}
					dropGold = (1+(int)(Math.random()*10));
					if (dropGold == 1)
					{
						if (doubleGold == 1)
						{
							goldAmount = (1+(int)(Math.random()*5));
							goldAmount = goldAmount*2;
							gold += goldAmount;
							System.out.println("The Harpy drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("The Harpy drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nHarpy health: "+enemy2.getEnemyTwoHealth()+"\n");
		} while ((player.getHealth() > 0) && (enemy2.getEnemyTwoHealth() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (10+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
			if (City.level < 3)
				City.level = 3;
			if (City.health < 140)
				City.health = 140;
		}
		else
		{
			System.out.println("Defeat");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
		}
	}
}
