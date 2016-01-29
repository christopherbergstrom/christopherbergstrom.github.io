public static void clue()
	{
		String smallKey = "<small key>", bigKey = "<big key>", doorKey = "<door key>", hammer = "<hammer>", gloves = "<gloves>";
		String flashlight = "<flashlight>", batteries = "<batteries>", saw = "<saw>", wristWatch = "<wrist watch>";
		String i = wristWatch;
		
		Boolean BdownCenter = false, BdownNorth = false, BdownEast = false, BdownWest = false, BupCenter = false;
		Boolean BupNorth = false, BupEast = false, BupSouth = false, BupWest = false, Bbase = false;
		
		if (BdownCenter == false)
			System.out.println("\tYou haven't been in the DOWNSTAIRS Center room yet");
		if (BdownNorth == false)
			System.out.println("\tYou haven't been in the DOWNSTAIRS North room yet");
		if (BdownEast == false)
			System.out.println("\tYou haven't been in the DOWNSTAIRS East room yet");
		if (BdownWest == false)
			System.out.println("\tYou haven't been in the DOWNSTAIRS West room yet");
		if (BupCenter == false)
			System.out.println("\tYou haven't been in the UPSTAIRS Center room yet");
		if (BupNorth == false)
			System.out.println("\tYou haven't been in the UPSTAIRS North room yet");
		if (BupEast == false)
			System.out.println("\tYou haven't been in the UPSTAIRS East room yet");
		if (BupSouth == false)
			System.out.println("\tYou haven't been in the UPSTAIRS South room yet");
		if (BupWest == false)
			System.out.println("\tYou haven't been in the UPSTAIRS West room yet");
		if (Bbase == false)
			System.out.println("\tYou haven't been in the BASEMENT yet");
		if ((BdownCenter == true) && (BdownNorth == true) && (BdownEast == true) && (BdownWest == true) && (BupCenter == true) && (BupNorth == true) && (BupEast == true) && (BupSouth == true) && (BupWest == true) && (Bbase == true));
			System.out.println("\tYou have been in all of the rooms");
	
		if (!i.contains(smallKey))
			System.out.println("\tYou haven't found the "+smallKey+" yet");
		if (!i.contains(bigKey))
			System.out.println("\tYou haven't found the "+bigKey+" yet");
		if (!i.contains(doorKey))
			System.out.println("\tYou haven't found the "+doorKey+" yet");
		if (!i.contains(hammer))
			System.out.println("\tYou haven't found the "+hammer+" yet");
		if (!i.contains(gloves))
			System.out.println("\tYou haven't found the "+gloves+" yet");
		if (!i.contains(flashlight))
			System.out.println("\tYou haven't found the "+flashlight+" yet");
		if (!i.contains(batteries))
			System.out.println("\tYou haven't found the "+batteries+" yet");
		if (!i.contains(saw))
			System.out.println("\tYou haven't found the "+saw+" yet");
		if ((i.contains(smallKey)) && (i.contains(bigKey)) && (i.contains(doorKey)) && (i.contains(hammer)) && (i.contains(gloves)) && (i.contains(flashlight)) && (i.contains(batteries)) && (i.contains(saw)))
			System.out.println("\tYou have found all of the items");
		}