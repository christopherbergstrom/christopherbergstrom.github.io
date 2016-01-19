package cashRegister;
import java.util.Scanner;
public class MakeChange
{
	public static int quarter, dime, nickel, penny, one, five, ten, twenty, itemCostI, cashTenderedI, changeI, changeM;
	public static double itemCost, cashTendered, change;
	public static String itemCostS, cashTenderedS, changeS;
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// dollars: 1, 5, 10, 20
		// cents: 0.01, 0.05, 0.1, 0.25
		System.out.print("How much is the item? $");
		itemCostS = input.next();
		itemCost = Double.parseDouble(itemCostS);
		itemCostI = (int)(itemCost*100);
//		System.out.println(itemCost);
//		System.out.println(itemCostI);
		System.out.print("How much money was tendered by the customer? $");
		cashTenderedS = input.next();
		cashTendered = Double.parseDouble(cashTenderedS);
		cashTenderedI = (int)(cashTendered*100);
//		System.out.println(cashTendered);
//		System.out.println(cashTenderedI);
		while (cashTenderedI < itemCostI)
		{
			System.out.println("\nThe customer didn't tender enough money.");
			changeI =  (itemCostI - cashTenderedI);
			change = (double)(changeI/100.0);
			if (changeI%10 == 0)
			{
				System.out.println("An extra $"+change+"0 is needed");
			}
			else
				System.out.println("An extra $"+change+" is needed");
			System.out.print("How much extra money was tendered by the customer? $");
			cashTenderedS = input.next();
			cashTendered = Double.parseDouble(cashTenderedS);
			cashTenderedI = itemCostI - ((changeI) - (int)(cashTendered*100));
//			System.out.println(cashTenderedI);
		}
		input.close();
		if (cashTenderedI == itemCostI)
			System.out.println("The customer tendered the exact amount of item. No change is due.");
		else if (cashTenderedI > itemCostI)
		{
			changeI = (cashTenderedI - itemCostI);
			change = (double)(changeI/100.0);
//			System.out.println(changeI);
//			System.out.println(change);
			decimalFix(change);
			if (changeI%10 == 0)
				System.out.println("\nGive the customer $"+change+"0 in change\nUsing: ");
			else
				System.out.println("\nGive the customer $"+change+" in change\nUsing: ");
			
			
			twenty(changeI);
			changeI = changeI - (2000*twenty);
//			System.out.println(changeI);
			ten(changeI);
			changeI = changeI - (1000*ten);
//			System.out.println(changeI);
			five(changeI);
			changeI = changeI - (500*five);
//			System.out.println(changeI);
			one(changeI);
			changeI = changeI - (100*one);
//			System.out.println(changeI);
			quarter(changeI);
			changeI = changeI - (25*quarter);
//			System.out.println(changeI);
			dime(changeI);
			changeI = changeI - (10*dime);
//			System.out.println(changeI);
			nickel(changeI);
			changeI = changeI - (5*nickel);
//			System.out.println(changeI);
			penny(changeI);
			changeI = changeI - (1*penny);
			if (twenty > 1)
				System.out.println(twenty+" twenties ");
			else if (twenty == 1)
				System.out.println(twenty+" twenty ");
			if (ten > 1)
				System.out.println(ten+" tens ");
			else if (ten == 1)
				System.out.println(ten+" ten ");
			if (five > 1)
				System.out.println(five+" fives ");
			else if (five == 1)
				System.out.println(five+" five ");
			if (one > 1)
				System.out.println(one+" ones ");
			else if (one == 1)
				System.out.println(one+" one ");
			if (quarter > 1)
				System.out.println(quarter+" quarters ");
			else if (quarter == 1)
				System.out.println(quarter+" quarter ");
			if (dime > 1)
				System.out.println(dime+" dimes ");
			else if (dime == 1)
				System.out.println(dime+" dime ");
			if (nickel > 1)
				System.out.println(nickel+" nickels ");
			else if (nickel == 1)
				System.out.println(nickel+" nickel ");
			if (penny > 1)
				System.out.println(penny+" pennies ");
			else if (penny == 1)
				System.out.println(penny+" penny ");
//			System.out.println(twenty+" twenties "+ten+" tens "+five+" fives "+one+" ones");
//			System.out.println(quarter+" quarters "+dime+" dimes "+nickel+" nickels "+penny+" pennies");
		}
	}
	public static double decimalFix(double change)
	{
		change = (int)(change * 1000);
		change = (double)(change / 1000);
		return change;
	}
	public static int twenty(int changeI)
	{
		twenty = (changeI / 2000);
		return twenty;
	}
	public static int ten(int changeI)
	{
		ten = (changeI / 1000);
		return ten;
	}
	public static int five(int changeI)
	{
		five = (changeI / 500);
		return five;
	}
	public static int one(int changeI)
	{
		one = (changeI / 100);
		return one;
	}
	public static int quarter(int changeI)
	{
		quarter = (changeI / 25);
		return quarter;
	}
	public static int dime(int changeI)
	{
		dime = (changeI / 10);
		return dime;
	}
	public static int nickel(int changeI)
	{
		nickel = (changeI / 5);
		return nickel;
	}
	public static int penny(int changeI)
	{
		penny = (changeI / 1);
		return penny;
	}	
}