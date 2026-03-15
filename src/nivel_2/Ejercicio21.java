package nivel_2;

public class Ejercicio21 {

	public static void main(String[] args) {
		int[] arrayInt = {33, 3, 2, 15, 20, 0, 1};
		int numeroBuscar = 33;
		
		mostrarResultadoBusqueda(arrayInt, numeroBuscar);
		
	}
	
	private static int buscarIndice(int[] array, int numeroBuscado) {
		
		for (int i = 0; i < array.length; i++) {
			
			if(numeroBuscado == array[i]) {
				return i;
			}
		}
		return -1; 
	}
	
	private static void mostrarResultadoBusqueda(int[] array, int numeroBuscado) {
		
		if(array == null || array.length == 0) {
		    throw new IllegalArgumentException("El array no debe ser null ni estar vacío");
		}
		
		int resultado = buscarIndice(array, numeroBuscado);
		
		if(resultado >= 0) {
			System.out.println("El número " + numeroBuscado + " se encuentra en el índice " + resultado);
			
		}else {
			System.out.println("El número " + numeroBuscado +  " no se encuentra en el array");
		}
	}
}
