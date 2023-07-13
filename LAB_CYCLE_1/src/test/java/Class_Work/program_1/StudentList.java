/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_Work.program_1;

import java.util.Scanner;

/**
 *
 * @author jeslinpjames
 */
public class StudentList {       
    private Student ob[];
    private int n;
    public void input(){
        System.out.print("Enter the total number of students: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ob = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of Student " + (i + 1) + ":");
            ob[i] = new Student();
            ob[i].Accept_details();
            ob[i].compute_total();
        }
    }
    public void sort(){    
    for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ob[j].get_total() < ob[i].get_total()) {
                    Student temp = ob[j];
                    ob[j] = ob[i];
                    ob[i] = temp;
                }
            }
        }
    }
    public void print_List(){        
        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            ob[i].Print_details();
            System.out.println();
        }
    }
}

