package me.lyzev.example;

import me.lyzev.network.http.HttpClient;
import me.lyzev.network.http.HttpMethod;
import me.lyzev.network.http.HttpResponse;

import java.io.IOException;

/**
 * Example usage.
 *
 * @author Lyzev
 */
public class HttpExample {

    /**
     * Example usage.
     *
     * @param args command line arguments
     * @throws IOException if an I/O error occurs
     */
    public static void main(String[] args) throws IOException {
        HttpResponse response = HttpClient.request(HttpMethod.GET, "https://www.google.com");
        System.out.println(response);
    }
}
