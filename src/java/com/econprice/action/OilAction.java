/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econprice.action;

import com.econprice.model.OilModel;

import com.opensymphony.xwork2.ActionSupport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author Acer
 */
public class OilAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private List<OilModel> oilData;

    @Override
    public String execute() throws IOException {

        return "SUCCESS";
    }

    public List<OilModel> getOilData() throws IOException {

        Document doc = Jsoup.connect("http://gasprice.kapook.com/gasprice.php").get();
        //System.out.println(doc.html());
        //System.out.println(doc.getElementsByTag("em").text());
        //System.out.println(doc.getElementsByTag("em").size());

        oilData = new ArrayList<OilModel>();

        ListIterator<Element> litr = doc.getElementsByTag("em").listIterator();
        Element e = null;
        while (litr.hasNext()) {
            OilModel OilModel = new OilModel();
            e = litr.next();

            //ให้แสดงค่า ปั๊ม ptt bangchak shall esso
            System.out.print(e.parent().parent().parent().getElementsByTag("h3").text());//บอกว่าเป็นปั๊มอะไร pump , h3 เป็น text บอกชื่อปั๊ม
//                //System.out.print(" : "+e.parent().text()); //Oil Type บอกว่าเป็น น้ำมันอะไร
            System.out.print(" : " + e.parent().getElementsByTag("span").text()); //Oil Type บอกว่าเป็น น้ำมันอะไร
            //System.out.println(" : " + e.text()); //Oil price
            System.out.println(" : " + e.parent().getElementsByTag("em").text());

            OilModel.setPumpName(e.parent().parent().parent().getElementsByTag("h3").text());
            OilModel.setOilType(e.parent().getElementsByTag("span").text());
            OilModel.setOilPrice(e.parent().getElementsByTag("em").text());

            oilData.add(OilModel);

        }

        return oilData;    
    }
    public void setOilData(List<OilModel> oilData) {
        this.oilData = oilData;
    }
    
    
    

}
