/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package THREADS;

/**
 *
 * @author jeslinpjames
 */
public class MultiProgramming {
    public static void main(String args[]) throws InterruptedException{
        SampleThread t = new SampleThread();
        t.start();
        t.setPriority(Thread.MAX_PRIORITY);
        
        RunnableThread ob = new RunnableThread();
        Thread tr = new Thread(ob);
        tr.start();
        tr.setPriority(Thread.MIN_PRIORITY);
        
        for(int i=0;i<100;i++){
            System.out.println("From Main : "+i);
            Thread.sleep(10);
        }
        
    }
    
}
