package warriorProject;
//centaur
public class Enemy4
{
	private int enemyFourHealth = 500, enemyFourHandDamage, enemyFourChargeDamage, enemyFourDamageBlocked, enemyFourDamageReceived;
	private int enemyFourDodgeChange;
	private boolean enemyFourDodgeAmount;
	public void setEnemyFourHandDamage()
	{
		enemyFourHandDamage = (16+(int)(Math.random()*2));
	}
	public int getEnemyFourHandDamage()
	{
		return enemyFourHandDamage;
	}
	public void setEnemyFourChargeDamage()
	{
		enemyFourChargeDamage = (18+(int)(Math.random()*3));
	}
	public int getEnemyFourChargeDamage()
	{
		return enemyFourChargeDamage;
	}
	public void setEnemyFourDamageBlocked()
	{
		enemyFourDamageBlocked = (2+(int)(Math.random()*4));
	}
	public int getEnemyFourDamageBlocked()
	{
		return enemyFourDamageBlocked;
	}
	public void setEnemyFourHealth(int enemyFourHealth, int enemyFourDamageReceived)
	{
		int check;
		check = enemyFourHealth - enemyFourDamageReceived;
		if (check < 0)
			this.enemyFourHealth = 0;
		else
			this.enemyFourHealth = check;
	}
	public int getEnemyFourHealth()
	{
		return enemyFourHealth;
	}
	public void setEnemyFourDamageReceived(int enemyFourDamageReceived, int enemyFourDamageBlocked)
	{
		this.enemyFourDamageReceived = enemyFourDamageReceived - enemyFourDamageBlocked;
	}
	public int getEnemyFourDamageReceived()
	{
		return enemyFourDamageReceived;
	}
	public boolean enemyFourDodge()
	{
		enemyFourDodgeChange = (1+(int)(Math.random()*20));
		if (enemyFourDodgeChange >= 1 && enemyFourDodgeChange <= 3)
			enemyFourDodgeAmount = true;
		else
			enemyFourDodgeAmount = false;
		return enemyFourDodgeAmount;
	}
}
