package com.exception;

public class VoterId {

	public static void main(String[] args) {
		int ages[] = {50,35,21,16,77,99,53,40,11,-29,81,0,71,45};

		for(int i=0; i<ages.length; i++) {
			try {
				checkAge(ages[i]);
				System.out.println(ages[i] + " is valid age");
			} catch(NegativeAgeException e) {
				System.out.println(ages[i]+" "+e.getMessage());
			} catch(ZeroAgeException e) {
				System.out.println(ages[i]+" "+e.getMessage());
			} catch(TooYoungAgeException e) {
				System.out.println(ages[i]+" "+e.getMessage());
			} catch(TooOldAgeException e) {
				System.out.println(ages[i]+" "+e.getMessage());
			} catch(Exception e) {
			}
		}
	}

	public static void checkAge(int age) throws NegativeAgeException,
												ZeroAgeException,
												TooYoungAgeException,
												TooOldAgeException {
		if(age<0) throw new NegativeAgeException("Age is less then zero");
		if(age==0) throw new ZeroAgeException("Age is zero");
		if(age<18) throw new TooYoungAgeException("Age is less than 18");
		if(age>90) throw new TooOldAgeException("Age is greater than 90");
	}
	
}
