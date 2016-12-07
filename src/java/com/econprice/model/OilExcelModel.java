/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econprice.model;

import com.econprice.action.*;

/**
 *
 * @author Acer
 */
public class OilExcelModel {
   
    private String oilPump;
    private String oilType;

    public OilExcelModel(String oilPump, String oilType, String oilPrice) {
        this.oilPump = oilPump;
        this.oilType = oilType;
        this.oilPrice = oilPrice;
    }
    private String oilPrice;

    public String getOilPump() {
        return oilPump;
    }

//    public void setOilPump(String oilPump) {
//        this.oilPump = oilPump;
//    }

    public String getOilType() {
        return oilType;
    }

//    public void setOilType(String oilType) {
//        this.oilType = oilType;
//    }

    public String getOilPrice() {
        return oilPrice;
    }

//    public void setOilPrice(String oilPrice) {
//        this.oilPrice = oilPrice;
//    }
    
    


    
    
    
}
