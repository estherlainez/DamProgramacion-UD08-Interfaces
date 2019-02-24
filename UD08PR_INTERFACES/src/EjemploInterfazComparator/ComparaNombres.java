package EjemploInterfazComparator;
import java.util.Comparator;
public class ComparaNombres  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Cliente ob1=(Cliente)o1;
		Cliente ob2=(Cliente)o2;
		if(ob1.nombre.compareTo(ob2.nombre)<0)return -1;
		if(ob1.nombre.compareTo(ob2.nombre)>0)return 1;
		return 0;
	}

}
