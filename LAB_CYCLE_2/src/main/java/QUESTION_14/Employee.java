/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_14;

import java.util.Scanner;

/**
 *
 * @author jeslinpjames
 */
public class Employee {
    private long EmployeeID;
    private String EmployeeName;
    private double salary;
    private DateOfBirth DOB = new DateOfBirth();
    private DateOfJoining DOJ = new DateOfJoining();
    public Employee(){
       EmployeeID = 0;
       EmployeeName = "";
       salary =0.0;
    }
    public Employee(long EmployeeID,String EmployeeName, double salary){
        this.EmployeeID =EmployeeID;
        this.EmployeeName = EmployeeName;
        this.salary =salary;
    }
    static class DateOfBirth{
        private int day , month, year;
        public DateOfBirth(){
            day =0;
            month =0;
            year = 0;
        }
        public DateOfBirth(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public void getDOB(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the birth Day : ");
            day = sc.nextInt();
            System.out.print("Enter the birth Month : ");
            month = sc.nextInt();
            System.out.print("Enter the birth Year : ");
            year =sc.nextInt();            
        }
        public void printDOB(){
            System.out.println("Birth Date : "+day+"/"+month+"/"+year);
        }
    }
    static class DateOfJoining{
        private int day , month, year;
        public DateOfJoining(){
            day =0;
            month =0;
            year = 0;
        }
        public DateOfJoining(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public void getDOJ(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Joining Day : ");
            day = sc.nextInt();
            System.out.print("Enter the Joining Month : ");
            month = sc.nextInt();
            System.out.print("Enter the Joining Year : ");
            year =sc.nextInt();            
        }
        public void printDOJ(){
            System.out.println("Joining Date : "+day+"/"+month+"/"+year);
        }
    }
    public double getSalary(){
        return salary;
    }
    public void acceptDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee Name : ");
        EmployeeName = sc.nextLine();
        System.out.print("Enter the Employee ID : ");
        EmployeeID = sc.nextInt();
        System.out.print("Enter Employee salary : ");
        salary = sc.nextDouble();
        System.out.println("For the Employee ");
        DOB.getDOB();
        System.out.println("For the Employee ");
        DOJ.getDOJ();       
    }
    public void displayDetails(){
        System.out.println("Employee Name : "+EmployeeName);
        System.out.println("Employee ID :"+EmployeeID);
        System.out.println("Employee Salary : "+salary);
        DOB.printDOB();
        DOJ.printDOJ();
        System.out.println();
        
    }   
}
