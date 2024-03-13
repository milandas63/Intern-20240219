package com.modifiers;

public class FinalExample extends AnotherClass {
	public final String name;
	
	public FinalExample() {
		name = "Narendra Modi";
		System.out.println("We are students of Java");
		//name = "Jawaharlal Nehru";	// restricted
		
		System.out.println(welcome());
	}

	public String welcome() {
		return "Hello Milan";
	}

	public static void main(String[] args) {
		new FinalExample();
	}

	
	
}

final class AnotherClass {
	public String welcome() {
		return "Hello Dude";
	}
}
