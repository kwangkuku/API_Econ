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
import com.econprice.model.LotteryModel;
import com.opensymphony.xwork2.ActionSupport;
import static com.oracle.webservices.api.EnvelopeStyle.Style.XML;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import org.jsoup.Jsoup;

/**
 *
 * @author Whankung
 */
public class LotteryAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    //  private LotteryModel lotteryData = new LotteryModel();
    private List<LotteryModel> lotteryData;

    //private String date;
    @Override
    public String execute() throws IOException {
//        date = "16-09-59";
//        System.out.print("Date input : " + date);
//        if (date == "16-09-59") {
//            lotteryData.setDatePast("16-09-59");
//            lotteryData.setPrize1("567111");
//            lotteryData.setPrizeEnd2Digit("21");
//            lotteryData.setPrizeEnd3Digit("765");
//            lotteryData.setPrizeTop3Digit("111");
//            lotteryData.setPrizeNear1("567112");
//            lotteryData.setPrize2("980123");
//            lotteryData.setPrize3("092111");
//            lotteryData.setPrize4("666333");
//            lotteryData.setPrize5("038213");

//        } else if (date == "1-09-59") {
//            lotteryData.setDatePast("1-09-59");
//            lotteryData.setPrize1("000111");
//            lotteryData.setPrizeEnd2Digit("01");
//            lotteryData.setPrizeEnd3Digit("065");
//            lotteryData.setPrizeTop3Digit("011");
//            lotteryData.setPrizeNear1("000112");
//            lotteryData.setPrize2("180123");
//            lotteryData.setPrize3("192111");
//            lotteryData.setPrize4("166333");
//            lotteryData.setPrize5("138213");
//        }
        return "SUCCESS";
    }

    public List<LotteryModel> getLotteryData() throws IOException { 
//       lotteryData.add(new LotteryModel("16-09-59", "542111", "324521", "313", "000", "362", "328542", "323", "000", "134"));
//        lotteryData.add(new LotteryModel("1-09-59", "000111", "324521", "313", "000", "362", "328542", "323", "000", "134"));
//        lotteryData.add(new LotteryModel("16-08-59", "222222", "324521", "313", "000", "362", "328542", "323", "000", "134"));
//        lotteryData.add(new LotteryModel("1-08-59", "333333", "324521", "313", "000", "362", "328542", "323", "000", "134"));
        org.jsoup.nodes.Document docDate = Jsoup.connect("http://news.sanook.com/lotto/check/01122559/").get();
        org.jsoup.select.Elements date = docDate.getElementsByClass("content__title--sub");
        System.out.println(date.html());
//        org.jsoup.nodes.Document doc = Jsoup.connect("http://news.sanook.com/lotto/check/16112559/").get();
//        org.jsoup.select.Elements e = doc.getElementsByClass("lotto__number");
//        System.out.println(e.html());
        org.jsoup.nodes.Document doc = Jsoup.connect("http://lotto.mthai.com/lottery/result-3517.html").get();
        org.jsoup.select.Elements e = doc.getElementsByClass("result");
        System.out.println(e.html());
        
        System.out.println("=============================================");
        org.jsoup.nodes.Document docDate2 = Jsoup.connect("http://news.sanook.com/lotto/check/16112559/").get();
        org.jsoup.select.Elements date2 = docDate2.getElementsByClass("content__title--sub");
        System.out.println(date2.html());
        org.jsoup.nodes.Document doc1 = Jsoup.connect("http://lotto.mthai.com/lottery/result-3511.html").get();
        org.jsoup.select.Elements e1 = doc1.getElementsByClass("result");
        System.out.println(e1.html());
        
        System.out.println("=============================================");
        org.jsoup.nodes.Document docDate3 = Jsoup.connect("http://news.sanook.com/lotto/check/01112559/").get();
        org.jsoup.select.Elements date3 = docDate3.getElementsByClass("content__title--sub");
        System.out.println(date3.html());
        org.jsoup.nodes.Document doc2 = Jsoup.connect("http://lotto.mthai.com/lottery/result-3506.html").get();
        org.jsoup.select.Elements e2 = doc2.getElementsByClass("result");
        System.out.println(e2.html());
        
        System.out.println("=============================================");
        org.jsoup.nodes.Document docDate4 = Jsoup.connect("http://news.sanook.com/lotto/check/16102559/").get();
        org.jsoup.select.Elements date4 = docDate4.getElementsByClass("content__title--sub");
        System.out.println(date4.html());
        org.jsoup.nodes.Document doc3 = Jsoup.connect("http://lotto.mthai.com/lottery/result-3496.html").get();
        org.jsoup.select.Elements e3 = doc3.getElementsByClass("result");
        System.out.println(e3.html());

        //lotteryData.add(new LotteryModel(e.html(), e.html(), e.html(), e.html(), e.html(), e.html(), e.html(), e.html(), e.html()));
        lotteryData = new ArrayList<LotteryModel>();
        lotteryData.add(new LotteryModel(date.html(),e.html().substring(0,6),e.html().substring(7,9),e.html().substring(18,25),e.html().substring(10,17),e.html().substring(26,39),e.html().substring(40,74),e.html().substring(75,144),e.html().substring(145,494),e.html().substring(495)));
        lotteryData.add(new LotteryModel(date2.html(),e1.html().substring(0,6),e1.html().substring(7,9),e1.html().substring(18,25),e1.html().substring(10,17),e1.html().substring(26,39),e1.html().substring(40,74),e1.html().substring(75,144),e1.html().substring(145,494),e1.html().substring(495)));
        lotteryData.add(new LotteryModel(date3.html(),e2.html().substring(0,6),e2.html().substring(7,9),e2.html().substring(18,25),e2.html().substring(10,17),e2.html().substring(26,39),e2.html().substring(40,74),e2.html().substring(75,144),e2.html().substring(145,494),e2.html().substring(495)));
        lotteryData.add(new LotteryModel(date4.html(),e3.html().substring(0,6),e3.html().substring(7,9),e3.html().substring(18,25),e3.html().substring(10,17),e3.html().substring(26,39),e3.html().substring(40,74),e3.html().substring(75,144),e3.html().substring(145,494),e3.html().substring(495)));
        return lotteryData;
    }

    public void setLotteryData(List<LotteryModel> lotteryData) {
        this.lotteryData = lotteryData;
    }

//    public LotteryModel getLotteryData() {
//        return lotteryData;
//    }
//
//    public void setLotteryData(LotteryModel lotteryData) {
//        this.lotteryData = lotteryData;
//    }
//    public String getDate() {
//        return date;
//    }
//    public void setDate(String date) {
//        this.date = date;
//    }
}
