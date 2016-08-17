package com.countryadventuremode;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class ReadAndWriteAdventure
{
	Path ourNewPath = Paths.get("\\Users\\admin\\newWorkspace\\WeekThreeDayOne\\src\\com\\lab\\monday\\explore\\CountryList");
	File aNewFile = ourNewPath.toFile();
	static ArrayList<String>countries = new ArrayList<>();
	
	public void readCountries()
	{
	
		for (int i = 0; i < countries.size(); i++)
		{
		System.out.println(countries.get(i));
		}
	
	}//end readCountries

	public void writeCountries(String userCountry)
	{

		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFile, true))))
		{
		out.print("\n" + userCountry);
		countries.add(userCountry);
		out.close();
		}
	
		catch (IOException e)
		{
		e.printStackTrace();
		}

	}//end writeCountries

	public void deleteCountries()
	{
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFile))))
		{
		out.println(countries.get(0));
		out.close();
		}
		catch (IOException e)
		{
		e.printStackTrace();
		}
	
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFile,true))))
		{
			for (int i = 1; i < (countries.size())-1; i++)
			{
			out.println(countries.get(i));
			}
		out.close();	
		}
		catch (IOException e)
		{
		e.printStackTrace();
		}	
	
}	//end delete countries

	public void deleteLastCountryFromArray()
	{
	countries.remove(countries.size() - 1);
	countries.trimToSize();
	}
}//class
