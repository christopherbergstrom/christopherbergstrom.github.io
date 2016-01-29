package caeserCypher;
import java.util.Scanner;
public class Encrypt
{
	public void encrypt()
	{
		String message, range;
		int rangeNum = 0;
		String [] words;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the message that you want to encrypt");
		message = input.nextLine().toUpperCase();
		do
		{
			System.out.println("Enter the range that you want to encrypt your message (-26 - 26)");
			range = input.next();
			try
			{
				rangeNum = Integer.parseInt(range);
			}
			catch (Exception e)
			{
				System.out.println("You didn't enter a number.\nEnter a number such as \"3\"");
			}
//			System.out.println(rangeNum);
		} while (rangeNum < -26 || rangeNum > 26);
		words = message.split(" ");	
		for (String word : words)
		{
			word.trim();
			encryptWord(word, rangeNum);
		}
		System.out.println();
		System.out.println();
	}
	public void encryptWord(String word, int range)
	{
		char [] letters = new char [word.length()];
		char [] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char [] numbers =  {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		for (int i = 0; i < letters.length; i ++)
		{
			letters[i] = word.charAt(i);
		}
		for (int i = 0; i < letters.length; i++)
		{
			for (int j = 0; j < alphabet.length; j++)
			{
				if (letters[i] == alphabet[j])
				{
					if (j + range > 25)
					{
						int place = (j + range) - 26;
						letters[i] = alphabet[place];
						break;
					}
					if (j + range < 0)
					{
						int place = (j + range) + 26;
						letters[i] = alphabet[place];
						break;
					}
					else
					{
						letters[i] = alphabet[j+range];						
						break;
					}
				}
			}
		}
		for (int i = 0; i < letters.length; i++)
		{
			for (int k = 0; k < numbers.length; k++)
			{
				if  (letters[i] == numbers[k])
				{					
					if (k + range > 9)
					{
						int place = (k + range) - 10;
						letters[i] = numbers[place];
						break;
					}
					if (k + range < 0)
					{
						int place = (k + range) + 10;
						letters[i] = numbers[place];
						break;
					}
					else
					{
						letters[i] = numbers[k+range];						
						break;
					}
				}
			}
		}
		for (char letter : letters)
			System.out.print(letter);
		System.out.print(" ");
	}
}
