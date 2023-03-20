package main.java.ieseuropa;

public class Decimales {
	
	private static int redondearDecimal(double num) {
		return (int) Math.ceil(num);
	}
	
	private static int eliminarDecimal(double num) {
		return (int) num;
	}
	
	public static void ecuacionSegundoGrado(double a, double b, double c) {
	    double discriminante = Math.pow(b, 2) - 4 * a * c;
	    if (discriminante < 0) {
	        System.out.println("La ecuación no tiene soluciones reales.");
	    } else if (discriminante == 0) {
	        double x = -b / (2 * a);
	        System.out.println("La ecuación tiene una solución real: " + x);
	    } else {
	        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
	        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
	        System.out.println("La ecuación tiene dos soluciones reales: " + x1 + " y " + x2);
	    }
	}

	public static void main(String[] args) {
		double numeroDecimal = 4.145;
		System.out.println("El número original es " + numeroDecimal);
		System.out.println("El número redondeado es " + redondearDecimal(numeroDecimal));
		System.out.println("El número eliminando decimales es " + eliminarDecimal(numeroDecimal));
		System.out.println("Ecuación de segundo grado: ");
		ecuacionSegundoGrado(1.0, -3.0, 2.0);

	}

}
