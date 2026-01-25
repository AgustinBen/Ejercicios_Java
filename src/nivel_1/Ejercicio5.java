package nivel_1;

public class Ejercicio5 {

	public static void main(String[] args) {
		int limite = 10;
		int contador = 1;
		
		if (limite > 0) {
			while (contador <= limite) {
				
				if (contador % 2 == 0) {
					System.out.println(contador);
				}
				contador++;
			}
		}else {
			System.out.println("El limite debe ser mayor a cero");
		}
	}
}
