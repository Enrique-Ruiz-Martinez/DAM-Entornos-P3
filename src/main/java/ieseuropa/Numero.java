package main.java.ieseuropa;

public class Numero {
	
	private static int calcularFactorial(int num) {
		int factorial = 1;
		for (int i=1; i<=num; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println("Factorial: " + num + " != " + calcularFactorial(num));
	}

}
