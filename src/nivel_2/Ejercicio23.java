package nivel_2;

public class Ejercicio23 {

	public static void main(String[] args) {
		int[] arrayEnteros = {5, 2, 33, 22, 11, 1};
		
		mostrarResultado(arrayEnteros);

	}
	
	private static boolean tieneDuplicados(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] == array[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	private static void mostrarResultado(int[] array) {
		
		if(array == null || array.length == 0) {
			throw new IllegalArgumentException("El array no debe estar vacío ni ser null");
		}
		
		if(tieneDuplicados(array)) {
			System.out.println("El array contiene números duplicados");
		}else {
			System.out.println("Todos los números del array son únicos");
		 }
	}
}
