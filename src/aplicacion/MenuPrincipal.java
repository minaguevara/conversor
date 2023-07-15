package aplicacion;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import conversiones.Divisas;
import conversiones.Temperatura;
import conversiones.Masa;
import conversiones.Longitud;

public class MenuPrincipal {
	
	// Carga el ícono para mostrar en el cuadro de diálogo
	ImageIcon icon = new ImageIcon("/Users/minaguevara/Desktop/Dev/ONE/eclipse-workspace/conversor/src/icon-01.png");
	
	public void iniciar() {
		
		// Definir las opciones del menú
		Object[] opciones = {
			"Conversor de Divisas",
			"Conversor de Temperatura",
			"Conversor de Masa",
			"Conversor de Longitud"
		};
		
		// Mostrar el cuadro de diálogo para seleccionar una opción
		Object elegirOpcion = JOptionPane.showInputDialog(
			null,
			"Selecciona una opción",
			"Menú Principal",
			JOptionPane.QUESTION_MESSAGE,
			icon,
			opciones,
			opciones[0]
		);
		String opcionElegida = (String) elegirOpcion;
		
		if (opcionElegida != null) {
			switch (opcionElegida) {
				case "Conversor de Divisas":
					Divisas conversorDivisas = new Divisas();
					conversorDivisas.convertirDivisa();
					break;
				case "Conversor de Temperatura":
					Temperatura conversorTemperatura = new Temperatura();
					conversorTemperatura.convertirTemperatura();
					break;
				case "Conversor de Masa":
					Masa conversorMasa = new Masa();
					conversorMasa.convertirMasa();
					break;
				case "Conversor de Longitud":
					Longitud conversorLongitud = new Longitud();
					conversorLongitud.convertirLongitud();
					break;
				default:
					break;
			}
		}
	}
}
