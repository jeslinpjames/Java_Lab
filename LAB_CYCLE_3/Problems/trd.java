/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package THREADS;

/**
 *
 * @author jeslin
 */
public class trd implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i+1);
            try{
            Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Exception: "+e.getMessage());
            }
        }
    }
    
}
