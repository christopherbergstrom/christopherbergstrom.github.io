package warriorProject;
//import java.util.Scanner;

public class Player
{
//	public static void main(String[] args)
//	{
//		Player player = new Player();
//		EnemyOneFight fight1 = new EnemyOneFight();
//		EnemyTwoFight fight2 = new EnemyTwoFight();
//		EnemyThreeFight fight3 = new EnemyThreeFight();
//		EnemyFourFight fight4 = new EnemyFourFight();
//		EnemyFiveFight fight5 = new EnemyFiveFight();
//		BossFight fightBoss = new BossFight();
//		PracticeArena practice = new PracticeArena();
//		WeaponShop weaponShop = new WeaponShop();
//		weaponShop.weaponShop();
//		practice.practiceArena();
//		fight1.enemyOneFight();
//		fight2.enemyTwoFight();
//		fight3.enemyThreeFight();
//		fight4.enemyFourFight();
//		fight5.enemyFiveFight();
//		fightBoss.bossFight();
//		Scanner input = new Scanner(System.in);
//	}
	Player(String hand, String range, String shield, String power, String magic)
	{
		playerHandWeapon = hand;
		playerRangeWeapon = range;
		playerShield = shield;
		playerPowerUp = power;
		playerMagic = magic;
	}
	Player()
	{
		
	}
	private String playerHandWeapon;
//	private String playerHandWeapon = "Shortsword";
	private String playerRangeWeapon;
//	private String playerRangeWeapon = "Long Bow";
	private String playerShield;
//	private String playerShield = "Wood Shield";
	private String playerPowerUp;
//	private String playerPowerUp = "";
	private String playerMagic;
//	private String playerMagic = "";
	private int healthAmount; 
	private int level;
	
	private String handWeaponDamageRange, rangeWeaponDamageRange, shieldDamageRange, powerUpRange, magicDamageRange;
	private int handDamage, rangeDamage, damageBlocked, damageReceived, magicDamage;
	private boolean dodgeAmount;
	HandWeapon handWeapon = new HandWeapon();
	RangeWeapon rangeWeapon = new RangeWeapon();
	Shield shield = new Shield();
	Magic magic = new Magic();
	Dodge dodge = new Dodge();
	Health health = new Health();
	HandWeaponDamageRange checkHandWeaponDamageRange = new HandWeaponDamageRange();
	RangeWeaponDamageRange checkRangeWeaponDamageRange = new RangeWeaponDamageRange();
	ShieldDamageRange checkShieldDamageRange = new ShieldDamageRange();
	PowerUpRange checkPowerUpRange = new PowerUpRange();
	MagicDamageRange checkMagicDamageRange = new MagicDamageRange();
	
	
	public String getHandWeapon()
	{
		return playerHandWeapon;
	}
	public int getHandDamage()
	{
		return handDamage;
	}
	public void setPlayerHandWeapon(Object playerHandWeapon)
	{
		String playerWeapon = playerHandWeapon.toString();
//		String playerWeapon = String.valueOf(playerHandWeapon);
		this.playerHandWeapon = playerWeapon;
//		return this.playerHandWeapon;
	}
	public void setPlayerHandWeapon(String playerHandWeapon)
	{
		this.playerHandWeapon = playerHandWeapon;
	}
	public String getHandWeaponDamageRange()
	{
		if (playerHandWeapon.equals("Shortsword"))
		{
			handWeaponDamageRange = checkHandWeaponDamageRange.shortsword(level);
		}
		else if (playerHandWeapon.equals("War Hammer"))
		{
			handWeaponDamageRange = checkHandWeaponDamageRange.warHammer(level);
		}
		else if (playerHandWeapon.equals("Spear"))
		{
			handWeaponDamageRange = checkHandWeaponDamageRange.spear(level);
		}
		else if (playerHandWeapon.equals("Mace"))
		{
			handWeaponDamageRange = checkHandWeaponDamageRange.mace(level);
		}
		else if (playerHandWeapon.equals("Battle Axe"))
		{
			handWeaponDamageRange = checkHandWeaponDamageRange.battleAxe(level);
		}
		else if (playerHandWeapon.equals("Broadsword"))
		{
			handWeaponDamageRange = checkHandWeaponDamageRange.broadsword(level);
		}
		else if (playerHandWeapon.equals("Mystical Sword"))
		{
			handWeaponDamageRange = checkHandWeaponDamageRange.mysticalSword();
		}
		return handWeaponDamageRange;
	}
	public int attackHandWeapon()
	{
		if (playerHandWeapon.equals("Shortsword"))
		{
			handDamage = handWeapon.shortsword(level, playerPowerUp);
		}
		else if (playerHandWeapon.equals("War Hammer"))
		{
			handDamage = handWeapon.warHammer(level, playerPowerUp);
		}
		else if (playerHandWeapon.equals("Spear"))
		{
			handDamage = handWeapon.spear(level, playerPowerUp);
		}
		else if (playerHandWeapon.equals("Mace"))
		{
			handDamage = handWeapon.mace(level, playerPowerUp);
		}
		else if (playerHandWeapon.equals("Battle Axe"))
		{
			handDamage = handWeapon.battleAxe(level, playerPowerUp);
		}
		else if (playerHandWeapon.equals("Broadsword"))
		{
			handDamage = handWeapon.broadsword(level, playerPowerUp);
		}
		else if (playerHandWeapon.equals("Mystical Sword"))
		{
			handDamage = handWeapon.mysticalSword(playerPowerUp);
		}
		return handDamage;
	}

