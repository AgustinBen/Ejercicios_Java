package nivel_1;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int limite = 10;
		
		if (limite > 0) {
			
			int positivos = 0;
			int negativos = 0;
			int ceros = 0;
			
			for (int i = -limite ; i <= limite ; i++) {
				
				if (i < 0) {
					negativos++;					
				} else if (i == 0) {
					ceros++;
				  } else {
					  positivos++;
					}
			}
			
			System.out.println(positivos);
			System.out.println(negativos);
			System.out.println(ceros);

		} else {
			
			System.out.println("El número límite debe ser mayor a 0");
		}
	}
}
