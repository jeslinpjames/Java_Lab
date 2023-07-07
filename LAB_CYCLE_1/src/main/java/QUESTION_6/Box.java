/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_6;

/**
 *
 * @author jeslinpjames
 */
public class Box extends Rectangle{
    private double height, volume;
    public Box(){}
    public Box(double length, double breadth, double height){
        super(length,breadth);
        this.height = height;               
    }
    public void calc_Volume(){
        volume = length* height * breadth;
    }
    public double get_Volume(){
        return volume;
    }
    public void print_Volume(){
        System.out.println("The Volume is : "+ volume);
    }
}
