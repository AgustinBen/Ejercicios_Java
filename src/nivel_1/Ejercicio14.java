package nivel_1;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		String textoRevisar = "Palabra";
		
		char caracterContar = 'a';
		
		int cantidad = contarCaracter(textoRevisar, caracterContar);
		
		System.out.println("Cantidad de veces que '" + caracterContar + "' aparece en el texto: " + cantidad);

	}
	
	public static int contarCaracter(String texto, char caracter) {
			
			if (texto == null || texto.length() == 0) {
			    throw new IllegalArgumentException("El texto no puede estar vacío o ser null");
			}
		
			int conteo = 0;
			
			for (  int i = 0; i < texto.length(); i++) {
				
				if (texto.charAt(i) == caracter) {
					conteo++;
				}
			}
			
			return conteo;
	}
}
