/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_9;

/**
 *
 * @author jeslnpjames
 */
public class SalarySlip extends Employee implements Salary{
    private double Salary;
    private double deductions = 0.04;        
    private double allowances = 0.15;
    public SalarySlip(){}
    public SalarySlip(String name, long code, double basic_pay,double deductions , double allowances){
        super(name,code,basic_pay);
        this.allowances=allowances;
        this.deductions= deductions;
    }
    public double getSalary(){
        return Salary;
    }
    public void printSalary(){
        System.out.println("The Salary is "+ Salary);
    }
    @Override
    public void calcSalary() {

        Salary = basic_pay + (allowances*basic_pay)-(deductions*basic_pay);
    }
    public void printSalarySlip(){
        System.out.println("------------Salary Slip----------");
        System.out.println("Employee name : "+name);
        System.out.println("Employee Code : "+code);
        System.out.println("Basic Pay : "+basic_pay);
        System.out.println("Net Salary : "+Salary);
        System.out.println("----------------------------------");
    }
    
}
