package Repaso;

import java.util.Comparator;

public class ComparaApellidos implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Empleado e1=(Empleado) o1;
		Empleado e2=(Empleado) o2;
		
		
		if(e1.getApellidos().compareTo(e2.getApellidos())<0) return -1;
		if(e1.getApellidos().compareTo(e2.getApellidos())<0) return 1;
		return 0;
	}

}
