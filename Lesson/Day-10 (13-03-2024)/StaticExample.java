package com.modifiers;

public class StaticExample {
	public String parent = "Biju Patnaik";
	public static String child = "Naveen Patnaik";

	public static void main(String[] args) {
		StaticExample x1 = new StaticExample();
		StaticExample x2 = new StaticExample();
		StaticExample x3 = new StaticExample();

		System.out.println("x1- parent: "+x1.parent+" child: "+x1.child);
		System.out.println("x2- parent: "+x2.parent+" child: "+x2.child);
		System.out.println("x3- parent: "+x3.parent+" child: "+x3.child);
	
		x2.parent = "Jawaharlal Nehru";
		x2.child = "Indira Gandhi";

		System.out.println("x1- parent: "+x1.parent+" child: "+x1.child);
		System.out.println("x2- parent: "+x2.parent+" child: "+x2.child);
		System.out.println("x3- parent: "+x3.parent+" child: "+x3.child);
		
		//System.out.println(StaticExample.parent);		// not allowed
		System.out.println(StaticExample.child);
	}

}
