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

/**
 * @author kapong
 *
 */
public class WeatherAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private WeatherModel weather = new WeatherModel();

    @Override
    public String execute() throws Exception {

        return "SUCCESS";
    }

    public WeatherModel getWeather() {
        return weather;
    }

    public void setWeather(WeatherModel weather) {
        this.weather = weather;
    }

}