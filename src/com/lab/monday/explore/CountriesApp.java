package com.lab.monday.explore;

import java.util.Scanner;
import java.io.*; 
import java.nio.file.*; 
public class CountriesApp
{
	private static boolean unitedNations = true;
	public static void main(String[] args)
	{
		Scanner map = new Scanner(System.in);
		String menuChoice = null;
		String userCountry = null;
		String countryList = null;
		
		
		while (unitedNations == true)
		{
			System.out.println();
			System.out.println("Welcome to our working list of countries.");
			do
			{
				System.out.println("To select an option, please use the menu below:");
				System.out.println("\n\t 1. Display countries."
				+ "\n\t 2. Add a country."
				+ "\n\t 3. Exit");
				menuChoice = map.nextLine();
			}
			while (Validation.isValidMenuChoice(menuChoice));
		
			switch(menuChoice)
			{
				case "1":
					ReadAndWrite display = new ReadAndWrite();
					System.out.print("Here is the list you requested");
					display.readCountries();
				break;
				
				case "2":
					System.out.print("Please enter the name of the country you wish to add to our working list.");
					userCountry = map.nextLine();
					ReadAndWrite addCountry = new ReadAndWrite();
					addCountry.writeCountries(userCountry);
				break;
				
				case "3":
					System.out.println("Thank you for visiting our working list of countries. Goodbye!");
					System.exit(0);
			}		
		}	
	}
}

