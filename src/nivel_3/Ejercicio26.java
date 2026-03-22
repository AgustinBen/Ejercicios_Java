package nivel_3;

public class Ejercicio26 {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Agustín", 40);
		
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Edad: " + persona.getEdad());
		System.out.println("Es mayor de edad?: " + persona.esMayorDeEdad());
	}

}
