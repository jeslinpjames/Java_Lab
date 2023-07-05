/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeslinpjames
 */
public class Prime {
    public static void main(String args[]){
       int n = Integer.parseInt(args[0]);
       Prime ob = new Prime();
       boolean b = ob.check_prime(n);
       int count =0;
       int i = 1;
       System.out.print("The First "+n+" prime numbers are : ");
       while(count<n){
           boolean ch = ob.check_prime(i);
           if(ch){
               count++;
	       System.out.print(i+" ");
           }
           i++;
       }       
       System.out.println();
    }
    public boolean check_prime(int no){
        int c =0;
        boolean b = false;
        for(int i =1;i<=no/2;i++){
            if (no%i==0)
                c++;
        }
        if (c==1)
            b = true;
        return b;
    }
}
