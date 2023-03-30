package main.java.ieseuropa;

import java.util.Arrays;

public class Array {

	private static float calcularMediana(int[] array) {
		int mitad = array.length / 2;
		Arrays.sort(array);
		if (array.length % 2 == 0) {
			return (array[mitad - 1] + array[mitad]) / 2;
		} else {
			return array[mitad];
		}
	}

	private static float calcularMedia(int[] array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return (float) total / array.length;
	}

	public static int valorMaximo(int[] numeros) {
		int maxValue = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maxValue) {
				maxValue = numeros[i];
			}
		}
		return maxValue;
	}

	public static int calcularMinimo(int[] array) {
		int minimo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minimo) {
				minimo = array[i];
			}
		}
		return minimo;
	}

	public static void ordenarDeMenorAMayor(int[] array) {
		Arrays.sort(array);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		int[] array = { 3, 43, 54, 65, 2, 35, 12, 31 };
		System.out.println(calcularMedia(array));
		System.out.println("La mediana es: " + calcularMediana(array));
		int[] numbers = { 10, 50, 20, 15 };
		int maxValue = valorMaximo(numbers);
		System.out.println("Valor máximo: " + maxValue);
		System.out.println("Valor mínimo: "+calcularMinimo(array));
		ordenarDeMenorAMayor(array);
		System.out.println("Ordenado de menor a mayor:"+ array);
	}

}
