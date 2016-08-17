package com.monday;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;

public class OurDateWriterReader
{
	public static void main(String[] args)
	{
		Path ourNewPath = Paths.get("\\Users\\admin\\Desktop\\everyTimeWeRanApp.txt"); 
		File ourNewFile = ourNewPath.toFile();
		
	try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(ourNewFile, true))))
	{
		LocalDateTime currentDateTime = LocalDateTime.now();
		out.println("I accessed this app at " + currentDateTime);
	} 
	catch (IOException e)
	{
		e.printStackTrace();
	}
	}
}
