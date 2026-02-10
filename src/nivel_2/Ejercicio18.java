package nivel_2;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		int dividendo = 100;
		int divisor = 5;
		
		double division = devolverDivision(dividendo, divisor);
		System.out.println(dividendo + " / " + divisor + " = " + division);

	}
	
	public static double devolverDivision(int dividendoInt, int divisorInt) {
		
		if (divisorInt == 0) {
			throw new IllegalArgumentException("El divisor no puede ser cero!");
		}
		if (dividendoInt < -1000 || dividendoInt > 1000) {
			throw new IllegalArgumentException("El dividendo debe estar en el rango -1000 a 1000");
		}
		if(divisorInt < -1000 || divisorInt > 1000) {
			throw new IllegalArgumentException("El divisor debe estar en el rango -1000 a 1000");
		}
		
		return (double) dividendoInt / divisorInt;
	}
}