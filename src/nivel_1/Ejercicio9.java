package nivel_1;

public class Ejercicio9 {

	public static void main(String[] args) {
		int limite = 10;
		mostrarNumerosDel1AlN(limite);

	}
	
	public static void mostrarNumerosDel1AlN(int n) {
		
		if (n > 0) {
			for (int i = 1; i <= n ; i++ ) {
				System.out.println(i);
			}
		} else {
			System.out.println("El número debe ser mayor a 0");
		  }
	}
}
