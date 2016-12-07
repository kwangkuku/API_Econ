/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econprice.action;

import com.econprice.model.OilExcelModel;
import com.econprice.model.OilModel;
import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author Acer
 */
public class OilExcelAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private List<OilExcelModel> oilExcelData;

    @Override
    public String execute() throws IOException {

        return "SUCCESS";
    }

    public List<OilExcelModel> getOilExcelData() throws IOException {
        try {
            String fileName = "C:\\Users\\Acer\\Documents\\retail-2016-11-09.xls";
            Workbook workbook = Workbook.getWorkbook(new File(fileName));

            Sheet ws = workbook.getSheet(0);

            Cell cell;

            oilExcelData = new ArrayList<OilExcelModel>();

            cell = ws.getCell(1, 11); //PTT
            System.out.println("ปั๊มน้ำมัน : " + cell.getContents());

//            cell = ws.getCell(0, 17); //เบนซิล
//            System.out.println(" " + cell.getContents());
            cell = ws.getCell(1, 17);
            System.out.println("    เบนซิล 95 : " + cell.getContents());

            cell = ws.getCell(1, 13);
            System.out.println("    โซฮอล์ 95 : " + cell.getContents());

            cell = ws.getCell(1, 16);
            System.out.println("    โซฮอล์ 91 : " + cell.getContents());

            cell = ws.getCell(1, 14);
            System.out.println("    E20 : " + cell.getContents());

            cell = ws.getCell(1, 15);
            System.out.println("    E85 : " + cell.getContents());

            cell = ws.getCell(1, 18);
            System.out.println("    ดีเซล : " + cell.getContents());
            System.out.println("--------------------------------------");

            cell = ws.getCell(2, 11); //BANGCHAK
            System.out.println("ปั๊มน้ำมัน : " + cell.getContents());

            cell = ws.getCell(2, 17);
            System.out.println("    เบนซิล 95 : " + cell.getContents());

            cell = ws.getCell(2, 13);
            System.out.println("    โซฮอล์ 95 : " + cell.getContents());

            cell = ws.getCell(2, 16);
            System.out.println("    โซฮอล์ 91 : " + cell.getContents());

            cell = ws.getCell(2, 14);
            System.out.println("    E20 : " + cell.getContents());

            cell = ws.getCell(2, 15);
            System.out.println("    E85 : " + cell.getContents());

            cell = ws.getCell(2, 18);
            System.out.println("    ดีเซล : " + cell.getContents());
            System.out.println("--------------------------------------");

            cell = ws.getCell(3, 11); //SHELL
            System.out.println("ปั๊มน้ำมัน : " + cell.getContents());

            cell = ws.getCell(3, 17);
            System.out.println("    เบนซิล 95 : " + cell.getContents());

            cell = ws.getCell(3, 13);
            System.out.println("    โซฮอล์ 95 : " + cell.getContents());

            cell = ws.getCell(3, 16);
            System.out.println("    โซฮอล์ 91 : " + cell.getContents());

            cell = ws.getCell(3, 14);
            System.out.println("    E20 : " + cell.getContents());

            cell = ws.getCell(3, 15);
            System.out.println("    E85 : " + cell.getContents());

            cell = ws.getCell(3, 18);
            System.out.println("    ดีเซล : " + cell.getContents());
            System.out.println("--------------------------------------");

            cell = ws.getCell(4, 11); //ESSO
            System.out.println("ปั๊มน้ำมัน : " + cell.getContents());

            cell = ws.getCell(4, 17);
            System.out.println("    เบนซิล 95 : " + cell.getContents());

            cell = ws.getCell(4, 13);
            System.out.println("    โซฮอล์ 95 : " + cell.getContents());

            cell = ws.getCell(4, 16);
            System.out.println("    โซฮอล์ 91 : " + cell.getContents());

            cell = ws.getCell(4, 14);
            System.out.println("    E20 : " + cell.getContents());

            cell = ws.getCell(4, 15);
            System.out.println("    E85 : " + cell.getContents());

            cell = ws.getCell(4, 18);
            System.out.println("    ดีเซล : " + cell.getContents());

//PTT
            oilExcelData.add(new OilExcelModel(" " + ws.getCell(1, 11).getContents(),
                    " " + ws.getCell(0, 17).getContents(),
                    " " + ws.getCell(1, 17).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(1, 11).getContents(),
                    " " + ws.getCell(0, 13).getContents(),
                    " " + ws.getCell(1, 13).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(1, 11).getContents(),
                    " " + ws.getCell(0, 16).getContents(),
                    " " + ws.getCell(1, 16).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(1, 11).getContents(),
                    " " + ws.getCell(0, 14).getContents(),
                    " " + ws.getCell(1, 14).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(1, 11).getContents(),
                    " " + ws.getCell(0, 15).getContents(),
                    " " + ws.getCell(1, 15).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(1, 11).getContents(),
                    " " + ws.getCell(0, 18).getContents(),
                    " " + ws.getCell(1, 18).getContents()));

//BANGCHAK
            oilExcelData.add(new OilExcelModel(" " + ws.getCell(2, 11).getContents(),
                    " " + ws.getCell(0, 17).getContents(),
                    " " + ws.getCell(2, 17).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(2, 11).getContents(),
                    " " + ws.getCell(0, 13).getContents(),
                    " " + ws.getCell(2, 13).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(2, 11).getContents(),
                    " " + ws.getCell(0, 16).getContents(),
                    " " + ws.getCell(2, 16).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(2, 11).getContents(),
                    " " + ws.getCell(0, 14).getContents(),
                    " " + ws.getCell(2, 14).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(2, 11).getContents(),
                    " " + ws.getCell(0, 15).getContents(),
                    " " + ws.getCell(2, 15).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(2, 11).getContents(),
                    " " + ws.getCell(0, 18).getContents(),
                    " " + ws.getCell(2, 18).getContents()));

//SHELL
            oilExcelData.add(new OilExcelModel(" " + ws.getCell(3, 11).getContents(),
                    " " + ws.getCell(0, 17).getContents(),
                    " " + ws.getCell(3, 17).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(3, 11).getContents(),
                    " " + ws.getCell(0, 13).getContents(),
                    " " + ws.getCell(3, 13).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(3, 11).getContents(),
                    " " + ws.getCell(0, 16).getContents(),
                    " " + ws.getCell(3, 16).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(3, 11).getContents(),
                    " " + ws.getCell(0, 14).getContents(),
                    " " + ws.getCell(3, 14).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(3, 11).getContents(),
                    " " + ws.getCell(0, 15).getContents(),
                    " " + ws.getCell(3, 15).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(3, 11).getContents(),
                    " " + ws.getCell(0, 18).getContents(),
                    " " + ws.getCell(3, 18).getContents()));

//ESSO
            oilExcelData.add(new OilExcelModel(" " + ws.getCell(4, 11).getContents(),
                    " " + ws.getCell(0, 17).getContents(),
                    " " + ws.getCell(4, 17).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(4, 11).getContents(),
                    " " + ws.getCell(0, 13).getContents(),
                    " " + ws.getCell(4, 13).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(4, 11).getContents(),
                    " " + ws.getCell(0, 16).getContents(),
                    " " + ws.getCell(4, 16).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(4, 11).getContents(),
                    " " + ws.getCell(0, 14).getContents(),
                    " " + ws.getCell(4, 14).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(4, 11).getContents(),
                    " " + ws.getCell(0, 15).getContents(),
                    " " + ws.getCell(4, 15).getContents()));

            oilExcelData.add(new OilExcelModel(" " + ws.getCell(4, 11).getContents(),
                    " " + ws.getCell(0, 18).getContents(),
                    " " + ws.getCell(4, 18).getContents()));
            workbook.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return oilExcelData;
    }

    public void setOilExcelData(List<OilExcelModel> oilExcelData) {
        this.oilExcelData = oilExcelData;
    }

}
