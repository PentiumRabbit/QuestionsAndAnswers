package com.robot.answers.net;

import com.google.gson.Gson;
import com.robot.answers.data.HttpResponse;
import com.robot.answers.data.YouDaoAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class NetRunnable implements Runnable {
    @Override
    public void run() {
        HttpResponse response = netRequest();

        if (response.getResponseCode() != 200) {
            return;
        }

        YouDaoAPI youDaoAPI = parseJson(response.getResponseBody());


        List<String> translation = youDaoAPI.getTranslation();

        if (translation != null) {

        }


    }

    private HttpResponse netRequest() {

        HttpResponse response = new HttpResponse();

        try {
            URL url = new URL(Net.baseUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(10000);
            conn.setReadTimeout(10000);
            conn.connect();
            int responseCode = conn.getResponseCode();
            response.setResponseCode(responseCode);
            if (responseCode == 200) {
                InputStream inStream = conn.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inStream));
                String s;
                StringBuilder builder = new StringBuilder();
                while ((s = bufferedReader.readLine()) != null) {
                    builder.append(s).append("\n");
                }
                response.setResponseBody(builder.toString());
            } else {
                InputStream errorStream = conn.getErrorStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                StringBuilder sb = new StringBuilder();
                String s;
                while ((s = bufferedReader.readLine()) != null) {
                    sb.append(s).append("\n");
                }
                errorStream.close();
                bufferedReader.close();
            }
        } catch (MalformedURLException e) {
            response.setException(e);
        } catch (IOException e) {
            response.setException(e);
        }

        return response;
    }

    private YouDaoAPI parseJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, YouDaoAPI.class);
    }
}
