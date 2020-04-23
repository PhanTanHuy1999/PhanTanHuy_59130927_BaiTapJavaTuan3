/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class GioHang {
    IThanhToan thanhToan;
    ArrayList<HangHoa> hh = new ArrayList<>();
    public GioHang() {
    }
    

    public void hinhthucTT(IThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }
    public double thanhToan(int tienHang)
    {
        return thanhToan.thanhToan(tienHang);
    }
}