package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {

	public static void main(String[] args) {
		String inputFile = "rbi.pdf";
		String outputFile = "rbix.pdf";

		try {
			File f = new File(inputFile);
			long len = f.length();
			double fivePc = len*0.05;

			InputStream in = new FileInputStream(inputFile);
			OutputStream out = new FileOutputStream(outputFile);

			long count = 0;
			int each = 0;
			while( (each=in.read()) != -1 ) {
				out.write(each);
				count++;
				if(count>=fivePc) {
					System.out.print(".");
					count = 0;
				}
			}

			System.out.println(outputFile+" file is successfully created");
			out.close();
			in.close();
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		} catch(Exception e) {
		}
	}

}
