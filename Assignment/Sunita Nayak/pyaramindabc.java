
package com.pattern;
 public class pyaramindabc{
	 public static void main(String[] args) {
		
	
	 int spaces = 40;
	 int alpha =97   ;
	 
	 for(int i=0; i<10; i++) {
		 for (int j=1;j<=spaces;j++) System.out. print(" ");
		 for(alpha=97;alpha<=(97+i);alpha++) System.out.print((char)alpha);
		 for(alpha=alpha-2; alpha>=97;alpha--) System.out.print((char)alpha);
		 
		 System.out.println();
		 spaces--;
	 }
 }

 }

