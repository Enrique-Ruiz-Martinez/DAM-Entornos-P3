package main.java.ieseuropa;

public class CadenaDeTexto {
	
	private static String repetirOcurrencia(String cadena) {
		String resultado = "";
		for (int i=0; i<cadena.length(); i++) {
			char letra = cadena.charAt(i);
			resultado += letra;
			resultado += letra;
		}
		return resultado;
	}
	
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
		System.out.println(cadena + " se convierte en: " + repetirOcurrencia(cadena));
	}

}
