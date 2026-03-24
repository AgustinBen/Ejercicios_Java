package nivel_3;

public class Ejercicio27 {

	public static void main(String[] args) {
		Persona[] arrayPersonas = {	
				new Persona("Rodrigo", 18),
				new Persona("Maia", 25),
				new Persona("Mariano", 20),
				new Persona("Roman", 10)
		};
		
		mostrarResultado(arrayPersonas);

	}
	
	private static Persona obtenerPersonaMayor(Persona[] personas) {
		
		Persona mayor = personas[0];
		
		for(int i = 1; i < personas.length; i++) {
			
			if(personas[i].getEdad() > mayor.getEdad()) {
				
				mayor = personas[i];
			}
		}
		return mayor;
	}
	
	private static void mostrarResultado(Persona[] personas) {
		
		if(personas == null || personas.length == 0) {
			throw new IllegalArgumentException("El array no debe estar vacío ni ser null");
		}
		
		System.out.println("La persona con mayor edad es: " + obtenerPersonaMayor(personas).getNombre()
		+ " - " + obtenerPersonaMayor(personas).getEdad());
		
	}
	
}
