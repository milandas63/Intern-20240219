package com.pattern;

public class MTables {

	public static void main(String[] args) {
		int start = 2;
		int end = 45;
		
		for(int i=start; i<=end; i+=5) {
			for(int j=1; j<=10; j++) {
				for(int k=i; k<=(i+4); k++) {
					System.out.print(padL(k,2)+" x "+padL(j,2)+" = "+padL((k*j),3)+"   ");
					if(k>=end) break;
				}
				System.out.println();
			}
			System.out.println();
		}

	}
	
	private static String padL(int n, int w) {
		String buf = ""+n;
		for(int i=buf.length(); i<w; i++) {
			buf = " "+buf;
		}
		return buf;
	}

}
