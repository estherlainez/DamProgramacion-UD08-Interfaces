package ComparablePersona;
import java.util.Comparator;
public class ComparaPeso implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Persona Obj1 = (Persona) o1;
		Persona Obj2 = (Persona) o2;
		if(Obj1.peso < Obj2.peso) return -1;
		if(Obj1.peso > Obj2.peso) return 1;
		return 0;
	}

}
