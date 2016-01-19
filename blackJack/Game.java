package blackJack;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Game
{
	double money, wager;
	static int playerPoints = 0, dealerPoints = 0;
	public void game()
	{
		String cash, bet, choice, playAgain = "1", extraMoneyCar, extraMoneySell;
		boolean firstDrawDealer = true, firstDrawPlayer = true, buyWatch = false, doubleOption = true, doubleAbility = false;
		Scanner input = new Scanner(System.in);
//		for (int i = 0; i < 52; i++)
//		{
//			System.out.println(deck.get(0));
//			deck.remove(0);
//		}
//		System.out.println(deck.toString());
		Dealer dealer = new Dealer();
		Player player = new Player();
		//figure out money and bet
		System.out.println("Welcome to the Blackjack Table\n");
		do
		{
			System.out.println("How much money did you bring?");
			System.out.print("$");
			cash = input.next();
			money = Double.parseDouble(cash);
			if (money <= 0)
				System.out.println("Sorry, you can't play for free.");
			else
				System.out.println("Great!\n");
		} while (money <= 0);
		
		// Main game
		do
		{
			ArrayList<String> deck = new ArrayList<>();
			String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
			String[] cards = {"Two of ", "Three of ", "Four of ", "Five of ", "Six of ", "Seven of ", "Eight of ", "Nine of ", "Ten of ", "Jack of ", "Queen of ", "King of ", "Ace of "};
			for(String suit: suits)
			{
				for (String card: cards)
				{
					deck.add(card+suit);
				}
			}
			Collections.shuffle(deck);
			Collections.shuffle(deck);
//			System.out.println(deck.size());
			player.hand.clear();
			dealer.hand.clear();
			firstDrawPlayer = true;
			firstDrawDealer = true;
			doubleOption = true;
			playerPoints = 0;
			dealerPoints = 0;
			do
			{
				System.out.println("How much would you like to bet?");
				System.out.print("$");
				bet = input.next();
				wager = Double.parseDouble(bet);
				if (wager > money)
					System.out.println("You don't have that much money.");
				else
					System.out.println("Great, let's play.");
			} while (wager > money);
			do
			{
				System.out.println("\nHouse draws");
				System.out.println(deck.get(0).toString());
				dealer.setHand(deck.get(0).toString());
				dealerPoints += calculate(deck.get(0).toString(), dealerPoints);
				deck.remove(0);
				System.out.println("\nHouse's hand");
				if (firstDrawDealer == false)
				{
					dealer.printHand();
				}
				if (firstDrawDealer == true)
				{
					firstDrawDealer = false;
					System.out.println("Hole card");
					dealer.setHand(deck.get(0).toString());
					dealerPoints += calculate(deck.get(0).toString(), dealerPoints);
					deck.remove(0);
					dealer.printHandHide();
				}
	//			System.out.println("\n"+dealerPoints);
				if (dealerPoints >= 21)
					break;
				if (firstDrawPlayer == false && doubleOption == true)
				{
					System.out.println("\nYour hand");
					player.printHand();
				}
				if (firstDrawPlayer == true)
				{
					firstDrawPlayer = false;
					player.setHand(deck.get(0).toString());
					playerPoints += calculate(deck.get(0).toString(), playerPoints);
					deck.remove(0);
					player.setHand(deck.get(0).toString());
					playerPoints += calculate(deck.get(0).toString(), playerPoints);
					deck.remove(0);
					System.out.println("\nYou draw");
					player.printHand();
				}
	//			System.out.println("\n"+playerPoints);
				if (doubleOption == true)
				{
					System.out.println("\n(1) Hit\n(2) Stand");
					if (wager*2 <= money)
					{
						System.out.println("(3) Double");
						doubleAbility = true;
					}
					//(4) Split
					choice = input.next();
					if (choice.equals("1"))
					{
						System.out.println("You draw");
						System.out.println(deck.get(0).toString());
						player.setHand(deck.get(0).toString());
						playerPoints += calculate(deck.get(0).toString(), playerPoints);
						deck.remove(0);
						System.out.println("\nYour hand");
						player.printHand();
//						System.out.println();
					}
					else if (choice.equals("2"))
					{
						System.out.println("\nYour hand");
						player.printHand();
					}
					else if (choice.equals("3") && doubleAbility == true)
					{
						doubleOption = false;
						wager *=2;
						System.out.println("New bet: $"+wager);
						System.out.println("You draw");
						System.out.println(deck.get(0).toString());
						player.setHand(deck.get(0).toString());
						playerPoints += calculate(deck.get(0).toString(), playerPoints);
						deck.remove(0);
					}
//					else if (choice.equals("4"))
//					{
//						split
//					}
				}
				if (doubleOption == false)
				{
					System.out.println("\nYour hand");
					player.printHand();					
				}
				if (playerPoints >= 21)
					break;
	//			System.out.println("\n"+playerPoints);
				
			} while(!(playerPoints > 21) && dealerPoints <= 16);
			if (playerPoints == 21 && player.hand.size() == 2)
			{
				System.out.println("\nBlackjack!\nYou win!");
				money += ((double)((int)(100*(wager*(1.5)))))/100;
			}
			else if (dealerPoints == 21 && dealer.hand.size() == 2)
			{
				System.out.println("\nBlackjack!\nYou lose");
				money -= wager;
			}
			else if (playerPoints > 21)
			{
				System.out.println("\nYou lose");
				money -= wager;
			}
			else if (playerPoints < dealerPoints && dealerPoints <= 21)
			{
				System.out.println("\nYou lose");
				money -= wager;
			}
			else if (dealerPoints > 21)
			{
				System.out.println("\nYou win!");
				money += wager;
			}
			else if (playerPoints <=21 && playerPoints > dealerPoints)
			{
				System.out.println("\nYou win!");
				money += wager;
			}
			else if (playerPoints == dealerPoints)
			{
				System.out.println("\nDraw");
			}
			System.out.println("\nYour points: "+playerPoints);
			System.out.println("House points: "+dealerPoints);
			System.out.println("Money left: $"+money);
			
			if (money > 0)
			{
				System.out.println("\n(1) Play again\n(2) Cash out");
				playAgain = input.next();
				if (playAgain.equals("1"))
				{
					System.out.println();
				}
				else if (playAgain.equals("2"))
				{
					System.out.println("Nice doing business with you.\nHere are your earnings.\n$"+money);
					break;
				}
			}
			else if (money <= 0)
			{
				System.out.println("\nYou are out of money, would you like to check your car?\n(1) Yes\n(2) No");
				extraMoneyCar = input.next();
				if (extraMoneyCar.equals("1"))
				{
					
					int carCash = 1+(int)(Math.random()*2);
					int moreMoney = 1+(int)(Math.random()*20);
					if (carCash == 1)
					{
						money += moreMoney;
						System.out.println("Found an extra $"+moreMoney+" huh?\nAlright, let's keep playing.");
					}
					else
					{
						if (buyWatch == false)
						{	
							buyWatch = true;
							System.out.println("Didn't find any money there huh?\nIf you still want to keep playing, I'll buy that watch from you.");
							System.out.println("(1) Sell watch\n(2) Leave");
							extraMoneySell = input.next();
							if (extraMoneySell.equals("1"))
							{
								int watchMoney = 5+(int)(Math.random()*46);
								money += watchMoney;
								System.out.println("Hmmm, I'll give you $"+watchMoney+" for this watch.\nLet's keep playing.");
							}
							else
							{
								System.out.println("Nice doing business with you.");
								break;
							}
						}
						else
						{
							System.out.println("Didn't find any more money in your car?\nWell I already bought your watch for more than twice what is was worth.");
							System.out.println("Come back when you have more money.\nIt was nice doing business with you.");
							break;
						}
					}
				}
				else
				{
					System.out.println("Nice doing business with you.");
					break;
				}
			}
		
		} while (playAgain.equals("1"));
	}
	public int calculate(String card, int points)
	{
		int value = 0;
//		System.out.println(card);
		if (card.contains("Two"))
			value += 2;
		if (card.contains("Three"))
			value += 3;
		if (card.contains("Four"))
			value += 4;
		if (card.contains("Five"))
			value += 5;
		if (card.contains("Six"))
			value += 6;
		if (card.contains("Seven"))
			value += 7;
		if (card.contains("Eight"))
			value += 8;
		if (card.contains("Nine"))
			value += 9;
		if (card.contains("Ten") || card.contains("Jack") || card.contains("Queen") || card.contains("King"))
			value += 10;
		if (card.contains("Ace"))
		{
			if (points < 11)
				value += 11;
			else
				value += 1;
		}
		return value;
	}
}
