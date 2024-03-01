import java.util.Scanner;
public class SumofNumbers {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n = scanner .nextInt();
	int sum = 0;
	for (int i = 1; i<= n; i++) {
		sum +=i;
	}
	System.out.println("the sum of number from 1 to " + n + " is:" + sum);
	scanner.close();
	}

	}

