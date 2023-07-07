/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_8;

/**
 *
 * @author jeslinpjames
 */
public class Cylinder implements ThreeDShapes{
    private double radius,height,area,volume;
    public Cylinder(double radius,double height){
        this.radius=radius;
        this.height= height;
        this.area=0;
        this.volume=0;
    }
    public Cylinder(){}
    public Cylinder(double x){
        this.radius =x;
        this.height= x;
        this.area=0;
        this.volume=0;
    }
    public void calcArea(){
        area=(2*(22/7)*radius*radius)+2*(22/7)*radius*height;
    }
    public double getArea(){
        return area;
    }
    public void calcVolume(){
        volume =(22/7)*radius*radius*height;
    }
    public double getVolmue(){
        return volume;
    }
    @Override
    public void printVolume() {
        System.out.println("The Volume of the Cylinder is : "+ volume);
    }

    @Override
    public void printArea() {
        System.out.println("The Area of the Cylinder is : "+area);
    }  
}
