package Repaso;

public class Empleado extends Persona implements Comparable{
	private double salario;
	Empleado(String n, String a, String d,double s) {
		super(n, a, d);
		this.salario=s;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return super.toString()+"Empleado [salario=" + salario + "]";
	}
	@Override
	public int compareTo(Object obj) {
		
		Empleado e=(Empleado) obj;
		
		if(this.getDni().compareTo(e.getDni())<0)return -1;
		if(this.getDni().compareTo(e.getDni())>0)return 1;
		
		return 0;
	}

	
}
