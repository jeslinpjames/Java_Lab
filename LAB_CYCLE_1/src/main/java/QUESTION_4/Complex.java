/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_4;

/**
 *
 * @author jeslinpjames
 */
public class Complex {
    float real, imaginary;
    public Complex(){
        real =0.0;
        imaginary = 0.0;
    }
    public Complex(float real,float imaginary){
        this.real = real;
        this.imaginary = imaginary;       
    }
    public Complex(float a){
        this.real = a;
        this.imaginary = a;
    }
    public void initialize(float real, float imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public void print_Complex(){
        if(imaginary>0)
            System.out.println(real+" + "+imaginary+"i ");
        else
            System.out.println(real+" "+imaginary+"i ");
    }
}
