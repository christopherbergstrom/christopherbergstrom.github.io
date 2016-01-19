package blackJack;

import java.util.ArrayList;

public class Player
{
	ArrayList<String> hand = new ArrayList<>();
	public void setHand(String card)
	{
		hand.add(card);
	}
	public String[] getHand()
	{
		int size = hand.size();
		String[] cards = new String[size];
		for (int i = 0; i < hand.size(); i++)
			cards[i] = hand.get(i);
		return cards;
	}
	public void printHand()
	{
		for (int i = 0; i < hand.size(); i ++)
			System.out.println(hand.get(i));
	}
}
