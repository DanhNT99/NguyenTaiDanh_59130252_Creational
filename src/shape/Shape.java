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
public abstract class Shape {
     String brush, paper, frame;

    public Shape() {
        brush  = "Bút chì";
        paper = "Giấy A4";
        frame = "Khung";
    }
    public String getBrush() {
        return brush;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    @Override
    public String toString() {
        return "Shape: " +brush + " " + paper + " " + frame;
    }
    
    public abstract String draw();
}
