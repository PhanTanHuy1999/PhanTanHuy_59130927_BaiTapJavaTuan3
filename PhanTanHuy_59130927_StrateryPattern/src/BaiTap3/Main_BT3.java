/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Main_BT3 {

   public static void main(String[] args) throws ParseException {
        //  Định dạng kiểu Date
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        
        
        
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        dsSV.add(new SinhVien("Võ Thành Luân", dateFormat.parse("05-03-1999"), 9));
        dsSV.add(new SinhVien("Lương Tan Thi", dateFormat.parse("15-06-1999"), 7));
        dsSV.add(new SinhVien("Huynh Nhat Thanh", dateFormat.parse("22-09-1999"), 8));
        dsSV.add(new SinhVien("Tran Quang Nghia", dateFormat.parse("16-11-1999"), 10));
        
        QLSV qlsv = new QLSV();
        qlsv.setDsSV(dsSV);
        
        System.out.println("Chưa dược xắp xếp");
        qlsv.inDS();
        
        qlsv.setSoSanh((ISoSanh) new SSTheoDiem());
        qlsv.sapXep();
        System.out.println("So Sánh Theo Diểm");
        qlsv.inDS();
        
        qlsv.setSoSanh((ISoSanh) new SSTheoTen());
        qlsv.sapXep();
        System.out.println("So Sáng The Ten");
        qlsv.inDS();
    }
   }
    

