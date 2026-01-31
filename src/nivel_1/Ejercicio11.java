package nivel_1;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int[] arrayNumeros = new int[5];
		
		arrayNumeros[0] = 11;
		arrayNumeros[1] = 21;
		arrayNumeros[2] = 31;
		arrayNumeros[3] = 41;
		arrayNumeros[4] = 51;
		
		System.out.println(sumarArray(arrayNumeros));

	}
	
	public static int sumarArray(int[] array) {
		
		if (array != null) {
			int suma = 0;
			
			for (int i = 0; i < array.length; i++) {
			
				suma += array[i];
				
			}
			
			return suma;
		} else {
			
			return 0;
		}
	}
}
