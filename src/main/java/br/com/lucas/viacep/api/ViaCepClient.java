package br.com.lucas.viacep.api;

import br.com.lucas.viacep.model.Cep;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepClient {
    private static final String BASE_URL = "https://viacep.com.br/ws/";

    private final HttpClient client;
    private final ObjectMapper mapper;

    public ViaCepClient() {
        this.client = HttpClient.newHttpClient();
        this.mapper = new ObjectMapper();
    }

    public Cep searchCepClient(String cep) {
        try {
            URI uri = URI.create(BASE_URL + cep + "/json");

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .GET()
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            return mapper.readValue(response.body(), Cep.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao buscar CEP", e);
        }
    }
}
