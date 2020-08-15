package Sentencias;

import javax.swing.JOptionPane;

public class sentenciaIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sedad = JOptionPane.showInputDialog("escribe tu edad");
		int edad =  Integer.parseInt(sedad);
		
		if(edad >= 18 ) {
			// System.out.println("es mayor de edad ");
			// 
			JOptionPane.showMessageDialog(null, "es mayor de edad" );
		}
		else {
			// System.out.println("es menor de edad ");
			JOptionPane.showMessageDialog(null, "es menor  de edad" );
		}
	}

}
