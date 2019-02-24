package ComparablePersona;
import java.util.Comparator;

import EjemploInterfazComparator.Cliente;
public class ComparaNombres implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Persona Ob1 = (Persona)o1;
		Persona Ob2 = (Persona)o2;
		if(Ob1.nombre.compareTo(Ob2.nombre)<0)return -1;
		if(Ob1.nombre.compareTo(Ob2.nombre)>0)return 1;
		return 0;
	}
	
}
