package nivel_1;

public class Ejercicio4 {

	public static void main(String[] args) {
		int limite = 10;
		int contador = 1;
		
		if (limite <= 0) {
			System.out.println("El límite es menor o igual a cero");
		}
		else {
			while(contador <= limite) {
				
				System.out.println(contador);
				contador++;
			}
		}
	}
}
