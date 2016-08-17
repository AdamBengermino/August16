package com.monday;

import java.io.*;
import java.nio.file.*;

public class OurWriter
{

	public static void main(String[] args)
	{
		Path ourNewPath = Paths.get("\\Users\\admin\\Desktop\\anewtextfile.txt"); 
		File aNewFileObj = ourNewPath.toFile();
		
		try(
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFileObj, true))))
		{
			out.println("Claire");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		
		try(BufferedReader in= new BufferedReader(new FileReader(aNewFileObj)))
		{
			String peopleInClassroom; 
			
			while((peopleInClassroom = in.readLine()) != null)
			{
				System.out.println(peopleInClassroom);
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}//main

}//class
