package arreglos;

public class ArregloMetodos {
	
	private static int[] n = {25, 27, 22, 24, 29, 20, 23};
	// Operaciones p�blicas
	public static int tama�o() {
	 return n.length;
	}
	public  static int obtener(int i) {
	 return n[i];
	}
	public  static int sumaNumeros() {
	 int suma = 0;
	 for (int i=0; i<tama�o(); i++)
	 suma += n[i];
	 return suma;
	}
	public static int posPrimerNumeroMenorA25() {
	 for (int i=0; i<tama�o(); i++)
	 if (n[i] < 25)
	 return n[i];
	 return -1;
	}
 
	
	public static void main(String[] args) {
			
		// tama�o 7
		System.out.println("tama�o del arreglo " + tama�o() );
		
		System.out.println("obtener numero " + obtener(2) );
		
		System.out.println("suma de numeros " + sumaNumeros() );
		System.out.println("primer numero menor de 25 en el arreglo es :" + posPrimerNumeroMenorA25() );
	}

}
