package com.exception;

public class Example102 {

	public static void main(String[] args) {
		int n = 99;
		int j = 0;
		
		String name = "Mahatma Gandhi";
		int point = 25;
		
		char vowels[] = {'A','E','I','O','U','a','e','i','o','u'};
		int vpoint = 10;
		
		for(int i=0; i<5; i++) {
			try {
				double d = n/j;
				System.out.println("Correct: "+d);
				
				System.out.println(name.charAt(point));

				System.out.println(vowels[vpoint]);

				System.out.println("-------------------------");
				
			} catch(NullPointerException e) {
				System.out.println("NullPointerException");
			} catch(StringIndexOutOfBoundsException e) {
				point = 10; i--;
			} catch(ClassCastException e) {
				System.out.println("ClassCastException");
			} catch(ArithmeticException e) {
				j = 2; i--;
			} catch(ArrayIndexOutOfBoundsException e) {
				vpoint = 9; i--;
			} catch(MyExceptionClass e) {
			} catch(Exception e) {
				System.out.println("Exception");
			}
		}
	}

}

class MyExceptionClass extends RuntimeException {
	
}
