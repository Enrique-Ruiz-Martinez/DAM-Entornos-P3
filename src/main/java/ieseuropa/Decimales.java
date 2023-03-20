package main.java.ieseuropa;

public class Decimales {
	
	private static int redondearDecimal(double num) {
		return (int) Math.ceil(num);
	}
	
	private static int eliminarDecimal(double num) {
		return (int) num;
	}

	public static void main(String[] args) {
		double numeroDecimal = 4.145;
		System.out.println("El número original es " + numeroDecimal);
		System.out.println("El número redondeado es " + redondearDecimal(numeroDecimal));
		System.out.println("El número eliminando decimales es " + eliminarDecimal(numeroDecimal));

	}

}
