public class Factorial {

	public static void main(String[] args) {
	int number = 5;
	long factorial = calculateFactorial (number);
	System.out.println("Factorial of " + number + " is:" + factorial);
	}
	public static long calculateFactorial(int n) {
		if (n<0) {
		}
		long factorial =1;
		for (int i =1; i <=n; i++) {
			factorial *=i;
		}
		return factorial;
		
	}

}
