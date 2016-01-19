package warriorProject;
//practice enemy hard
public class PracticeEnemyHard
{
	private int practiceEnemyHardHealth = 200, practiceEnemyHardHandDamage, practiceEnemyHardRangeDamage, practiceEnemyHardDamageBlocked, practiceEnemyHardDamageReceived;
	public void setPracticeEnemyHardHandDamage()
	{
		practiceEnemyHardHandDamage = (14+(int)(Math.random()*3));
	}
	public int getPracticeEnemyHardHandDamage()
	{
		return practiceEnemyHardHandDamage;
	}
	public void setPracticeEnemyHardRangeDamage()
	{
		practiceEnemyHardRangeDamage = (10+(int)(Math.random()*2));
	}
	public int getPracticeEnemyHardRangeDamage()
	{
		return practiceEnemyHardRangeDamage;
	}
	public void setPracticeEnemyHardDamageBlocked()
	{
		practiceEnemyHardDamageBlocked = (5+(int)(Math.random()*2));
	}
	public int getPracticeEnemyHardDamageBlocked()
	{
		return practiceEnemyHardDamageBlocked;
	}
	public void setPracticeEnemyHardHealth(int practiceEnemyHardHealth, int practiceEnemyHardDamageReceived)
	{
		int check;
		check = practiceEnemyHardHealth - practiceEnemyHardDamageReceived;
		if (check < 0)
			this.practiceEnemyHardHealth = 0;
		else
			this.practiceEnemyHardHealth = check;
	}
	public int getPracticeEnemyHardHealth()
	{
		return practiceEnemyHardHealth;
	}
	public void setPracticeEnemyHardDamageReceived(int practiceEnemyHardDamageReceived, int practiceEnemyHardDamageBlocked)
	{
		int check;
		check = practiceEnemyHardDamageReceived - practiceEnemyHardDamageBlocked;
		if (check < 0)
			this.practiceEnemyHardDamageReceived = 0;
		else
			this.practiceEnemyHardDamageReceived = check;
	}
	public int getPracticeEnemyHardDamageReceived()
	{
		return practiceEnemyHardDamageReceived;
	}
}
