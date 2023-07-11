/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_Work.program_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jeslinpjames
 */
public class Student {
    private String name;
    private int roll_no;
    private double marks []= new double [3];
    private double total_marks;
    public Student(String name, int roll_no){
        this.name =name;
        this.roll_no =roll_no;
    }
    public Student() {
    // Default constructor
    this.name = "";
    this.roll_no = 0;
    this.marks = new double[3];
    this.total_marks = 0.0;
    }
    public Student(Student other) {
    this.name = other.name;
    this.roll_no = other.roll_no;
    this.marks = Arrays.copyOf(other.marks, other.marks.length);
    this.total_marks = other.total_marks;
    }
    public Student(String name, int roll_no, double marks[]){
        this.name=name;
        this.roll_no= roll_no;
        this.marks = marks;
    }
    public void Accept_details(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        name = sc.next();
        System.out.print("Enter the Roll number :");
        roll_no=sc.nextInt();
        for(int i =0;i<3;i++){
            System.out.print("Enter the marks of subject "+(i+1)+" : ");
            marks[i]=sc.nextDouble();
        }
    }
    public void compute_total(){
        for(int i=0;i<3;i++){
            total_marks+=marks[i];
        }
    }
    public double get_total(){
        return total_marks;
    }
    public void Print_details(){
        System.out.println("Name : "+name+" Roll No : "+roll_no+" Total Marks : "+total_marks);
    }
    
}
