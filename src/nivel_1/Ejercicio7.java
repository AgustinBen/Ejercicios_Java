package nivel_1;

public class Ejercicio7 {

	public static void main(String[] args) {
		int limite = 5;
		int acumulador = 0;
		
		if (limite > 0) {
			
			for (int i = 1; i <= limite; i++) {
				
				acumulador = acumulador + i;
			}
			System.out.println("Resultado = " + acumulador);
		} else {
			System.out.println("El límite debe ser mayor a 0");
		}
	}
}
