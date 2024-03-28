package com.day10;
import java.util.*;
public class greeting {

	public static void main(String[] args) {
		
//2:  Write a program that asks the user for their name and greets them with their name.
String str;
Scanner sc =new Scanner(System.in);
try{
	System.out.print(" Enter user name"+ " : ");
	str = sc.next();
	System.out.print("\"Hello,"+ str.toUpperCase() +",Good moring!!\"");
}catch(Exception e)
{
	}
	}
}


