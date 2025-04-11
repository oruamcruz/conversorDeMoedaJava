package br.com.macruz.conversormoeda.api;

import br.com.macruz.conversormoeda.moeda.ApiResponse;
import br.com.macruz.conversormoeda.moeda.ConversionRates;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConectaApi {

    public double buscarCotacao(String moedaBase, String moedaAlvo) throws IOException, InterruptedException {
        String chave = "6217127a43773f6be51840b8";
        URI url = URI.create("https://v6.exchangerate-api.com/v6/" + chave + "/latest/" + moedaBase);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(url).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        ApiResponse apiResponse = gson.fromJson(response.body(), ApiResponse.class);
        ConversionRates rates = apiResponse.getConversion_rates();

        switch (moedaAlvo.toUpperCase()) {
            case "USD": return rates.getUSD();
            case "BRL": return rates.getBRL();
            case "ARS": return rates.getARS();
            case "COP": return rates.getCOP();
            case "BOB": return rates.getBOB();
            case "CLP": return rates.getCLP();
            default: throw new IllegalArgumentException("Moeda não suportada: " + moedaAlvo);
        }
    }
}
