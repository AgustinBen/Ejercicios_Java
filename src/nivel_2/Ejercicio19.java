package nivel_2;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		int[] arrayEnteros = {2, 4, 66, 0, 12, 25, 1};
		
		mostrarEstadisticas(arrayEnteros);
		
	}
	
	protected static int obtenerMayor(int[] array) {
		int mayor = array[0];
		
		for(int i = 1; i < array.length; i++) {
			
			if(array[i] > mayor) {
				mayor = array[i];
			}
		}
		return mayor;
	}
	
	private static int obtenerMenor(int[] array) {
		int menor = array[0];
		
		for(int i = 1; i < array.length; i++) {
			
			if(array[i] < menor) {
				menor = array[i];
			}
		}
			return menor;
		
	}
	
	private static double calcularPromedio(int[] array) {
		
		int suma = 0;
		
		for (int i = 0; i < array.length ; i++) {
			
			suma += array[i];
		}
		return (double) suma / array.length;
	}
	
	private static void mostrarEstadisticas(int[] array) {
		
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("El array no debe estar vacío o ser nulo");
		}
		
		System.out.println("El mayor número es: " +  obtenerMayor(array));
		System.out.println("El menor número es: " + obtenerMenor(array));
		System.out.printf("El promedio de los números es: %.2f%n", calcularPromedio(array));

	}

}
