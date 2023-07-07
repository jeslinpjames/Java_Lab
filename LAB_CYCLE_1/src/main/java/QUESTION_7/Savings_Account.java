/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_7;

/**
 *
 * @author jeslinpjames
 */
public class Savings_Account extends Account{
    private static final double Min_balance = 1000;
    public Savings_Account(String holder_name, long acc_no, double balance){
        super(holder_name,acc_no,balance);
    }

    @Override
    public void withdrawal(double amount) {
        if(balance-amount>=Min_balance){
            balance -= amount;
            System.out.println(amount+" Rupees has been withdrawn, new balance is : "+balance+" Rupees");
        }
        else{
            System.out.println("Insufficient Balance.Minimum Balance should be maintained!");
        }
    }

    @Override
    public void display() {
        System.out.println("Savings Account Details : ");
        System.out.println("Account Holder Name :  "+holder_name);
        System.out.println("Account Number : "+acc_no);
        System.out.println("Account Balance : "+ balance);
    }
    
}
