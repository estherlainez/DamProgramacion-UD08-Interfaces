package EjemploInterfazComparator;

import java.util.Arrays;
import java.util.Comparator;

public class usoClienteClaseAnonima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente[] misClientes= new Cliente[5];
		misClientes[0]= new Cliente("11222333D","Esther L.",37,300.0);
		misClientes[1]= new Cliente("22333443A","Jorge C.",21,500.0);
		misClientes[2]= new Cliente("33444555S","Oscar T.",22,600.0);
		misClientes[3]= new Cliente("44555666E","Alejandro S.",20,400.0);
		misClientes[4]= new Cliente("55666777F","Jorge R.",19,300.0);
		
		Arrays.sort(misClientes);
		
		//tengo que crearme un objeto de la clase ComparaEdades
		//ComparaEdades c= new ComparaEdades();
		//Arrays.sort(misClientes,c);
		//LLAMAMOS AL METODO SORT QUE SOS OBLIGA 
		//A IMPLEMENTAR LA INTERFAZ COMPARABLE
		System.out.println("Por Dni" + Arrays.toString(misClientes));
		System.out.println("Por Nombre" + Arrays.toString(misClientes));
		Arrays.sort(misClientes,  new Comparator() {
			public int compare(Object o1, Object o2) {
				Cliente c1=(Cliente)o1;
				Cliente c2=(Cliente)o2;
				return c1.nombre.compareTo(c2.nombre);
			}
		});
		System.out.println("Por edades: "+Arrays.toString(misClientes));
		
		//ComparaNombres d = new ComparaNombres();
		Arrays.sort(misClientes, new Comparator() {
		
		public int compare (Object o1, Object o2) {
			return ((Cliente) o1).edad - ((Cliente) o2).edad;
		}
		});
		
		
	}

}

