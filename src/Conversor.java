import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    public static void main(String[] args) {
        // The main currency can be set by modifying the last three digits of the address; In this case, "USD"
        String address = "https://v6.exchangerate-api.com/v6/6b46ad142b98f85a3b33e80b/latest/USD";

        // Create the client, request and response. All of them surrounded by a try-catch statement
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // The response is returned as a String (JSON)
            String json = response.body();
            System.out.println(json);

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro: não foi possível realizar a consulta.");
        }
    }
}
