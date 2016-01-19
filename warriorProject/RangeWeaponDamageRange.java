package warriorProject;

public class RangeWeaponDamageRange
{
	private String rangeWeaponDamageRange;
	public String longBow(int level)
	{
		if (level == 1)
		{
			rangeWeaponDamageRange = "2-3";
			return rangeWeaponDamageRange;
		}
		else if (level == 2)
		{
			rangeWeaponDamageRange = "4-5";
			return rangeWeaponDamageRange;
		}
		else if (level == 3)
		{
			rangeWeaponDamageRange = "6-7";
			return rangeWeaponDamageRange;
		}
		else if (level == 4)
		{
			rangeWeaponDamageRange = "8-9";
			return rangeWeaponDamageRange;
		}
		else if (level == 5)
		{
			rangeWeaponDamageRange = "10-11";
			return rangeWeaponDamageRange;
		}
		else
		{
			rangeWeaponDamageRange = "12-13";
			return rangeWeaponDamageRange;
		}
	}
	public String throwingKnives(int level)
	{
		if (level == 1)
		{
			rangeWeaponDamageRange = "4-5";
			return rangeWeaponDamageRange;
		}
		else if (level == 2)
		{
			rangeWeaponDamageRange = "6-7";
			return rangeWeaponDamageRange;
		}
		else if (level == 3)
		{
			rangeWeaponDamageRange = "8-9";
			return rangeWeaponDamageRange;
		}
		else if (level == 4)
		{
			rangeWeaponDamageRange = "10-11";
			return rangeWeaponDamageRange;
		}
		else if (level == 5)
		{
			rangeWeaponDamageRange = "12-13";
			return rangeWeaponDamageRange;
		}
		else
		{
			rangeWeaponDamageRange = "14-15";
			return rangeWeaponDamageRange;
		}
	}
	public String crossbow(int level)
	{
		if (level == 1)
		{
			rangeWeaponDamageRange = "6-7";
			return rangeWeaponDamageRange;
		}
		else if (level == 2)
		{
			rangeWeaponDamageRange = "8-9";
			return rangeWeaponDamageRange;
		}
		else if (level == 3)
		{
			rangeWeaponDamageRange = "10-11";
			return rangeWeaponDamageRange;
		}
		else if (level == 4)
		{
			rangeWeaponDamageRange = "12-13";
			return rangeWeaponDamageRange;
		}
		else if (level == 5)
		{
			rangeWeaponDamageRange = "14-15";
			return rangeWeaponDamageRange;
		}
		else
		{
			rangeWeaponDamageRange = "16-17";
			return rangeWeaponDamageRange;
		}
	}
	public String mysticalBow()
	{
		rangeWeaponDamageRange = "5-20";
		return rangeWeaponDamageRange;
	}
}
