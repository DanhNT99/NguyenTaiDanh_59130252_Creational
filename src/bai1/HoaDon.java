/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Tai Danh
 */
public class HoaDon {
    HoaDonHeader hdHeader;
    List<CTHD> listCTHD = new ArrayList<>();
    protected HoaDon(hoaDonBuilder builder){
        this.hdHeader = builder.hdHeader;
        this.listCTHD = builder.listCTHD;
    }
    @Override
    public String toString() {
        return "HoaDon:" + "\nhdHeader: " + hdHeader + ", \nlistCTHD: " + listCTHD.toString();
    }
    
    public static class hoaDonBuilder{
        HoaDonHeader hdHeader;
        List<CTHD> listCTHD = new ArrayList<>();
        public hoaDonBuilder addHeader(HoaDonHeader hdHeader){
            this.hdHeader = hdHeader;
            return this;
        }
        public hoaDonBuilder addCTHD(CTHD cthd){
            this.listCTHD.add(cthd);
            return this;
        }
        public HoaDon builder(){
            return new HoaDon(this);
        }
    }
}
