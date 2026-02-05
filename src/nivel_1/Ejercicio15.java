package nivel_1;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		String texto1 = "Hola";
		String texto2 = "Hola";
		
		boolean resultado = sonIguales(texto1, texto2);
		
		System.out.println("Texto 1: \"" + texto1 + "\" y Texto 2: \"" + texto2 + "\" → son iguales? " + resultado);

	}
	
	public static boolean sonIguales(String texto1, String texto2) {
			
		if (texto1 == null || texto2 == null) {
		    throw new IllegalArgumentException("Los textos no deben ser null");
		}
		
		return texto1.equals(texto2);

	}
}
