package nivel_1;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int numero = 2;
		int resultado;
		
		if (numero > 0) {
			for (int i = 1; i <= 10; i++) {
				resultado = numero * i;
				System.out.println(numero + " x " + i + " = " + resultado);
			}
		}else {
			System.out.println("El número debe ser mayor a cero");
		}
	}
}
