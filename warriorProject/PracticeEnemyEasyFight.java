package warriorProject;
import java.util.Scanner;
public class PracticeEnemyEasyFight
{
	private String choiceAttack;
	private String choiceDefense;
	private boolean dodgeMaybe;
	Player player = new Player(WeaponShop.playerHandWeapon, WeaponShop.playerRangeWeapon, WeaponShop.playerShield, WeaponShop.playerPowerUp, WeaponShop.playerMagic);
	PracticeEnemyEasy practiceEnemyEasy = new PracticeEnemyEasy(); 
	static int gold = 0;
	public void practiceEnemyEasyFight()
	{
		player.setLevel(City.level);
		player.setHealth(City.health);
		practiceEnemyEasy.setPracticeEnemyEasyHealth(100, 0);
		
		System.out.println("Practice Enemy Easy\n");
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
		System.out.println("Health: "+practiceEnemyEasy.getPracticeEnemyEasyHealth());
		System.out.println("Dagger damage: 1-3");
		System.out.println("Rock damage: 1");
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
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackHandWeapon()*2;
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackHandWeapon()*2;
						System.out.println("Critical Hit!");
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
					else
					{
						player.attackHandWeapon();
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getHandDamage(), practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
				}
				System.out.println("You attack with "+player.getPowerUp()+player.getHandWeapon());
			}
			else if (choiceAttack.equals("2"))
			{
				if (doubleDamage == 1 && doubleRange == 1)
				{
					if (critical == 1)
					{
						critical = player.attackRangeWeapon()*8;
						System.out.println("Critical Hit!");
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackRangeWeapon()*4;
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
				}
				else if (doubleRange == 1)
				{
					if (critical == 1)
					{
						critical = player.attackRangeWeapon()*4;
						System.out.println("Critical Hit!");
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
					else
					{
						doubleRangeVar = player.attackRangeWeapon()*2;
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleRangeVar, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
				}
				else if (doubleDamage == 1)
				{
					if (critical == 1)
					{
						critical = player.attackRangeWeapon()*4;
						System.out.println("Critical Hit!");
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackRangeWeapon()*2;
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackRangeWeapon()*2;
						System.out.println("Critical Hit!");
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
					else
					{
						player.attackRangeWeapon();
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getRangeDamage(), practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
				}
				System.out.println("You attack with "+player.getPowerUp()+player.getRangeWeapon());
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
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
					else
					{
						doubleDamageVar = player.attackMagic()*2;
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
				}
				else
				{
					if (critical == 1)
					{
						critical = player.attackMagic()*2;
						System.out.println("Critical Hit!");
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
					else
					{
						player.attackMagic();
						practiceEnemyEasy.setPracticeEnemyEasyDamageBlocked();
						practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getMagicDamage(), practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked());
					}
				}
				System.out.println("You attack with "+player.getPowerUp()+player.getMagic());
			}
			practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
			System.out.println("The Practice Enemy blocks "+practiceEnemyEasy.getPracticeEnemyEasyDamageBlocked()+" damage\nYou do "+practiceEnemyEasy.getPracticeEnemyEasyDamageReceived()+" damage to the Practice Enemy");
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
			System.out.println("\nYour health: "+player.getHealth()+"\nPractice Enemy health: "+practiceEnemyEasy.getPracticeEnemyEasyHealth()+"\n");
			if (practiceEnemyEasy.getPracticeEnemyEasyHealth() <= 0)
				break;
			int practiceEnemyEasyAttackChoice = (1+(int)(Math.random()*2));
			critical = (1+(int)(Math.random()*10));
			if (practiceEnemyEasyAttackChoice == 1)
			{
				practiceEnemyEasy.setPracticeEnemyEasyHandDamage();
				System.out.println("The Practice Enemy attacks with dagger\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getHandWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyHandDamage()/2, player.getDamageBlocked());
					}
					else
					{
						player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyHandDamage(), player.getDamageBlocked());
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You take "+player.getDamageReceived()+" damage from the Practice Enemy");
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
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								player.attackHandWeapon();
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getHandDamage(), 0);
							}
						}
						practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack");
						System.out.println("You do "+practiceEnemyEasy.getPracticeEnemyEasyDamageReceived()+" damage to the Practice Enemy");
						System.out.println("You take 0 damage from the Practice Enemy");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*4;
								System.out.println("Critical Hit!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackHandWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackHandWeapon()*2;
								System.out.println("Critical Hit!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								player.attackHandWeapon();
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getHandDamage(), 0);
							}
						}
						practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyHandDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyHandDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack");
						System.out.println("You do "+practiceEnemyEasy.getPracticeEnemyEasyDamageReceived()+" damage to the Practice Enemy");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Practice Enemy");
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
			else if (practiceEnemyEasyAttackChoice == 2)
			{
				practiceEnemyEasy.setPracticeEnemyEasyRangeDamage();
				System.out.println("Practice Enemy throws a rock\n");
				System.out.println("(1) Block with "+player.getPowerUp()+player.getShield()+"\n(2) Dodge and attack with "+player.getPowerUp()+player.getRangeWeapon());
				choiceDefense = input.next();
				if (choiceDefense.equals("1"))
				{
					player.block();
					if (halfDamage == 1)
					{
						player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyRangeDamage()/2, player.getDamageBlocked());
					}
					else
					{
						player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyRangeDamage(), player.getDamageBlocked());
					}
					System.out.println("You block "+player.getDamageBlocked()+" damage with "+player.getPowerUp()+player.getShield());
					System.out.println("You take "+player.getDamageReceived()+" damage from the Practice Enemy");
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
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								player.attackRangeWeapon();
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getRangeDamage(), 0);
							}
						}
						practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
						player.setHealth(player.getHealth());
						System.out.println("You successfully dodge the attack");
						System.out.println("You do "+practiceEnemyEasy.getPracticeEnemyEasyDamageReceived()+" damage to the Practice Enemy");
						System.out.println("You take 0 damage from the Practice Enemy");
					}
					else
					{
						if (doubleDamage == 1)
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*4;
								System.out.println("Critical Hit!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								doubleDamageVar = player.attackRangeWeapon()*2;
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(doubleDamageVar, 0);
							}
						}
						else
						{
							if (critical == 1)
							{
								critical = player.attackRangeWeapon()*2;
								System.out.println("Critical Hit!");
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(critical, 0);
							}
							else
							{
								player.attackRangeWeapon();
								practiceEnemyEasy.setPracticeEnemyEasyDamageReceived(player.getRangeDamage(), 0);
							}
						}
						practiceEnemyEasy.setPracticeEnemyEasyHealth(practiceEnemyEasy.getPracticeEnemyEasyHealth(), practiceEnemyEasy.getPracticeEnemyEasyDamageReceived());
						if (halfDamage == 1)
						{
							player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyRangeDamage()/2, 0);							
						}
						else
						{
							player.setDamageReceived(practiceEnemyEasy.getPracticeEnemyEasyRangeDamage(), 0);							
						}
						System.out.println("You unsuccessfully dodge the attack");
						System.out.println("You do "+practiceEnemyEasy.getPracticeEnemyEasyDamageReceived()+" damage to the Practice Enemy");
						System.out.println("You take "+player.getDamageReceived()+" damage from the Practice Enemy");
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
			System.out.println("\nYour health: "+player.getHealth()+"\nPractice Enemy health: "+practiceEnemyEasy.getPracticeEnemyEasyHealth()+"\n");
		} while ((player.getHealth() > 0) && (practiceEnemyEasy.getPracticeEnemyEasyHealth() > 0));
		if (player.getHealth() > 0)
		{
			int dropGold = 2;
			gold += dropGold;
			System.out.println("Victory!\nYou are awarded 2 gold");
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
