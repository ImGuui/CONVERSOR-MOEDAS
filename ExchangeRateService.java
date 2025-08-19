import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExchangeRateService {

    private static final String API_KEY = "610d731afd24a51868b3f748"; 
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double getExchangeRate(String from, String to) {
        try {
            String url = BASE_URL + API_KEY + "/latest/" + from;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                System.out.println("Erro na API. Código HTTP: " + response.statusCode());
                return -1;
            }

            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject rates = json.getAsJsonObject("conversion_rates");

            return rates.get(to).getAsDouble();

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
