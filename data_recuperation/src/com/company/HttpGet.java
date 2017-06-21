package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class HttpGet {

    public static void main(String[] args) {
	// Main of the file
        System.out.println("Hello World");

        HttpGet request = new HttpGet();

        String json_response = request.sendRequest();

    }

    private String sendRequest() { // TODO deal with exceptions

        String apiKey = "595f4d6209640ee45177150f9029bb199cb89bc1";
        String baseUrl = "https://api.jcdecaux.com/vls/v1/stations/55?contract=Toulouse&apiKey=" + apiKey;

        try {
            URL url = new URL(baseUrl); // Format the URL
            URLConnection connection = url.openConnection(); // Open the connection with the url
            BufferedReader response_string = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = response_string.readLine()) != null)     // Read the file line by line
                System.out.println(line);

            response_string.close();


        } catch (IOException e){}
        return "url";
    }
}
