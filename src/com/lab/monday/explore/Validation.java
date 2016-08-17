package com.lab.monday.explore;

public class Validation
{
	public static boolean isValidMenuChoice(String menuChoice)
	{
		boolean validSelection = true;
		String[] validEntries = {"1", "2", "3"};
		
		for (int i = 0; i < validEntries.length; i++)
		{
			if (menuChoice.equalsIgnoreCase(validEntries[i].toString()))
			{
				validSelection = false;
			}
		}
		if (validSelection)
		{
			System.out.println("This is not a valid entry. Please try again.");
		}
		return validSelection;
	}

	
}
