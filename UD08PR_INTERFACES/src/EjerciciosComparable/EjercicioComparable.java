package EjerciciosComparable;

import java.util.Arrays;

public class EjercicioComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado [] plantilla = new Empleado[3];
		plantilla[0]=new Empleado ("Pepe","Lorente","22333444X",35000);
		plantilla[1]=new Empleado ("Maria","Garcia","55666777D",50000);
		plantilla[2]=new Empleado ("Consuelo","Marin","88999000D",38000);

		for(Empleado e:plantilla) {	
			System.out.println(e.toString());
		}
		
		Arrays.sort(plantilla);
		for(Empleado e:plantilla) {
			e.getNombre();
			System.out.println(e.toString());
		}
	}

}

class Persona{
	private String nombre;
	private String apellidos;
	private String dni;
	
	public Persona (String n, String a, String d) {
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

class Empleado extends Persona implements Comparable{
	
	private double salario;
	public Empleado(String n, String a, String d, double s) {
		super(n,a,d);
		this.salario=s;
	}
	@Override
	public String toString() {
		return super.toString()+" [salario=" + salario + "]";
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	@Override
	
	public int compareTo(Object e) {	
		Empleado obj = (Empleado) e;
		if(this.getNombre().compareTo(obj.getNombre()) < 0 )return -1;
		if(this.getNombre().compareTo(obj.getNombre()) > 0 )return 1;  	
		return 0;
	}
	
	
	
}

