package com.jspiders.javaApp.fileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation 
{
/*	public static void main(String[] args) 
	{
		String path="D:\\fileoperations\\myDocument";
		File file=new File(path);
		if(file.exists())
		{
			System.out.println("folder is already exist!!!");
		}else
		{
			file.mkdirs();
			System.out.println("folder is created!!!!!");
		}
		D:\fileoperations\myDocument
		
	}*/
	public static void main(String[] args) throws IOException 
	{
		String path="D:\\fileoperations\\myDocument\\myTextFile.txt";
		
		FileReader writer=new FileReader(path);
		
		BufferedReader buffereader=new BufferedReader(writer);
		
		String str=buffereader.readLine();
		int count=0;
		while(str!=null)
		{
		System.out.println(str);
		String[] arr=str.split(" ");
		for(int i=0;i<=arr.length-1;i++)
		{
			count++;
		}
		str=buffereader.readLine();
		}
		buffereader.close();
		System.out.println(count);
		System.out.println("done");
		
		/*File file=new File(path);
		if(file.exists())
		{
			System.out.println("file is already exist!!!");
		}else
		{
			file.createNewFile();
			System.out.println("file is created!!!!!");
		}*/
		
		
	}

}
