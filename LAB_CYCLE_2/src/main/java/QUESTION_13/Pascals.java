/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_13;

/**
 *
 * @author jeslinpjames
 */
public class Pascals {
    private int len;
    public Pascals(){
        len=0;
    }
    public Pascals(int len){
        this.len= len;
    }
    public int factorial(int n){
        int f=1;
        while(n>0){
            f=f*n;
            n=n-1;
        }
        return f;
    }
    public int nCr(int n, int r){
        if (n==0)
            return 1;
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        int ncr =a / (b * c);
        return ncr;
    }
    public void printPascals(){
        int z =len;
        for(int i=0;i<len;i++){
            for (int k =z;k>0;k--)
                System.out.print(" ");
            for(int j=0;j<=i;j++){
                int ncr = nCr(i,j);
                System.out.print(ncr+" ");
            }
            System.out.println();
            z=z-1;
        }
    }
}
