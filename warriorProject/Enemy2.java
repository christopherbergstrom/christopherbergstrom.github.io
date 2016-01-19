package warriorProject;
//harpy
public class Enemy2
{
	private int enemyTwoHealth = 200, enemyTwoClawDamage, enemyTwoAcidDamage, enemyTwoDamageReceived;
	private int enemyTwoDodgeChange;
	private boolean enemyTwoDodgeAmount;
	public void setEnemyTwoClawDamage()
	{
		enemyTwoClawDamage = (8+(int)(Math.random()*3));
	}
	public int getEnemyTwoClawDamage()
	{
		return enemyTwoClawDamage;
	}
	public void setEnemyTwoAcidDamage()
	{
		enemyTwoAcidDamage = (6+(int)(Math.random()*2));
	}
	public int getEnemyTwoAcidDamage()
	{
		return enemyTwoAcidDamage;
	}
	public void setEnemyTwoHealth(int enemyTwoHealth, int enemyTwoDamageReceived)
	{
		int check;
		check = enemyTwoHealth - enemyTwoDamageReceived;
		if (check < 0)
			this.enemyTwoHealth = 0;
		else
			this.enemyTwoHealth = check;
	}
	public int getEnemyTwoHealth()
	{
		return enemyTwoHealth;
	}
	public void setEnemyTwoDamageReceived(int enemyTwoDamageReceived)
	{
		this.enemyTwoDamageReceived = enemyTwoDamageReceived;
	}
	public int getEnemyTwoDamageReceived()
	{
		return enemyTwoDamageReceived;
	}
	public boolean enemyTwoDodge()
	{
		enemyTwoDodgeChange = (1+(int)(Math.random()*20));
		if (enemyTwoDodgeChange == 1)
			enemyTwoDodgeAmount = true;
		else
			enemyTwoDodgeAmount = false;
		return enemyTwoDodgeAmount;
	}
}
