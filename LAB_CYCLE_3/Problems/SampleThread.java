/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package THREADS;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeslinpjames
 */
public class SampleThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            try {
                System.out.println("From Thread : "+i);
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(SampleThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    
    
}
