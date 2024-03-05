package pyramid;

public class ppyramid {
public static void main() {
		
	}

	public static void main(String[] args) {
		int spaces = 40;
		int stars = 1;
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=spaces; j++) System.out.print(" ");
			for(int j=1; j<=stars; j++)  System.out.print("*");
			System.out.println();
			spaces--; stars+=2;
		}
	}

}
