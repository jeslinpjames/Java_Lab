/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_4;

import java.util.Scanner;

/**
 *
 * @author jeslinpjames
 */
public class ComplexMain {
    public static void main(String args[]){
        System.out.println("For the first Complex number,");
        Complex c1 = ComplexMain.input();
        System.out.println("For the second Complex number,");
        Complex c2 = ComplexMain.input();
        System.out.print("The Sum of the two Complex numbers is : ");
        Complex sum = ComplexOperations.add(c1, c2);
        sum.print_Complex();
        System.out.print("\nThe Product of the two Complex numbers is : ");
        Complex prod = ComplexOperations.multiply(c1, c2);
        prod.print_Complex();
        System.out.println("\nThe modulus of the first Complex number is : "+ComplexOperations.Modulus(c1));
        System.out.println("The modulus of the second Complex number is : "+ComplexOperations.Modulus(c2));
    }
    public static Complex input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real part : "); 
        float real = sc.nextFloat();
        System.out.print("Enter the imaginary part : ");
        float imag = sc.nextFloat();
        return new Complex(real,imag);
    }
}
