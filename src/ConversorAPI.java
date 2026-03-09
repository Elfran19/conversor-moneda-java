import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorAPI {

    public static void convertir(String base, String destino, double valor)
            throws IOException, InterruptedException {

        String API_KEY = "83d420b595fe5da887ce9c7a";

        String direccion =
                "https://v6.exchangerate-api.com/v6/" +
                        API_KEY +
                        "/pair/" +
                        base +
                        "/" +
                        destino +
                        "/" +
                        valor;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response =
                client.send(request,
                        HttpResponse.BodyHandlers.ofString());

        JsonObject jsonObject =
                JsonParser.parseString(response.body())
                        .getAsJsonObject();

        double resultado =
                jsonObject.get("conversion_result").getAsDouble();

        System.out.println(valor + " " + base +
                " = " + resultado + " " + destino);
    }
}