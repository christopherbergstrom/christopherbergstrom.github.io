package warriorProject;
//cyclops
public class Boss
{
	private int bossHealth = 1000, bossHandDamage, bossFootDamage, bossDamageReceived;
	public void setBossHandDamage()
	{
		bossHandDamage = (28+(int)(Math.random()*3));
	}
	public int getBossHandDamage()
	{
		return bossHandDamage;
	}
	public void setBossFootDamage()
	{
		bossFootDamage = (26+(int)(Math.random()*2));
	}
	public int getBossFootDamage()
	{
		return bossFootDamage;
	}
	public void setBossHealth(int bossHealth, int bossDamageReceived)
	{
		int check;
		check = bossHealth - bossDamageReceived;
		if (check < 0)
			this.bossHealth = 0;
		else
			this.bossHealth = check;
	}
	public int getBossHealth()
	{
		return bossHealth;
	}
	public void setBossDamageReceived(int bossDamageReceived)
	{
		this.bossDamageReceived = bossDamageReceived;
	}
	public int getBossDamageReceived()
	{
		return bossDamageReceived;
	}
}
