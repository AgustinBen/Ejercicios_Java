package nivel_2;

public class Ejercicio22 {

	public static void main(String[] args) {
		int[] arrayInt = {1, 2, 3, 4, 5};
		
		mostrarArray(arrayInt);
		mostrarResultado(invertirArray(arrayInt));
		
	}
	
	private static int[] invertirArray(int[] array) {
		
		int[] nuevoArray = new int[array.length];
		int indice = array.length - 1;
		
		for (int i = 0; i < array.length; i++) {
			nuevoArray[indice] = array[i];
			indice--;
		}
		
		return nuevoArray;
	}
	
	private static void mostrarArray(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println("");
	}
	private static void mostrarResultado(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
}
