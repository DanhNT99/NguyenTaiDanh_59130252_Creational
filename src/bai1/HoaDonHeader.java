/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Nguyen Tai Danh
 */
public class HoaDonHeader {
    String maHoaDon, ngayBan, tenKH;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String maHoaDon, String ngayBan, String tenKH) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "maHoaDon= " + maHoaDon + ", ngayBan= " + ngayBan + ", tenKH= " + tenKH;
    }
    
}
