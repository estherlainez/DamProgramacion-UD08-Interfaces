package EjemploInterfazComparator;
import java.util.Comparator;
public class ComparaEdades implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Cliente ob1=(Cliente) o1;
		Cliente ob2=(Cliente) o2;
		if (ob1.edad<ob2.edad) return -1;
		if (ob1.edad>ob2.edad) return 1;
		return 0;
		
		//return (Cliente) o1.edad -((Cliente) o2).edad;
	}

}
