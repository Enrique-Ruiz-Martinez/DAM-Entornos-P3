package main.java.ieseuropa;

public class Decimales {
	
	private static int redondearDecimal(double num) {
		return (int) Math.ceil(num);
	}

	public static void main(String[] args) {
		double numeroDecimal = 4.1;
		System.out.println("El número original es " + numeroDecimal);
		System.out.println("El número redondeado es " + redondearDecimal(numeroDecimal));

		
	}

}
