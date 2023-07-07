/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_6;

/**
 *
 * @author jeslinpjames
 */
public class Rectangle {
    protected double length, breadth, area;
    public Rectangle(double x){
        this.length=x;
        this.breadth=x;
    }
    public Rectangle(){}
    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth = breadth;
    }
    public void calc_Area(){
        area = length*breadth;
    }
    public double get_Area(){
        return area;    
    }
    public void print_Area(){
        System.out.println("The Area is : "+ area);
    }
}