/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econprice.action;

import com.econprice.model.WeatherModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import static java.awt.SystemColor.text;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import static javax.ws.rs.client.Entity.text;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 * @author kapong
 *
 */
public class WeatherAction {

    WeatherModel weatherModel;
    JSONArray station, sevenDaysForecast;

    public String execute() throws Exception {
        String text = "";
        URL url;
        try {

            url = new URL(
                    "http://data.tmd.go.th/api/WeatherForecast7Days/V1/?type=json");
            HttpURLConnection httpsURLConnection = (HttpURLConnection) url
                    .openConnection();
            httpsURLConnection.setDoOutput(true);

            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Province", "แม่ฮ่องสอน");
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
            httpsURLConnection.connect();
            String response = null;
            if (httpsURLConnection.getResponseCode() == 200) {
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(
                                httpsURLConnection.getInputStream(), "utf-8"));

                while ((response = bufferedReader.readLine()) != null) {
//   response  += bufferedReader.readLine();
                    text += response;

                    System.out.print(response);
                }
            } else {
                throw new RuntimeException("Failed to connect service"
                        + httpsURLConnection.getResponseCode());
            }
            httpsURLConnection.disconnect();
//             System.out.print(text);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        JSONObject obj = new JSONObject(text);
        station = obj.getJSONArray("Provinces");
//       station.length();
        for (int i = 0; i < station.length(); i++) {

            JSONObject jsonObject = station.getJSONObject(i);

            sevenDaysForecast = jsonObject.getJSONArray("SevenDaysForecast");

        }
        return "SUCCESS";
    }

    public List<WeatherModel> getWeatherModel() {
        ArrayList<WeatherModel> weatherModel = new ArrayList<WeatherModel>();

        try {
//       station.length();
            for (int i = 0; i < station.length(); i++) {

                JSONObject jsonObject = station.getJSONObject(i);

                sevenDaysForecast = jsonObject.getJSONArray("SevenDaysForecast");

                weatherModel.add(new WeatherModel(jsonObject.getString("ProvinceNameTh"),
                        (sevenDaysForecast.getJSONObject(0).getJSONObject("MaxTemperature").getDouble("Value") + " "
                        + "°C"),
                        (sevenDaysForecast.getJSONObject(0).getJSONObject("WindDirection").getDouble("Value") + " "
                        + "ดีกรี"),
                        (sevenDaysForecast.getJSONObject(0).getJSONObject("WindSpeed").getDouble("Value") + " "
                        + "กม./ชม."),
                        sevenDaysForecast.getJSONObject(0).getString("WeatherDescription"),
                        sevenDaysForecast.getJSONObject(0).getString("TempartureLevel")));

            }
            System.out.println("weatherModel---> " + weatherModel.size());

        } catch (Exception e) {
        }

        return weatherModel;
    }

}
