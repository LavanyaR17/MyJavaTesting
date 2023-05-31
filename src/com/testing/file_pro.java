package com.testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class file_pro {

	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:/Users/002HNY744/Documents/FileHandling/a.txt");	
		//File f = new File("C:/Users/002HNY744/Documents/FileHandling/sunday/monday/tuesday");
		//f.mkdirs();//to create a multiple folders
		//f.mkdir();//to create a single folder
		//f.createNewFile();//to create a txt file
		//System.out.println("created");
		
		
		//To read text from text file
		FileReader fr = new FileReader(f);
		BufferedReader bf = new BufferedReader(fr);
		System.out.println(bf.readLine());
		
		String str = "";
		while(str!=null)
		{
			str=bf.readLine();
			if(str!=null)
			{
			System.out.println(str);
			}
		}

	}

}
