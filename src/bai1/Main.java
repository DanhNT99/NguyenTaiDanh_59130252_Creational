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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         HoaDon hd1 = new HoaDon.hoaDonBuilder()
            .addHeader(new HoaDonHeader("01","15/07/1999","Nguyễn Tài Danh"))
            .addCTHD(new CTHD("Iphone11",1, 1500000,10 ))
            .addCTHD(new CTHD("Iphone6",2, 5000000,15 ))
            .addCTHD(new CTHD("Iphone5",1, 3000000,5 ))
            .builder();
            System.err.println(hd1.toString());
    }
    
}
