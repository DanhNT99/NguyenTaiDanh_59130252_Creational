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
public class CTHD {
    String sanPhan;
    int soLuong;
    double donGia;
    int chietKhau;
    public CTHD() {
    }

    public CTHD(String sanPhan, int soLuong, double donGia, int chietKhau) {
        this.sanPhan = sanPhan;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public String getSanPhan() {
        return sanPhan;
    }

    public void setSanPhan(String sanPhan) {
        this.sanPhan = sanPhan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(int chietKhau) {
        this.chietKhau = chietKhau;
    }
    

    @Override
    public String toString() {
        return "sanPhan= " + sanPhan + ", soLuong= " + soLuong + ", donGia= " + donGia + ", chietKhau= " + chietKhau;
    }
    
}
