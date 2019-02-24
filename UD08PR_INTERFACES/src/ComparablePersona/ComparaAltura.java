package ComparablePersona;
import java.util.Comparator;
public class ComparaAltura implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Persona Ob1 = (Persona) o1;
		Persona Ob2 = (Persona) o2;
		if(Ob1.altura <Ob2.altura) return -1;
		if(Ob1.altura >Ob2.altura) return 1;
		return 0;
	}

}
