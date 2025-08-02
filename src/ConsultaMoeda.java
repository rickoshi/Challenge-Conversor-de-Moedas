import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {

    // This method creates the client, request and response and returns a record Moeda
    public Moeda consultaMoeda (String endereco) {

        // Create the client, request and response. All of them surrounded by a try-catch statement
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // The response is returned as a String (JSON)
            String json = response.body();

            // Convert the json into a Java object and returns it
            Gson gson = new Gson();
            return gson.fromJson(json, Moeda.class);

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro: não foi possível realizar a consulta.");
            throw new RuntimeException("Falha na consulta da moeda", e);
        }
    }
}