/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package THREADS;

/**
 *
 * @author jeslin
 */
public class trdMain {
    public static void main(String[] args) {
        trd ta = new trd();
        trd tb= new trd();
        Thread t1 = new Thread(ta);
        Thread t2 = new Thread(tb);
        t1.start();        
        t2.start();
                
    }
}
