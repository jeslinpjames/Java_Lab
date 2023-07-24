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
public class EmployeeMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of the Employees : ");
        int count = sc.nextInt();
        EmployeeList lst = new EmployeeList(count);
        lst.getlist();
        lst.sortList();
        System.out.println("EMPLOYEE LIST");
        lst.printList();       
    }
}
