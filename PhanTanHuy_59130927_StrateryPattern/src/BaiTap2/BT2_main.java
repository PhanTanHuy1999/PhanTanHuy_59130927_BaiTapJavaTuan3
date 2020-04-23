/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Admin
 */
public class BT2_main {

    public static void main(String[] args) {
        
        
        
        GioHang GH1 = new GioHang();
        HangHoa HH1 = new HangHoa();
        HH1.setTenHH("Tiger");
        HH1.setGia(15000);
        HH1.setMoTa("Bia tiger ");
        
        
        HangHoa HH2 = new HangHoa();
        HH2.setTenHH("Sua");
        HH2.setGia(10000);
        HH2.setMoTa("Sua bo tuoi ");
        
        GH1.hh.add(HH1);
        GH1.hh.add(HH2);
        System.out.println("Gio hang 1 :");
        
        
        int tien1 = 0;
        for(int i = 0; i < GH1.hh.size(); i++)
        {
            System.out.println("Mat hang "+i+":[ "+GH1.hh.get(i).toString()+"]");
        }
        for(int i = 0; i < GH1.hh.size(); i++)
        {
            tien1 = tien1 + GH1.hh.get(i).getGia();
        }
        
        
        GH1.hinhthucTT((IThanhToan) new ThanhToanOnline());
        System.out.println("So tien phai tra: "+ GH1.thanhToan(tien1));
        GioHang GH2 = new GioHang();
        HangHoa HH4 = new HangHoa();
        HH4.setTenHH("Yen");
        HH4.setGia(1000000);
        HH4.setMoTa("5 hop yen xao Khanh Hoa");
        
        
        
        
        HangHoa HH5 = new HangHoa();
        HH5.setTenHH("Tra Xanh");
        HH5.setGia(3000000);
        HH5.setMoTa("10 thung Tra Xanh Khong do");
        
        
        GH2.hh.add(HH4);
        GH2.hh.add(HH5);
        System.out.println("Gio hang 2:");
        
        
        int tien2 = 0;
        for(int i = 0; i < GH2.hh.size(); i++)
        {
            System.out.println("Mat hang "+i+":[ "+GH2.hh.get(i).toString()+"]");
        }
        for(int i = 0; i < GH2.hh.size(); i++)
        {
            tien2 = tien2 + GH2.hh.get(i).getGia();
        }
        GH2.hinhthucTT(new ThanhToanCOD());
        System.err.println("So tien phai tra la: "+GH2.thanhToan(tien2));
        
        
    }
    
    
}
