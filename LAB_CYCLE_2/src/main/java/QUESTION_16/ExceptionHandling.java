/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_16;

import java.util.Scanner;

/**
 *
 * @author jeslinpjames
 */
public class ExceptionHandling {
    String input;
    public ExceptionHandling(){
        input="";
    }
    public ExceptionHandling(String input){
        this.input=input;
    }
    public void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input : ");
        input=sc.next();
    }
    public void handleNumberFormatException(){
        try{
            int number =Integer.parseInt(input);
            System.out.println("Succefully parsed the number : "+number);
        }
        catch(NumberFormatException e){
            System.out.println("EXception occured :" +e.getMessage());
        }
    }  
    public void handleNullPointerException(){
        try{
            String str =null;
            int length =str.length();
            System.out.println("String Length = " +length);
        }catch(NullPointerException e){
            System.out.println("NullPointer Exeption : "+e.getMessage());
        }
    }
}
