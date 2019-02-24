package EjemploInterfazComparator;

public class Cliente implements Comparable {
	
	String dni;
	String nombre;
	int edad;
	double saldo;
	public Cliente(String dni, String nombre, int edad, double saldo) {
		this.dni=dni;
		this.nombre=nombre;
		this.edad=edad;
		this.saldo=saldo;
	}
		
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int compareTo(Object o) {
		//casting de Objet a Cliente
		Cliente obj =(Cliente) o;
		if(this.getDni().compareTo(obj.getDni())<0) return -1;
		if(this.getDni().compareTo(obj.getDni())>0) return 1;
		return 0;
	}
	
	public boolean equals (Object otro) {
		Cliente ob =(Cliente) otro;
		return this.dni.equals(ob.dni);
	}
	
	@Override
	public String toString() {
		return "\nCliente [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", saldo=" + saldo + "]\n";
	}
	

}
