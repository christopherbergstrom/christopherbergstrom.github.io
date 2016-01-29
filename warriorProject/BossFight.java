package warriorProject;
import java.util.Scanner;
public class BossFight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe;
	Player player = new Player(WeaponShop.playerHandWeapon, WeaponShop.playerRangeWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	Boss boss = new Boss(); 
	static int gold = 0;
	public void bossFight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		
		System.out.println("Boss: Cyclops\n");
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
		System.out.println("Health: "+boss.getBossHealth());
		System.out.println("Spiked Club damage: 28-30");
		System.out.println("Kick damage: 26-27\n");
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
						boss.setBossDamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackHandWeapon()*2;
						boss.setBossDamageReceived(doubleDamageVar);
					}					
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackHandWeapon()*2;
						System.out.println("Critical Hit!");
						boss.setBossDamageReceived(critical);
					}
					else
					{
						player.attackHandWeapon();
						boss.setBossDamageReceived(player.getHandDamage());
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
						boss.setBossDamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackRangeWeapon()*4;
						boss.setBossDamageReceived(doubleDamageVar);
					}
				}
				else if (doubleRange == 1)
				{
					if (critical == 1)
					{
						critical = player.attackRangeWeapon()*4;
						System.out.println("Critical Hit!");
						boss.setBossDamageReceived(critical);
					}
					else
					{
						doubleRangeVar = player.attackRangeWeapon()*2;
						boss.setBossDamageReceived(doubleRangeVar);
					}
				}
				else if (doubleDamage == 1)
				{
					if (critical == 1)
					{
						critical = player.attackRangeWeapon()*4;
						System.out.println("Critical Hit!");
						boss.setBossDamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackRangeWeapon()*2;
						boss.setBossDamageReceived(doubleDamageVar);
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackRangeWeapon()*2;
						System.out.println("Critical Hit!");
						boss.setBossDamageReceived(critical);
					}
					else
					{
						player.attackRangeWeapon();
						boss.setBossDamageReceived(player.getRangeDamage());
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
						boss.setBossDamageReceived(critical);
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						boss.setBossDamageReceived(doubleDamageVar);
					}					
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("Critical Hit!");
						boss.setBossDamageReceived(critical);
					}
					else
					{
						player.attackMagic();
						boss.setBossDamageReceived(player.getMagicDamage());
					}					
				}
				System.out.println("You attack with "+player.getPowerUp()+player.getMagic());
			}
			boss.setBossHealth(boss.getBossHealth(), boss.getBossDamageReceived());
			System.out.println("You do "+boss.getBossDamageReceived()+" damage to the Cyclops.");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1)
			{
				if (doubleGold == 1)
				{
					goldAmount = (1+(int)(Math.random()*5));
					goldAmount = goldAmount*2;
					gold += goldAmount;
					System.out.println("The Cyclops drops "+goldAmount+" gold");					
				}
				else
				{
					goldAmount = (1+(int)(Math.random()*5));
					gold += goldAmount;
					System.out.println("The Cyclops drops "+goldAmount+" gold");					
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nCyclops health: "+boss.getBossHealth()+"\n");
			if (boss.getBossHealth() <= 0)
				break;
			int bossAttackChoice = (1+(int)(Math.random()*2));
			critical = (1+(int)(Math.random()*10));
			if (bossAttackChoice == 1)
			{
				boss.setBossHandDamage();
				System.out.println("The Cyclops attacks with spiked club.\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getHandWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(boss.getBossHandDamage()/2, player.getDamageBlocked());						
					}
					else
					{
						player.setDamageReceived(boss.getBossHandDamage(), player.getDamageBlocked());						
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield()+".");
					System.out.println("You take "+player.getDamageReceived()+" damage from the Cyclops.");
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
								boss.setBossDamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								boss.setBossDamageReceived(doubleDamageVar);
							}							
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								boss.setBossDamageReceived(critical);
							}
							else
							{
								player.attackHandWeapon();
								boss.setBossDamageReceived(player.getHandDamage());
							}							
						}
						boss.setBossHealth(boss.getBossHealth(), boss.getBossDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack.");
						System.out.println("You do "+boss.getBossDamageReceived()+" damage to the Cyclops.");
						System.out.println("You take 0 damage from the Cyclops.");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*4;
								System.out.println("Critical Hit!");
								boss.setBossDamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								boss.setBossDamageReceived(doubleDamageVar);
							}							
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								boss.setBossDamageReceived(critical);
							}
							else
							{
								player.attackHandWeapon();
								boss.setBossDamageReceived(player.getHandDamage());
							}							
						}
						boss.setBossHealth(boss.getBossHealth(), boss.getBossDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(boss.getBossHandDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(boss.getBossHandDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack.");
						System.out.println("You do "+boss.getBossDamageReceived()+" damage to the Cyclops.");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Cyclops.");
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
							System.out.println("The Cyclops drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("The Cyclops drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (bossAttackChoice == 2)
			{
				boss.setBossFootDamage();
				System.out.println("Cyclops attacks with a kick.\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getRangeWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(boss.getBossFootDamage()/2, player.getDamageBlocked());						
					}
					else
					{
						player.setDamageReceived(boss.getBossFootDamage(), player.getDamageBlocked());						
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield()+".");
					System.out.println("You take "+player.getDamageReceived()+" damage from the Cyclops.");
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
								boss.setBossDamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								boss.setBossDamageReceived(doubleDamageVar);
							}							
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								boss.setBossDamageReceived(critical);
							}
							else
							{
								player.attackRangeWeapon();
								boss.setBossDamageReceived(player.getRangeDamage());
							}							
						}
						boss.setBossHealth(boss.getBossHealth(), boss.getBossDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack.");
						System.out.println("You do "+boss.getBossDamageReceived()+" damage to the Cyclops.");
						System.out.println("You take 0 damage from the Cyclops.");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*4;
								System.out.println("Critical Hit!");
								boss.setBossDamageReceived(critical);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								boss.setBossDamageReceived(doubleDamageVar);
							}							
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								boss.setBossDamageReceived(critical);
							}
							else
							{
								player.attackRangeWeapon();
								boss.setBossDamageReceived(player.getRangeDamage());
							}							
						}
						boss.setBossHealth(boss.getBossHealth(), boss.getBossDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(boss.getBossFootDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(boss.getBossFootDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack.");
						System.out.println("You do "+boss.getBossDamageReceived()+" damage to the Cyclops.");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Cyclops.");
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
							System.out.println("The Cyclops drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("The Cyclops drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nCyclops health: "+boss.getBossHealth()+"\n");
		} while ((player.getHealth() > 0) && (boss.getBossHealth() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = (10+(int)(Math.random()*16));
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded "+dropGold+" gold");
			System.out.println("Total gold for round: "+gold+"\n");
			City.gold += gold;
			gold = 0;
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
