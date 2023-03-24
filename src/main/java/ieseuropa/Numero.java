package main.java.ieseuropa;

public class Numero {
	
	private static void seriePell(int num) {
		int p0 = 0;
		int p1 = 1;
		System.out.println("Serie pell: ");
		System.out.println(p0);
		System.out.println(p1);
		for (int i=2; i<num; i++) {
			int pi = 2 * p1 + p0;
			System.out.println(pi);
			p0 = p1;
			p1 = pi;
		}
	}
 	
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
		seriePell(num);
	}

}
