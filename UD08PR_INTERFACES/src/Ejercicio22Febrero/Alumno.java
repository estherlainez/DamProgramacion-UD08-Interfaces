package Ejercicio22Febrero;

public class Alumno extends Persona{

	double notaMedia;
	Alumno(String n, String a, String d,double m) {
		super(n, a, d);
		this.notaMedia=m;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	@Override
	public String toString() {
		return super.toString()+"Alumno [notaMedia=" + notaMedia + "]";
	}

}
