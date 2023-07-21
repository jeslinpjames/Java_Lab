/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_2;

/**
 *
 * @author jeslinpjames
 */
public class DynamicArrayMain {
    public static void main(String args[]){
        DynamicArray obj = new DynamicArray(5);
        obj.acceptArray();
        obj.printArray();
        obj.addElement(10);
        obj.printArray();
        obj.addElement(6, 3);
        obj.printArray();
        obj.removeElement(3);
        obj.printArray();
        obj.searchElement(10);
    }
    
}
