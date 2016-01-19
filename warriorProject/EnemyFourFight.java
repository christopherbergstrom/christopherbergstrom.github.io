package warriorProject;
import java.util.Scanner;
public class EnemyFourFight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe, enemyDodgeMaybe;
	Player player = new Player(WeaponShop.playerHandWeapon, WeaponShop.playerRangeWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Enemy4 enemy4 = new Enemy4(); 
	static int gold = 0;
	public void enemyFourFight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		
		System.out.println("Level 4: Centaur\n");
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
		System.out.println("Health: "+enemy4.getEnemyFourHealth());
		System.out.println("Charge damage: 18-20");
		System.out.println("Mace damage: 16-17");
		System.out.println("Shield block damage: 2-5");
		System.out.println("Dodge percentage: 15%\n");
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
							enemy4.setEnemyFourDamageBlocked();
							enemy4.setEnemyFourDamageReceived(critical, enemy4.getEnemyFourDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackHandWeapon()*2;
							enemy4.setEnemyFourDamageBlocked();
							enemy4.setEnemyFourDamageReceived(doubleDamageVar, enemy4.getEnemyFourDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackHandWeapon()*2;
							System.out.println("Critical Hit!");
							enemy4.setEnemyFourDamageBlocked();
							enemy4.setEnemyFourDamageReceived(critical, enemy4.getEnemyFourDamageBlocked());
						}
						else
						{
							player.attackHandWeapon();
							enemy4.setEnemyFourDamageBlocked();
							enemy4.setEnemyFourDamageReceived(player.getHandDamage(), enemy4.getEnemyFourDamageBlocked());
						}
					}
					System.out.println("You attack with "+player.getPowerUp()+player.getHandWeapon()+".");
					System.out.println("The Centaur blocks "+enemy4.getEnemyFourDamageBlocked()+" damage.");
				}
				else if (enemy4DefenseChoice == 2)
				{
					System.out.println("You attack with "+player.getPowerUp()+player.getHandWeapon()+".");
					enemyDodgeMaybe = enemy4.enemyFourDodge();
					if (enemyDodgeMaybe == true)
					{
						System.out.println("The Centaur successfully dodged your attack");
						enemy4.setEnemyFourDamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Centaur unsuccessfully dodged your attack");
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*4;
								System.out.println("Critical Hit!");
								enemy4.setEnemyFourDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								enemy4.setEnemyFourDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								enemy4.setEnemyFourDamageReceived(critical, 0);
							}
							else
							{
								player.attackHandWeapon();
								enemy4.setEnemyFourDamageReceived(player.getHandDamage(), 0);
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
							enemy4.setEnemyFourDamageBlocked();
							enemy4.setEnemyFourDamageReceived(critical, enemy4.getEnemyFourDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackRangeWeapon()*4;
							enemy4.setEnemyFourDamageBlocked();
							enemy4.setEnemyFourDamageReceived(doubleDamageVar, enemy4.getEnemyFourDamageBlocked());
						}
					}
					else if (doubleRange == 1)
					{
						if (critical == 1)
						{
							critical = player.attackRangeWeapon()*4;
							System.out.println("Critical Hit!");
							enemy4.setEnemyFourDamageBlocked();
							enemy4.setEnemyFourDamageReceived(critical, enemy4.getEnemyFourDamageBlocked());
						}
						else
						{
							doubleRangeVar = player.attackRangeWeapon()*2;
							enemy4.setEnemyFourDamageBlocked();
							enemy4.setEnemyFourDamageReceived(doubleRangeVar, enemy4.getEnemyFourDamageBlocked());
						}
					}
					else if (doubleDamage == 1)
					{
						if (critical == 1)
						{
							critical = player.attackRangeWeapon()*4;
							System.out.println("Critical Hit!");
							enemy4.setEnemyFourDamageBlocked();
							enemy4.setEnemyFourDamageReceived(critical, enemy4.getEnemyFourDamageBlocked());
						}
						else
						{
							doubleDamageVar = player.attackRangeWeapon()*2;
							enemy4.setEnemyFourDamageBlocked();
							enemy4.setEnemyFourDamageReceived(doubleDamageVar, enemy4.getEnemyFourDamageBlocked());
						}
					}
					else
					{
						if (critical == 1)
						{
							critical = player.attackRangeWeapon()*2;
							System.out.println("Critical Hit!");
							enemy4.setEnemyFourDamageBlocked();
							enemy4.setEnemyFourDamageReceived(critical, enemy4.getEnemyFourDamageBlocked());
						}
						else
						{
							player.attackRangeWeapon();
							enemy4.setEnemyFourDamageBlocked();
							enemy4.setEnemyFourDamageReceived(player.getRangeDamage(), enemy4.getEnemyFourDamageBlocked());
						}
					}
					System.out.println("You attack with "+player.getPowerUp()+player.getRangeWeapon()+".");
					System.out.println("The Centaur blocks "+enemy4.getEnemyFourDamageBlocked()+" damage.");
				}
				else if (enemy4DefenseChoice == 2)
				{
					System.out.println("You attack with "+player.getPowerUp()+player.getRangeWeapon()+".");
					enemyDodgeMaybe = enemy4.enemyFourDodge();
					if (enemyDodgeMaybe == true)
					{
						System.out.println("The Centaur successfully dodged your attack");
						enemy4.setEnemyFourDamageReceived(0, 0);
					}
					else
					{
						System.out.println("The Centaur unsuccessfully dodged your attack");
						if (doubleDamage == 1 && doubleRange == 1)
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*8;
								System.out.println("Critical Hit!");
								enemy4.setEnemyFourDamageBlocked();
								enemy4.setEnemyFourDamageReceived(critical, enemy4.getEnemyFourDamageBlocked());
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*4;
								enemy4.setEnemyFourDamageBlocked();
								enemy4.setEnemyFourDamageReceived(doubleDamageVar, enemy4.getEnemyFourDamageBlocked());
							}
						}
						else if (doubleRange == 1)
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*4;
								System.out.println("Critical Hit!");
								enemy4.setEnemyFourDamageBlocked();
								enemy4.setEnemyFourDamageReceived(critical, enemy4.getEnemyFourDamageBlocked());
							}
							else
							{
								doubleRangeVar = player.attackRangeWeapon()*2;
								enemy4.setEnemyFourDamageBlocked();
								enemy4.setEnemyFourDamageReceived(doubleRangeVar, enemy4.getEnemyFourDamageBlocked());
							}
						}
						else if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*4;
								System.out.println("Critical Hit!");
								enemy4.setEnemyFourDamageBlocked();
								enemy4.setEnemyFourDamageReceived(critical, enemy4.getEnemyFourDamageBlocked());
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								enemy4.setEnemyFourDamageBlocked();
								enemy4.setEnemyFourDamageReceived(doubleDamageVar, enemy4.getEnemyFourDamageBlocked());
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								enemy4.setEnemyFourDamageBlocked();
								enemy4.setEnemyFourDamageReceived(critical, enemy4.getEnemyFourDamageBlocked());
							}
							else
							{
								player.attackRangeWeapon();
								enemy4.setEnemyFourDamageBlocked();
								enemy4.setEnemyFourDamageReceived(player.getRangeDamage(), enemy4.getEnemyFourDamageBlocked());
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
						enemy4.setEnemyFourDamageBlocked();
						enemy4.setEnemyFourDamageReceived(critical, enemy4.getEnemyFourDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						enemy4.setEnemyFourDamageBlocked();
						enemy4.setEnemyFourDamageReceived(doubleDamageVar, enemy4.getEnemyFourDamageBlocked());
					}					
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("Critical Hit!");
						enemy4.setEnemyFourDamageBlocked();
						enemy4.setEnemyFourDamageReceived(critical, enemy4.getEnemyFourDamageBlocked());
					}
					else
					{
						player.attackMagic();
						enemy4.setEnemyFourDamageBlocked();
						enemy4.setEnemyFourDamageReceived(player.getMagicDamage(), enemy4.getEnemyFourDamageBlocked());
					}					
				}
				System.out.println("You attack with "+player.getPowerUp()+player.getMagic());
			}
			enemy4.setEnemyFourHealth(enemy4.getEnemyFourHealth(), enemy4.getEnemyFourDamageReceived());
			System.out.println("You do "+enemy4.getEnemyFourDamageReceived()+" damage to the Centaur.");
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
						System.out.println("The Centaur drops "+goldAmount+" gold");					
					}
					else
					{
						goldAmount = (1+(int)(Math.random()*5));
						gold += goldAmount;
						System.out.println("The Centaur drops "+goldAmount+" gold");					
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nCentaur health: "+enemy4.getEnemyFourHealth()+"\n");
			if (enemy4.getEnemyFourHealth() <= 0)
				break;
			int enemy4AttackChoice = (1+(int)(Math.random()*2));
			critical = (1+(int)(Math.random()*10));
			if (enemy4AttackChoice == 1)
			{
				enemy4.setEnemyFourHandDamage();
				System.out.println("The Centaur attacks with mace.\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getHandWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy4.getEnemyFourHandDamage()/2, player.getDamageBlocked());						
					}
					else
					{
						player.setDamageReceived(enemy4.getEnemyFourHandDamage(), player.getDamageBlocked());						
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield()+".");
					System.out.println("You take "+player.getDamageReceived()+" damage from the Centaur.");
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
								enemy4.setEnemyFourDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								enemy4.setEnemyFourDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								enemy4.setEnemyFourDamageReceived(critical, 0);
							}
							else
							{
								player.attackHandWeapon();
								enemy4.setEnemyFourDamageReceived(player.getHandDamage(), 0);
							}
						}
						enemy4.setEnemyFourHealth(enemy4.getEnemyFourHealth(), enemy4.getEnemyFourDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack.");
						System.out.println("You do "+enemy4.getEnemyFourDamageReceived()+" damage to the Centaur.");
						System.out.println("You take 0 damage from the Centaur.");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*4;
								System.out.println("Critical Hit!");
								enemy4.setEnemyFourDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								enemy4.setEnemyFourDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								enemy4.setEnemyFourDamageReceived(critical, 0);
							}
							else
							{
								player.attackHandWeapon();
								enemy4.setEnemyFourDamageReceived(player.getHandDamage(), 0);
							}
						}
						enemy4.setEnemyFourHealth(enemy4.getEnemyFourHealth(), enemy4.getEnemyFourDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy4.getEnemyFourHandDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy4.getEnemyFourHandDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack.");
						System.out.println("You do "+enemy4.getEnemyFourDamageReceived()+" damage to the Centaur.");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Centaur.");
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
							System.out.println("The Centaur drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("The Centaur drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (enemy4AttackChoice == 2)
			{
				enemy4.setEnemyFourChargeDamage();
				System.out.println("Centaur charges at you.\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getRangeWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy4.getEnemyFourChargeDamage()/2, player.getDamageBlocked());						
					}
					else
					{
						player.setDamageReceived(enemy4.getEnemyFourChargeDamage(), player.getDamageBlocked());						
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield()+".");
					System.out.println("You take "+player.getDamageReceived()+" damage from the Centaur.");
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
								enemy4.setEnemyFourDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								enemy4.setEnemyFourDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								enemy4.setEnemyFourDamageReceived(critical, 0);
							}
							else
							{
								player.attackRangeWeapon();
								enemy4.setEnemyFourDamageReceived(player.getRangeDamage(), 0);
							}
						}
						enemy4.setEnemyFourHealth(enemy4.getEnemyFourHealth(), enemy4.getEnemyFourDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack.");
						System.out.println("You do "+enemy4.getEnemyFourDamageReceived()+" damage to the Centaur.");
						System.out.println("You take 0 damage from the Centaur.");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*4;
								System.out.println("Critical Hit!");
								enemy4.setEnemyFourDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								enemy4.setEnemyFourDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								enemy4.setEnemyFourDamageReceived(critical, 0);
							}
							else
							{
								player.attackRangeWeapon();
								enemy4.setEnemyFourDamageReceived(player.getRangeDamage(), 0);
							}
						}
						enemy4.setEnemyFourHealth(enemy4.getEnemyFourHealth(), enemy4.getEnemyFourDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy4.getEnemyFourChargeDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy4.getEnemyFourChargeDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack.");
						System.out.println("You do "+enemy4.getEnemyFourDamageReceived()+" damage to the Centaur.");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Centaur.");
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
							System.out.println("The Centaur drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("The Centaur drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nCentaur health: "+enemy4.getEnemyFourHealth()+"\n");
		} while ((player.getHealth() > 0) && (enemy4.getEnemyFourHealth() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (10+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
			if (City.level < 5)
				City.level = 5;
			if (City.health < 180)
				City.health = 180;
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
