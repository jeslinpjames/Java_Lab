/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package QUESTION_3;

/**
 *
 * @author jeslinpjames
 */
public class StudentMain {
    String name ;
    int roll_no;
    int marks[] = new int[5];
    public static void main(String args[]){
        Student ob1 = new Student();
        Student ob2 = new Student();
        System.out.println("Enter the Details of Student 1 :");
        ob1.input();
        System.out.println("Enter the Details of Student 2 : ");
        ob2.input();
        ob1.calculate_total();
        ob2.calculate_total();
        System.out.println();
        ob1.print_details();
        System.out.println();
        ob2.print_details();        
        
    }
}
