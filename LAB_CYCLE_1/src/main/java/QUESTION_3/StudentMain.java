/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_3;

/**
 *
 * @author jeslinpjames
 */
public class StudentMain {
    public static void main(String args[]){
        Student ob1 = new Student();
        Student ob2 = new Student();
        int mark1[] ={99,78,89,90,95};
        int mark2[] ={89,98,85,81,96};
        ob1.initialize("John", 21,mark1);
        ob2.initialize("Kevin",25,mark2);                
        ob1.calculate_total();
        ob2.calculate_total();
        int tot1 = ob1.getTotal();
        int tot2 = ob2.getTotal();
        if(tot1>tot2){
            ob1.print_details();
        }
        else
            ob2.print_details();
        
    }
    
}
