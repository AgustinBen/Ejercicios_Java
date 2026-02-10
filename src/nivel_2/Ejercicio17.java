package nivel_2;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		int[] arrayEnteros = {10,23,3,15,5};
		double promedio = calcularPromedio(arrayEnteros);
		
		System.out.println("El promedio del array es: " + promedio);

	}
	
	public static double calcularPromedio(int[] array) {
		
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("El array no puede estar vacío o ser null");
		}
		
		int suma = 0;
		
		for ( int i = 0; i < array.length; i++) {
			
			suma += array[i];
		}
		
		return (double) suma / array.length;
		
	}

}
