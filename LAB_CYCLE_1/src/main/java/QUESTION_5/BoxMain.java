/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_5;

import java.util.Scanner;

/**
 *
 * @author jeslinpjames
 */
public class BoxMain {
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side for a cube : ");
        double side = sc.nextDouble();
        Box cube = new Box(side);
        cube.calc_Area();
        cube.calc_Volume();
        System.out.println("\nFor the Cube,  ");
        cube.print_Dimensions();
        cube.print_Area();
        cube.print_Volume();
        System.out.print("Enter the length of the Square Prism : ");
        double l1 = sc.nextDouble();
        System.out.print("\nEnter the breadth of the Square Prism : ");
        double b1 = sc.nextDouble();
        Box squareprism = new Box(l1,b1);
        squareprism.calc_Area();
        squareprism.calc_Volume();
        System.out.println("For the Square Prism, ");
        squareprism.print_Dimensions();
        squareprism.print_Area();
        squareprism.print_Volume();
        System.out.print("Enter the length of the Rectangular Prism : ");
        double l2 = sc.nextDouble();
        System.out.print("\nEnter the breadth of the Rectangular Prism : ");
        double b2 = sc.nextDouble();        
        System.out.print("\nEnter the height of the Rectangular Prism : ");
        double h2 = sc.nextDouble();
        Box rectprism = new Box(l2,b2,h2);
        rectprism.calc_Area();
        rectprism.calc_Volume();
        System.out.println("For the Rectangular Prism, ");
        rectprism.print_Dimensions();
        rectprism.print_Area();
        rectprism.print_Volume();
    }
    
}
