package warriorProject;

public class ShieldDamageRange
{
	private String shieldDamageRange;
	public String woodShield(int level)
	{
		if (level == 1)
		{
			shieldDamageRange = "1-3";
			return shieldDamageRange;
		}
		else if (level == 2)
		{
			shieldDamageRange = "4-6";
			return shieldDamageRange;
		}
		else if (level == 3)
		{
			shieldDamageRange = "7-9";
			return shieldDamageRange;
		}
		else if (level == 4)
		{
			shieldDamageRange = "10-12";
			return shieldDamageRange;
		}
		else if (level == 5)
		{
			shieldDamageRange = "13-15";
			return shieldDamageRange;
		}
		else
		{
			shieldDamageRange = "16-18";
			return shieldDamageRange;
		}
	}
	public String steelShield(int level)
	{
		if (level == 1)
		{
			shieldDamageRange = "4-6";
			return shieldDamageRange;
		}
		else if (level == 2)
		{
			shieldDamageRange = "7-9";
			return shieldDamageRange;
		}
		else if (level == 3)
		{
			shieldDamageRange = "10-12";
			return shieldDamageRange;
		}
		else if (level == 4)
		{
			shieldDamageRange = "13-15";
			return shieldDamageRange;
		}
		else if (level == 5)
		{
			shieldDamageRange = "16-18";
			return shieldDamageRange;
		}
		else
		{
			shieldDamageRange = "19-21";
			return shieldDamageRange;
		}
	}
	public String goldShield(int level)
	{
		if (level == 1)
		{
			shieldDamageRange = "7-9";
			return shieldDamageRange;
		}
		else if (level == 2)
		{
			shieldDamageRange = "10-12";
			return shieldDamageRange;
		}
		else if (level == 3)
		{
			shieldDamageRange = "13-15";
			return shieldDamageRange;
		}
		else if (level == 4)
		{
			shieldDamageRange = "16-18";
			return shieldDamageRange;
		}
		else if (level == 5)
		{
			shieldDamageRange = "19-21";
			return shieldDamageRange;
		}
		else
		{
			shieldDamageRange = "22-24";
			return shieldDamageRange;
		}
	}
	public String mysticalShield()
	{
		shieldDamageRange = "10-30";
		return shieldDamageRange;
	}
}
