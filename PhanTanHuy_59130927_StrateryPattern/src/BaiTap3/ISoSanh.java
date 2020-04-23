/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Admin
 */
public interface ISoSanh {
    public int soSanh(T o1, T o2);

    public int soSanh(SinhVien sv1, SinhVien sv2);

    public static class T {

        public T() {
        }
    }
    
}
