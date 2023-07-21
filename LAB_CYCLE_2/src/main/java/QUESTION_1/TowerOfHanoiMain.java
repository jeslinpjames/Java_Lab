/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_1;

import java.util.Scanner;

/**
 *
 * @author jeslinpjames
 */
public class TowerOfHanoiMain {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of Disks : ");
        int n =sc.nextInt();
        TowerOfHanoi tower = new TowerOfHanoi(n);
        tower.solve();        
    }
    
}
