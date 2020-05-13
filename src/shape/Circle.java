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
public class Circle extends Shape{
    
    private static Circle instance;
    public static Circle creatCircle(){
        if(instance == null)
               instance = new Circle();
        return instance;
    }

    @Override
    public String draw() {
        return "Vẽ ông mặt trời";
    }
}
