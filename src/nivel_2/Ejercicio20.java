package nivel_2;

public class Ejercicio20 {

	public static void main(String[] args) {
			
			int[] arrayEnteros = {22, 33, 2, 0, 50};
			
			mostrarEstadisticas(arrayEnteros);

	}
	
	private static int contarPares(int[] array) {
		
		int pares = 0;
		for (int i = 0; i < array.length ; i++) {
			if(array[i] % 2 == 0) {
				pares++;
			}
		}
		return pares;
	}
	
	private static int contarImpares(int[] array) {
		
		int impares = 0;
		for (int i = 0; i < array.length ; i++) {
			if(array[i] % 2 != 0) {
				impares++;
			}
		}
		return impares;
	}
	
	private static int contarCeros(int[] array) {
		
		int ceros = 0;
		for (int i = 0; i < array.length ; i++) {
			if(array[i] == 0) {
				ceros++;
			}
		}
		return ceros;
	}
	
	private static void mostrarEstadisticas(int[] array) {
		
		if(array == null || array.length == 0) {
			throw new IllegalArgumentException("El array no debe estar vacío ni ser null");
		}
		
		int pares = contarPares(array);
		int impares = contarImpares(array);
		int ceros = contarCeros(array);
		
		System.out.println("Cantidad de números pares en el array: " + pares);
		System.out.println("Cantidad de números impares en el array: " + impares);
		System.out.println("Cantidad de ceros en el array: " + ceros);
		
	}

}
