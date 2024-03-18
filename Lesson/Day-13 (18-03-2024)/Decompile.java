package com.reengineer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Decompile {
	private Class obj;

	public Decompile(String className) {
		try {
			obj = Class.forName(className);
			Field f[] = obj.getDeclaredFields();
			Constructor c[] = obj.getDeclaredConstructors();
			Method m[] = obj.getDeclaredMethods();
			
			System.out.println(className);
			for(int i=0; i<className.length(); i++) System.out.print("-");
			System.out.println();

			// Fields
			if(f.length>0) {
				System.out.println("FIELDS:");
				for(int i=0; i<f.length; i++) {
					System.out.println((i+1)+": "+removePackage(f[i].toString()));
				}
			}
			
			// Constructors
			if(c.length>0) {
				System.out.println("CONSTRUCTORS:");
				for(int i=0; i<c.length; i++) {
					System.out.println((i+1)+": "+removePackage(c[i].toString()));
				}
			}

			// Methods
			if(m.length>0) {
				System.out.println("METHODS:");
				for(int i=0; i<m.length; i++) {
					System.out.println((i+1)+": "+removePackage(m[i].toString()));
				}
			}
		} catch(ClassNotFoundException e) {
		}
	}

	private String removePackage(String text) {
		char c;
		boolean yn = true;
		StringBuffer buf = new StringBuffer();
		for(int i=text.length()-1; i>=0; i--) {
			c = text.charAt(i);
			switch(c) {
				case '.': yn = false; break;
				case ' ': yn = true;  break;
				case '(': yn = true;  break;
				case ')': yn = true;  break;
				case '[': yn = true;  break;
				case ']': yn = true;  break;
				case ',': yn = true;  break;
			}
			if(yn) {
				buf.insert(0, c);
			}
		}
		
		return buf.toString();
	}
	
	public static void main(String[] args) {
		new Decompile("java.lang.String");
	}
}
