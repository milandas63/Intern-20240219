package com.day10;

import java.util.Scanner;

public class bobalicegreet {
	
     
	public static void main(String[] args) {
		
		//3:3:  Modify the previous program such that only the users Alice and Bob are greeted with their names.
		String str;
		Scanner sc =new Scanner(System.in);
		try{
			System.out.print("Enter name: ");
			str = sc.next();
			if(str.equalsIgnoreCase("Bob") || str.equalsIgnoreCase("Alice")) { 
				System.out.print("\"Hello,"+ str.toUpperCase() +",Good moring!!\"");
			}
		}catch(Exception e)
		{
			}
			}
		}

		




