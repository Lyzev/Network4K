package me.lyzev.example

import me.lyzev.network.http.HttpClient
import me.lyzev.network.http.HttpMethod

/**
 * Example usage.
 */
fun main() {
    val response = HttpClient.request(HttpMethod.GET, "https://www.google.com")
    println(response)
}