/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

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
        MyStringBuilder myString = new MyStringBuilder("Tài Danh")
                .addString("22 tuổi Nặng")
                .addFloat(68)
                .addBool(true);
        System.err.println(myString.toString());
    }
    
}
