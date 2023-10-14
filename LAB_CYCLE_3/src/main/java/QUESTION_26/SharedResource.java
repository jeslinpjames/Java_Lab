/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_26;

/**
 *
 * @author jeslin
 */
public class SharedResource {
    int sharedValue=0;
    public synchronized void updateSharedValue(String threadName){
        System.out.println(threadName+" is updating the shared value.");
        sharedValue++;
        System.out.println(threadName +" has updated the shared value to : "+sharedValue);
    }
}
