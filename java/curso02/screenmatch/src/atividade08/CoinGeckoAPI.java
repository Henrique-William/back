package atividade08;

import java.util.Scanner;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinGeckoAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String apiKey = "";
        System.out.println("Digite o nome da Cripto Moeda: ");
        var criptoNome = leitura.next();

        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptoNome +"&vs_currencies=usd"; 

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}