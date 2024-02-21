package com.pattern;

//	All prime numbers between 1000 and 3000

public class PrimeNo {
	public static void main(String[] args) {
		int start = 1000;
		int end = 3000;
		boolean yn = true;
		int count = 0;
		
		for(int i=start; i<=end; i++) {
			yn = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					yn = false;
					break;
				}
			}
			if(yn) {
				System.out.print(i+" ");
				count++;
				if(count>=10) {
					System.out.println();
					count = 0;
				}
			}
		}
	}
}
