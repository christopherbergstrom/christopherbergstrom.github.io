package warriorProject;
//gorgon
public class Enemy3
{
	private int enemyThreeHealth = 300, enemyThreeClawDamage, enemyThreeTailDamage, enemyThreeDamageReceived;
	private int enemyThreeDodgeChange;
	private boolean enemyThreeDodgeAmount;
	public void setEnemyThreeClawDamage()
	{
		enemyThreeClawDamage = (11+(int)(Math.random()*2));
	}
	public int getEnemyThreeClawDamage()
	{
		return enemyThreeClawDamage;
	}
	public void setEnemyThreeTailDamage()
	{
		enemyThreeTailDamage = (13+(int)(Math.random()*3));
	}
	public int getEnemyThreeTailDamage()
	{
		return enemyThreeTailDamage;
	}
	public void setEnemyThreeHealth(int enemyThreeHealth, int enemyThreeDamageReceived)
	{
		int check;
		check = enemyThreeHealth - enemyThreeDamageReceived;
		if (check < 0)
			this.enemyThreeHealth = 0;
		else
			this.enemyThreeHealth = check;
	}
	public int getEnemyThreeHealth()
	{
		return enemyThreeHealth;
	}
	public void setEnemyThreeDamageReceived(int enemyThreeDamageReceived)
	{
		this.enemyThreeDamageReceived = enemyThreeDamageReceived;
	}
	public int getEnemyThreeDamageReceived()
	{
		return enemyThreeDamageReceived;
	}
	public boolean enemyThreeDodge()
	{
		enemyThreeDodgeChange = (1+(int)(Math.random()*10));
		if (enemyThreeDodgeChange == 1)
			enemyThreeDodgeAmount = true;
		else
			enemyThreeDodgeAmount = false;
		return enemyThreeDodgeAmount;
	}
}
