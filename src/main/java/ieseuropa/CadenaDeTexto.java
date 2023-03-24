package main.java.ieseuropa;

import java.util.Scanner;

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
	
	private static String eliminarAparienciasRepetidas(String texto1, String texto2) {
		return texto1.toLowerCase().replaceAll(texto2.toLowerCase(), "").trim();
	}
	
	private static String repetirStrings(String texto1, String texto2, int numero) {
		String nuevoStr = "";
		for (int i = 0; i < numero; i++) {
			nuevoStr += "" + texto1 + texto2;
		}
		return nuevoStr;
	}
	
	private static String textoMinuscula(String texto) {
		return texto.toLowerCase();
	}
	
	private static String textoMayuscula(String texto) {
		return texto.toUpperCase();
	}

	public static void main(String[] args) {
		String cadena = "Hola mundo";
		System.out.println("La longitud de la cadena es de " + calcularLongitud(cadena) + " letras");
		System.out.println("El numero de ocurrencias de la letra 'o' es: " + ocurrenciasLetra(cadena));
		System.out.println(cadena + " se convierte en: " + repetirOcurrencia(cadena));
		System.out.println(eliminarAparienciasRepetidas("Real Zaragoza es de la realeza", "Real"));
		Scanner teclado = new Scanner(System.in);
		System.out.println(repetirStrings("Mensaje 1","Mensaje 2",teclado.nextInt()));
		System.out.println(textoMinuscula(cadena));
		System.out.println(textoMayuscula(cadena));
	}

}
