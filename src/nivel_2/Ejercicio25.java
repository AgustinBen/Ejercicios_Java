package nivel_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		mostrarResultado(scanner);
		
		scanner.close();
	}
	
	private static int pedirNumero(Scanner scanner) {
		
		while(true) {
	
			try {
				System.out.print("Ingresar un número entero: ");
				int numero = scanner.nextInt();
				return numero;
				
			} catch (InputMismatchException e) {
				System.out.println("Error: Ingresa un número entero válido");
				scanner.next();
			}
		}
	}
	
	private static int calcularSuma(Scanner scanner) {
		
		int numero = 0;
		int suma = 0;
		
		do {
			numero = pedirNumero(scanner);
			
			if(numero != 0) {		
				suma += numero;
			}
			
		} while (numero != 0);
		
		return suma;
	}
	
	private static void mostrarResultado(Scanner scanner) {
		
		System.out.println("La suma total es: " + calcularSuma(scanner));
	}
}
