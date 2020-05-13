/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapefactory;

import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Triangle;


/**
 *
 * @author Nguyen Tai Danh
 */
public class ShapeFactory {

    public ShapeFactory() {
    }
    public Shape createShape(ShapeType shapetype){
        switch(shapetype){
            case Circle: return Circle.creatCircle();
            case Rectangle: return Rectangle.createRectangle();
            case Triangle : return Triangle.creatTriangle();
        }
        return null;
    }
}
