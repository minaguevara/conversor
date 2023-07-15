package conversiones;

import aplicacion.MensajeFinal;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Divisas {
	
	// Carga los íconos para mostrar en el cuadro de diálogo
	ImageIcon icon = new ImageIcon("/Users/minaguevara/Desktop/Dev/ONE/eclipse-workspace/conversor/src/icon-divisas.png");
	ImageIcon iconErr = new ImageIcon("/Users/minaguevara/Desktop/Dev/ONE/eclipse-workspace/conversor/src/icon-err.png");
	
	public void convertirDivisa() {
	
		// Definir las opciones de conversión de divisas
		Object[] opcionesDivisa = {
			"MXN a USD",
			"USD a MXN",
			"MXN a EUR",
			"EUR a MXN",
			"MXN a GBP",
			"GBP a MXN",
			"MXN a JPY",
			"JPY a MXN",
			"MXN a KRW",
			"KRW a MXN"
		};
		
		// Mostrar el cuadro de diálogo para seleccionar una opción de conversión de divisas
		Object opcionElegida = JOptionPane.showInputDialog(
			null,
			"Selecciona una opción",
			"Conversión de Divisas",
			JOptionPane.QUESTION_MESSAGE,
			icon,
			opcionesDivisa,
			opcionesDivisa[0]
		);
		System.out.println(opcionElegida);
		
		String opcionDivisaElegida = (String) opcionElegida;
		
		// Salir del programa si se cancela la selección de opción de conversión de divisas
		if (opcionElegida == null) {
			MensajeFinal mensajeFinal = new MensajeFinal();
			mensajeFinal.MensajeFinal();
			System.exit(0);
		}
		
		try {
			// Solicitar la cantidad a convertir
			Object opcionCantidadAConvertir = JOptionPane.showInputDialog(
				null,
				"Ingresa la cantidad que deseas convertir de: " + opcionDivisaElegida,
				"Conversión de Divisas",
				JOptionPane.QUESTION_MESSAGE,
				icon,
				null,
				null
			);
			String stringCantidadAConvertir = opcionCantidadAConvertir.toString();
			//double cantidadAConvertir = Double.parseDouble(stringCantidadAConvertir);

			// Realizar la operación de conversión
			DivisasCalculo operacion = new DivisasCalculo();
			operacion.resultadoConversion(opcionDivisaElegida, stringCantidadAConvertir);
		
		} catch(NumberFormatException | NullPointerException exception) {
			// Manejar errores de formato de número o selección nula
			JOptionPane.showMessageDialog(
				null,
				"I",
				"Error",
				JOptionPane.ERROR_MESSAGE,
				iconErr
			);
		}
		
		// Mostrar el mensaje final
		MensajeFinal mensajeFinal = new MensajeFinal();
		mensajeFinal.MensajeFinal();
	}
}
