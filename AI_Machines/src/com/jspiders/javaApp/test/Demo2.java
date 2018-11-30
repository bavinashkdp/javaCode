package com.jspiders.javaApp.test;
import java.util.ArrayList;
import java.util.Scanner;
public class Demo2 
{
	public static final String start="SYS_BGINING"; 
	public static final String end="SYS_ENDING"; 
	public static void main(String[] args) 
	{
	/*	Scanner scanner=new Scanner(System.in);
		System.out.println("enter input");
		String input=scanner.next();
		System.out.println("how many lines you want to enter?????");
		int n=scanner.nextInt();
		System.out.println("enter sentences.....");
		String string=scanner.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println(string);
			find(string,input);
			string=scanner.nextLine();
		}
		System.out.println(string);*/
		ArrayList<String>arrayList=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter how many lines of sentences youu are going to enter.....");
		int n=scanner.nextInt();
		System.out.println("enter input");
		String input=scanner.next();
		System.out.println("enter sentences.....");
		String str=scanner.nextLine();
		
		
		for( int i=1;i<=n;i++)
		{
			arrayList.add(find(str, input));
			str=scanner.nextLine();
		}
		arrayList.add(find(str, input));
		for (String string : arrayList) {
			System.out.println(string);
		}
		System.out.println();
		scanner.close();

	}
/*	public static ArrayList<Character> getSpecialChars()
	{
		ArrayList<Character>list=new ArrayList<>();
		for(int i=33;i<=47;i++)
		{
			list.add((char)i);
		}
		for(int i=123;i<=126;i++)
		{
			list.add((char)i);
		}
		return list;
		
	}
*/	public static String removesplchars(String str)
	{
		
		/*for(int i=33;i<=47;i++)
		{
			System.out.println(i+"="+(char)i);
			str2= str2+(char)i;
		}
		for(int i=123;i<=126;i++)
		{
			System.out.println(i+"="+(char)i);
			str2= str2+(char)i;
		}*/
		String str3="";
		char[]arr=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			if((arr[i]>=33 && arr[i]<=47))
			{
				
			}
			else if((arr[i]>=58 && arr[i]<=64))
			{
				
			}
			else if((arr[i]>=91 && arr[i]<=96))
			{
				
			}
			else if((arr[i]>=123 && arr[i]<=126))
			{
				
			}
			else{
				str3=str3+arr[i]; 
			}
			
		} 
		
		return str3;
	}
	
	public static String delSpaces(String str){
	    StringBuilder sb = new StringBuilder(str);
	    ArrayList<Integer> spaceIndexes = new ArrayList<>();

	    for ( int i=0; i < sb.length(); i++ ){
	        if ( sb.charAt(i) == ' ' && sb.charAt(i-1) == ' '){
	            spaceIndexes.add(i);
	        }
	    }

	    for (int i = 0; i < spaceIndexes.size(); i++){
	        sb.deleteCharAt(spaceIndexes.get(i)-i);
	    }
	    return new String(sb.toString());
	}

	public static String find(String str,String input)
	{
		
		str=delSpaces(str);
		str=removesplchars(str);
		str=delSpaces(str);
		String str2="";
		
		
		String[]arr=str.split(" ");
		for(int i=0;i<=arr.length-1;i++)
		{
			
				 if((arr[i]+"").equals(input) && arr[i]==arr[arr.length-1])
					{
						str2=str2+arr[i-1]+" "+arr[i]+" "+end;
					}
				 
				 else if((arr[i]+"").equals(input) && arr[i]==arr[0])
					{
					/* if(!(getSpecialChars().contains(arr[i+1]))){
					str2=str2+start+" "+arr[i]+" "+arr[i+1];
					 }
					 else
					 {
						 str2=str2+start+" "+arr[i]+" "+arr[i+2]; 
					 }*/
					 str2=str2+start+" "+arr[i]+" "+arr[i+1];
					}
				 else if((arr[i]+"").equals(input) && (arr[i]!=arr[arr.length-1]|arr[i]!=arr[0]))
					{
				/*	 if(!(getSpecialChars().contains(arr[i+1])))
					 {
						str2=str2+arr[i-1]+" "+arr[i]+" "+arr[i+1];
					 }
					 else
					 {
						 
					 }*/
					 str2=str2+arr[i-1]+" "+arr[i]+" "+arr[i+1];
					}
				 else
				 {
					 
				 }
				 
		
		}
		//System.out.println(str2);
		return str2;
		
	}


}
