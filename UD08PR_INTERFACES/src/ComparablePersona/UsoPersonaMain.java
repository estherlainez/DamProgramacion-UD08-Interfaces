package ComparablePersona;

import java.util.Arrays;
import java.util.Scanner;

public class UsoPersonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int opcion=0,imc=0;
		boolean prueba=false;
		String nombre="";

		Persona [] arrayPersona=new Persona[6];

		arrayPersona[0]=new Persona("Hugo",8,'H',30, 1.40);		
		arrayPersona[1]=new Persona("Jesus",21,'H',58, 1.65);
		arrayPersona[2]=new Persona("Pablo",18,'H',50, 1.55);
		arrayPersona[3]=new Persona("Victor",37,'H',59, 1.75);
		arrayPersona[4]=new Persona("Guillermo",1,'H',12, 0.50);
		arrayPersona[5]=new Persona("David",40,'H',65, 1.68);
		
		do {
			System.out.println("MENU");
			System.out.println("1.Acceder a la informacion de una persona");
			System.out.println("2.Comprobar su imc");
			System.out.println("3.Comprobar si es mayor de edad");
			System.out.println("4.Mostrar datos de las personas");
			System.out.println("5.Mostrar dni de una persona");
			System.out.println("6.Ordenar a las personas por edad");
			System.out.println("7.Ordenar a las personas por nombre");
			System.out.println("8.Ordenar a las personas por peso");
			System.out.println("9.Ordenar a las personas por altura");
			System.out.println("10.Ordenar a las personas por Dni ");
			System.out.println("11.Salir ");
			opcion=teclado.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Acceder a la informacion de una persona");
				System.out.println("Nombre a buscar:");
				teclado.nextLine();
				nombre=teclado.nextLine();
				
				for(Persona a:arrayPersona) {
					if(a.getNombre().equals(nombre)) {
						System.out.println(a.toString());
					}
				}
				
			break;
			case 2:
				System.out.println("Comprobar su imc");
				System.out.println("Nombre a buscar:");
				teclado.nextLine();
				nombre=teclado.nextLine();
				
				for(int i=0;i<6;i++) {
					if(arrayPersona[i].getNombre().equals(nombre)) {
						arrayPersona[i].toString();
						System.out.println("El peso: "+arrayPersona[i].getPeso());
						System.out.println("La altura: "+arrayPersona[i].getAltura());
						imc=arrayPersona[i].calcularIMC(arrayPersona[i].getPeso(), arrayPersona[i].getAltura());
					}		
				}
				
				System.out.println("su imc es de "+imc);
				if (imc==0) {
					System.out.println("Esta en su peso ideal");
				}else if(imc==1) {
					System.out.println("Esta por encima de su peso ideal");
					}else if(imc==-1) {	
						System.out.println("Esta por debajo de su peso ideal");
						}
				break;
			case 3:
				System.out.println("Comprobar si es mayor de edad");
				System.out.println("Nombre a buscar:");
				teclado.nextLine();
				nombre=teclado.nextLine();
				for(int i=0;i<6;i++) {
					if(arrayPersona[i].getNombre().equals(nombre)) {
						System.out.println(nombre+" tiene: "+arrayPersona[i].getEdad()+" años");
						prueba=arrayPersona[i].mayorEdad(arrayPersona[i].getEdad());
					}
				}
				
				if (prueba==true) {
					System.out.println("Es mayor de edad");
				}else if(prueba==false) {
					System.out.println("Es menor de edad");
				}
				break;
			case 4:
				System.out.println("Mostrar datos de las personas");
				for(Persona e:arrayPersona) {
					System.out.println(e.toString());
				}
				break;
			case 5:
				System.out.println("Mostrar dni");
				
				for(Persona e:arrayPersona) {
					e.setDni();
					System.out.println(e.toString());
				}
				
				break;
				
			case 6:
				System.out.println("Mostramos del mas joven al mas viejo");
				Arrays.sort(arrayPersona);
				for(Persona p:arrayPersona) {
					System.out.println(p.toString());
				}
				
				break;
			case 7:
				System.out.println("Mostramos por orden alfabetico");
				ComparaNombres c = new ComparaNombres();
				Arrays.sort(arrayPersona,c);
				for(Persona p:arrayPersona) {
					System.out.println(p.toString());
				}
				
				break;
				
			case 8:
				System.out.println("Mostramos del mas delgado al mas gordo");
				ComparaPeso d = new ComparaPeso();
				Arrays.sort(arrayPersona,d);
				for(Persona p:arrayPersona) {
					System.out.println(p.toString());
				}
				
				break;
			case 9:
				System.out.println("Mostramos del mas pequeño al mas alto");
				ComparaAltura e = new ComparaAltura();
				Arrays.sort(arrayPersona,e);
				for(Persona p:arrayPersona) {
					System.out.println(p.toString());
				}
				
				break;
			case 10:
				System.out.println("Mostramos en orden por Dni");
				
				ComparaDni j= new ComparaDni();
				Arrays.sort(arrayPersona, j);
				for(Persona p:arrayPersona) {
					System.out.println(p.toString());
				}
				break;
			case 11:
				System.out.println("Salir");
				break;
				
			}
		
		}while(opcion!=10);
	}

}

