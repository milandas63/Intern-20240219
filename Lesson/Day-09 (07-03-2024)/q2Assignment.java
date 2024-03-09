package com.pattern;
import java.util.*;
public class q2Assignment {

	public static void main(String[] args) {
		// Count the number of vowels in a given string?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to get the number of vowels: ");
		String s= sc.nextLine();
		int vCount = func(s);
		System.out.println(s+ " 'VOWELS'= "+vCount);
	}
	public static int func(String s)
	{
		
		char c;
		int count=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				count++;
			}
		}
		return count;
	}

}
