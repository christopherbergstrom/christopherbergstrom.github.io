package warriorProject;
import java.util.Scanner;
public class EnemyFiveFight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, enemyDodgeMaybe;
	Player player = new Player(WeaponShop.playerHandWeapon, WeaponShop.playerRangeWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Enemy5 enemy5 = new Enemy5(); 
	static int gold = 0;
	public void enemyFiveFight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		
		System.out.println("Level 5: Minotaur\n");
		System.out.println("Your stats:");
		System.out.println("Level: "+City.level);
		System.out.println("Health: "+player.getHealth());
		System.out.println(player.getHandWeapon()+" damage: "+player.getHandWeaponDamageRange());
		System.out.println(player.getRangeWeapon()+" damage: "+player.getRangeWeaponDamageRange());
		System.out.println(player.getShield()+" block damage "+player.getShieldDamageRange());
		System.out.println("Power Up damage: "+player.getPowerUp()+player.getPowerUpRange());
		System.out.println("Magic damage: "+player.getMagic()+player.getMagicDamageRange());
		System.out.println("Dodge percentage: 50%");
		System.out.println("\nEnemy stats:");
		System.out.println("Health: "+enemy5.getEnemyFiveHealth());
		System.out.println("Charge damage: 23-25");
		System.out.println("Axe damage: 21-22");
		System.out.println("Shield block damage: 5-8");
		System.out.println("Dodge percentage: 20%\n");
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
				int enemy4DefenseChoice = (1+(int)(Math.random()*2));
				if (enemy4DefenseChoice == 1)
				{
					if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackHandWeapon()*4;
							System.out.println("Critical Hit!");
							enemy5.setEnemyFiveDamageBlocked();
							enemy5.setEnemyFiveDamageReceived(critical, enemy5.getEnemyFiveDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHandWeapon()*2;
							enemy5.setEnemyFiveDamageBlocked();
							enemy5.setEnemyFiveDamageReceived(doubleDamageVar, enemy5.getEnemyFiveDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackHandWeapon()*2;
							System.out.println("Critical Hit!");
							enemy5.setEnemyFiveDamageBlocked();
							enemy5.setEnemyFiveDamageReceived(critical, enemy5.getEnemyFiveDamageBlocked());
						}
						else
						{
							player.attackHandWeapon();
							enemy5.setEnemyFiveDamageBlocked();
							enemy5.setEnemyFiveDamageReceived(player.getHandDamage(), enemy5.getEnemyFiveDamageBlocked());
						}
					}
					System.out.println("You attack with "+player.getPowerUp()+player.getHandWeapon()+".");
					System.out.println("The Minotaur blocks "+enemy5.getEnemyFiveDamageBlocked()+" damage.");
				}
				else if (enemy4DefenseChoice == 2)
				{
					System.out.println("You attack with "+player.getPowerUp()+player.getHandWeapon()+".");
					enemyDodgeMaybe = enemy5.enemyFiveDodge();
					if (enemyDodgeMaybe == true)
					{
						System.out.println("The Minotaur successfully dodged your attack");
						enemy5.setEnemyFiveDamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Minotaur unsuccessfully dodged your attack");
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*4;
								System.out.println("Critical Hit!");
								enemy5.setEnemyFiveDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								enemy5.setEnemyFiveDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								enemy5.setEnemyFiveDamageReceived(critical, 0);
							}
							else
							{
								player.attackHandWeapon();
								enemy5.setEnemyFiveDamageReceived(player.getHandDamage(), 0);
							}
						}
					}
				}
			}
			else if (choiceAttack.equals("2"))
			{
				int enemy4DefenseChoice = (1+(int)(Math.random()*2));
				if (enemy4DefenseChoice == 1)
				{
					if (doubleDamage == 1 && doubleRange == 1)
					{
						if (critical == 1)
						{
							critical = player.attackRangeWeapon()*8;
							System.out.println("Critical Hit!");
							enemy5.setEnemyFiveDamageBlocked();
							enemy5.setEnemyFiveDamageReceived(critical, enemy5.getEnemyFiveDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackRangeWeapon()*4;
							enemy5.setEnemyFiveDamageBlocked();
							enemy5.setEnemyFiveDamageReceived(doubleDamageVar, enemy5.getEnemyFiveDamageBlocked());
						}
					}
					else if (doubleRange == 1)
					{
						if (critical == 1)
						{
							critical = player.attackRangeWeapon()*4;
							System.out.println("Critical Hit!");
							enemy5.setEnemyFiveDamageBlocked();
							enemy5.setEnemyFiveDamageReceived(critical, enemy5.getEnemyFiveDamageBlocked());
						}
						else
						{
							doubleRangeVar = player.attackRangeWeapon()*2;
							enemy5.setEnemyFiveDamageBlocked();
							enemy5.setEnemyFiveDamageReceived(doubleRangeVar, enemy5.getEnemyFiveDamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackRangeWeapon()*4;
							System.out.println("Critical Hit!");
							enemy5.setEnemyFiveDamageBlocked();
							enemy5.setEnemyFiveDamageReceived(critical, enemy5.getEnemyFiveDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackRangeWeapon()*2;
							enemy5.setEnemyFiveDamageBlocked();
							enemy5.setEnemyFiveDamageReceived(doubleDamageVar, enemy5.getEnemyFiveDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackRangeWeapon()*2;
							System.out.println("Critical Hit!");
							enemy5.setEnemyFiveDamageBlocked();
							enemy5.setEnemyFiveDamageReceived(critical, enemy5.getEnemyFiveDamageBlocked());
						}
						else
						{
							player.attackRangeWeapon();
							enemy5.setEnemyFiveDamageBlocked();
							enemy5.setEnemyFiveDamageReceived(player.getRangeDamage(), enemy5.getEnemyFiveDamageBlocked());
						}
					}
					System.out.println("You attack with "+player.getPowerUp()+player.getRangeWeapon()+".");
					System.out.println("The Minotaur blocks "+enemy5.getEnemyFiveDamageBlocked()+" damage.");
				}
				else if (enemy4DefenseChoice == 2)
				{
					System.out.println("You attack with "+player.getPowerUp()+player.getRangeWeapon()+".");
					enemyDodgeMaybe = enemy5.enemyFiveDodge();
					if (enemyDodgeMaybe == true)
					{
						System.out.println("The Minotaur successfully dodged your attack");
						enemy5.setEnemyFiveDamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Minotaur unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleRange == 1)
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*8;
								System.out.println("Critical Hit!");
								enemy5.setEnemyFiveDamageBlocked();
								enemy5.setEnemyFiveDamageReceived(critical, enemy5.getEnemyFiveDamageBlocked());
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*4;
								enemy5.setEnemyFiveDamageBlocked();
								enemy5.setEnemyFiveDamageReceived(doubleDamageVar, enemy5.getEnemyFiveDamageBlocked());
							}
						}
						else if (doubleRange == 1)
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*4;
								System.out.println("Critical Hit!");
								enemy5.setEnemyFiveDamageBlocked();
								enemy5.setEnemyFiveDamageReceived(critical, enemy5.getEnemyFiveDamageBlocked());
							}
							else
							{
								doubleRangeVar = player.attackRangeWeapon()*2;
								enemy5.setEnemyFiveDamageBlocked();
								enemy5.setEnemyFiveDamageReceived(doubleRangeVar, enemy5.getEnemyFiveDamageBlocked());
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*4;
								System.out.println("Critical Hit!");
								enemy5.setEnemyFiveDamageBlocked();
								enemy5.setEnemyFiveDamageReceived(critical, enemy5.getEnemyFiveDamageBlocked());
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								enemy5.setEnemyFiveDamageBlocked();
								enemy5.setEnemyFiveDamageReceived(doubleDamageVar, enemy5.getEnemyFiveDamageBlocked());
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								enemy5.setEnemyFiveDamageBlocked();
								enemy5.setEnemyFiveDamageReceived(critical, enemy5.getEnemyFiveDamageBlocked());
							}
							else
							{
								player.attackRangeWeapon();
								enemy5.setEnemyFiveDamageBlocked();
								enemy5.setEnemyFiveDamageReceived(player.getRangeDamage(), enemy5.getEnemyFiveDamageBlocked());
							}
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
						enemy5.setEnemyFiveDamageBlocked();
						enemy5.setEnemyFiveDamageReceived(critical, enemy5.getEnemyFiveDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						enemy5.setEnemyFiveDamageBlocked();
						enemy5.setEnemyFiveDamageReceived(doubleDamageVar, enemy5.getEnemyFiveDamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("Critical Hit!");
						enemy5.setEnemyFiveDamageBlocked();
						enemy5.setEnemyFiveDamageReceived(critical, enemy5.getEnemyFiveDamageBlocked());
					}
					else
					{
						player.attackMagic();
						enemy5.setEnemyFiveDamageBlocked();
						enemy5.setEnemyFiveDamageReceived(player.getMagicDamage(), enemy5.getEnemyFiveDamageBlocked());
					}
				}
				System.out.println("You attack with "+player.getPowerUp()+player.getMagic());
			}
			enemy5.setEnemyFiveHealth(enemy5.getEnemyFiveHealth(), enemy5.getEnemyFiveDamageReceived());
			System.out.println("You do "+enemy5.getEnemyFiveDamageReceived()+" damage to the Minotaur.");
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
						System.out.println("The Minotaur drops "+goldAmount+" gold");					
					}
					else
					{
						goldAmount = (1+(int)(Math.random()*5));
						gold += goldAmount;
						System.out.println("The Minotaur drops "+goldAmount+" gold");					
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nMinotaur health: "+enemy5.getEnemyFiveHealth()+"\n");
			if (enemy5.getEnemyFiveHealth() <= 0)
				break;
			int enemy5AttackChoice = (1+(int)(Math.random()*2));
			critical = (1+(int)(Math.random()*10));
			if (enemy5AttackChoice == 1)
			{
				enemy5.setEnemyFiveHandDamage();
				System.out.println("The Minotaur attacks with axe.\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getHandWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy5.getEnemyFiveHandDamage()/2, player.getDamageBlocked());						
					}
					else
					{
						player.setDamageReceived(enemy5.getEnemyFiveHandDamage(), player.getDamageBlocked());						
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield()+".");
					System.out.println("You take "+player.getDamageReceived()+" damage from the Minotaur.");
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
								enemy5.setEnemyFiveDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								enemy5.setEnemyFiveDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								enemy5.setEnemyFiveDamageReceived(critical, 0);
							}
							else
							{
								player.attackHandWeapon();
								enemy5.setEnemyFiveDamageReceived(player.getHandDamage(), 0);
							}
						}
						enemy5.setEnemyFiveHealth(enemy5.getEnemyFiveHealth(), enemy5.getEnemyFiveDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack.");
						System.out.println("You do "+enemy5.getEnemyFiveDamageReceived()+" damage to the Minotaur.");
						System.out.println("You take 0 damage from the Minotaur.");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*4;
								System.out.println("Critical Hit!");
								enemy5.setEnemyFiveDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								enemy5.setEnemyFiveDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								enemy5.setEnemyFiveDamageReceived(critical, 0);
							}
							else
							{
								player.attackHandWeapon();
								enemy5.setEnemyFiveDamageReceived(player.getHandDamage(), 0);
							}
						}
						enemy5.setEnemyFiveHealth(enemy5.getEnemyFiveHealth(), enemy5.getEnemyFiveDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy5.getEnemyFiveHandDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy5.getEnemyFiveHandDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack.");
						System.out.println("You do "+enemy5.getEnemyFiveDamageReceived()+" damage to the Minotaur.");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Minotaur.");
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
							System.out.println("The Minotaur drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("The Minotaur drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (enemy5AttackChoice == 2)
			{
				enemy5.setEnemyFiveChargeDamage();
				System.out.println("Minotaur charges at you.\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getRangeWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy5.getEnemyFiveChargeDamage()/2, player.getDamageBlocked());						
					}
					else
					{
						player.setDamageReceived(enemy5.getEnemyFiveChargeDamage(), player.getDamageBlocked());						
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield()+".");
					System.out.println("You take "+player.getDamageReceived()+" damage from the Minotaur.");
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
								enemy5.setEnemyFiveDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								enemy5.setEnemyFiveDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								enemy5.setEnemyFiveDamageReceived(critical, 0);
							}
							else
							{
								player.attackRangeWeapon();
								enemy5.setEnemyFiveDamageReceived(player.getRangeDamage(), 0);
							}
						}
						enemy5.setEnemyFiveHealth(enemy5.getEnemyFiveHealth(), enemy5.getEnemyFiveDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack.");
						System.out.println("You do "+enemy5.getEnemyFiveDamageReceived()+" damage to the Minotaur.");
						System.out.println("You take 0 damage from the Minotaur.");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*4;
								System.out.println("Critical Hit!");
								enemy5.setEnemyFiveDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								enemy5.setEnemyFiveDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								enemy5.setEnemyFiveDamageReceived(critical, 0);
							}
							else
							{
								player.attackRangeWeapon();
								enemy5.setEnemyFiveDamageReceived(player.getRangeDamage(), 0);
							}
						}
						enemy5.setEnemyFiveHealth(enemy5.getEnemyFiveHealth(), enemy5.getEnemyFiveDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy5.getEnemyFiveChargeDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy5.getEnemyFiveChargeDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack.");
						System.out.println("You do "+enemy5.getEnemyFiveDamageReceived()+" damage to the Minotaur.");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Minotaur.");
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
							System.out.println("The Minotaur drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("The Minotaur drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nMinotaur health: "+enemy5.getEnemyFiveHealth()+"\n");
		} while ((player.getHealth() > 0) && (enemy5.getEnemyFiveHealth() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (10+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
			if (City.level < 6)
				City.level = 6;
			if (City.health < 200)
				City.health = 200;
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
