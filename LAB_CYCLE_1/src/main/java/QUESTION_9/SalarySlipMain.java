/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_9;

import java.util.Scanner;

/**
 *
 * @author jeslinpjames
 */
public class SalarySlipMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee Name : ");
        String name = sc.next();
        System.out.print("Enter the Employee Code : ");
        long code = sc.nextLong();
        System.out.print("Enter the Basic Pay : ");
        double basic_pay = sc.nextDouble();
        System.out.print("Enter the Deduction Percentage : ");
        double deduction = sc.nextDouble();
        System.out.print("Enter the Allowances Percentage : ");
        double allowances = sc.nextDouble();
        deduction=deduction/100;
        allowances= allowances/100;
        SalarySlip sal = new SalarySlip(name,code,basic_pay,deduction,allowances);
        sal.calcSalary();
        sal.printSalarySlip();               
    }
}
