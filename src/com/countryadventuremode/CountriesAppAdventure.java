package com.countryadventuremode;

import java.util.Scanner;
import java.io.*;
import java.nio.file.*;

public class CountriesAppAdventure
{
	private static boolean unitedNations = true;

	public static void main(String[] args)
	{
		Scanner map = new Scanner(System.in);
		String menuChoice = null;
		String userCountry = null;
		String countryList = null;
		String userConfirmation = null;
		String yesNoChoice = null;
		String removeCountry = null;
		Path ourNewPath = Paths
				.get("\\Users\\admin\\newWorkspace\\WeekThreeDayOne\\src\\com\\lab\\monday\\explore\\CountryList");
		File aNewFile = ourNewPath.toFile();

		try (BufferedReader in = new BufferedReader(new FileReader(aNewFile)))
		{
			String aCountry;
			while ((aCountry = in.readLine()) != null)
			{
			ReadAndWriteAdventure.countries.add(aCountry);
			}
			
			in.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		while (unitedNations == true)
		{
			System.out.println();
			System.out.println("Welcome to our working list of countries.");

			do
			{
				System.out.println("To select an option, please use the menu below:");
				System.out.println("\n\t 1. Display countries." + "\n\t 2. Add a country."
						+ "\n\t 3. Delete the last country entered." + "\n\t 4. Exit");
				menuChoice = map.nextLine();
			} while (ValidationAdventure.isValidMenuChoice(menuChoice));

			switch (menuChoice)
			{
			case "1":
				ReadAndWriteAdventure display = new ReadAndWriteAdventure();
				System.out.print("Here is the list you requested\n");
				display.readCountries();
				break;

			case "2":
				System.out.print("Please enter the name of the country you wish to add to our working list.");
				userCountry = map.nextLine();
				ReadAndWriteAdventure addCountry = new ReadAndWriteAdventure();
				addCountry.writeCountries(userCountry);
				break;

			case "3":
				ReadAndWriteAdventure delete = new ReadAndWriteAdventure();
				delete.deleteCountries();
				ReadAndWriteAdventure deleteArray = new ReadAndWriteAdventure();
				deleteArray.deleteLastCountryFromArray();
				break;

			case "4":
				System.out.println("Thank you for visiting our working list of countries. Goodbye!");
				System.exit(0);
			}// switch
		} // while
	}// main
}// class