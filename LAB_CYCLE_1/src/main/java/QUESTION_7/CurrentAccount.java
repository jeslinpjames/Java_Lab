/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_7;

/**
 *
 * @author jeslinpjames
 */
public class CurrentAccount extends Account {
    private static final double Over_percnt=0.05;
    public CurrentAccount(String holder_name, long acc_no, double balance){
        super(holder_name,acc_no,balance);
    }

    @Override
    public void withdrawal(double amount) {
        double overdraftAmount = balance * Over_percnt;
        if (balance - amount >= -overdraftAmount) {
            balance -= amount;
            System.out.println(amount+"Rupees has been withdrawn successfully. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance. You can withdraw up to " + overdraftAmount + " as overdraft.");
        }
    }

    @Override
    public void display() {
        System.out.println("Current Account Details : ");
        System.out.println("Account Holder Name :  "+holder_name);
        System.out.println("Account Number : "+acc_no);
        System.out.println("Account Balance : "+ balance);
    }
}
    

