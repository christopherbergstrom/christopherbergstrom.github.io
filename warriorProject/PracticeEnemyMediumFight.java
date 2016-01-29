package warriorProject;
import java.util.Scanner;
public class PracticeEnemyMediumFight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe;
	Player player = new Player(WeaponShop.playerHandWeapon, WeaponShop.playerRangeWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	PracticeEnemyMedium practiceEnemyMedium = new PracticeEnemyMedium(); 
	static int gold = 0;
	public void practiceEnemyMediumFight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		practiceEnemyMedium.setPracticeEnemyMediumHealth(150, 0);
		
		System.out.println("Practice Enemy Medium\n");
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
		System.out.println("Health: "+practiceEnemyMedium.getPracticeEnemyMediumHealth());
		System.out.println("Sword damage: 6-8");
		System.out.println("Sling Shot damage: 4-5");
		System.out.println("Shield block damage: 3-4\n");
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
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackHandWeapon()*2;
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackHandWeapon()*2;
						System.out.println("Critical Hit!");
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
					else
					{
						player.attackHandWeapon();
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getHandDamage(), practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
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
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackRangeWeapon()*4;
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
				}
				else if (doubleRange == 1)
				{
					if (critical == 1)
					{
						critical = player.attackRangeWeapon()*4;
						System.out.println("Critical Hit!");
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
					else
					{
						doubleRangeVar = player.attackRangeWeapon()*2;
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleRangeVar, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
				}
				else if (doubleDamage == 1)
				{
					if (critical == 1)
					{
						critical = player.attackRangeWeapon()*4;
						System.out.println("Critical Hit!");
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackRangeWeapon()*2;
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackRangeWeapon()*2;
						System.out.println("Critical Hit!");
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
					else
					{
						player.attackRangeWeapon();
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getRangeDamage(), practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
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
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}					
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("Critical Hit!");
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}
					else
					{
						player.attackMagic();
						practiceEnemyMedium.setPracticeEnemyMediumDamageBlocked();
						practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getMagicDamage(), practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked());
					}					
				}
				System.out.println("You attack with "+player.getPowerUp()+player.getMagic());
			}
			practiceEnemyMedium.setPracticeEnemyMediumHealth(practiceEnemyMedium.getPracticeEnemyMediumHealth(), practiceEnemyMedium.getPracticeEnemyMediumDamageReceived());
			System.out.println("The Practice Enemy blocks "+practiceEnemyMedium.getPracticeEnemyMediumDamageBlocked()+" damage.\nYou do "+practiceEnemyMedium.getPracticeEnemyMediumDamageReceived()+" damage to the Practice Enemy.");
			dropGold = (1+(int)(Math.random()*10));
			if (dropGold == 1)
			{
				if (doubleGold == 1)
				{
					goldAmount = (1+(int)(Math.random()*5));
					goldAmount = goldAmount*2;
					gold += goldAmount;
					System.out.println("Practice enemy drops "+goldAmount+" gold");					
				}
				else
				{
					goldAmount = (1+(int)(Math.random()*5));
					gold += goldAmount;
					System.out.println("Practice enemy drops "+goldAmount+" gold");					
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nPractice Enemy health: "+practiceEnemyMedium.getPracticeEnemyMediumHealth()+"\n");
			if (practiceEnemyMedium.getPracticeEnemyMediumHealth() <= 0)
				break;
			int practiceEnemyMediumAttackChoice = (1+(int)(Math.random()*2));
			critical = (1+(int)(Math.random()*10));
			if (practiceEnemyMediumAttackChoice == 1)
			{
				practiceEnemyMedium.setPracticeEnemyMediumHandDamage();
				System.out.println("The Practice Enemy attacks with sword.\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getHandWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(practiceEnemyMedium.getPracticeEnemyMediumHandDamage()/2, player.getDamageBlocked());						
					}
					else
					{
						player.setDamageReceived(practiceEnemyMedium.getPracticeEnemyMediumHandDamage(), player.getDamageBlocked());						
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield()+".");
					System.out.println("You take "+player.getDamageReceived()+" damage from the Practice Enemy.");
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
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								player.attackHandWeapon();
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getHandDamage(), 0);
							}
						}
						practiceEnemyMedium.setPracticeEnemyMediumHealth(practiceEnemyMedium.getPracticeEnemyMediumHealth(), practiceEnemyMedium.getPracticeEnemyMediumDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack.");
						System.out.println("You do "+practiceEnemyMedium.getPracticeEnemyMediumDamageReceived()+" damage to the Practice Enemy.");
						System.out.println("You take 0 damage from the Practice Enemy.");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*4;
								System.out.println("Critical Hit!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								player.attackHandWeapon();
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getHandDamage(), 0);
							}
						}
						practiceEnemyMedium.setPracticeEnemyMediumHealth(practiceEnemyMedium.getPracticeEnemyMediumHealth(), practiceEnemyMedium.getPracticeEnemyMediumDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(practiceEnemyMedium.getPracticeEnemyMediumHandDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(practiceEnemyMedium.getPracticeEnemyMediumHandDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack.");
						System.out.println("You do "+practiceEnemyMedium.getPracticeEnemyMediumDamageReceived()+" damage to the Practice Enemy.");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Practice Enemy.");
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
							System.out.println("Practice enemy drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Practice enemy drops "+goldAmount+" gold");					
						}
					}
				}
			}
			else if (practiceEnemyMediumAttackChoice == 2)
			{
				practiceEnemyMedium.setPracticeEnemyMediumRangeDamage();
				System.out.println("Practice Enemy attacks with sling shot.\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getRangeWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(practiceEnemyMedium.getPracticeEnemyMediumRangeDamage()/2, player.getDamageBlocked());						
					}
					else
					{
						player.setDamageReceived(practiceEnemyMedium.getPracticeEnemyMediumRangeDamage(), player.getDamageBlocked());						
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield()+".");
					System.out.println("You take "+player.getDamageReceived()+" damage from the Practice Enemy.");
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
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								player.attackRangeWeapon();
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getRangeDamage(), 0);
							}
						}
						practiceEnemyMedium.setPracticeEnemyMediumHealth(practiceEnemyMedium.getPracticeEnemyMediumHealth(), practiceEnemyMedium.getPracticeEnemyMediumDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack.");
						System.out.println("You do "+practiceEnemyMedium.getPracticeEnemyMediumDamageReceived()+" damage to the Practice Enemy.");
						System.out.println("You take 0 damage from the Practice Enemy.");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*4;
								System.out.println("Critical Hit!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(critical, 0);
							}
							else
							{
								player.attackRangeWeapon();
								practiceEnemyMedium.setPracticeEnemyMediumDamageReceived(player.getRangeDamage(), 0);
							}
						}
						practiceEnemyMedium.setPracticeEnemyMediumHealth(practiceEnemyMedium.getPracticeEnemyMediumHealth(), practiceEnemyMedium.getPracticeEnemyMediumDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(practiceEnemyMedium.getPracticeEnemyMediumRangeDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(practiceEnemyMedium.getPracticeEnemyMediumRangeDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack.");
						System.out.println("You do "+practiceEnemyMedium.getPracticeEnemyMediumDamageReceived()+" damage to the Practice Enemy.");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Practice Enemy.");
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
							System.out.println("Practice enemy drops "+goldAmount+" gold");					
						}
						else
						{
							goldAmount = (1+(int)(Math.random()*5));
							gold += goldAmount;
							System.out.println("Practice enemy drops "+goldAmount+" gold");					
						}
					}
				}
			}
			System.out.println("\nYour health: "+player.getHealth()+"\nPractice Enemy health: "+practiceEnemyMedium.getPracticeEnemyMediumHealth()+"\n");
		} while ((player.getHealth() > 0) && (practiceEnemyMedium.getPracticeEnemyMediumHealth() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = 5;
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded 5 gold");
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
