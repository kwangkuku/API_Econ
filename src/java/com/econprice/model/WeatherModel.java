/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econprice.model;

/**
 *
 * @author Acer
 */
public class WeatherModel {
    
    
    private String Province = "นนทบุรี";
    private String Temperature = "40 ";
    private String WindDirection = "100";
    private String WindSpeed = "20";
    private String RelativeHumidity = "33";

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String Temperature) {
        this.Temperature = Temperature;
    }

    public String getWindDirection() {
        return WindDirection;
    }

    public void setWindDirection(String WindDirection) {
        this.WindDirection = WindDirection;
    }

    public String getWindSpeed() {
        return WindSpeed;
    }

    public void setWindSpeed(String WindSpeed) {
        this.WindSpeed = WindSpeed;
    }

    public String getRelativeHumidity() {
        return RelativeHumidity;
    }

    public void setRelativeHumidity(String RelativeHumidity) {
        this.RelativeHumidity = RelativeHumidity;
    }

    
}
