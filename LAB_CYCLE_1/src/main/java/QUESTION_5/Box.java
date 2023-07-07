/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_5;

/**
 *
 * @author jeslinpjames
 */
public class Box {
    double length,breadth,height,area,volume;
    public Box(double length, double breadth, double height){
        this.length=length;
        this.breadth=breadth;
        this.height= height;
    }
    public Box(double x){
        this.length=x;
        this.breadth=x;
        this.height= x;
    }
    public Box(double length, double breadth){
        this.length= length;
        this.breadth = breadth;
        this.height = length;
    }
    public void calc_Area(){
        area = 2*(length*breadth+breadth*height+height*length);
    }
    public double get_Area(){
        return area;
    }
    public void print_Area(){
        System.out.println("The area is : "+ area);
    }
    public void calc_Volume(){
        volume = length*breadth*height;
    }
    public double get_Volume(){
        return volume;
    }
    public void print_Volume(){
        System.out.println("The Volume is : "+ volume);
    }
    public void print_Dimensions(){
        System.out.println("The length is : "+length);
        System.out.println("The breadth is : "+ breadth);
        System.out.println("The height is : "+height);
    }
}
