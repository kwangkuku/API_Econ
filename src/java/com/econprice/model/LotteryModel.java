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
public class LotteryModel {

    private String datePast;
    private String Prize1;
    private String PrizeEnd2Digit;
    private String PrizeEnd3Digit;
    private String PrizeTop3Digit;
    private String PrizeNear1;
    private String Prize2;
    private String Prize3;
    private String Prize4;
    private String Prize5;

    public LotteryModel( String datePast,String Prize1, String PrizeEnd2Digit, String PrizeEnd3Digit, String PrizeTop3Digit, String PrizeNear1, String Prize2, String Prize3, String Prize4, String Prize5) {
        this.datePast = datePast;
        this.Prize1 = Prize1;
        this.PrizeEnd2Digit = PrizeEnd2Digit;
        this.PrizeEnd3Digit=PrizeEnd3Digit;
        this.PrizeTop3Digit = PrizeTop3Digit;
        this.PrizeNear1= PrizeNear1;
        this.Prize2 = Prize2;
        this.Prize3= Prize3;
        this.Prize4 = Prize4;
        this.Prize5 = Prize5;
    }
//    public LotteryModel(String datePast, String Prize1, String PrizeEnd2Digit) {
//        this.datePast = datePast;
//        this.Prize1 = Prize1;
//        this.PrizeEnd2Digit = PrizeEnd2Digit;
//    }

    public String getDatePast() {
        return datePast;
    }

    public void setDatePast(String datePast) {
        this.datePast = datePast;
    }

    public String getPrize1() {
        return Prize1;
    }

    public void setPrize1(String Prize1) {
        this.Prize1 = Prize1;
    }

    public String getPrizeEnd2Digit() {
        return PrizeEnd2Digit;
    }

    public void setPrizeEnd2Digit(String PrizeEnd2Digit) {
        this.PrizeEnd2Digit = PrizeEnd2Digit;
    }

    public String getPrizeEnd3Digit() {
        return PrizeEnd3Digit;
    }

    public void setPrizeEnd3Digit(String PrizeEnd3Digit) {
        this.PrizeEnd3Digit = PrizeEnd3Digit;
    }

    public String getPrizeTop3Digit() {
        return PrizeTop3Digit;
    }

    public void setPrizeTop3Digit(String PrizeTop3Digit) {
        this.PrizeTop3Digit = PrizeTop3Digit;
    }

    public String getPrizeNear1() {
        return PrizeNear1;
    }

    public void setPrizeNear1(String PrizeNear1) {
        this.PrizeNear1 = PrizeNear1;
    }

    public String getPrize2() {
        return Prize2;
    }

    public void setPrize2(String Prize2) {
        this.Prize2 = Prize2;
    }

    public String getPrize3() {
        return Prize3;
    }

    public void setPrize3(String Prize3) {
        this.Prize3 = Prize3;
    }

    public String getPrize4() {
        return Prize4;
    }

    public void setPrize4(String Prize4) {
        this.Prize4 = Prize4;
    }

    public String getPrize5() {
        return Prize5;
    }

    public void setPrize5(String Prize5) {
        this.Prize5 = Prize5;
    }

}
