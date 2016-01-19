package romanNumerals;

public class Conversion
{
	public void conversion(int number)
	{
		int thousand, fiveHundred, oneHundred, fifty, ten, five, one;
		// I = 1
		// V = 5
		// X = 10
		// L = 50
		// C = 100
		// D = 500
		// M = 1,000
//		System.out.println("in coversion method");
//		System.out.println("before thousand method number "+number);
		thousand = thousand(number);
		number -= thousand;
//		System.out.println("\nbefore 500 method number "+number);
//		System.out.println("before 500 method thousand "+thousand);
		fiveHundred = fiveHundred(number);
		number -= fiveHundred;
//		System.out.println("\nbefore 100 method number "+number);
//		System.out.println("before 100 method 500 "+fiveHundred);
		oneHundred = oneHundred(number);
		number -= oneHundred;
//		System.out.println("\nbefore 50 method number "+number);
//		System.out.println("before 50 method 100 "+oneHundred);
		fifty = fifty(number);
		number -= fifty;
//		System.out.println("\nbefore 10 method number "+number);
//		System.out.println("before 10 method fifty "+fifty);
		ten = ten(number);
//		System.out.println("after ten method ten "+ten);
		number -= ten;
//		System.out.println("\nbefore 5 method number "+number);
//		System.out.println("before 5 method 10 "+ten);
		five = five(number);
		number -= five;
//		System.out.println("\nbefore 1 method number "+number);
//		System.out.println("before 1 method 5 "+five);
		one(number);
	}
	public int thousand(int number)
	{
		int thousand;
		thousand = number / 1000;
		if (thousand != 0)
		{
			number = (thousand * 1000);
			for (int i = 0; i < thousand; i++)
				System.out.print("M");
			return number;
		}
		else
			return 0;
	}
	public int fiveHundred(int number)
	{
		int fiveHundred;
		fiveHundred = number / 500;
		if (fiveHundred != 0)
		{
			number = (fiveHundred * 500);
			for (int i = 0; i < fiveHundred; i++)
				System.out.print("D");
			return number;
		}
		else
			return 0;
	}
	public int oneHundred(int number)
	{
		int oneHundred;
		oneHundred = number / 100;
		if (oneHundred != 0)
		{
			number = (oneHundred * 100);
			for (int i = 0; i < oneHundred; i++)
				System.out.print("C");
			return number;
		}
		else
			return 0;
	}
	public int fifty(int number)
	{
		int fifty;
		fifty = number / 50;
		if (fifty != 0)
		{
			number = (fifty * 50);
			for (int i = 0; i < fifty; i++)
				System.out.print("L");
			return number;
		}
		else
			return 0;
	}
	public int ten(int number)
	{
		int ten;
		ten = number / 10;
		if (ten != 0)
		{
			number = (ten * 10);
			for (int i = 0; i < ten; i++)
				System.out.print("X");
			return number;
		}
		else
			return 0;
	}
	public int five(int number)
	{
		int five;
		five = number / 5;
		if (five != 0)
		{
			number = (five * 5);
			for (int i = 0; i < five; i++)
				System.out.print("V");
			return number;
		}
		else
			return 0;
	}
	public int one(int number)
	{
		int one;
		one = number / 1;
		if (one != 0)
		{
			number = (one * 1);
			for (int i = 0; i < one; i++)
				System.out.print("I");
			return number;
		}
		else
			return 0;
	}
}
