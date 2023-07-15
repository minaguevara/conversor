package conversiones;

import java.io.InputStreamReader;
import java.net.*;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.text.DecimalFormat;

public class DivisasAPI {
	
	public double get(String cantidadDinero, String deDivisa, String aDivisa) {

        double resultado = 0;
        double cantidadDouble = Double.parseDouble(cantidadDinero);
        String APIKey = "8390d4d2c5a723f5b76132b0";

        try {
            // Construir la URL de la API con los parámetros de conversión
            URL url = new URL("https://v6.exchangerate-api.com/v6/" + APIKey + "/pair/" + deDivisa + "/" + aDivisa + "/" + cantidadDouble);

            // Establecer la conexión HTTP
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Verificar el código de respuesta HTTP
            if (request.getResponseCode() == 200) {
            	// Analizar la respuesta JSON
            	System.out.println("Esperando Respuesta");
                JsonObject root = JsonParser.parseReader(new InputStreamReader(request.getInputStream())).getAsJsonObject();
                double conversionResult = root.get("conversion_result").getAsDouble();
                double tasaConversion = root.get("conversion_rate").getAsDouble();
                JsonElement ultimaActualizacion = root.get("time_last_update_utc");
                System.out.println("La tasa de conversión es de: $" + tasaConversion + "\nFecha: " + ultimaActualizacion);

                // Formatear el resultado de la conversión con dos decimales
                DecimalFormat df = new DecimalFormat("#0.00");
                String formattedResult = df.format(conversionResult);

                resultado = Double.parseDouble(formattedResult);            
                
            } else {
                System.out.println("Error de Respuesta " + request.getResponseCode());
            }
            // Cerrar la conexión HTTP
            request.disconnect();

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return resultado;
    }
}
