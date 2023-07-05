/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package QUESTION_2;

/**
 *
 * @author jeslinpjames
 */
public class str {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = args[1];
        str ob = new str();
        ob.repeat(s, n);
        
    }
    public void repeat(String s, int n){
        for(int i =0;i<n;i++)
            System.out.println(s);
    }
    
}
