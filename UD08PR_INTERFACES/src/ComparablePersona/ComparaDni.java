package ComparablePersona;
import java.util.Comparator;
public class ComparaDni implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Persona Obj1=(Persona) o1;
		Persona Obj2=(Persona) o2;
		if(Obj1.dni.compareTo(Obj2.dni)<0)return -1;
		if(Obj1.dni.compareTo(Obj2.dni)>0)return 1;
		return 0;
	}

}
