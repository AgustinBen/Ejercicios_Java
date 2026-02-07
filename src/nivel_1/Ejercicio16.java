package nivel_1;

public class Ejercicio16 {

	public static void main(String[] args) {
		String[] arrayPalabras = {"hola", "adios", null, "manzana", "banana"};
		char caracterABuscar = 'a';
		
		int resultado = contarCaracteresArray(arrayPalabras, caracterABuscar);
		
		System.out.println("El caracter buscado se encuentra " + resultado + " veces en el array");
	}
	public static int contarCaracteresArray(String[] array, char caracter){
		
		if( array == null || array.length == 0) {
			throw new IllegalArgumentException("El array no puede estar vacio o ser null");
		}
		
		int contador = 0;
		
		for ( int i = 0; i < array.length ; i++ ) {
			
			if( array[i] == null) {
				continue;
			}
			
			for ( int j = 0; j < array[i].length(); j++) {
				
				if ( array[i].charAt(j) == caracter) {
					contador++;
				}
			}
		}
		
		return contador;
	}
}
