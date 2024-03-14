package com.exception;

public class Example101 {

	public static void main(String[] args) {
		try {
			int i = 99;
			int j = 0;
			double d = i/j;
			System.out.println(d);
		} catch(NullPointerException e) {
			System.out.println("NullPointerException");
		} catch(ClassCastException e) {
			System.out.println("ClassCastException");
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("Exception");
		}
	}

}
