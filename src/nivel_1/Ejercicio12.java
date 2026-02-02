package nivel_1;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		int[] arrayEnteros = {20, -5, -22, 1, 44, 1, 80};
		
		int numeroMayor = obtenerMayorArray(arrayEnteros);
		
		System.out.println("El mayor número es: " + numeroMayor);
		
	}
	
	public static int obtenerMayorArray(int[] array) {
		
		if (array == null || array.length == 0) {
		    throw new IllegalArgumentException("El array no puede estar vacío");
		}
		
		int mayor = array[0];
		
		for (int i = 1; i < array.length; i++) {
			
			if (mayor < array[i]) {
		
				mayor = array[i];
			}
		}
		return mayor;
	}
}
