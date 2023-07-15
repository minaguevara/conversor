package aplicacion;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MensajeFinal {
	
	ImageIcon iconQ = new ImageIcon("/Users/minaguevara/Desktop/Dev/ONE/eclipse-workspace/conversor/src/icon-question.png");
	ImageIcon iconB = new ImageIcon("/Users/minaguevara/Desktop/Dev/ONE/eclipse-workspace/conversor/src/icon-exit.png");

	
	public void MensajeFinal() {
		System.out.println("Terminar");
		
		// Mostrar un cuadro de diálogo para preguntar si se desea continuar
		Object opcionMensaje = JOptionPane.showConfirmDialog(
			null,
			"¿Deseas continuar?",
			"Selecciona una opción",
			JOptionPane.YES_NO_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			iconQ
		);
		int mensaje = (Integer) opcionMensaje;
		
		// Continuar la aplicación si se elige "Sí"
		if (mensaje == 0) {
			MenuPrincipal iniciarAplicacion = new MenuPrincipal();
			iniciarAplicacion.iniciar();
		} 
		// Mostrar un mensaje de finalización si se elige "No"
		else if (mensaje == 1) {
			JOptionPane.showMessageDialog(
				null,
				"Programa Finalizado",
				"Gracias",
				JOptionPane.INFORMATION_MESSAGE,
				iconB
			);
		}
	}
}