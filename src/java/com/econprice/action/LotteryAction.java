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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Whankung
 */
public class LotteryAction extends ActionSupport {

    private static final long serialVersionUID = 1L; 
    private LotteryModel lotteryData = new LotteryModel();


   

    public LotteryModel getLotteryData() {
        return lotteryData;
    }

    public void setLotteryData(LotteryModel lotteryData) {
        this.lotteryData = lotteryData;
    }

    @Override
    public String execute() {
        System.out.print("");
        return "SUCCESS";
    }
}

