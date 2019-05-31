package Repaso;

import java.util.Arrays;
import java.util.Comparator;

import Ejercicio22Febrero.Alumno;

public class usoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado []empleados= new Empleado[6];
		empleados[0]=new Empleado("Carlos","Jimenez","12345678J",3500);
		empleados[1]=new Empleado("Julian","Perez","33444555C",4500);
		empleados[2]=new Empleado("Esther","Garcia","77666555G",3500);
		empleados[3]=new Empleado("Alicia","Mañero","88999777L",2500);
		empleados[4]=new Empleado("Ruben","Perez","11222333K",3500);
		empleados[5]=new Empleado("Tomas","Remiro","44333444F",2500);
		
		for(Empleado e:empleados) {
			System.out.println(e.toString());
		}
		
		System.out.println("\n");
		
		System.out.println("Por dni  \n");
		//ORDENADOS POR DNI
		Arrays.sort(empleados);
		for(Empleado e:empleados) {			
			System.out.println(e.toString());
		}
		System.out.println("\n");
		/*AHORA ORDENO POR NOMBRE  USANDO INTERFAZ COMPARATOR*/
		ComparaNombres cn= new ComparaNombres();
		Arrays.sort(empleados, cn/*objeto de una clse que implemente comparator*/);
		
		System.out.println("Por nombre  \n");
		for(Empleado e:empleados) {			
			System.out.println(e.toString());
		}
		
		/*AHORA ORDENO POR NOMBRE  USANDO INTERFAZ COMPARATOR*/
		ComparaApellidos cv= new ComparaApellidos();
		Arrays.sort(empleados, cv);
		
		System.out.println("\n");
		System.out.println("Por apellido  \n");
		for(Empleado e:empleados) {			
			System.out.println(e.toString());
		}
		
			
		
		Arrays.sort(empleados, new Comparator() {
			public int compare(Object o1, Object o2) {
				Empleado a1=(Empleado)o1;
				Empleado a2=(Empleado)o2;
				return a1.getApellidos().compareTo(a2.getApellidos());
			}
		});
		
		System.out.println("\n");
		
		for(Empleado e:empleados) {			
			System.out.println(e.toString());
		}
		
		}
	
}
