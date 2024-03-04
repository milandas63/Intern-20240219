package com.Thirteen;

public class ReverseString {

	public static void main(String[] args) {
		String s1="java is easy";
		String s2=" ";
		char[]ch=s1.toCharArray();
		int i=ch.length-1;
		int j=ch.length-1;
		while(j>-1)
		{
			while(j>-1 && ch[j]!=' ')
			j--;
			int k=j+1;
			String temp="";
			while(k<=i)
			{
				temp+=ch[k];
				k++;
			}
			s2+=temp;
			s2+="";
			j--;
			i=j;
			
		}
System.out.println(s2);
	}

}
