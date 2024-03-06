package com.algo;

public class Stretcher {
	public String stretch(String data, int howMuch, char whichSide, char whichChar) {
		String retval = data;
		for(int i=retval.length(); i<howMuch; i++) {
			switch(whichSide) {
			case 'L':
				retval = whichChar + retval;
				break;
			case 'R':
				retval = retval + whichChar;
				break;
			case 'C':
				if(i%2==0) {
					retval = whichChar + retval;
				} else {
					retval = retval + whichChar;
				}
				break;
			}
		}
		return retval;
	}
	
	public String padL(String data, int howMuch) {
		return stretch(data, howMuch, 'L', ' ');
	}

	public String padL(String data, int howMuch, char whichChar) {
		return stretch(data, howMuch, 'L', whichChar);
	}

	public String padC(String data, int howMuch) {
		return stretch(data, howMuch, 'C', ' ');
	}

	public String padC(String data, int howMuch, char whichChar) {
		return stretch(data, howMuch, 'C', whichChar);
	}

	public String padR(String data, int howMuch) {
		return stretch(data, howMuch, 'R', ' ');
	}

	public String padR(String data, int howMuch, char whichChar) {
		return stretch(data, howMuch, 'R', whichChar);
	}
}
