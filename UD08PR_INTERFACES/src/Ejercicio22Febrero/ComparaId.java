package Ejercicio22Febrero;
import java.util.Comparator;
public class ComparaId implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Alumno Ob1 = (Alumno)o1;
		Alumno Ob2 = (Alumno)o2;
		if(Ob1.getId()<Ob2.getId())return -1;
		if(Ob1.getId()>Ob2.getId())return 1;
		return 0;
	}
}
