package warriorProject;

public class MagicDamageRange
{
	private String magicDamageRange;
	public String ice(int level)
	{
		if  (level == 1)
		{
			magicDamageRange = "5-10";
			return magicDamageRange;
		}
		else if  (level == 2)
		{
			magicDamageRange = "10-15";
			return magicDamageRange;
		}
		else if  (level == 3)
		{
			magicDamageRange = "15-20";
			return magicDamageRange;
		}
		else if  (level == 4)
		{
			magicDamageRange = "20-25";
			return magicDamageRange;
		}
		else if  (level == 5)
		{
			magicDamageRange = "25-30";
			return magicDamageRange;
		}
		else
		{
			magicDamageRange = "30-35";
			return magicDamageRange;
		}
	}
	public String fire(int level)
	{
		if  (level == 1)
		{
			magicDamageRange = "15-20";
			return magicDamageRange;
		}
		else if  (level == 2)
		{
			magicDamageRange = "20-25";
			return magicDamageRange;
		}
		else if  (level == 3)
		{
			magicDamageRange = "25-30";
			return magicDamageRange;
		}
		else if  (level == 4)
		{
			magicDamageRange = "30-35";
			return magicDamageRange;
		}
		else if  (level == 5)
		{
			magicDamageRange = "35-40";
			return magicDamageRange;
		}
		else
		{
			magicDamageRange = "40-45";
			return magicDamageRange;
		}
	}
	public String lightning(int level)
	{
		if  (level == 1)
		{
			magicDamageRange = "25-30";
			return magicDamageRange;
		}
		else if  (level == 2)
		{
			magicDamageRange = "30-35";
			return magicDamageRange;
		}
		else if  (level == 3)
		{
			magicDamageRange = "35-40";
			return magicDamageRange;
		}
		else if  (level == 4)
		{
			magicDamageRange = "40-45";
			return magicDamageRange;
		}
		else if  (level == 5)
		{
			magicDamageRange = "45-50";
			return magicDamageRange;
		}
		else
		{
			magicDamageRange = "50-55";
			return magicDamageRange;
		}
	}
}
