package Sentencias;

import javax.swing.JOptionPane;

public class sentenciaSwitch {

	public static void main(String[] args) {
		String sedad = JOptionPane.showInputDialog("escribe tu edad");
		int edad =  Integer.parseInt(sedad);
		
		switch(edad) {
			case 18: 
				System.out.println("tu edad es 18");
			case 19: 
				System.out.println("tu edad es 19");
			case 20: 
				System.out.println("tu edad es 20");
			default: 	
				System.out.println("tu edad no esta entre 18,19 ó 20");
		}
	}

}
