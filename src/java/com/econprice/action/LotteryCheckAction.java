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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Whankung
 */
public class LotteryCheckAction extends ActionSupport{
    private static final long serialVersionUID = 1L;
    private LotteryCheckModel checkLottery = new LotteryCheckModel();

    public LotteryCheckModel getCheckLottery() {
        return checkLottery;
    }

    public void setCheckLottery(LotteryCheckModel checkLottery) {
        this.checkLottery = checkLottery;
    }
    
   @Override
    public String execute() {
        System.out.print("");
        return "SUCCESS";
    }  
}

