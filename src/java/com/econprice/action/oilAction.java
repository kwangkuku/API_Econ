/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econprice.action;

import com.econprice.model.OilModel;

/**
 *
 * @author Acer
 */
public class OilAction {

    private static final long serialVersionUID = 1L;
    private OilModel oilData = new OilModel();

    public OilModel getOilData() {
        return oilData;
    }

    public void setOilData(OilModel oilData) {
        this.oilData = oilData;
    }
    
    public String execute() {
        System.out.print("");
        return "SUCCESS";
    }

}
