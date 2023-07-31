package com.example.assignment2gc3629remastered;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiUtility {
    public static ApiResponse getDataFromApi(){
        String url = "https://lamp.computerstudi.es/~PriyanshPriyansh01/java/week13/companies.json";

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).build();

        try{
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse
                    .BodyHandlers
                    .ofString());
            Gson gson = new Gson();
            return gson.fromJson(response.body(), ApiResponse.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
