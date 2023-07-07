/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_7;

import java.util.Scanner;

/**
 *
 * @author jeslinpjames
 */
public class AccountMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to Create a Current Account, ");
        System.out.println("Enter 2 to Create a Savings Account, ");
        System.out.print("Please Enter your Choice : ");
        int choice = sc.nextInt();
        System.out.print("Enter Account Holder Name : ");
        String holder_name = sc.next();
        System.out.print("Enter Accout Number  : ");
        long acc_no = sc.nextLong();
        System.out.print("Enter initial balance : ");
        double balance = sc.nextDouble();
        Account acc ;
        if(choice ==1){
            acc= new CurrentAccount(holder_name,acc_no,balance);
        }
        else
            acc= new Savings_Account(holder_name,acc_no,balance);
        System.out.println("Account has been created...");
        int flag =0;
        do{
            System.out.println("Enter 1 to Deposit money");
            System.out.println("2 to Withdraw money");
            System.out.println("3 to Display Account Details ");
            System.out.println("4 to Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                    System.out.print("Enter the amount to be Deposited : ");
                    double amount = sc.nextDouble();
                    acc.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount to be Withdrawn : ");
                    double amt = sc.nextDouble();
                    acc.withdrawal(amt);
                    break;
                case 3:
                    acc.display();
                    break;
                case 4:
                    flag++;
                default :System.out.println("Wrong Choice! Try again.");
            }         
        }while(flag==0);
    }
}
