package Ejercicio22Febrero;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		Persona arrayAlumno[]= new Alumno[5];

		arrayAlumno[0]=new Alumno("Esther", "Lainez", "22333444Y",8.2);		
		arrayAlumno[1]=new Alumno("Jorge", "Chueca","11222333K",9.5);
		arrayAlumno[2]=new Alumno("Jorge","Rivas","33444555S",8.5);
		arrayAlumno[3]=new Alumno("Paqui","Garcia","44555666H",8.9);
		arrayAlumno[4]=new Alumno("Oscar","Tutor","55666777P",9.2);
	
		
		do {
			System.out.println("MENU");
			System.out.println("1.Ordenar a las personas por id");
			System.out.println("2.Ordenar a las personas por nombre");
			System.out.println("3.Ordenar a las personas por nota media");
			System.out.println("4.Salir");
			
			opcion=teclado.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("Mostramos por id");
					ComparaId s = new ComparaId();
					Arrays.sort(arrayAlumno,s);
					for(Persona p:arrayAlumno) {
						System.out.println(p.toString());
					}
					break;
		
				case 2:
					System.out.println("Mostramos por orden alfabetico");
					ComparaNombres c = new ComparaNombres();
					Arrays.sort(arrayAlumno,c);
					for(Persona p:arrayAlumno) {
						System.out.println(p.toString());
					}
					break;
		
				case 3:
					System.out.println("Mostramos por nota media");
					ComparaNotaMedia d = new ComparaNotaMedia();
					Arrays.sort(arrayAlumno,d);
					for(Persona p:arrayAlumno) {
						System.out.println(p.toString());
					}
				
					break;
					
				case 4:
					System.out.println("Salir");
					break;
			}
		}while(opcion!=4);
	}

}
