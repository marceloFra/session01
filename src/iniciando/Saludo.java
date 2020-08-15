package iniciando;
import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java
public class Saludo {

	public static void main(String[] args) {
		String nombre;
		int edad;
		
		System.out.print("Hola escribe tu noombre por favor");
		Scanner entradaNombre = new Scanner (System.in); //Creación de un objeto Scanner
		nombre = entradaNombre.nextLine();
		
		System.out.print("ahora escribe tu edad por favor");
		Scanner entradaEdad = new Scanner (System.in);
		edad = entradaEdad.nextInt();

		
		System.out.print("tu nombre es "+ nombre+ " y tu edad es " + edad);
	}

}
