package nivel_2;

import java.util.*;

public class Ejercicio24 {

	public static void main(String[] args) {
		int[] arrayEnteros = {22, 3, 0, 66, 21, 7};
		
		mostrarResultado(arrayEnteros);
	}
	
	private static int buscarIndice(int[] array, int numero) {
		
		for (int i = 0; i < array.length; i++) {
			if(numero == array[i]) {
				return i;
			}
		}
		return -1;
	}
	
	private static int pedirNumero() {
		Scanner teclado = new Scanner(System.in);
		
		int numero = 0;
		boolean valido = false;
		
		while(!valido) {
			try {
				System.out.print("Ingresar un numero entero: ");
				numero = teclado.nextInt();
				valido = true;  //entrada correcta
			} catch (InputMismatchException e) {
				System.out.println("Error: Ingresa un número entero válido");
				teclado.next(); //limpiar entrada invalida
			}
		}
		return numero;
	}
	
	private static void mostrarResultado(int[] array) {
		
		if(array == null || array.length == 0) {
			throw new IllegalArgumentException("El array no debe ser null ni estar vacío");
		}
			
		int numero = pedirNumero();
		int indice = buscarIndice(array, numero);
		
		if(indice >= 0) {
			System.out.println("El número " + numero +" se encuentra en el índice " + indice );
		}else {
			System.out.println("El número " + numero + " no se encuentra en el array");
		}
	}
}
