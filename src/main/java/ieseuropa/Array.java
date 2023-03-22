package main.java.ieseuropa;

public class Array {
	
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
	}

}
