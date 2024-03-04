package com.question;

public class SwappingNo {

	public static void main(String[] args) {
		int no1=10;
		int no2=20;
		no1=no2+no1;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println("before swapping the value of no1"+no1);
		System.out.println("after swapping the value no2 is"+ no2);

	}

}
