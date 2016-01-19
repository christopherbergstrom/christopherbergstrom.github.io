package warriorProject;
//practice enemy easy
public class PracticeEnemyEasy
{
	private int practiceEnemyEasyHealth = 100, practiceEnemyEasyHandDamage, practiceEnemyEasyRangeDamage, practiceEnemyEasyDamageBlocked, practiceEnemyEasyDamageReceived;
	public void setPracticeEnemyEasyHandDamage()
	{
		practiceEnemyEasyHandDamage = (1+(int)(Math.random()*3));
	}
	public int getPracticeEnemyEasyHandDamage()
	{
		return practiceEnemyEasyHandDamage;
	}
	public void setPracticeEnemyEasyRangeDamage()
	{
		practiceEnemyEasyRangeDamage = 1;
	}
	public int getPracticeEnemyEasyRangeDamage()
	{
		return practiceEnemyEasyRangeDamage;
	}
	public void setPracticeEnemyEasyDamageBlocked()
	{
		practiceEnemyEasyDamageBlocked = (1+(int)(Math.random()*2));
	}
	public int getPracticeEnemyEasyDamageBlocked()
	{
		return practiceEnemyEasyDamageBlocked;
	}
	public void setPracticeEnemyEasyHealth(int practiceEnemyEasyHealth, int practiceEnemyEasyDamageReceived)
	{
		int check;
		check = practiceEnemyEasyHealth - practiceEnemyEasyDamageReceived;
		if (check < 0)
			this.practiceEnemyEasyHealth = 0;
		else
			this.practiceEnemyEasyHealth = check;
	}
	public int getPracticeEnemyEasyHealth()
	{
		return practiceEnemyEasyHealth;
	}
	public void setPracticeEnemyEasyDamageReceived(int practiceEnemyEasyDamageReceived, int practiceEnemyEasyDamageBlocked)
	{
		this.practiceEnemyEasyDamageReceived = practiceEnemyEasyDamageReceived - practiceEnemyEasyDamageBlocked;
	}
	public int getPracticeEnemyEasyDamageReceived()
	{
		return practiceEnemyEasyDamageReceived;
	}
}
