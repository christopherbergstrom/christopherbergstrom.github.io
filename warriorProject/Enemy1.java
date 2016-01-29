package warriorProject;
//undead soldier
public class Enemy1
{
	private int enemyOneHealth = 100, enemyOneHandDamage, enemyOneRangeDamage, enemyOneDamageBlocked, enemyOneDamageReceived;
	public void setEnemyOneHandDamage()
	{
		enemyOneHandDamage = (3+(int)(Math.random()*3));
	}
	public int getEnemyOneHandDamage()
	{
		return enemyOneHandDamage;
	}
	public void setEnemyOneRangeDamage()
	{
		enemyOneRangeDamage = (1+(int)(Math.random()*2));
	}
	public int getEnemyOneRangeDamage()
	{
		return enemyOneRangeDamage;
	}
	public void setEnemyOneDamageBlocked()
	{
		enemyOneDamageBlocked = (1+(int)(Math.random()*2));
	}
	public int getEnemyOneDamageBlocked()
	{
		return enemyOneDamageBlocked;
	}
	public void setEnemyOneHealth(int enemyOneHealth, int enemyOneDamageReceived)
	{
		int check;
		check = enemyOneHealth - enemyOneDamageReceived;
		if (check < 0)
			this.enemyOneHealth = 0;
		else
			this.enemyOneHealth = check;
	}
	public int getEnemyOneHealth()
	{
		return enemyOneHealth;
	}
	public void setEnemyOneDamageReceived(int enemyOneDamageReceived, int enemyOneDamageBlocked)
	{
		this.enemyOneDamageReceived = enemyOneDamageReceived - enemyOneDamageBlocked;
	}
	public int getEnemyOneDamageReceived()
	{
		return enemyOneDamageReceived;
	}
}
