package main.java.ieseuropa;

import java.util.ArrayList;

public class Numero {
	
	private static String numeroSuerte(int numero) {
		ArrayList <Integer> numeros = new ArrayList<>();
		for (int i=1; i<=numero; i++) {
			numeros.add(i);
		}
		numeros.removeIf(num -> (num % 2 == 0));
		int pos = 1;
		while (pos < numeros.size()) {
			int lista = numeros.get(pos);
			for (int i = lista-1; i < numeros.size(); i += lista-1) {
				numeros.remove(i);
			}
			pos++;
		}
		if (numeros.contains(numero)) {
			return "es un numero de la suerte";
		} else {
			return "no es un numero de la suerte";
		}
	}
	
	private static void seriePell(int numero) {
		int p0 = 0;
		int p1 = 1;
		System.out.println("Serie pell: ");
		System.out.println(p0);
		System.out.println(p1);
		for (int i=2; i<numero; i++) {
			int pi = 2 * p1 + p0;
			System.out.println(pi);
			p0 = p1;
			p1 = pi;
		}
	}
 	
	private static int calcularFactorial(int numero) {
		int factorial = 1;
		for (int i=1; i<=numero; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	private static boolean esNumeroAmstrong(int n) {
		int c = 0;
		int a = 0;
		int temp = 0;
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c) {
			return true;
		}else{
			return false;
		}
	}
	
	private static String esPrimo(int numero) {
		boolean esPrimo = true;
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				esPrimo = false;
			}
		}
		if (esPrimo == true)
			return numero + " es un numero primo";
		else
			return numero + " no es un numero primo";
	}
	
	private static String calcularHMS(int numero) {
		int horas = numero / 3600;
		int minutos = (numero % 3600) / 60;
		int segundos = numero % 60;
		return numero + " segundos en horas, minutos y segundos son " + horas + " h " + minutos + " m " + segundos + " s";
	}

	public static void main(String[] args) {
		int numero = 5;
		System.out.println("Factorial: " + numero + " != " + calcularFactorial(numero));
		seriePell(numero);
		System.out.println("El numero " + numero + " " + numeroSuerte(numero));
		if(esNumeroAmstrong(numero))
			System.out.println(numero + " es un numero de amstrong");
		else
			System.out.println(numero + " no es un numero de amstrong");
		System.out.println(esPrimo(6));
		int numero2 = 345616;
		System.out.println(calcularHMS(numero2));
	}

}
