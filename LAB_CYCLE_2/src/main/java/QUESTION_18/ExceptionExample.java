/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_18;

import java.util.Scanner;

/**
 *
 * @author jeslinpjames
 */
public class ExceptionExample {
    public static void main(String args[]){
        try{
            System.out.print("Enter a Number : ");
            Scanner sc = new Scanner(System.in);
            int number =sc.nextInt();
            if (number<0){
                throw new NegativeNumberException("Negative Numbers are not allowed!");
            }else{
                System.out.println("The Number is : "+number);
            }
        }catch(NegativeNumberException ex){
            System.out.println("Exception Caught : "+ex.getMessage());
        }
    }
}