	public String getRangeWeapon()
	{
		return playerRangeWeapon;
	}
	public int getRangeDamage()
	{
		return rangeDamage;
	}
	public void setPlayerRangeWeapon(String playerRangeWeapon)
	{
		this.playerRangeWeapon = playerRangeWeapon;
	}
	public String getRangeWeaponDamageRange()
	{
		if (playerRangeWeapon.equals("Long Bow"))
		{
			rangeWeaponDamageRange = checkRangeWeaponDamageRange.longBow(level);
		}
		else if (playerRangeWeapon.equals("Throwing Knives"))
		{
			rangeWeaponDamageRange = checkRangeWeaponDamageRange.throwingKnives(level);
		}
		else if (playerRangeWeapon.equals("Crossbow"))
		{
			rangeWeaponDamageRange = checkRangeWeaponDamageRange.crossbow(level);
		}
		else if (playerRangeWeapon.equals("Mystical Bow"))
		{
			rangeWeaponDamageRange = checkRangeWeaponDamageRange.mysticalBow();
		}
		return rangeWeaponDamageRange;
	}
	public int attackRangeWeapon()
	{
		if (playerRangeWeapon.equals("Long Bow"))
		{
			rangeDamage = rangeWeapon.longBow(level, playerPowerUp);
		}
		else if (playerRangeWeapon.equals("Throwing Knives"))
		{
			rangeDamage = rangeWeapon.throwingKnives(level, playerPowerUp);
		}
		else if (playerRangeWeapon.equals("Crossbow"))
		{
			rangeDamage = rangeWeapon.crossbow(level, playerPowerUp);
		}
		else if (playerRangeWeapon.equals("Mystical Bow"))
		{
			rangeDamage = rangeWeapon.mysticalBow(playerPowerUp);
		}
		return rangeDamage;
	}

	public String getShield()
	{
		return playerShield;
	}
	public int getDamageBlocked()
	{
		return damageBlocked;
	}
	public void setPlayerShield(String playerShield)
	{
		this.playerShield = playerShield;
	}
	public String getShieldDamageRange()
	{
		if (playerShield.equals("Wood Shield"))
		{
			shieldDamageRange = checkShieldDamageRange.woodShield(level);			
		}
		else if (playerShield.equals("Steel Shield"))
		{
			shieldDamageRange = checkShieldDamageRange.steelShield(level);			
		}
		else if (playerShield.equals("Gold Shield"))
		{
			shieldDamageRange = checkShieldDamageRange.goldShield(level);			
		}
		else if (playerShield.equals("Mystical Shield"))
		{
			shieldDamageRange = checkShieldDamageRange.mysticalShield();			
		}
		return shieldDamageRange;
	}
	public int block()
	{
		if (playerShield.equals("Wood Shield"))
		{
			damageBlocked = shield.woodShield(level, playerPowerUp);			
		}
		else if (playerShield.equals("Steel Shield"))
		{
			damageBlocked = shield.steelShield(level, playerPowerUp);			
		}
		else if (playerShield.equals("Gold Shield"))
		{
			damageBlocked = shield.goldShield(level, playerPowerUp);			
		}
		else if (playerShield.equals("Mystical Shield"))
		{
			damageBlocked = shield.mysticalShield(playerPowerUp);			
		}
		return damageBlocked;
	}

