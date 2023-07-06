/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package QUESTION_3;
import java.util.*;

/**
 *
 * @author jeslinpjames
 */
public class Student {
    private String name;
    private int roll_no;
    private int marks []= new int[5];
    private int total;

    public Student() {
        this.name = " ";
        this.roll_no = 0;
        this.total = 0 ;
        for(int i=0;i<5;i++)
            marks[i] =0 ;
    }
    public void initialize(String name, int roll_no,int marks[]){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;       
    }
    public void calculate_total(){
        for(int i=0;i<5;i++)
            total += marks[i];
    }
    public int getTotal(){
        return total;
    }
    public void print_details(){
        System.out.println("Name :"+ name);
        System.out.println("Roll No : "+roll_no);
        System.out.println("--------------------------------------");
        for(int i=0;i<5;i++)
            System.out.println("Mark of subject "+(i+1)+"is : "+marks[i]);
        System.out.println("--------------------------------------");
        System.out.println("Total Marks = "+ total);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the student : ");
        name = sc.nextLine();
        System.out.print("Enter the roll number of the student : ");
        roll_no = sc.nextInt();
        for(int i=0;i<5;i++){
            System.out.print("Enter the mark of subject "+(i+1)+" : ");
            marks[i]=sc.nextInt();
        }
    }
    
    
    
}
