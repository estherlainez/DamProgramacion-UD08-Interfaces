package ComparablePersona;

public class Persona implements Comparable{
	//atributos
	String nombre;
	int edad;
	String dni;
	char sexo='H';
	double peso;
	double altura;
	
	//constructor por teclado objeto 1
	public Persona(String n,int e, char s, double p, double a) {
		nombre=n;
		edad=e;
		sexo=s;
		peso=p;
		altura=a;
	}
	
	//constructor objeto 2
	public Persona(String n,int e, char s) {
		nombre=n;
		edad=e;
		sexo=s;
	}
	
	//constructor por defecto objeto 3
	public Persona() {
		 nombre="Por Defecto";
		 dni="Por Defecto";
		 edad=0;
		 peso=55.00;
		 altura=1.60;
	}
	
	
	public Persona(String n, int e, String s) {
		nombre=n;
		edad=e;
		dni="Por Defecto";
		peso=56.00;
		altura=1.60;
		sexo='H';
	}
	
	//constructor para todos los valores
	public Persona(String n,int e, String d,char s, double p,double a) {
		nombre=n;
		edad=e;
		dni=d;
		peso=p;
		altura=a;
	}

	
	public boolean mayorEdad(int edad) {
		boolean mayor=false;
		if(edad>=18) {
			mayor=true;
		}
		return mayor;
		
	}
	
	
	public int calcularIMC(double peso,double altura) {
		double imc=peso/Math.pow(altura,2);
		int valor=0;
		
		if(imc<20) {
			 valor=-1;
			}else if(imc==20 && imc<=25) {		
					 valor=0;
				}else if(imc>25) {
					 valor=1;
			}
		return valor;
		
		
	}
	

	public boolean comprobarSexo(char s) {
		sexo='H';
		char mujer='M';
		boolean masculino=true;
		if(sexo=='M') {
			masculino=false;
		}else if(sexo=='H') {
			masculino=true;
		}
		return masculino;
	}
	

	public String toString () {
		
		return"\nNombre: "+nombre+" Edad: "+edad+" Dni: "+dni+" Peso: "+peso + 
				" Altura: "+altura;
	}
	
	
	public int generaDni() {
		int numero=(int)(Math.random()*99999999);
		return numero;
	}
	
	
	public String letraDni(int numero) {
		int modulo;	
		modulo=numero%23;
		String letra;
		switch(modulo) {
			case 0:
				letra= "T";
				break;
			case 1:
				letra= "R";
				break;
			case 2:
				letra= "W";
				break;
			case 3:
				letra= "A";
				break;
			case 4:
				letra= "G";
				break;
			case 5:
				letra= "M";
				break;
			case 6:
				letra= "Y";
				break;
			case 7:
				letra= "F";
				break;
			case 8:
				letra= "P";
				break;
			case 9:
				letra= "D";
				break;
			case 10:
				letra= "X";
				break;
			case 11:
				letra= "B";
				break;
			case 12:
				letra= "N";
				break;
			case 13:
				letra= "J";
				break;
			case 14:
				letra= "Z";
				break;
			case 15:
				letra= "S";
				break;
			case 16:
				letra= "Q";
				break;
			case 17:
				letra= "V";
				break;
			case 18:
				letra= "H";
				break;
			case 19:
				letra= "L";
				break;
			case 20:
				letra= "C";
				break;
			case 21:
				letra= "K";
				break;
			case 22:
				letra= "E";
				break;
			default:
				letra="error: no es valido";
				
		}
			
		return letra;
	}
	//metodos.get
	public String getNombre() {
		return this.nombre; 
	}
	
	
	public int getEdad() {
		return this.edad; 
	}
	
	
	public double getPeso() {
		return this.peso; 
	}
	
	
	public double getAltura() {
		return this.altura; 
	}
	
	
	public char getSexo() {
		return this.sexo;
	}
	
	
	//metodos set
	public void setNombre(String n) {
			this.nombre=n;
	}
		
		
	public void setEdad(int e) {
			this.edad=e;
	}
		
		
	public void setPeso(double p) {
			this.peso=p;
	}
		
		
	public void setAltura(double a) {
			this.altura=a;
	}
		
		
	public void setSexo(char s) {
			this.sexo=s;
	}
	
	public void setDni() {
		int numero=(int)(Math.random()*99999999);
		String dA=numero+this.letraDni(numero);
		this.dni=dA;
	}

	@Override
	public int compareTo(Object p) {
		Persona obj = (Persona)p;
		if (this.getEdad() < obj.getEdad()) return -1;
		if (this.getEdad() > obj.getEdad()) return 1;
		return 0;
	}
}
