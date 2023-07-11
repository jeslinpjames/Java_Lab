/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_Work.program_1;

import Class_Work.program_1.Student;
import java.util.Scanner;

/**
 *
 * @author jeslinpjames
 */
public class StudentMain {
    public static void main(String args[]) {
        System.out.print("Enter the total number of students: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student ob[] = new Student[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of Student " + (i + 1) + ":");
            ob[i] = new Student();
            ob[i].Accept_details();
            ob[i].compute_total();
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ob[j].get_total() > ob[i].get_total()) {
                    Student temp = ob[j];
                    ob[j] = ob[i];
                    ob[i] = temp;
                }
            }
        }
        
        System.out.println("Results:");
        for (int i = 0; i < n; i++) {
            ob[i].Print_details();
            System.out.println();
        }
    }
}
