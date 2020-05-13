/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Nguyen Tai Danh
 */
public class Triangle extends Shape{
    private static Triangle instance;
    public static Triangle creatTriangle(){
        if(instance == null)
               instance = new Triangle();
        return instance;
    }
    @Override
    public String draw() {
       return "Vẽ lá cờ hình tam giác";
    }
}
