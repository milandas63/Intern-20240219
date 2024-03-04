package com.pattern;

public class VowelCounter {

	public static int countVowels(String s ) {
		int count = 0;
		s= s.toLowerCase();
		for (int i =0; i< s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'u') {
				count++;
				
			}
		}
		
		return count;
}
	public static void main(String[] arg) {
		String str = "Hello,World!";
		System.out.println("Number of vowels:" + countVowels(str));
		
	}

}
