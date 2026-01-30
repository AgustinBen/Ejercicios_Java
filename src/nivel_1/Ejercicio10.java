package nivel_1;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int numero1 = 10, numero2 = 15;
		
		int resultado = obtenerMayor(numero1, numero2);
		
		System.out.println("El número mayor es: " + resultado);
	}
	
	public static int obtenerMayor(int a, int b) {
		
		return a >= b ? a : b;
		
	}
}
