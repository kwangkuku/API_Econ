/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econprice.model;
//model ไม่มีการ set ค่า , มีแค่ ตัวแปร กับ get set
//model เหมือนโครงเฉย มีแค่ bensin-PTT = ______ 

import org.jsoup.nodes.Element;


/**
 *
 * @author Acer
 */
public class OilModel {
    
        private String pumpName; 
        private String oilType; 
        private String oilPrice; 
        
    
    public String getPumpName() {
        return pumpName;
    }

    public void setPumpName(String pumpName) {
        this.pumpName = pumpName;
    }

    public String getOilType() {
        return oilType;
    }

    public void setOilType(String oilType) {
        this.oilType = oilType;
    }

    public String getOilPrice() {
        return oilPrice;
    }

    public void setOilPrice(String oilPrice) {
        this.oilPrice = oilPrice;
    }
  
   
}
