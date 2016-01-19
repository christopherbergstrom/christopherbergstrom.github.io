package romanNumerals;
import java.util.Scanner;
public class Prompt
{
	public void prompt()
	{
		Conversion conversion = new Conversion();
		Scanner input = new Scanner(System.in);
		String stringNum;
		int conversionNum;
		System.out.println("Welcome to Rome!");
		do
		{
			System.out.println("Enter your number to be converted to Roman Numberals");
			stringNum = input.next();
			if (stringNum.equals("q"))
				break;
			else
			{
				try
				{
//					System.out.println("in try block");
					conversionNum = Integer.parseInt(stringNum);
					conversion.conversion(conversionNum);
				}
				catch (ClassCastException e)
				{
					System.out.println("You didn't enter a number.\nEnter a number such as \"23.\"");
				}
			}
			System.out.println();
			System.out.println();
		} while (!stringNum.equals("q"));
	}
}
