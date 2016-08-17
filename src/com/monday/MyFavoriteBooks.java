package com.monday;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class MyFavoriteBooks
{
	public static void main(String[] args)
	{
		ArrayList<String> adamsFavBooks = new ArrayList<>(); 
		
		Path ourNewPath = Paths.get("\\Users\\admin\\Desktop\\MyFaveBooks.txt");
		File aNewFile = ourNewPath.toFile(); 
		
	try(BufferedReader in = new BufferedReader(new FileReader(aNewFile)))
	{
		String aBook; 
		while((aBook = in.readLine()) != null)
				{
					adamsFavBooks.add(aBook); 
				}
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	}
}
