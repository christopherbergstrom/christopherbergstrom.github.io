package caeserCypher;
import java.util.Scanner;
public class Start
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		Encrypt encrypt = new Encrypt();
		Decrypt decrypt = new Decrypt();
		String menu;
		do
		{
			System.out.println("(1) Encrypt message");
			System.out.println("(2) Decrypt message");
			System.out.println("(3) Quit");
			menu = input.next();
			if (menu.equals("1"))
				encrypt.encrypt();
			else if (menu.equals("2"))
				decrypt.decrypt();
			else if (menu.equals("3"))
				System.exit(0);
			else
				System.out.println("Choose a valid option");
		} while (!input.equals("3"));
	}
}
