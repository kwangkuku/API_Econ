/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econprice.model;

import java.awt.SystemColor;
import java.lang.annotation.Annotation;
import javax.ejb.Singleton;

/**
 *
 * @author Acer
 */
public class WeatherModel {

    private String provinceNameTh;
    private String maxTemperature;
    private String windDirection;
    private String windSpeed;
    private String weatherDescription;
    private String tempartureLevel;
 
    public WeatherModel(String provinceNameTh, String maxTemperature, String windDirection,
            String windSpeed,String weatherDescription ,String tempartureLevel) {

        this.provinceNameTh= provinceNameTh;
        this.maxTemperature = maxTemperature;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.weatherDescription = weatherDescription;
        this.tempartureLevel = tempartureLevel;
       
    
    }

    public String getProvinceNameTh() {
        return provinceNameTh;
    }

    public void setProvinceNameTh(String provinceNameTh) {
        this.provinceNameTh = provinceNameTh;
    }

   

    public String getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(String maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

   

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String WindDirection) {
         this.windDirection = windDirection;
    }

    

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String WindSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public String getTempartureLevel() {
        return tempartureLevel;
    }

    public void setTempartureLevel(String tempartureLevel) {
        this.tempartureLevel = tempartureLevel;
    }

   

    public static void getJSONObject(String porvice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
