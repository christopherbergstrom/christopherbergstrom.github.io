package warriorProject;
import java.util.Scanner;
public class EnemyOneFight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe;
	Player player = new Player(WeaponShop.playerHandWeapon, WeaponShop.playerRangeWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Enemy1 enemy1 = new Enemy1(); 
	static int gold = 0;
	public void enemyOneFight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		
		System.out.println("Level 1: Undead Soldier\n");
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
		System.out.println("Health: "+enemy1.getEnemyOneHealth());
		System.out.println("Sword damage: 3-5");
		System.out.println("Bow damage: 1-2");
		System.out.println("Shield block damage: 1-2\n");
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
				if (doubleDamage == 1)
				{
					if (critical == 1)
					{
						critical = player.attackHandWeapon()*4;
						System.out.println("Critical Hit!");
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(critical, enemy1.getEnemyOneDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackHandWeapon()*2;
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(doubleDamageVar, enemy1.getEnemyOneDamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackHandWeapon()*2;
						System.out.println("Critical Hit!");
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(critical, enemy1.getEnemyOneDamageBlocked());
					}
					else
					{
						player.attackHandWeapon();
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(player.getHandDamage(), enemy1.getEnemyOneDamageBlocked());
					}
				}
				System.out.println("You attack with "+player.getPowerUp()+player.getHandWeapon()+".");
			}
			else if (choiceAttack.equals("2"))
			{
				if (doubleDamage == 1 && doubleRange == 1)
				{
					if (critical == 1)
					{
						critical = player.attackRangeWeapon()*8;
						System.out.println("Critical Hit!");
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(critical, enemy1.getEnemyOneDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackRangeWeapon()*4;
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(doubleDamageVar, enemy1.getEnemyOneDamageBlocked());
					}
				}
				else if (doubleRange == 1)
				{
					if (critical == 1)
					{
						critical = player.attackRangeWeapon()*4;
						System.out.println("Critical Hit!");
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(critical, enemy1.getEnemyOneDamageBlocked());
					}
					else
					{
						doubleRangeVar = player.attackRangeWeapon()*2;
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(doubleRangeVar, enemy1.getEnemyOneDamageBlocked());
					}
				}
				else if (doubleDamage == 1)
				{
					if (critical == 1)
					{
						critical = player.attackRangeWeapon()*4;
						System.out.println("Critical Hit!");
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(critical, enemy1.getEnemyOneDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackRangeWeapon()*2;
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(doubleDamageVar, enemy1.getEnemyOneDamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackRangeWeapon()*2;
						System.out.println("Critical Hit!");
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(critical, enemy1.getEnemyOneDamageBlocked());
					}
					else
					{
						player.attackRangeWeapon();
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(player.getRangeDamage(), enemy1.getEnemyOneDamageBlocked());
					}
				}
				System.out.println("You attack with "+player.getPowerUp()+player.getRangeWeapon()+".");
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
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(critical, enemy1.getEnemyOneDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(doubleDamageVar, enemy1.getEnemyOneDamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("Critical Hit!");
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(critical, enemy1.getEnemyOneDamageBlocked());
					}
					else
					{
						player.attackMagic();
						enemy1.setEnemyOneDamageBlocked();
						enemy1.setEnemyOneDamageReceived(player.getMagicDamage(), enemy1.getEnemyOneDamageBlocked());
					}
				}
				System.out.println("You attack with "+player.getPowerUp()+player.getMagic());
			}
			enemy1.setEnemyOneHealth(enemy1.getEnemyOneHealth(), enemy1.getEnemyOneDamageReceived());
			System.out.println("The Undead Soldier blocks "+enemy1.getEnemyOneDamageBlocked()+" damage.\nYou do "+enemy1.getEnemyOneDamageReceived()+" damage to the Undead Soldier.");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1)
			{
				if (doubleGold == 1)
				{
					goldAmount = (1+(int)(Math.random()*5));
					goldAmount = goldAmount*2;
					gold += goldAmount;
					System.out.println("The Undead Soldier drops "+goldAmount+" gold");					
				}
				else
				{
					goldAmount = (1+(int)(Math.random()*5));
					gold += goldAmount;
					System.out.println("The Undead Soldier drops "+goldAmount+" gold");					
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nUndead Soldier health: "+enemy1.getEnemyOneHealth()+"\n");
			if (enemy1.getEnemyOneHealth() <= 0)
				break;
			int enemy1AttackChoice = (1+(int)(Math.random()*2));
			critical = (1+(int)(Math.random()*10));
			if (enemy1AttackChoice == 1)
			{
				enemy1.setEnemyOneHandDamage();
				System.out.println("The Undead Soldier attacks with sword.\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getHandWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy1.getEnemyOneHandDamage()/2, player.getDamageBlocked());						
					}
					else
					{
						player.setDamageReceived(enemy1.getEnemyOneHandDamage(), player.getDamageBlocked());						
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield()+".");
					System.out.println("You take "+player.getDamageReceived()+" damage from the Undead Soldier.");
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
								enemy1.setEnemyOneDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								enemy1.setEnemyOneDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								enemy1.setEnemyOneDamageReceived(critical, 0);
							}
							else
							{
								player.attackHandWeapon();
								enemy1.setEnemyOneDamageReceived(player.getHandDamage(), 0);
							}
						}
						enemy1.setEnemyOneHealth(enemy1.getEnemyOneHealth(), enemy1.getEnemyOneDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack.");
						System.out.println("You do "+enemy1.getEnemyOneDamageReceived()+" damage to the Undead Soldier.");
						System.out.println("You take 0 damage from the Undead Soldier.");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*4;
								System.out.println("Critical Hit!");
								enemy1.setEnemyOneDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								enemy1.setEnemyOneDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								enemy1.setEnemyOneDamageReceived(critical, 0);
							}
							else
							{
								player.attackHandWeapon();
								enemy1.setEnemyOneDamageReceived(player.getHandDamage(), 0);
							}
						}
						enemy1.setEnemyOneHealth(enemy1.getEnemyOneHealth(), enemy1.getEnemyOneDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy1.getEnemyOneHandDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy1.getEnemyOneHandDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack.");
						System.out.println("You do "+enemy1.getEnemyOneDamageReceived()+" damage to the Undead Soldier.");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Undead Soldier.");
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
							System.out.println("The Undead Soldier drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("The Undead Soldier drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (enemy1AttackChoice == 2)
			{
				enemy1.setEnemyOneRangeDamage();
				System.out.println("Undead Soldier attacks with bow.\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getRangeWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(enemy1.getEnemyOneRangeDamage()/2, player.getDamageBlocked());
					}
					else
					{
						player.setDamageReceived(enemy1.getEnemyOneRangeDamage(), player.getDamageBlocked());
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield()+".");
					System.out.println("You take "+player.getDamageReceived()+" damage from the Undead Soldier.");
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
								enemy1.setEnemyOneDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								enemy1.setEnemyOneDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								enemy1.setEnemyOneDamageReceived(critical, 0);
							}
							else
							{
								player.attackRangeWeapon();
								enemy1.setEnemyOneDamageReceived(player.getRangeDamage(), 0);
							}
						}
						enemy1.setEnemyOneHealth(enemy1.getEnemyOneHealth(), enemy1.getEnemyOneDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack.");
						System.out.println("You do "+enemy1.getEnemyOneDamageReceived()+" damage to the Undead Soldier.");
						System.out.println("You take 0 damage from the Undead Soldier.");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*4;
								System.out.println("Critical Hit!");
								enemy1.setEnemyOneDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								enemy1.setEnemyOneDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								enemy1.setEnemyOneDamageReceived(critical, 0);
							}
							else
							{
								player.attackRangeWeapon();
								enemy1.setEnemyOneDamageReceived(player.getRangeDamage(), 0);
							}
						}
						enemy1.setEnemyOneHealth(enemy1.getEnemyOneHealth(), enemy1.getEnemyOneDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(enemy1.getEnemyOneRangeDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(enemy1.getEnemyOneRangeDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack.");
						System.out.println("You do "+enemy1.getEnemyOneDamageReceived()+" damage to the Undead Soldier.");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Undead Soldier.");
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
							System.out.println("The Undead Soldier drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("The Undead Soldier drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nUndead Soldier health: "+enemy1.getEnemyOneHealth()+"\n");
		} while ((player.getHealth() > 0) && (enemy1.getEnemyOneHealth() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (10+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
			if (City.level < 2)
				City.level = 2;
			if (City.health < 120)
				City.health = 120;
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
