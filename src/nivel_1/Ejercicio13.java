package nivel_1;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int[] arrayEnteros = {3, 55, 1, 10, 0, -55};
		int numeroABuscar = 0;
		
		boolean resultado = contieneNumeros(arrayEnteros, numeroABuscar);
		
		System.out.println("Numero buscado: " + numeroABuscar);
		System.out.println("Resultado: " + resultado);
	}
	
	public static boolean contieneNumeros(int[] array, int num) {
		
		for (int i = 0; i < array.length; i++) {

			if ( array[i] == num) {
				
				return true;
			}
		}
		return false;
	}
}
