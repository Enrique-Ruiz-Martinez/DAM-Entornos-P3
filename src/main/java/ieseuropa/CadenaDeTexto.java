package main.java.ieseuropa;

public class CadenaDeTexto {
	
	private static int ocurrenciasLetra(String cadena) {
		int contador = 0;
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i) == 'o') {
				contador++;
			}
		}
		return contador;
	}
	
	private static int calcularLongitud(String cadena) {
		return cadena.length();
	}

	public static void main(String[] args) {
		String cadena = "Hola mundo";
		System.out.println("La longitud de la cadena es de " + calcularLongitud(cadena) + " letras");
		System.out.println("El numero de ocurrencias de la letra 'o' es: " + ocurrenciasLetra(cadena));
	}

}
