package Ejercicio22Febrero;

public class Persona {

	String nombre;
	String apellidos;
	String dni;
	private int id;
	static int idSiguiente=1;
	Persona(String n,String a, String d){
		this.nombre=n;
		this.apellidos=a;
		this.dni=d;
		this.id=idSiguiente;
		idSiguiente++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getIdSiguiente() {
		return idSiguiente;
	}

	public static void setIdSiguiente(int idSiguiente) {
		Persona.idSiguiente = idSiguiente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "\nPersona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", id=" + id + "]\n";
	}

	
	
}
