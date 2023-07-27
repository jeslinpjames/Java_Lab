/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_13;

import java.util.Scanner;

/**
 *
 * @author jeslinpjames
 */
public class PascalsMain {
    public static void main(String args[]){
        System.out.print("Enter the number of rows required : ");
        Scanner sc = new Scanner(System.in);
        int len = sc .nextInt();
        Pascals obj = new Pascals(len);
        obj.printPascals();
    }
    
}
