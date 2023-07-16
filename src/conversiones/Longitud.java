package conversiones;

import aplicacion.MenuPrincipal;
import aplicacion.MensajeFinal;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Longitud {
	
	ImageIcon icon = new ImageIcon("/Users/minaguevara/Desktop/Dev/ONE/eclipse-workspace/conversor/src/icon-long.png");
	
	public void convertirLongitud() {
	
		// Opciones de Conversión de Longitud
		Object [] opcionesLongitud = {
				"Metros a Pies",
				"Pies a Metros",
				"Metros a Pulgadas",
				"Pulgadas a Metros",
				"Pies a Pulgadas",
				"Pulgadas a Pies"
		};
		
		// Mostrar el cuadro de diálogo para seleccionar una opción de conversión de longitud
		Object opcionElegida = JOptionPane.showInputDialog(
				null,
				"Selecciona un tipo de conversión",
				"Menu",
				JOptionPane.QUESTION_MESSAGE,
				icon,
				opcionesLongitud,
				opcionesLongitud[0]
		);
		
		// Salir del programa si se cancela la selección de opción de conversión
		if (opcionElegida == null) {
			MensajeFinal mensajeFinal = new MensajeFinal();
			mensajeFinal.MensajeFinal();
			System.exit(0);
		}
		
		String opcionLongitudElegida = (String) opcionElegida;
		
		try {
			// Solicitar el valor de longitud a convertir
			Object longitudAConvertirObject = JOptionPane.showInputDialog(
				null,
				"Ingresa la longitud que deseas convertir de: " + opcionLongitudElegida,
				"Conversión de Temperatura",
				JOptionPane.QUESTION_MESSAGE,
				icon,
				null,
				null
			);
			String longitudAConvertir = (String) longitudAConvertirObject;
			double doubleLongitudAConvertir = Double.parseDouble(longitudAConvertir);
			Longitud operacion = new Longitud();
			operacion.resultadoConversion(opcionLongitudElegida, doubleLongitudAConvertir);
		
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Valor no válido", "Error", JOptionPane.ERROR_MESSAGE);
			MenuPrincipal iniciarAplicacion = new MenuPrincipal();
			iniciarAplicacion.iniciar();
		}
	}

		
	public void resultadoConversion (String tipoConversion, double valorLongitud) {
		double resultado = 0;
			
		switch (tipoConversion) {
			case "Metros a Pies":
				resultado = valorLongitud * 3.281;
				break;
			case "Pies a Metros":
				resultado = valorLongitud / 3.281;
				break;
			case "Metros a Pulgadas":
				resultado = valorLongitud * 39.37;
				break;
			case "Pulgadas a Metros":
				resultado = valorLongitud / 39.37;
				break;
			case "Pies a Pulgadas":
				resultado = valorLongitud * 12;
				break;
			case "Pulgadas a Pies":
				resultado = valorLongitud / 12;
				break;
			default:
				break;
		}
			
		JOptionPane.showMessageDialog(
				null,
				"El resultado de la conversión " + tipoConversion + " es: " + resultado,
				"Conversión de Longitud",
				JOptionPane.INFORMATION_MESSAGE,
				icon
			);
				
			MensajeFinal mensajeFinal = new MensajeFinal();
			mensajeFinal.MensajeFinal();
	}
}
