package Clases;

public class ReporteAlumno {
	static Alumno a = new Alumno(12345, "Juan", 13, 15);
 
	

	public static void main(String[] args) {
		
		Alumno x = a;
		System.out.println("DirMem : " + x);
		System.out.println("código : " + x.getCodigo());
		System.out.println("nombre : " + x.getNombre());
		System.out.println("nota 1 : " + x.getNota1());
		System.out.println("nota 2 : " + x.getNota2());
		System.out.println("promedio : " + x.promedio());

	}

}
