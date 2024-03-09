package com.pattern;

public class q16 {

	public static void main(String[] args) {
		/*  Flip/Invert/Toggle the case of all characters in a given String?

	    Original:   Quick Brown Fox Jumps Over The Lazy Dog
	    Invert:     qUICK bROWN fOX jUMPS oVER tHE lAZY dOG
	    
	    */
		String s = new String();
		s= "Quick Brown Fox Jumps Over The Lazy Dog";
		char c;
		for(int i=0;i<s.length();i++)
		{
			c = s.charAt(i);
			if(c>=97 && c<=122)
			{
				c=(char)(c-32);		
			}
			else if(c>=65 && c<=90)
			{
				c=(char)(c+32);
			}
			System.out.print(c);
		}
	}
}