package com.jspiders.javaApp.reverseVowels;

import java.util.ArrayList;

public class ReverseConsunants 
{
	public static void main(String[]args)
	{
		reverse("10i mounika");
	}
	public static void reverse(String str)
	{
		ArrayList<Character>characters=new ArrayList<>();
		characters.add('a');
		characters.add('e');
		characters.add('i');
		characters.add('o');
		characters.add('u');
		characters.add('0');
		characters.add('1');
		characters.add('2');
		characters.add('3');
		characters.add('4');
		characters.add('5');
		characters.add('6');
		characters.add('7');
		characters.add('8');
		characters.add('9');
		characters.add(' ');
		int x=0;
		int y=str.length()-1;
		char[]arr=str.toCharArray();
		
		while(x<y)
		{
			if(characters.contains(arr[x]))
			{
				x++;
				continue;
			}
			if(characters.contains(arr[y]))
			{
				y--;
				continue;
			}
			char c=arr[x];
			arr[x]=arr[y];
			arr[y]=c;
			x++;
			y--;
		}
		String str1=new String(arr);
		System.out.println(str1);
		
		
	}

}
