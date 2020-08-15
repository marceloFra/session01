package cadena;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					  // 0123456789101112
		String cadena = "Java es mejor";
		System.out.println("cadena normal es: " + cadena );
		
		int longitud = cadena.length();
		
		System.out.println(longitud);

		/// char 
		char caracter ;
		caracter = cadena.charAt(2);
		System.out.println(caracter);
		
		// equals
		
		String cad1 = "Java es lo maximo";
		String cad2 = "Java es mejor";
		
		boolean verificar = cadena.equals(cad1);
		boolean verificar2 = cadena.equals(cad2);	
		
		System.out.println("primera verificacion es " + verificar);
		System.out.println("segunda verificacion es " + verificar2);
		 
		// toLowerCase minusculas
		
		String minusculas  = cadena.toLowerCase(); 
		System.out.println("cadena todo en minusculas " + minusculas);
		
		
		// toUpperCase Mayusculas
		String mayusculas  = cadena.toUpperCase();
		System.out.println("cadena todo en Mayusculas " + mayusculas);

		// substring
		
		String s1 = "Viva el Perú";
		
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(3,10));
		
	}

}
