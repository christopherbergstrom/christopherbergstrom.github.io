package warriorProject;
//practice enemy medium
public class PracticeEnemyMedium
{
	private int practiceEnemyMediumHealth = 150, practiceEnemyMediumHandDamage, practiceEnemyMediumRangeDamage, practiceEnemyMediumDamageBlocked, practiceEnemyMediumDamageReceived;
	public void setPracticeEnemyMediumHandDamage()
	{
		practiceEnemyMediumHandDamage = (6+(int)(Math.random()*3));
	}
	public int getPracticeEnemyMediumHandDamage()
	{
		return practiceEnemyMediumHandDamage;
	}
	public void setPracticeEnemyMediumRangeDamage()
	{
		practiceEnemyMediumRangeDamage = (4+(int)(Math.random()*2));
	}
	public int getPracticeEnemyMediumRangeDamage()
	{
		return practiceEnemyMediumRangeDamage;
	}
	public void setPracticeEnemyMediumDamageBlocked()
	{
		practiceEnemyMediumDamageBlocked = (3+(int)(Math.random()*2));
	}
	public int getPracticeEnemyMediumDamageBlocked()
	{
		return practiceEnemyMediumDamageBlocked;
	}
	public void setPracticeEnemyMediumHealth(int practiceEnemyMediumHealth, int practiceEnemyMediumDamageReceived)
	{
		int check;
		check = practiceEnemyMediumHealth - practiceEnemyMediumDamageReceived;
		if (check < 0)
			this.practiceEnemyMediumHealth = 0;
		else
			this.practiceEnemyMediumHealth = check;
	}
	public int getPracticeEnemyMediumHealth()
	{
		return practiceEnemyMediumHealth;
	}
	public void setPracticeEnemyMediumDamageReceived(int practiceEnemyMediumDamageReceived, int practiceEnemyMediumDamageBlocked)
	{
		int check;
		check = practiceEnemyMediumDamageReceived - practiceEnemyMediumDamageBlocked;
		if (check < 0)
			this.practiceEnemyMediumDamageReceived = 0;
		else
			this.practiceEnemyMediumDamageReceived = check;
	}
	public int getPracticeEnemyMediumDamageReceived()
	{
		return practiceEnemyMediumDamageReceived;
	}
}
