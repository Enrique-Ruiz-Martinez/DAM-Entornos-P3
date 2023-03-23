package main.java.ieseuropa;

import java.util.Arrays;

public class Array {
	
	private static float calcularMediana(int [] array) {
		int mitad = array.length/2;
		Arrays.sort(array);
		if (array.length % 2 == 0) {
			return (array[mitad - 1] + array[mitad]) / 2;
		} else {
			return array[mitad];
		}
	}
	
	private static float calcularMedia(int[] array) {
		int total = 0;
		for(int i=0;i<array.length;i++) {
			total += array[i];
		}
		return (float)total/array.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		int[] array = {3,43,54,65,2,35,12,31};
		System.out.println(calcularMedia(array));
		System.out.println("La mediana es: " + calcularMediana(array));
	}

}
