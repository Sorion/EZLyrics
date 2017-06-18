package com.ezteam.ezlyrics;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Class to get xml data from the lyrics server
 * Created by sorion on 18/06/2017.
 */

public class LyricsRetriever {

    private final String URL = "http://api.chartlyrics.com/apiv1.asmx/";

    private InputStream sendRequest(URL url) throws Exception {

        try {
            // Opening connexion
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            // Connect to URL
            urlConnection.connect();

            // If it's ok server send ok response
            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                return urlConnection.getInputStream();
            }
        } catch (Exception e) {
            throw new Exception("");
        }
        return null;
    }
}
