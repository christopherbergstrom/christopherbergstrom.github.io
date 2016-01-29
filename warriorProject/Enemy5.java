package warriorProject;
//minotaur
public class Enemy5
{
	private int enemyFiveHealth = 800, enemyFiveHandDamage, enemyFiveChargeDamage, enemyFiveDamageBlocked, enemyFiveDamageReceived;
	private int enemyFiveDodgeChange;
	private boolean enemyFiveDodgeAmount;
	public void setEnemyFiveHandDamage()
	{
		enemyFiveHandDamage = (21+(int)(Math.random()*2));
	}
	public int getEnemyFiveHandDamage()
	{
		return enemyFiveHandDamage;
	}
	public void setEnemyFiveChargeDamage()
	{
		enemyFiveChargeDamage = (23+(int)(Math.random()*3));
	}
	public int getEnemyFiveChargeDamage()
	{
		return enemyFiveChargeDamage;
	}
	public void setEnemyFiveDamageBlocked()
	{
		enemyFiveDamageBlocked = (5+(int)(Math.random()*4));
	}
	public int getEnemyFiveDamageBlocked()
	{
		return enemyFiveDamageBlocked;
	}
	public void setEnemyFiveHealth(int enemyFiveHealth, int enemyFiveDamageReceived)
	{
		int check;
		check = enemyFiveHealth - enemyFiveDamageReceived;
		if (check < 0)
			this.enemyFiveHealth = 0;
		else
			this.enemyFiveHealth = check;
	}
	public int getEnemyFiveHealth()
	{
		return enemyFiveHealth;
	}
	public void setEnemyFiveDamageReceived(int enemyFiveDamageReceived, int enemyFiveDamageBlocked)
	{
		this.enemyFiveDamageReceived = enemyFiveDamageReceived - enemyFiveDamageBlocked;
	}
	public int getEnemyFiveDamageReceived()
	{
		return enemyFiveDamageReceived;
	}
	public boolean enemyFiveDodge()
	{
		enemyFiveDodgeChange = (1+(int)(Math.random()*5));
		if (enemyFiveDodgeChange == 1)
			enemyFiveDodgeAmount = true;
		else
			enemyFiveDodgeAmount = false;
		return enemyFiveDodgeAmount;
	}
}