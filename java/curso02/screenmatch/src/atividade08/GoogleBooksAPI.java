package atividade08;

import java.util.Scanner;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GoogleBooksAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String apiKey = "";
        System.out.println("Digite o nome do livro: ");
        var busca = leitura.next();

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca +"&key=" + apiKey; 

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
