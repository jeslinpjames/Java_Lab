/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_2;

import java.util.Scanner;

/**
 *
 * @author jeslinpjames
 */
public class DynamicArray {
    private int[] Arr;
    private int length;
    public DynamicArray()
    {
        this.length = 0;
        Arr = new int[length];
    }
    public DynamicArray(int length){
        this.length = length;
        Arr = new int [length];
    }
    public void acceptArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter "+length+" elements of the array : ");
        for(int i=0;i<length;i++){
            Arr[i]=sc.nextInt();
        }
    }
    public void printArray(){
        System.out.print("The array is : ");
        for(int i =0;i<length;i++)
            System.out.print(Arr[i]+" ");
        System.out.println();            
    }
    public void addElement(int Element){
        int[] newArr= new int[length+1];
        for(int i=0;i<length;i++)
            newArr[i]=Arr[i];
        newArr[length]=Element;
        Arr = newArr;
        length++;
    }
    public void addElement(int Element, int pos){
        int [] newArr = new int[length+1];
        for(int i=0;i<pos;i++)
            newArr[i]=Arr[i];
        newArr[pos]= Element;
        for (int i = pos+1;i<=length;i++)
            newArr[i]=Arr[i-1];
        Arr= newArr;
        length++;
    }
    public void removeElement(int Element){
        int i=0,f=0;
        for (i =0;i<length;i++)
        {
            if (Arr[i]==Element){
                f=1;
                break;
            }
        }
        if(f==1){
            for(int j=i;j<length-1;j++)
            {
                Arr[j]=Arr[j+1];
            }
        }
        else
            System.out.println("The Element is not present.");        
    }
    public void searchElement(int target){
        int f=0;
        int left = 0;
        int right = length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = Arr[mid];

            if (midElement == target) {     
                f=1;
                break;
            } else if (midElement < target) {
                left = mid + 1; 
            } else {
                right = mid - 1;
            }
        }
        if(f==1)
            System.out.println("The Element is present in the Array.");
        else
            System.out.println("The ELement is not present in the Array.");
    }
}
