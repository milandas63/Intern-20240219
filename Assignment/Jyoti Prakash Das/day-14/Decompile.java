package com.reengineer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Decompile {
	private Class obj;
	private StringBuffer buffer;
	private FileOutputStream fout;

	public Decompile(String className) {
		try {
			fout = new FileOutputStream("JavaAPIhelp.txt", true);

			obj = Class.forName(className);
			Field f[] = obj.getDeclaredFields();
			Constructor c[] = obj.getDeclaredConstructors();
			Method m[] = obj.getDeclaredMethods();

			System.out.println(className);
			fout.write((className + "\r\n").getBytes());
			for (int i = 0; i < className.length(); i++)
				System.out.print("-");
			System.out.println();

			// Fields
			if (f.length > 0) {
				buffer = new StringBuffer("FIELDS:");
				System.out.println(buffer);
				fout.write((buffer.toString() + "\r\n").getBytes());
				for (int i = 0; i < f.length; i++) {
					buffer = new StringBuffer((i + 1) + ": " + removePackage(f[i].toString()));
					System.out.println(buffer);
					fout.write((buffer + "\r\n").getBytes());
				}
			}

			// Constructors
			if (c.length > 0) {
				buffer = new StringBuffer("CONSTRUCTORS");
				System.out.println("buffer");
				fout.write((buffer.toString() + "\r\n").getBytes());
				for (int i = 0; i < c.length; i++) {
					buffer = new StringBuffer((i + 1) + ":" + removePackage(c[i].toString()));
					System.out.println((i + 1) + ": " + removePackage(c[i].toString()));
					System.out.println(buffer);
					fout.write((buffer + "\r\n").getBytes());
				}
			}

			// Methods
			if (m.length > 0) {
				buffer = new StringBuffer("METHODS");
				System.out.println("buffer");
				fout.write((buffer.toString() + "\r\n").getBytes());
				for (int i = 0; i < m.length; i++) {
					buffer = new StringBuffer((i + 1)+ ":" + removePackage(m[i].toString()));
					System.out.println((i + 1) + ":" + removePackage(m[i].toString()));
					System.out.println(buffer);
					fout.write((buffer + "\r\n").getBytes());
				}
			}
				System.out.println("METHODS:");
				System.out.println("FIElDS");
				System.out.println("CONSTRUCTORS");
				for (int i = 0; i < m.length; i++) {
					System.out.println((i + 1) + ": " + removePackage(m[i].toString()));
				}
			

			fout.close();
	} catch (FileNotFoundException e) {
	} catch (ClassNotFoundException e) {
	} catch (Exception e) {
	}
		
	}

	private String removePackage(String text) {
		char c;
		boolean yn = true;
		StringBuffer buf = new StringBuffer();
		for (int i = text.length() - 1; i >= 0; i--) {
			c = text.charAt(i);
			switch (c) {
			case '.':
				yn = false;
				break;
			case ' ':
				yn = true;
				break;
			case '(':
				yn = true;
				break;
			case ')':
				yn = true;
				break;
			case '[':
				yn = true;
				break;
			case ']':
				yn = true;
				break;
			case ',':
				yn = true;
				break;
			}
			if (yn) {
				buf.insert(0, c);
			}
		}

		return buf.toString();
	}

	public static void main(String[] args) {
		new Decompile("java.lang.String");
	}
}
