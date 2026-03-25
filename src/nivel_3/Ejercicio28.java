package nivel_3;

public class Ejercicio28 {

	public static void main(String[] args) {
		
		Persona[] personas = {
				
				new Persona("Rodrigo", 18),
				new Persona("Maia", 25),
				new Persona("Mariano", 20),
				new Persona("Martin", 15),
				new Persona("Ariana", 9)
				
		};
		
		mostrarResultado(personas);

	}
	
	private static Persona[] obtenerMayoresDeEdad(Persona[] personas) {
		
		int mayores = 0;
		
		for(int i=0; i < personas.length; i++) {
			
			if(personas[i].getEdad() >= 18) {
				mayores++;
			}
		}
		
		Persona[] nuevoArray = new Persona[mayores];
		int contador = 0;
		
		for(int i = 0; i < personas.length; i++) {
			
			if(personas[i].esMayorDeEdad()) {
				nuevoArray[contador] = personas[i];
				contador++;
			}
		}
		
		return nuevoArray;
	}
	
	private static void mostrarPersonas(Persona[] personas){
		
		for(int i=0; i < personas.length; i++) {
			
			System.out.println("Nombre: " + personas[i].getNombre() + " - Edad: " + personas[i].getEdad());
		}
	}
	
	private static void mostrarResultado(Persona[] personas) {
		
		if(personas == null || personas.length == 0) {
			throw new IllegalArgumentException("El array no debe ser null o estar vacío");
		}
		
		Persona[] mayores = obtenerMayoresDeEdad(personas);
		System.out.println("Personas mayores de edad:");

		if(mayores.length == 0) {
		    System.out.println("No hay personas mayores de edad");
		}
		
		mostrarPersonas(mayores);
		
	}
}
