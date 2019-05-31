package Repaso;

import java.util.Comparator;

public class ComparaNombres implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		Empleado e1=(Empleado) obj1;
		Empleado e2=(Empleado) obj2;
		
		if(e1.getNombre().compareTo(e2.getNombre())<0) return -1;
		if(e1.getNombre().compareTo(e2.getNombre())>0) return 1;
		return 0;
		
	}

}
