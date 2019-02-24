package Ejercicio22Febrero;
import java.util.Comparator;


public class ComparaNotaMedia implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Alumno Ob1 = (Alumno)o1;
		Alumno Ob2 = (Alumno)o2;
		if(Ob1.notaMedia<Ob2.notaMedia)return -1;
		if(Ob1.notaMedia>Ob2.notaMedia)return 1;
		return 0;
	
	}
	
	
}
