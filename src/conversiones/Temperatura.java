package conversiones;

import aplicacion.MenuPrincipal;
import aplicacion.MensajeFinal;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Temperatura {
	
	ImageIcon icon = new ImageIcon("/Users/minaguevara/Desktop/Dev/ONE/eclipse-workspace/conversor/src/icon-temp.png");
	
	public void convertirTemperatura() {
	
		// Opciones de Conversión de Temperatura
		Object[] opcionesTemperatura = {
			"Celsius a Fahrenheit",
			"Fahrenheit a Celsius",
			"Celsius a Kelvin",
			"Kelvin a Celsius",
			"Fahrenheit a Kelvin"
		};
		
		// Mostrar el cuadro de diálogo para seleccionar una opción de conversión de temperatura
		Object opcionElegida = JOptionPane.showInputDialog(
			null,
			"Seleccione un tipo de conversión",
			"Menu",
			JOptionPane.QUESTION_MESSAGE,
			icon,
			opcionesTemperatura,
			opcionesTemperatura[0]
		);
		System.out.println(opcionElegida);
		
		String opcionTemperaturaElegida = (String) opcionElegida;
		
		// Salir del programa si se cancela la selección de opción de conversión
		if (opcionElegida == null) {
			MensajeFinal mensajeFinal = new MensajeFinal();
			mensajeFinal.MensajeFinal();
			System.exit(0);
		}
		
		try {
			// Solicitar el valor de grados a convertir
			Object gradosAConvertirObject = JOptionPane.showInputDialog(
				null,
				"Ingresa los grados que deseas convertir de: " + opcionTemperaturaElegida,
				"Conversión de Temperatura",
				JOptionPane.QUESTION_MESSAGE,
				icon,
				null,
				null
			);
			String gradosAConvertir = (String) gradosAConvertirObject;
			double doubleGradosAConvertir = Double.parseDouble(gradosAConvertir);
			Temperatura operacion = new Temperatura();
			operacion.resultadoConversion(opcionTemperaturaElegida, doubleGradosAConvertir);
		
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Valor no válido", "Error", JOptionPane.ERROR_MESSAGE);
			MenuPrincipal iniciarAplicacion = new MenuPrincipal();
			iniciarAplicacion.iniciar();
		}
	}
		
	public void resultadoConversion(String tipoConversion, double valorGrados) {
		double resultado = 0;
			
		switch (tipoConversion) {
			case "Celsius a Kelvin":
				resultado = valorGrados + 273;
				break;
			case "Kelvin a Celsius":
				resultado = valorGrados - 273;
				break;
			case "Celsius a Fahrenheit":
				resultado = (1.8 * valorGrados) + 32;
				break;
			case "Fahrenheit a Celsius":
				resultado = (valorGrados - 32) / 1.8;
				break;
			case "Fahrenheit a Kelvin":
				resultado = ((valorGrados - 32) / 1.8) + 273;
				break;
			default:
				break;
		}
			
		JOptionPane.showMessageDialog(
			null,
			"El resultado de la conversión " + tipoConversion + " es: " + resultado,
			"Conversión de Temperatura",
			JOptionPane.INFORMATION_MESSAGE,
			icon
		);
			
		MensajeFinal mensajeFinal = new MensajeFinal();
		mensajeFinal.MensajeFinal();
	}
}
