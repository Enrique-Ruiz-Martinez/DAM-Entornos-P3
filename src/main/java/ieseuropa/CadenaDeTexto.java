package main.java.ieseuropa;

public class CadenaDeTexto {
	
	private static int calcularLongitud(String cadena) {
		return cadena.length();
	}

	public static void main(String[] args) {
		String cadena = "Hola mundo";
		System.out.println("La longitud de la cadena es de " + calcularLongitud(cadena) + " letras");
	}

}
