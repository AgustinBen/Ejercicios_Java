package nivel_3;

public class Persona {
	private String nombre;
	private int edad;
	
	
	public Persona(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	public boolean esMayorDeEdad() {
		
		return edad >= 18;
	}
	
	public String getNombre() {
	    return nombre;
	}

	public int getEdad() {
	    return edad;
	}
	
}
