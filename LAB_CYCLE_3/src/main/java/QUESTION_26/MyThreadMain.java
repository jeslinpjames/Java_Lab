/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_26;

/**
 *
 * @author jeslin
 */
public class MyThreadMain {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread thread1 = new Thread((Runnable) new MyThread(resource, "Thread 1"));
        Thread thread2 = new Thread((Runnable) new MyThread(resource, "Thread 2"));

        thread1.start();
        thread2.start();
    }
}

