package Repaso;

public class Persona {
	private String nombre;
	private String apellidos;
	private String dni;
	
	Persona(String n,String a,String d){
		this.nombre=n;
		this.apellidos=a;
		this.dni=d;
		
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
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + "]";
	}

}
