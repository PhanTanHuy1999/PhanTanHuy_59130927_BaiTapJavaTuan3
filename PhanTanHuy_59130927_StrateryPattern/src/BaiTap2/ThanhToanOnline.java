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
public class ThanhToanOnline implements IThanhToan{

    private int TienHang;

    

    public double ThanhToan(int TiengHang) {
        if(TienHang < 1000000)
        {
            return TienHang - TienHang*0.05 ;
        }else return TienHang - TienHang*0.07;
    }

    @Override
    public double thanhToan(int TienHang) {
        return TienHang;
    }
    

   
}
