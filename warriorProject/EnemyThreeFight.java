package warriorProject;
import java.util.Scanner;
public class EnemyThreeFight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, enemyDodgeMaybe;
	Player player = new Player(WeaponShop.playerHandWeapon, WeaponShop.playerRangeWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Enemy3 enemy3 = new Enemy3(); 
	static int gold = 0;
	public void enemyThreeFight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		
		System.out.println("Level 3: Gorgon\n");
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
		System.out.println("Health: "+enemy3.getEnemyThreeHealth());
		System.out.println("Tail damage: 13-15");
		System.out.println("Claws damage: 11-12");
		System.out.println("Dodge percentage: 10%\n");
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
			System.out.println("(1) Attack with "+player.getPowerUp()+player.getHandWeapon()+"\n(2) Attack with "+player.getPowerUp()+player.getRangeWeapon());
			if (magicAttack == true)
				System.out.println("(3) Attack with "+player.getPowerUp()+player.getMagic());
			choiceAttack = input.next();
			if (choiceAttack.equals("1"))
			{
				System.out.println("You attack with "+player.getPowerUp()+player.getHandWeapon()+".");
				enemyDodgeMaybe = enemy3.enemyThreeDodge();
				if (enemyDodgeMaybe == true)
				{
					System.out.println("The Gorgon successfully dodged your attack");
					enemy3.setEnemyThreeDamageReceived(0);
				}
				else
				{
					System.out.println("The Gorgon unsuccessfully dodged your attack");
					if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHandWeapon()*4;
							System.out.println("Critical Hit!");
							enemy3.setEnemyThreeDamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackHandWeapon()*2;
							enemy3.setEnemyThreeDamageReceived(doubleDamageVar);
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackHandWeapon()*2;
							System.out.println("Critical Hit!");
							enemy3.setEnemyThreeDamageReceived(critical);
						}
						else
						{
							player.attackHandWeapon();
							enemy3.setEnemyThreeDamageReceived(player.getHandDamage());
						}
					}
				}
			}
			else if (choiceAttack.equals("2"))
			{
				System.out.println("You attack with "+player.getPowerUp()+player.getRangeWeapon()+".");
				enemyDodgeMaybe = enemy3.enemyThreeDodge();
				if (enemyDodgeMaybe == true)
				{
					System.out.println("The Gorgon successfully dodged your attack");
					enemy3.setEnemyThreeDamageReceived(0);
				}
				else
				{
					System.out.println("The Gorgon unsuccessfully dodged your attack");
					if (doubleDamage == 1 && doubleRange == 1)
					{
						if (critical == 1)
						{
							critical = player.attackRangeWeapon()*8;
							System.out.println("Critical Hit!");
							enemy3.setEnemyThreeDamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackRangeWeapon()*4;
							enemy3.setEnemyThreeDamageReceived(doubleDamageVar);
						}
					}
					else if (doubleRange == 1)
					{
						if (critical == 1)
						{
							critical = player.attackRangeWeapon()*4;
							System.out.println("Critical Hit!");
							enemy3.setEnemyThreeDamageReceived(critical);
						}
						else
						{
							doubleRangeVar = player.attackRangeWeapon()*2;
							enemy3.setEnemyThreeDamageReceived(doubleRangeVar);
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackRangeWeapon()*4;
							System.out.println("Critical Hit!");
							enemy3.setEnemyThreeDamageReceived(critical);
						}
						else
						{
							doubleDamageVar = player.attackRangeWeapon()*2;
							enemy3.setEnemyThreeDamageReceived(doubleDamageVar);
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackRangeWeapon()*2;
							System.out.println("Critical Hit!");
							enemy3.setEnemyThreeDamageReceived(critical);
						}
						else
						{
							player.attackRangeWeapon();
							enemy3.setEnemyThreeDamageReceived(player.getRangeDamage());
						}
					}
				}
			}
			else if (magicAttack == true && choiceAttack.equals("3"))
			{
				magicAttack = false;
				if (doubleDamage == 1)
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*4;
						System.out.println("Critical Hit!");
						enemy3.setEnemyThreeDamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						enemy3.setEnemyThreeDamageReceived(doubleDamageVar);
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("Critical Hit!");
						enemy3.setEnemyThreeDamageReceived(critical);
					}
					else
					{
						player.attackMagic();
						enemy3.setEnemyThreeDamageReceived(player.getMagicDamage());
					}
				}
				System.out.println("You attack with "+player.getPowerUp()+player.getMagic());
			}
			enemy3.setEnemyThreeHealth(enemy3.getEnemyThreeHealth(), enemy3.getEnemyThreeDamageReceived());
			System.out.println("You do "+enemy3.getEnemyThreeDamageReceived()+" damage to the Gorgon.");
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
						System.out.println("The Gorgon drops "+goldAmount+" gold");					
					}
					else
					{
						goldAmount = (1+(int)(Math.random()*5));
						gold += goldAmount;
						System.out.println("The Gorgon drops "+goldAmount+" gold");					
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nGorgon health: "+enemy3.getEnemyThreeHealth()+"\n");
			if (enemy3.getEnemyThreeHealth() <= 0)
				break;
			int enemy3AttackChoice = (1+(int)(Math.random()*2));
			critical = (1+(int)(Math.random()*10));
			if (enemy3AttackChoice == 1)
			{
				enemy3.setEnemyThreeClawDamage();
				System.out.println("The Gorgon attacks with claws.\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getHandWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy3.getEnemyThreeClawDamage()/2, player.getDamageBlocked());						
					}
					else
					{
						player.setDamageReceived(enemy3.getEnemyThreeClawDamage(), player.getDamageBlocked());						
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield()+".");
					System.out.println("You take "+player.getDamageReceived()+" damage from the Gorgon.");
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
								enemy3.setEnemyThreeDamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								enemy3.setEnemyThreeDamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								enemy3.setEnemyThreeDamageReceived(critical);
							}
							else
							{
								player.attackHandWeapon();
								enemy3.setEnemyThreeDamageReceived(player.getHandDamage());
							}
						}
						enemy3.setEnemyThreeHealth(enemy3.getEnemyThreeHealth(), enemy3.getEnemyThreeDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack.");
						System.out.println("You do "+enemy3.getEnemyThreeDamageReceived()+" damage to the Gorgon.");
						System.out.println("You take 0 damage from the Gorgon.");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*4;
								System.out.println("Critical Hit!");
								enemy3.setEnemyThreeDamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								enemy3.setEnemyThreeDamageReceived(doubleDamageVar);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								enemy3.setEnemyThreeDamageReceived(critical);
							}
							else
							{
								player.attackHandWeapon();
								enemy3.setEnemyThreeDamageReceived(player.getHandDamage());
							}
						}
						enemy3.setEnemyThreeHealth(enemy3.getEnemyThreeHealth(), enemy3.getEnemyThreeDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy3.getEnemyThreeClawDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy3.getEnemyThreeClawDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack.");
						System.out.println("You do "+enemy3.getEnemyThreeDamageReceived()+" damage to the Gorgon.");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Gorgon.");
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
							System.out.println("The Gorgon drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("The Gorgon drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (enemy3AttackChoice == 2)
			{
				enemy3.setEnemyThreeTailDamage();
				System.out.println("Gorgon attacks with tail.\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getRangeWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy3.getEnemyThreeTailDamage()/2, player.getDamageBlocked());						
					}
					else
					{
						player.setDamageReceived(enemy3.getEnemyThreeTailDamage(), player.getDamageBlocked());						
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield()+".");
					System.out.println("You take "+player.getDamageReceived()+" damage from the Gorgon.");
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
								enemy3.setEnemyThreeDamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								enemy3.setEnemyThreeDamageReceived(doubleDamageVar);
							}
							enemy3.setEnemyThreeHealth(enemy3.getEnemyThreeHealth(), enemy3.getEnemyThreeDamageReceived());
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								enemy3.setEnemyThreeDamageReceived(critical);
							}
							else
							{
								player.attackRangeWeapon();
								enemy3.setEnemyThreeDamageReceived(player.getRangeDamage());
							}
							enemy3.setEnemyThreeHealth(enemy3.getEnemyThreeHealth(), enemy3.getEnemyThreeDamageReceived());
						}
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack.");
						System.out.println("You do "+enemy3.getEnemyThreeDamageReceived()+" damage to the Gorgon.");
						System.out.println("You take 0 damage from the Gorgon.");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*4;
								System.out.println("Critical Hit!");
								enemy3.setEnemyThreeDamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								enemy3.setEnemyThreeDamageReceived(doubleDamageVar);
							}
							enemy3.setEnemyThreeHealth(enemy3.getEnemyThreeHealth(), enemy3.getEnemyThreeDamageReceived());
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								enemy3.setEnemyThreeDamageReceived(critical);
							}
							else
							{
								player.attackRangeWeapon();
								enemy3.setEnemyThreeDamageReceived(player.getRangeDamage());
							}
							enemy3.setEnemyThreeHealth(enemy3.getEnemyThreeHealth(), enemy3.getEnemyThreeDamageReceived());
						}
						enemy3.setEnemyThreeHealth(enemy3.getEnemyThreeHealth(), enemy3.getEnemyThreeDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy3.getEnemyThreeTailDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy3.getEnemyThreeTailDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack.");
						System.out.println("You do "+enemy3.getEnemyThreeDamageReceived()+" damage to the Gorgon.");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Gorgon.");
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
							System.out.println("The Gorgon drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("The Gorgon drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nGorgon health: "+enemy3.getEnemyThreeHealth()+"\n");
		} while ((player.getHealth() > 0) && (enemy3.getEnemyThreeHealth() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (10+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
			if (City.level < 4)
				City.level = 4;
			if (City.health < 160)
				City.health = 160;
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
