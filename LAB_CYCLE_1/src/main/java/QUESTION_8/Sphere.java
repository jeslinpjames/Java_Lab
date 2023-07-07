/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_8;

/**
 *
 * @author jeslnpjames
 */
public class Sphere implements ThreeDShapes{
    private double radius, volume, area;
    public Sphere(){}
    public Sphere(double radius){
        this.radius = radius;
        volume =0;
        area =0;
    }
    public void calcArea(){
        area= 4*(22/7)*radius*radius;
    }
    public void calcVolume(){
        volume =(4/3)*(22/7)*radius*radius*radius;
    }
    public double getArea(){
        return area;
    }
    public double getVolume(){
        return volume;
    }
    @Override
    public void printVolume() {
        System.out.println("The Volume of the Sphere is "+volume);
    }

    @Override
    public void printArea() {
        System.out.println("The Area of the Sphere is "+area);
    }   
}