	public String getPowerUp()
	{
		if (playerPowerUp.equals("Ice"))
		{
			return playerPowerUp+" ";
		}
		else if (playerPowerUp.equals("Fire"))
		{
			return playerPowerUp+" ";
		}
		else if (playerPowerUp.equals("Lightning"))
		{
			return playerPowerUp+" ";
		}
		else
		{
			return "";
		}
	}
	public void setPlayerPowerUp(String playerPowerUp)
	{
		this.playerPowerUp = playerPowerUp;
	}
	public String getPowerUpRange()
	{
		if (playerPowerUp.equals("Ice"))
		{
			powerUpRange = checkPowerUpRange.ice();
		}
		else if (playerPowerUp.equals("Fire"))
		{
			powerUpRange = checkPowerUpRange.fire();
		}
		else if (playerPowerUp.equals("Lightning"))
		{
			powerUpRange = checkPowerUpRange.lightning();
		}
		else
		{
			powerUpRange = "";
		}
		return powerUpRange;
	}

	public String getMagic()
	{
		if (playerMagic.equals("Ice Blast"))
		{
			return playerMagic+" ";
		}
		else if (playerMagic.equals("Fire Blast"))
		{
			return playerMagic+" ";
		}
		else if (playerMagic.equals("Lightning Blast"))
		{
			return playerMagic+" ";
		}
		else
		{
			return "";
		}
	}
	public int getMagicDamage()
	{
		return magicDamage;
	}
	public void setPlayerMagic(String playerMagic)
	{
		this.playerMagic = playerMagic;
	}
	public String getMagicDamageRange()
	{
		if (playerMagic.equals("Ice Blast"))
		{
			magicDamageRange = checkMagicDamageRange.ice(level);
		}
		else if (playerMagic.equals("Fire Blast"))
		{
			magicDamageRange = checkMagicDamageRange.fire(level);
		}
		else if (playerMagic.equals("Lightning Blast"))
		{
			magicDamageRange = checkMagicDamageRange.lightning(level);
		}
		else
		{
			magicDamageRange = "";
		}
		return magicDamageRange;
	}
	public int attackMagic()
	{
		if (playerMagic.equals("Ice Blast"))
		{
			magicDamage = magic.ice(level, playerPowerUp);
		}
		else if (playerMagic.equals("Fire Blast"))
		{
			magicDamage = magic.fire(level, playerPowerUp);
		}
		else if (playerMagic.equals("Lightning Blast"))
		{
			magicDamage = magic.lightning(level, playerPowerUp);
		}
		else
		{
			magicDamage = 0;
		}
		return magicDamage;
	}
	
	public boolean getDodge()
	{
		return dodgeAmount;
	}
	public boolean dodge()
	{
		dodgeAmount = dodge.dodge();
		return dodgeAmount;
	}

	public int getHealth()
	{
		return healthAmount;
	}
	public void setHealth(int health)
	{
		healthAmount = health;
	}
	public int calculateHealth()
	{
		healthAmount = health.health(healthAmount, damageReceived);
		return healthAmount;
	}

	public int getLevel()
	{
		return this.level;
	}
	public void setLevel(int level)
	{
		this.level = level;
	}

	public int getDamageReceived()
	{
		return damageReceived;
	}
	public void setDamageReceived(int damageReceived, int damageBlocked)
	{
		int check;
		check = damageReceived - damageBlocked;
		if (check < 0)
			this.damageReceived = 0;
		else
			this.damageReceived = check;
	}

}
