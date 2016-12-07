/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econprice.action;

/**
 *
 * @author Acer
 */
import com.econprice.model.LotteryCheckModel;
import com.opensymphony.xwork2.ActionSupport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author Whankung
 */
public class LotteryCheckAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private String code;

    private LotteryCheckModel checkLottery = new LotteryCheckModel();

    @Override
    public String execute() throws IOException {
//        code="111110";
//        
//       System.out.print("Code input : " + code);
//        // setter LotteryCheckModel
//        if(code=="111110"){
//           checkLottery.setCheckLottery(true);  
//        }else {
//            checkLottery.setCheckLottery(false);  
//        }
        Document doc = Jsoup.connect("http://lotto.mthai.com/lottery/result-3511.html").get();
        Elements e = doc.getElementsByClass("result");
        System.out.println(e.html());

        return "SUCCESS";
    }

    //<editor-fold desc="Setter Getter">
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LotteryCheckModel getCheckLottery() {
        return checkLottery;
    }

    public void setCheckLottery(LotteryCheckModel checkLottery) {
        this.checkLottery = checkLottery;
    }
    //</editor-fold>

}
