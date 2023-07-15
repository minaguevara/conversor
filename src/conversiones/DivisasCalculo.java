package conversiones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DivisasCalculo {
	
	ImageIcon icon = new ImageIcon("/Users/minaguevara/Desktop/Dev/ONE/eclipse-workspace/conversor/src/icon-divisas.png");
	
	public void resultadoConversion(String tipoDivisa, String cantidadAConvertir) {
		
		// Crear un arreglo para almacenar los datos necesarios para la API
		String datosAPI[];
		datosAPI = new String[3];
		
		String deDivisa = "", aDivisa = "";
		
		// Determinar las divisas de origen y destino según el tipo de conversión seleccionado
		switch (tipoDivisa) {
			case "MXN a USD":
				deDivisa = "MXN";
				aDivisa = "USD";
				break;
			case "USD a MXN":
				deDivisa = "USD";
				aDivisa = "MXN";
				break;
			case "MXN a EUR":
				deDivisa = "MXN";
				aDivisa = "EUR";
				break;
			case "EUR a MXN":
				deDivisa = "EUR";
				aDivisa = "MXN";
				break;
			case "MXN a GBP":
				deDivisa = "MXN";
				aDivisa = "GBP";
				break;
			case "GBP a MXN":
				deDivisa = "GBP";
				aDivisa = "MXN";
				break;
			case "MXN a JPY":
				deDivisa = "MXN";
				aDivisa = "JPY";
				break;
			case "JPY a MXN":
				deDivisa = "JPY";
				aDivisa = "MXN";
				break;
			case "MXN a KRW":
				deDivisa = "MXN";
				aDivisa = "KRW";
				break;
			case "KRW a MXN":
				deDivisa = "KRW";
				aDivisa = "MXN";
				break;
			default:
				break;
		}
		
		// Obtener la fecha actual y formatearla
		LocalDate actualDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLL yyyy");
		String fechaFormateada = actualDate.format(formatter);
		
		// Actualizar los datos necesarios para la API
		//datosAPI[0] = fechaFormateada;
		datosAPI[0] = cantidadAConvertir;
		datosAPI[1] = deDivisa;
		datosAPI[2] = aDivisa;
		
		// Realizar la llamada a la API y obtener la cantidad convertida
		DivisasAPI res = new DivisasAPI();
		double cantidadConvertida = res.get(datosAPI[0], datosAPI[1], datosAPI[2]);
		
		// Mostrar el resultado de la conversión en un cuadro de diálogo
		JOptionPane.showMessageDialog(
				null, 
				"$" + datosAPI[0] + " " + datosAPI[1] + " equivale a $" + cantidadConvertida + " " + datosAPI[2], 
				fechaFormateada, 
				0, 
				icon
			);
	}

}
