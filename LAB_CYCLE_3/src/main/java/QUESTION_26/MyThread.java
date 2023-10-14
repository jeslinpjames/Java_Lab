/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_26;

/**
 *
 * @author jeslin
 */
public class MyThread implements Runnable {
    private SharedResource ob;
    private String threadName;
    public MyThread(SharedResource ob, String threadName){
        this.threadName=threadName;
        this.ob=ob;
    }
    public void run(){
      for (int i = 0; i < 3; i++) {
            ob.updateSharedValue(threadName);
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
