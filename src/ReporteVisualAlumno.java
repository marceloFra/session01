import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Alumno;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReporteVisualAlumno extends JFrame {

	private JPanel contentPane;
	private JButton btnImprimir;
 	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReporteVisualAlumno frame = new ReporteVisualAlumno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReporteVisualAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnImprimir_actionPerformed(e);
			}
		});
		btnImprimir.setBounds(144, 11, 89, 23);
		contentPane.add(btnImprimir);
		{
			textArea = new JTextArea();
			textArea.setBounds(10, 51, 414, 199);
			contentPane.add(textArea);
		}
		
 
		
	}
	
	protected void do_btnImprimir_actionPerformed(ActionEvent e) {
		
		Alumno a = new Alumno(12345, "Juan", 13, 15);
		 Alumno b = new Alumno(67890, "Pedro", 12, 13);
		 Alumno c = new Alumno(38214, "María", 14, 20);
		 
		 
		 listado(a);
	}
	 void listado(Alumno x) {
		 imprimir("DirMem : " + x);
		 imprimir("código : " + x.getCodigo());
		 imprimir("nombre : " + x.getNombre());
		 imprimir("nota 1 : " + x.getNota1());
		 imprimir("nota 2 : " + x.getNota2());
		 imprimir("promedio : " + x.promedio());
		 }
	void imprimir(String cad) {
		textArea.append(cad + "\n");
		}
}
