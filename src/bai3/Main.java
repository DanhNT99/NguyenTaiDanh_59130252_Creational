/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import shape.Shape;
import shapefactory.ShapeFactory;
import shapefactory.ShapeType;

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
            ShapeFactory sf1 = new ShapeFactory();
        Shape Rec = sf1.createShape(ShapeType.Rectangle);
        Shape Tri = sf1.createShape(ShapeType.Triangle);
        Shape Cir = sf1.createShape(ShapeType.Circle);
        
        System.out.println(Rec.draw());
        System.out.println(Tri.draw());
        System.out.println(Cir.draw());
    }
    
}
