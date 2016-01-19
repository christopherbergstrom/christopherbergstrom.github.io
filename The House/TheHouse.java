import java.util.Scanner;

class TheHouse
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		
		// i = inventory, k = clue, m = map
		String error = "\t* * * * * * * * * * * * * * *\n\t PRESS THE CORRESPONDING KEY\n\t* * * * * * * * * * * * * * *\n";
		String instructions, name;
		String optShelf = "1 2 3 4 5", optBed = "1 2 3 4", optDress = "1 2 3 4 5";
		String yn = "y n";
		String downCenter = "1 2 3 4 7 8 9";
		String downNorth = "1 2 3 7 8 9";
		String downEast = "1 2 3 7 8 9";
		String downWest = "1 3 7 8 9";
		String upCenter = "1 2 3 4 5 7 8 9";
		String upNorth = "1 2 3 7 8 9";
		String upEast = "1 2 7 8 9";
		String upSouth = "1 2 3 7 8 9";
		String upWest = "1 2 7 8 9";
		String base = "1 2 3 4 5 7 8 9";
		String opt0, opt00, opt000, opt0000, opt1, opt2, opt3, opt4;
		
		// this list of Strings can be added to the inventory
		String smallKey = "<small key>", bigKey = "<big key>", doorKey = "<door key>", hammer = "<hammer>", gloves = "<gloves>";
		String flashlight = "<flashlight>", batteries = "<batteries>", saw = "<saw>", wristWatch = "<wrist watch>";
		
		// this list of Strings have the above set of Strings possibly in/on them and are anything that the user can possibly do something with
		String table = "\\table\\", bookshelf = "\\bookshelf\\", book = "\\book\\", windows = "\\windows\\", rug = "\\rug\\", door = "\\door\\";
		String couch = "\\couch\\", bed = "\\bed\\", blanket = "\\blanket\\", pillow = "\\pillow\\", dresser = "\\dresser\\", workbench = "\\workbench\\";
		String picture = "\\picture\\", tunnel = "\\tunnel\\", shelf = "\\shelf\\", drawer = "\\drawer\\", bike = "\\bike\\";
		String i = wristWatch; /*clue = "\t \n",*/// mapDC = mapCD(), mapDN = mapDN(), mapDE = mapDE(), mapDW = mapDW(), mapUC = mapUC(), mapUN = mapUN(), mapUE = mapUE(), mapUS = mapUS(), mapUW = mapUW, mapb = mapb;
		
		boolean Bwindows = false, BhiddenDoor = false, BdoorDE = false, BdoorUN = false, BdoorUW = false, Btunnel = false, Bpicture = false, Brug = false;
		boolean BdownCenter = false, BdownNorth = false, BdownEast = false, BdownWest = false, BupCenter = false;
		boolean BupNorth = false, BupEast = false, BupSouth = false, BupWest = false, Bbase = false;
		
		/* 	
			String directions (ex. downCenter) have the letters that are the allowable 
			options for the user to press and change rooms or do other tasks. If the
			user presses a key that is not allowed for the current room that they are in
			an error message will display and the list of available keys for the user to
			choose from will display again
		*/
		// opt1 is used for options allowed in the DOWNSTAIRS Center room
		// opt2 is used for options allowed in the DOWNSTAIRS North, East, and West rooms
		// opt3 is used for options allowed in the UPSTAIRS Center room
		// opt4 is used for options allowed in the UPSTAIRS North, East, South and West rooms
		// map = shows a map of where the user is
		// inventory = tells what objects the user has picked up so far
		// clue =  gives the user a clue of what to do next
		
		
		System.out.println("\n\n\t~~~~~~~~~~~");
		System.out.println("\t{The House}");
		System.out.println("\t~~~~~~~~~~~");
			
			
		System.out.println("\n\n\tWhat is your name?");
		name = input.next();
		do
		{
			System.out.println("\tDo you want to see the instructions, "+name+"? (y/n)");
			instructions = input.next();
		
			if (instructions.equals("y"))
			{
				System.out.println("\tInstructions:");
				System.out.println("\tUse keys 1-5 to choose available options");
				System.out.println("\tUse keys y & n for yes or no questions");
				System.out.println("\tUse key 7 to see your inventory");
				System.out.println("\tUse key 8 to show a map of where you are");
				System.out.println("\tUse key 9 to get a clue of what to do next");
				System.out.println("\tRegular text is descriptive");
				System.out.println("\tText in CAPS helps you determine where you are");
				System.out.println("\tText in \"quotes\" means you are talking");
				System.out.println("\tText in <angle brackets> means that you can pick something up");
				System.out.println("\tText in \\slashes\\ means that you might be able to do something");
				System.out.println("\n\tEnjoy the game!\n");
			}
			if (instructions.equals("n"))
				System.out.println("\tEnjoy the game!\n");
			if (!yn.contains(instructions))
				System.out.println(error);
		} while (!yn.contains(instructions));
		
		while (true)
		{
			System.out.println("\tYou are DOWNSTAIRS in the Center room");
			BdownCenter = true;
			System.out.println("\tThere is a small "+table+" in the corner");
			System.out.println("\n\tGo to the small "+table+"? (1)");
			System.out.println("\tNorth room (2)\n\tEast room (3)\n\tWest room (4)");
			System.out.println("\n\tInventory (7)");
			System.out.println("\tMap (8)");
			System.out.println("\tClue (9)");
			opt1 = input.next();
			
			while (opt1.equals("1"))
			{
				if (!i.contains(smallKey))
				{
					System.out.println("\tThere is a "+smallKey+" on the small "+table);
					System.out.println("\tTake the "+smallKey+"? (y/n)");
					opt0 = input.next();
					if (opt0.equals("y"))
					{
						System.out.println("\t"+smallKey+" has been added to your inventory\n");
						i = i + " "+smallKey;
						break;
					}
					if (opt0.equals("n"))
						break;
					if (!yn.contains(opt0))
						System.out.println(error);
				}
				else
				{
					System.out.println("\tThere is nothing on the small "+table+"\n");
					break;
				}
			}
			while (opt1.equals("2"))
			{
				System.out.println("\tYou are DOWNSTAIRS in the North room");
				BdownNorth = true;
				System.out.println("\tThere is a spiral staircase going UPSTAIRS");
				System.out.println("\tThere are some "+windows+" ahead");
				System.out.println("\n\tGo UPSTAIRS? (1)");
				System.out.println("\tGo to the "+windows+"? (2)");
				System.out.println("\tCenter room (3)");
				System.out.println("\n\tInventory (7)");
				System.out.println("\tMap (8)");
				System.out.println("\tClue (9)");
				opt2 = input.next();
				
				while (opt2.equals("1"))
				{
					System.out.println("\tYou are UPSTAIRS in the Center room");
					BupCenter = true;
					System.out.println("\tThere is a spiral staircase going DOWNSTAIRS");
					System.out.println("\n\tGo DOWNSTAIRS? (1)");
					System.out.println("\tNorth room (2)\n\tEast room (3)\n\tSouth room (4)\n\tWest room (5)");
					System.out.println("\n\tInventory (7)");
					System.out.println("\tMap (8)");
					System.out.println("\tClue (9)");
					opt3 = input.next();
					
					if (opt3.equals("1"))
						break;
					while (opt3.equals("2"))
					{
						if (i.contains(doorKey))
						{
							if (BdoorUN == false)
							{
								System.out.println("\tThe "+door+" is locked");
								System.out.println("\tUse "+doorKey+" on locked "+door+"? (y/n)");
								opt0 = input.next();
								if (opt0.equals("y"))
									BdoorUN = true;
								if (opt0.equals("n"))
									break;
								if (!yn.contains(opt0))
									System.out.println(error);
							}
							else
							{
								System.out.println("\tYou are UPSTAIRS in the North room");
								BupNorth = true;
								System.out.println("\tThere is a "+dresser+" on the other side of the room");
								System.out.println("\tThere is a "+bed+" to your left");
								System.out.println("\n\tGo to the "+dresser+"? (1)");
								System.out.println("\tGo to the "+bed+"? (2)");
								System.out.println("\tCenter room (3)");
								System.out.println("\n\tInventory (7)");
								System.out.println("\tMap (8)");
								System.out.println("\tClue (9)");
								opt4 = input.next();
								while (opt4.equals("1"))
								{
									System.out.println("\tLook in the first "+drawer+"? (1)");
									System.out.println("\tLook in the second "+drawer+"? (2)");
									System.out.println("\tLook in the third "+drawer+"? (3)");
									System.out.println("\tLook in the fourth "+drawer+"? (4)");
									System.out.println("\tBack (5)");
									opt0 = input.next();
									if (opt0.equals("1"))
										System.out.println("\tThere is nothing in the first "+drawer+"\n");
									if (opt0.equals("2"))
									{
										if (!i.contains(gloves))
										{
											do
											{
												System.out.println("\tThere are "+gloves+" in the second "+drawer);
												System.out.println("\tTake the "+gloves+"? (y/n)");
												opt00 = input.next();
												if (opt00.equals("y"))
												{
													System.out.println("\t"+gloves+" have been added to your inventory\n");
													i = i + " "+gloves;
													break;
												}
												if (opt00.equals("n"))
													break;
												if (!yn.contains(opt00))
													System.out.println(error);
											} while (!yn.contains(opt00));
										}
										else
											System.out.println("\tThere is nothing in the second "+drawer+"\n");
									}
									if (opt0.equals("3"))
									{
										if (!i.contains(bigKey))
										{
											do
											{
												System.out.println("\tThere is a "+bigKey+" in the third "+drawer);
												System.out.println("\tTake the "+bigKey+"? (y/n)");
												opt00 = input.next();
												if (opt00.equals("y"))
												{
													System.out.println("\t"+bigKey+" has been added to your inventory\n");
													i = i + " "+bigKey;
													break;
												}
												if (opt00.equals("n"))
													break;
												if (!yn.contains(opt00))
													System.out.println(error);
											} while (!yn.contains(opt00));
										}
										else
											System.out.println("\tThere is nothing in the third "+drawer+"\n");
									}
									if (opt0.equals("4"))
										System.out.println("\tThere is nothing in the fourth "+drawer+"\n");
									if (opt0.equals("5"))
										break;
									if (!optDress.contains(opt0))
										System.out.println(error);
								}
								while (opt4.equals("2"))
								{
									System.out.println("\tLook under the "+pillow+" (1)");
									System.out.println("\tLook under the "+blanket+" (2)");
									System.out.println("\tLook under the "+bed+" (3)");
									System.out.println("\tBack (4)");
									opt0 = input.next();
									if (opt0.equals("1"))
										System.out.println("\tThere is nothing under the "+pillow+"\n");
									if (opt0.equals("2"))
										System.out.println("\tThere is nothing under the "+blanket+"\n");
									if (opt0.equals("3"))
										System.out.println("\tThere is nothing under the "+bed+"\n");
									if (opt0.equals("4"))
										break;
									if (!optBed.contains(opt0))
										System.out.println(error);
								}
								if (opt4.equals("3"))
									break;
								if (opt4.equals("7"))
									System.out.println("\t"+i+"\n");
								if (opt4.equals("8"))
									mapUN();
								if (opt4.equals("9"))
								{
									//clue();
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
									if ((BdownCenter == true) && (BdownNorth == true) && (BdownEast == true) && (BdownWest == true) && (BupCenter == true) && (BupNorth == true) && (BupEast == true) && (BupSouth == true) && (BupWest == true) && (Bbase == true))
										System.out.println("\tYou have been in all of the rooms");
									System.out.println("");
		
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
									System.out.println("");
								}	
								if (!upNorth.contains(opt4))
									System.out.println(error);
							}
						}
						else
						{
							System.out.println("\tThe "+door+" is locked, a "+doorKey+" is needed\n");
							break;
						}
					}
					while (opt3.equals("3"))
					{
						System.out.println("\tYou are UPSTAIRS in the East room");
						BupEast = true;
						System.out.println("\tThere is a "+bed+" on the other side of the room");
						System.out.println("\n\tGo to "+bed+"? (1)");
						System.out.println("\tCenter room (2)");
						System.out.println("\n\tInventory (7)");
						System.out.println("\tMap (8)");
						System.out.println("\tClue (9)");
						opt4 = input.next();
						while (opt4.equals("1"))
						{
							System.out.println("\tLook under the "+pillow+" (1)");
							System.out.println("\tLook under the "+blanket+" (2)");
							System.out.println("\tLook under the "+bed+" (3)");
							System.out.println("\tBack (4)");
							opt0 = input.next();
							if (opt0.equals("1"))
							{
								if (!i.contains(batteries))
								{
									do
									{
										System.out.println("\tThere are "+batteries+" under the "+pillow);
										System.out.println("\tTake the "+batteries+"? (y/n)");
										opt00 = input.next();
										if (opt00.equals("y"))
										{
											System.out.println("\t"+batteries+" have been added to your inventory\n");
											i = i +" "+batteries;
											break;
										}
										if (opt00.equals("n"))
											break;
										if (!yn.contains(opt00))
											System.out.println(error);
									} while (!yn.contains(opt00));
								}
								else
									System.out.println("\tThere is nothing under the "+pillow+"\n");
							}
							if (opt0.equals("2"))
								System.out.println("\tThere is nothing under the "+blanket+"\n");
							if (opt0.equals("3"))
								System.out.println("\tThere is nothing under the "+bed+"\n");
							if (opt0.equals("4"))
								break;
							if (!optBed.contains(opt0))
								System.out.println(error);
						}
						if (opt4.equals("2"))
							break;
						if (opt4.equals("7"))
							System.out.println("\t"+i+"\n");
						if (opt4.equals("8"))
							mapUE();
						if (opt4.equals("9"))
						{
							//clue();
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
							if ((BdownCenter == true) && (BdownNorth == true) && (BdownEast == true) && (BdownWest == true) && (BupCenter == true) && (BupNorth == true) && (BupEast == true) && (BupSouth == true) && (BupWest == true) && (Bbase == true))
								System.out.println("\tYou have been in all of the rooms");
							System.out.println("");
		
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
							System.out.println("");
						}
						if (!upEast.contains(opt4))
							System.out.println(error);
					}
					while (opt3.equals("4"))
					{
						System.out.println("\tYou are UPSTAIRS in the South room");
						BupSouth = true;
						System.out.println("\tThere are some "+windows+" ahead");
						System.out.println("\tThere is a "+couch+" in front of you");
						System.out.println("\n\tGo to the "+windows+"? (1)");
						System.out.println("\tGo to the "+couch+"? (2)");
						System.out.println("\tCenter room (3)");
						System.out.println("\n\tInventory (7)");
						System.out.println("\tMap (8)");
						System.out.println("\tClue (9)");
						opt4 = input.next();
						if (opt4.equals("1"))
							System.out.println("\t\"The "+windows+" are not locked, but the glass is too thick for me to break\"\n");
						if (opt4.equals("2"))
						{
							System.out.println("\t\"Looks like a regular "+couch+"\"\n");
							do
							{
								System.out.println("\tSit on the "+couch+"? (y/n)");
								opt0 = input.next();
								if (opt0.equals("y"))
									System.out.println("\t\"This "+couch+" is actually pretty comfortable, but I should get back to trying to escape\"\n");
								if (opt0.equals("n"))
									break;
								if (!yn.contains(opt0))
									System.out.println(error);
							} while (!yn.contains(opt0));
						}
						if (opt4.equals("3"))
							break;
						if (opt4.equals("7"))
							System.out.println("\t"+i+"\n");
						if (opt4.equals("8"))
							mapUS();
						if (opt4.equals("9"))
						{
							//clue();
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
							if ((BdownCenter == true) && (BdownNorth == true) && (BdownEast == true) && (BdownWest == true) && (BupCenter == true) && (BupNorth == true) && (BupEast == true) && (BupSouth == true) && (BupWest == true) && (Bbase == true))
								System.out.println("\tYou have been in all of the rooms");
							System.out.println("");
		
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
							System.out.println("");
						}
						if (!upSouth.contains(opt4))
							System.out.println(error);
					}
					while (opt3.equals("5"))
					{
						if (i.contains(hammer))
						{
							if (BdoorUW == false)
							{
									System.out.println("\tThe "+door+" is locked from the inside");
									System.out.println("\tUse "+hammer+" to smash "+door+" handle off? (y/n)");
									opt0 = input.next();
									if (opt0.equals("y"))
									{
										BdoorUW = true;
									}
									if (opt0.equals("n"))
										break;
									if (!yn.contains(opt0))
										System.out.println(error);
							}
							else
							{
								System.out.println("\tYou are UPSTAIRS in the West room");
								BupWest = true;
								System.out.println("\tThere is a dining "+table+" in the middle of the room");
								System.out.println("\n\tGo to the dining "+table+"? (1)");
								System.out.println("\tCenter room (2)");
								System.out.println("\n\tInventory (7)");
								System.out.println("\tMap (8)");
								System.out.println("\tClue (9)");
								opt4 = input.next();
								if (opt4.equals("1"))
								{
									if (!i.contains(flashlight))
									{
										do
										{
											System.out.println("\tThere is a "+flashlight+" on the dining "+table);
											System.out.println("\tTake the "+flashlight+"? (y/n)");
											opt0 = input.next();
											if (opt0.equals("y"))
											{
												System.out.println("\t"+flashlight+" has been added to your inventory\n");
												i = i +" "+flashlight;
												break;
											}
											if (opt0.equals("n"))
												break;
											if (!yn.contains(opt0))
												System.out.println(error);
										} while (!yn.contains(opt0));
									}
									else
										System.out.println("\tThere is nothing on the dining "+table+"\n");
								}
								if (opt4.equals("2"))
									break;
								if (opt4.equals("7"))
									System.out.println("\t"+i+"\n");
								if (opt4.equals("8"))
									mapUW();
								if (opt4.equals("9"))
								{
									//clue();
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
									if ((BdownCenter == true) && (BdownNorth == true) && (BdownEast == true) && (BdownWest == true) && (BupCenter == true) && (BupNorth == true) && (BupEast == true) && (BupSouth == true) && (BupWest == true) && (Bbase == true))
										System.out.println("\tYou have been in all of the rooms");
									System.out.println("");
		
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
									System.out.println("");
								}
								if (!upWest.contains(opt4))
									System.out.println(error);
							}
						}
						else
						{
							System.out.println("\tThe "+door+" is locked from the inside");
							System.out.println("\tSomething is needed to smash off "+door+" handle\n");
							break;
						}
					}
					if (opt3.equals("7"))
						System.out.println("\t"+i+"\n");
					if (opt3.equals("8"))
						mapUC();
					if (opt3.equals("9"))
					{
						//clue();
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
						if ((BdownCenter == true) && (BdownNorth == true) && (BdownEast == true) && (BdownWest == true) && (BupCenter == true) && (BupNorth == true) && (BupEast == true) && (BupSouth == true) && (BupWest == true) && (Bbase == true))
							System.out.println("\tYou have been in all of the rooms");
						System.out.println("");

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
						System.out.println("");
					}
					if (!upCenter.contains(opt3))
						System.out.println(error);
				}
				while (opt2.equals("2"))
				{	
					if(i.contains(smallKey))
					{
						do
						{
							if (Bwindows == false)
							{	
								System.out.println("\tThe "+windows+" have bars locked over them");
								System.out.println("\tUse "+smallKey+" on "+windows+"? (y/n)");
								opt0 = input.next();
								if (opt0.equals("y"))
								{
									System.out.println("\t\"I unlocked the windows, but the glass is too thick for me to break\"\n");
									Bwindows = true;
									break;
								}
								if (opt0.equals("n"))
									break;
								if (!yn.contains(opt0))
									System.out.println(error);
							}
							else
							{
								System.out.println("\t\"I already unlocked the windows, the glass is too thick for me to break\"\n");
								break;
							}
						} while (!yn.contains(opt0));
						break;
					}
					else
						System.out.println("\tThe "+windows+" have bars locked over them, a "+smallKey+" is needed\n");
					break;
				}
				if (opt2.equals("3"))
					break;
				if (opt2.equals("7"))
					System.out.println("\t"+i+"\n");
				if (opt2.equals("8"))
					mapDN();
				if (opt2.equals("9"))
				{
					//clue();
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
					if ((BdownCenter == true) && (BdownNorth == true) && (BdownEast == true) && (BdownWest == true) && (BupCenter == true) && (BupNorth == true) && (BupEast == true) && (BupSouth == true) && (BupWest == true) && (Bbase == true))
						System.out.println("\tYou have been in all of the rooms");
					System.out.println("");

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
					System.out.println("");
				}
				if (!downNorth.contains(opt2))
					System.out.println(error);
			} 
			
			while (opt1.equals("3"))
			{
				if (i.contains(doorKey))
				{
						if (BdoorDE == false)
						{
								System.out.println("\tThe "+door+" is locked");
								System.out.println("\tUse "+doorKey+" on locked "+door+"? (y/n)");
								opt0 = input.next();
								if (opt0.equals("y"))
								{
									BdoorDE = true;
								}
								if (opt0.equals("n"))
									break;
								if (!yn.contains(opt0))
									System.out.println(error);
						}
						else
						{
								System.out.println("\tYou are DOWNSTAIRS in the East room");
								BdownEast = true;
								if (Brug == false)
									System.out.println("\tThere is a "+rug+" on the floor");
								else
									System.out.println("\tThere is a hidden "+door+" on the floor");
								System.out.println("\tThere is a "+door+" to your right");
								if (Brug == false)
									System.out.println("\n\tLook under the "+rug+"? (1)");
								else
									System.out.println("\n\tGo to the hidden "+door+"? (1)");
								System.out.println("\tGo to the "+door+"? (2)");
								System.out.println("\tCenter room (3)");
								System.out.println("\n\tInventory (7)");
								System.out.println("\tMap (8)");
								System.out.println("\tClue (9)");
								opt2 = input.next();
								while (opt2.equals("1"))
								{
									if (i.contains(bigKey))
									{
										if ((BhiddenDoor == false) && (Brug == false))
											System.out.println("\tThere is a hidden "+door);
											Brug = true;
										if ((BhiddenDoor == false) && (Brug == true))
										{
											
											System.out.println("\tThe hidden "+door+" is locked");
											System.out.println("\tUse "+bigKey+" on hidden "+door+"? (y/n)");
											opt0 = input.next();
											if (opt0.equals("y"))
											{
												BhiddenDoor = true;
												if ((!i.contains(flashlight)) && (!i.contains(batteries)))
												{
													System.out.println("\t\"I unlocked the hidden "+door+" but it is too dark for me to see down there\"\n");
													break;
												}
												if ((!i.contains(flashlight)) && (i.contains(batteries)))
												{
													System.out.println("\t\"I unlocked the hidden "+door+" but I don't have a "+flashlight+" for my "+batteries+" and it is too dark for me to see down there\"\n");
													break;
												}
												if ((!i.contains(batteries)) && (i.contains(flashlight)))
												{
													System.out.println("\t\"I unlocked the hidden "+door+" but I dont have "+batteries+" for my "+flashlight+" and it is too dark for me to see down there\"\n");
													break;
												}
											}
											if (opt0.equals("n"))
												break;
											if (!yn.contains(opt0))
												System.out.println(error);
											
										}
										if (BhiddenDoor == true)
										{
											if ((!i.contains(flashlight)) && (!i.contains(batteries)))
											{
												System.out.println("\t\"I already unlocked the hidden "+door+" but it is too dark for me to see down there\"\n");
												break;
											}
											if ((!i.contains(flashlight)) && (i.contains(batteries)))
											{
												System.out.println("\t\"I already unlocked the hidden "+door+" but I don't have a "+flashlight+" for my "+batteries+" and it is too dark for me to see down there\"\n");
												break;
											}
											if ((!i.contains(batteries)) && (i.contains(flashlight)))
											{
												System.out.println("\t\"I already unlocked the hidden "+door+" but I dont have "+batteries+" for my "+flashlight+" and it is too dark for me to see down there\"\n");
												break;
											}
											if ((i.contains(flashlight)) && (i.contains(batteries)))
											{
												System.out.println("\tThere are some stairs going to the BASEMENT");
												System.out.println("\tGo to the BASEMENT? (y/n)");
												opt0 = input.next();
												while (opt0.equals("y"))
												{
													System.out.println("\tYou are in the BASEMENT");
													Bbase = true;
													System.out.println("\tThere are some stairs going to the DOWNSTAIRS East room");
													System.out.println("\tThere is a "+workbench+" to your right");
													System.out.println("\tThere is a scary "+picture+" hanging across from you");
													System.out.println("\tThere is a "+bike+" and a boarded up "+tunnel+" to your left");
													System.out.println("\n\tGo to the DOWNSTAIRS East room? (1)");
													System.out.println("\tGo to the "+workbench+"? (2)");
													System.out.println("\tGo to the scary "+picture+"? (3)");
													System.out.println("\tGo to the "+bike+"? (4)");
													System.out.println("\tGo to the "+tunnel+"? (5)");
													System.out.println("\n\tInventory (7)");
													System.out.println("\tMap (8)");
													System.out.println("\tClue (9)");
													opt00 = input.next();
													if (opt00.equals("1"))
														break;
													while (opt00.equals("2"))
													{
														System.out.println("\tThere is a "+saw+" on the "+workbench);
														System.out.println("\tTake the "+saw+"? (y/n)");
														opt000 = input.next();
														if (opt000.equals("y"))
														{
															System.out.println("\t"+saw+" has been added to your inventory\n");
															i = i +" "+saw;
															break;
														}
														if (opt000.equals("n"))
															break;
														if (!yn.contains(opt000))
															System.out.println(error);	
													}
													while (opt00.equals("3"))
													{
														if (Bpicture == false)
														{	
															System.out.println("\tHit scary "+picture+" with "+hammer+"? (y/n)");
															opt000 = input.next();
															if (opt000.equals("y"))
															{
																Bpicture = true;
																System.out.println("\tYou broke the scary "+picture+"\n");
																break;
															}
															if (opt000.equals("n"))
																break;
															if (!yn.contains(opt000))
																System.out.println(error);
														}
														else
														{
															System.out.println("\tHit the scary "+picture+" again? (y/n)");
															opt000 = input.next();
															if (opt000.equals("y"))
															{
																System.out.println("\tYou hit the scary "+picture+"\n");
															}
															if (opt000.equals("n"))
																break;
															if (!yn.contains(opt000))
																System.out.println(error);
														}
													}
													while (opt00.equals("4"))
													{
														System.out.println("\tRide the "+bike+" around the room? (y/n)");
														opt000 = input.next();
														if (opt000.equals("y"))
														{
															System.out.println("\t\"Wow, that was fun\"\n");
															break;
														}
														if (opt000.equals("n"))
															break;
														if (!yn.contains(opt000))
															System.out.println(error);
													}
													while (opt00.equals("5"))
													{
														if (i.contains(saw))
														{
															if (Btunnel == false)
															{
																System.out.println("\tThe "+tunnel+" is boarded shut");
																System.out.println("\tUse "+saw+" to saw off the boards? (y/n)");
																opt000 = input.next();
																if (opt000.equals("y"))
																{
																	Btunnel = true;
																	System.out.println("\tYou saw off the boards");
																}
																if (opt000.equals("n"))
																	break;
																if (!yn.contains(opt000))
																	System.out.println(error);
															}
															else
															{
																if (i.contains(gloves))
																{
																	System.out.println("\tThe entrance to the "+tunnel+" is covered with spider webs and black widows");
																	System.out.println("\tUse "+gloves+" to clear out the "+tunnel+"? (y/n)");
																	opt000 = input.next();
																	if (opt000.equals("y"))
																	{
																		System.out.println("\tYou clear out the "+tunnel+" and crawl though");
																		System.out.println("\tESCAPE!");
																		System.exit(0);
																	}
																	if (opt000.equals("n"))
																		break;
																	if (!yn.contains(opt000))
																		System.out.println(error);
																}
																else
																{
																	System.out.println("\tThe entrance to the "+tunnel+" is covered with spider webs and black widows, some "+gloves+" are needed\n");
																	break;
																}	
															}
														}
														else
														{
															System.out.println("\tThe "+tunnel+" is boarded shut, a "+saw+" is needed\n");
															break;
														}
													}
													if (opt00.equals("7"))
														System.out.println("\t"+i+"\n");
													if (opt00.equals("8"))
														mapb();
													if (opt00.equals("9"))
													{
														//clue();
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
														if ((BdownCenter == true) && (BdownNorth == true) && (BdownEast == true) && (BdownWest == true) && (BupCenter == true) && (BupNorth == true) && (BupEast == true) && (BupSouth == true) && (BupWest == true) && (Bbase == true))
															System.out.println("\tYou have been in all of the rooms");
														System.out.println("");
		
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
														System.out.println("");
													}
													if (!base.contains(opt00))
														System.out.println(error);
												}
												if (opt0.equals("n"))
													break;
												if (!yn.contains(opt0))
													System.out.println(error);
											}
										}
									}
									else
									{
										if (Brug == false)
										{
											System.out.println("\tThere is a hidden "+door+", but it is locked, a "+bigKey+" is needed\n");
											Brug = true;
											break;
										}
										else
										{
											System.out.println("\tThe hidden "+door+" is locked, a "+bigKey+" is needed\n");
											break;
										}
									}
						
								}
								if (opt2.equals("2"))
									System.out.println("\t\"The "+door+" is chained shut, I can't open it\"\n");
								if (opt2.equals("3"))
									break;
								if (opt2.equals("7"))
									System.out.println("\t"+i+"\n");
								if (opt2.equals("8"))
									mapDE();
								if (opt2.equals("9"))
								{
									//clue();
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
									if ((BdownCenter == true) && (BdownNorth == true) && (BdownEast == true) && (BdownWest == true) && (BupCenter == true) && (BupNorth == true) && (BupEast == true) && (BupSouth == true) && (BupWest == true) && (Bbase == true))
										System.out.println("\tYou have been in all of the rooms");
									System.out.println("");
		
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
									System.out.println("");
								}
								if (!downEast.contains(opt2))
									System.out.println(error);
						}
				}
				else
				{
					System.out.println("\tThe "+door+" is locked, a "+doorKey+" is needed\n");
					break;
				}	
			}
			
			while (opt1.equals("4"))
			{
				System.out.println("\tYou are DOWNSTAIRS in the West room");
				BdownWest = true;
				System.out.println("\tThere is a "+bookshelf+" across from you");
				System.out.println("\n\tGo to the "+bookshelf+"? (1)");
				System.out.println("\tCenter room (2)");
				System.out.println("\n\tInventory (7)");
				System.out.println("\tMap (8)");
				System.out.println("\tClue (9)");
				opt2 = input.next();
				while (opt2.equals("1"))
				{
					System.out.println("\tLook on the first "+shelf+" (1)\n\tLook on the second "+shelf+" (2)\n\tLook on the third "+shelf+" (3)\n\tLook on the fourth "+shelf+" (4)\n\tBack (5)");
					opt0 = input.next();
					if (opt0.equals("1"))
					{
						if (!i.contains(doorKey))
						{
							do
							{
								System.out.println("\tThere is a "+book+" with something inside it");
								System.out.println("\tLook inside the "+book+"? (y/n)");
								opt00 = input.next();
								if (opt00.equals("y"))
								{
									do
									{
										System.out.println("\tThere is a "+doorKey+" inside the "+book);
										System.out.println("\tTake the "+doorKey+"? (y/n)");
										opt000 = input.next();
										if (opt000.equals("y"))
										{
											System.out.println("\t"+doorKey+" has been added to your inventory");
											System.out.println("\tYou put the "+book+" back\n");
											i = i +" "+doorKey;
											break;
										}
										if (opt000.equals("n"))
										{
											System.out.println("\tYou put the "+book+" back\n");
											break;
										}
										if (!yn.contains(opt000))
											System.out.println(error);
									} while (!yn.contains(opt000));
								}
								if (opt00.equals("n"))
									break;
								if (!yn.contains(opt00))
									System.out.println(error);
							} while (!yn.contains(opt00));
						}
						else
							System.out.println("\tThere is a "+book+"\n");
					}
					if (opt0.equals("2"))
						System.out.println("\tThe "+shelf+" is empty\n");
					if (opt0.equals("3"))
						System.out.println("\tThe "+shelf+" is empty\n");
					if (opt0.equals("4"))
					{
						if (!i.contains(hammer))
						{
							do
							{
								System.out.println("\tThere is a "+hammer);
								System.out.println("\tTake the "+hammer+"? (y/n)");
								opt00 = input.next();
								if (opt00.equals("y"))
								{
									System.out.println("\t"+hammer+" has been added to your inventory\n");
									i = i +" "+hammer;
									break;
								}
								if (opt00.equals("n"))
									break;
								if (!yn.contains(opt00))
									System.out.println(error);
							} while (!yn.contains(opt00));
						}
						else
							System.out.println("\tThe "+shelf+" is empty\n");
					}
					if (opt0.equals("5"))
						break;
					if (!optShelf.contains(opt0))
						System.out.println(error);
				}
				if (opt2.equals("2"))
					break;
				if (opt2.equals("7"))
					System.out.println("\t"+i+"\n");
				if (opt2.equals("8"))
					mapDW();
				if (opt2.equals("9"))
				{
					//clue();
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
					if ((BdownCenter == true) && (BdownNorth == true) && (BdownEast == true) && (BdownWest == true) && (BupCenter == true) && (BupNorth == true) && (BupEast == true) && (BupSouth == true) && (BupWest == true) && (Bbase == true))
						System.out.println("\tYou have been in all of the rooms");
					System.out.println("");

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
					System.out.println("");
				}
				if (!downWest.contains(opt2))
					System.out.println(error);
			}
			if (opt1.equals("7"))
				System.out.println("\t"+i+"\n");
			if (opt1.equals("8"))
				mapDC();
			if (opt1.equals("9"))
			{
				//clue();
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
				if ((BdownCenter == true) && (BdownNorth == true) && (BdownEast == true) && (BdownWest == true) && (BupCenter == true) && (BupNorth == true) && (BupEast == true) && (BupSouth == true) && (BupWest == true) && (Bbase == true))
					System.out.println("\tYou have been in all of the rooms");
				System.out.println("");

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
				System.out.println("");
			}
			if (!downCenter.contains(opt1))
				System.out.println(error);
		}
	}
	public static void clue()
	{
		String smallKey = "<small key>", bigKey = "<big key>", doorKey = "<door key>", hammer = "<hammer>", gloves = "<gloves>";
		String flashlight = "<flashlight>", batteries = "<batteries>", saw = "<saw>", wristWatch = "<wrist watch>";
		String i = wristWatch;
		
		boolean BdownCenter = false, BdownNorth = false, BdownEast = false, BdownWest = false, BupCenter = false;
		boolean BupNorth = false, BupEast = false, BupSouth = false, BupWest = false, Bbase = false;
		
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
		if ((BdownCenter == true) && (BdownNorth == true) && (BdownEast == true) && (BdownWest == true) && (BupCenter == true) && (BupNorth == true) && (BupEast == true) && (BupSouth == true) && (BupWest == true) && (Bbase == true))
			System.out.println("\tYou have been in all of the rooms");
		System.out.println("");
		
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
		System.out.println("");
		}
		public static void mapDC()
		{
			System.out.println("                                ____________________________                                         ");
			System.out.println("                               |         NORTH ROOM         |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("    ___________________________|____________________________|___________________________             ");
			System.out.println("   |         WEST ROOM         |         CENTER ROOM        |         EAST ROOM         |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |             /\\             |                           |            ");
			System.out.println("   |                           |            //\\\\            |                           |            ");
			System.out.println("   |                           |           ///\\\\\\           |                           |            ");
			System.out.println("   |                           |          ||||||||          |                           |            ");
			System.out.println("   |                           |           \\\\\\///           |                           |            ");
			System.out.println("   |                           |            \\\\//            |                           |            ");
			System.out.println("   |                           |             \\/             |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |___________________________|____________________________|___________________________|            ");
			System.out.println("\n");
		}
		public static void mapDN()
		{
			System.out.println("                                ____________________________                                         ");
			System.out.println("                               |         NORTH ROOM         |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |             /\\             |                                        ");
			System.out.println("                               |            //\\\\            |                                        ");
			System.out.println("                               |           ///\\\\\\           |                                        ");
			System.out.println("                               |          ||||||||          |                                        ");
			System.out.println("                               |           \\\\\\///           |                                        ");
			System.out.println("                               |            \\\\//            |                                        ");
			System.out.println("                               |             \\/             |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("    ___________________________|____________________________|___________________________             ");
			System.out.println("   |         WEST ROOM         |         CENTER ROOM        |         EAST ROOM         |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |___________________________|____________________________|___________________________|            ");
			System.out.println("\n");
		}
		public static void mapDE()
		{
			System.out.println("                                ____________________________                                         ");
			System.out.println("                               |         NORTH ROOM         |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("    ___________________________|____________________________|___________________________             ");
			System.out.println("   |         WEST ROOM         |         CENTER ROOM        |         EAST ROOM         |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |            /\\             |            ");
			System.out.println("   |                           |                            |           //\\\\            |            ");
			System.out.println("   |                           |                            |          ///\\\\\\           |            ");
			System.out.println("   |                           |                            |         ||||||||          |            ");
			System.out.println("   |                           |                            |          \\\\\\///           |            ");
			System.out.println("   |                           |                            |           \\\\//            |            ");
			System.out.println("   |                           |                            |            \\/             |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |___________________________|____________________________|___________________________|            ");
			System.out.println("\n");
		}
		public static void mapDW()
		{
			System.out.println("                                ____________________________                                         ");
			System.out.println("                               |         NORTH ROOM         |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("    ___________________________|____________________________|___________________________             ");
			System.out.println("   |         WEST ROOM         |         CENTER ROOM        |         EAST ROOM         |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |            /\\             |                            |                           |            ");
			System.out.println("   |           //\\\\            |                            |                           |            ");
			System.out.println("   |          ///\\\\\\           |                            |                           |            ");
			System.out.println("   |         ||||||||          |                            |                           |            ");
			System.out.println("   |          \\\\\\///           |                            |                           |            ");
			System.out.println("   |           \\\\//            |                            |                           |            ");
			System.out.println("   |            \\/             |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |___________________________|____________________________|___________________________|            ");
			System.out.println("\n");
		}
		public static void mapUC()
		{
			System.out.println("                                ____________________________                                         ");
			System.out.println("                               |         NORTH ROOM         |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("    ___________________________|____________________________|___________________________             ");
			System.out.println("   |         WEST ROOM         |         CENTER ROOM        |         EAST ROOM         |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |             /\\             |                           |            ");
			System.out.println("   |                           |            //\\\\            |                           |            ");
			System.out.println("   |                           |           ///\\\\\\           |                           |            ");
			System.out.println("   |                           |          ||||||||          |                           |            ");
			System.out.println("   |                           |           \\\\\\///           |                           |            ");
			System.out.println("   |                           |            \\\\//            |                           |            ");
			System.out.println("   |                           |             \\/             |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |___________________________|____________________________|___________________________|            ");
			System.out.println("                               |         SOUTH ROOM         |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |____________________________|                                        ");
			System.out.println("\n");
		}
		public static void mapUN()
		{
			System.out.println("                                ____________________________                                         ");
			System.out.println("                               |         NORTH ROOM         |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |             /\\             |                                        ");
			System.out.println("                               |            //\\\\            |                                        ");
			System.out.println("                               |           ///\\\\\\           |                                        ");
			System.out.println("                               |          ||||||||          |                                        ");
			System.out.println("                               |           \\\\\\///           |                                        ");
			System.out.println("                               |            \\\\//            |                                        ");
			System.out.println("                               |             \\/             |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("    ___________________________|____________________________|___________________________             ");
			System.out.println("   |         WEST ROOM         |         CENTER ROOM        |         EAST ROOM         |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |___________________________|____________________________|___________________________|            ");
			System.out.println("                               |         SOUTH ROOM         |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |____________________________|                                        ");
			System.out.println("\n");
		}
		public static void mapUE()
		{
			System.out.println("                                ____________________________                                         ");
			System.out.println("                               |         NORTH ROOM         |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("    ___________________________|____________________________|___________________________             ");
			System.out.println("   |         WEST ROOM         |         CENTER ROOM        |         EAST ROOM         |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |            /\\             |            ");
			System.out.println("   |                           |                            |           //\\\\            |            ");
			System.out.println("   |                           |                            |          ///\\\\\\           |            ");
			System.out.println("   |                           |                            |         ||||||||          |            ");
			System.out.println("   |                           |                            |          \\\\\\///           |            ");
			System.out.println("   |                           |                            |           \\\\//            |            ");
			System.out.println("   |                           |                            |            \\/             |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |___________________________|____________________________|___________________________|            ");
			System.out.println("                               |         SOUTH ROOM         |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |____________________________|                                        ");
			System.out.println("\n");

		}
		public static void mapUS()
		{
			System.out.println("                                ____________________________                                         ");
			System.out.println("                               |         NORTH ROOM         |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("    ___________________________|____________________________|___________________________             ");
			System.out.println("   |         WEST ROOM         |         CENTER ROOM        |         EAST ROOM         |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |___________________________|____________________________|___________________________|            ");
			System.out.println("                               |         SOUTH ROOM         |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |             /\\             |                                        ");
			System.out.println("                               |            //\\\\            |                                        ");
			System.out.println("                               |           ///\\\\\\           |                                        ");
			System.out.println("                               |          ||||||||          |                                        ");
			System.out.println("                               |           \\\\\\///           |                                        ");
			System.out.println("                               |            \\\\//            |                                        ");
			System.out.println("                               |             \\/             |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |____________________________|                                        ");
			System.out.println("\n");
		}
		public static void mapUW()
		{
			System.out.println("                                ____________________________                                         ");
			System.out.println("                               |         NORTH ROOM         |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("    ___________________________|____________________________|___________________________             ");
			System.out.println("   |         WEST ROOM         |         CENTER ROOM        |         EAST ROOM         |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |            /\\             |                            |                           |            ");
			System.out.println("   |           //\\\\            |                            |                           |            ");
			System.out.println("   |          ///\\\\\\           |                            |                           |            ");
			System.out.println("   |         ||||||||          |                            |                           |            ");
			System.out.println("   |          \\\\\\///           |                            |                           |            ");
			System.out.println("   |           \\\\//            |                            |                           |            ");
			System.out.println("   |            \\/             |                            |                           |            ");
			System.out.println("   |                           |                            |                           |            ");
			System.out.println("   |___________________________|____________________________|___________________________|            ");
			System.out.println("                               |         SOUTH ROOM         |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |____________________________|                                        ");
			System.out.println("\n");
		}
		public static void mapb()
		{
			System.out.println("                                ____________________________                                         ");
			System.out.println("                               |          BASEMENT          |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |             /\\             |                                        ");
			System.out.println("                               |            //\\\\            |                                        ");
			System.out.println("                               |           ///\\\\\\           |                                        ");
			System.out.println("                               |          ||||||||          |                                        ");
			System.out.println("                               |           \\\\\\///           |                                        ");
			System.out.println("                               |            \\\\//            |                                        ");
			System.out.println("                               |             \\/             |                                        ");
			System.out.println("                               |                            |                                        ");
			System.out.println("                               |____________________________|                                        ");
			System.out.println("\n");
		}
}