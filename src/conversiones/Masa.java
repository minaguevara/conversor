package conversiones;

import aplicacion.MenuPrincipal;
import aplicacion.MensajeFinal;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Masa {
	
	ImageIcon icon = new ImageIcon("/Users/minaguevara/Desktop/Dev/ONE/eclipse-workspace/conversor/src/icon-masa.png");
	
	public void convertirMasa() {
	
		// Opciones de Conversión de Masa
		Object[] opcionesPeso = {
			"Kilogramos a Libras",
			"Libras a Kilogramos",
			"Kilogramos a Onzas",
			"Onzas a Kilogramos",
			"Libras a Onzas",
			"Onzas a Libras"
		};
		
		// Mostrar el cuadro de diálogo para seleccionar una opción de conversión de masa
		Object opcionElegida = JOptionPane.showInputDialog(
			null,
			"Seleccione una opción de conversión",
			"Menú",
			JOptionPane.QUESTION_MESSAGE,
			icon,
			opcionesPeso,
			opcionesPeso[0]
		);
		
		// Salir del programa si se cancela la selección de opción de conversión
		if (opcionElegida == null) {
			MensajeFinal mensajeFinal = new MensajeFinal();
			mensajeFinal.MensajeFinal();
			System.exit(0);
		}
		
		String opcionPesoElegida = (String) opcionElegida;
		
		try {
			// Solicitar el valor de peso a convertir
			Object pesoAConvertirObject = JOptionPane.showInputDialog(
				null,
				"Ingresa el peso que deseas convertir\nOpción elegida: " + opcionPesoElegida,
				"Menú",
				JOptionPane.QUESTION_MESSAGE,
				icon,
				null,
				null
			);
			String pesoAConvertir = (String) pesoAConvertirObject;
			double doublePesoAConvertir = Double.parseDouble(pesoAConvertir);
			Masa operacion = new Masa();
			operacion.resultadoConversion(opcionPesoElegida, doublePesoAConvertir);
		
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Valor no válido", "Error", JOptionPane.ERROR_MESSAGE);
			MenuPrincipal iniciarAplicacion = new MenuPrincipal();
			iniciarAplicacion.iniciar();
		}
	}
		
	public void resultadoConversion(String tipoConversion, double valorPeso) {
		double resultado = 0;
			
		switch (tipoConversion) {
			case "Kilogramos a Libras":
				resultado = valorPeso * 2.2046;
				break;
			case "Libras a Kilogramos":
				resultado = valorPeso / 2.2046;
				break;
			case "Kilogramos a Onzas":
				resultado = valorPeso * 35.274;
				break;
			case "Onzas a Kilogramos":
				resultado = valorPeso / 35.274;
				break;
			case "Libras a Onzas":
				resultado = valorPeso * 16;
				break;
			case "Onzas a Libras":
				resultado = valorPeso / 16;
				break;
			default:
				break;
		}
			
		JOptionPane.showMessageDialog(
			null,
			"El valor de la conversión " + tipoConversion + " es: " + resultado,
			"Título del mensaje",
			JOptionPane.INFORMATION_MESSAGE,
			icon
		);
			
		MensajeFinal mensajeFinal = new MensajeFinal();
		mensajeFinal.MensajeFinal();
	}
}
