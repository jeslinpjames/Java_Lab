/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problems;

/**
 *
 * @author jeslin
 */
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BarberShop {
    private static final int N = 5; // Number of chairs in the waiting room
    private static Semaphore customers = new Semaphore(0);
    private static Semaphore barber = new Semaphore(0);
    private static Lock seatsMutex = new ReentrantLock();
    private static int freeSeats = N;

    public static void main(String[] args) {
        Thread barberThread = new Thread(Barber::run);
        Thread[] customerThreads = new Thread[10]; // Adjust the number of customers as needed

        barberThread.start();
        for (int i = 0; i < customerThreads.length; i++) {
            customerThreads[i] = new Thread(Customer::run);
            customerThreads[i].start();
        }
    }

    static class Barber {
        public static void run() {
            while (true) {
                try {
                    // Waits for a customer (sleeps).
                    customers.acquire();

                    // Mutex to protect the number of available seats.
                    seatsMutex.lock();

                    // A chair gets free.
                    freeSeats++;

                    // Bring customer for a haircut.
                    barber.release();

                    // Release the mutex on the chair.
                    seatsMutex.unlock();

                    // Barber is cutting hair.
                    System.out.println("Barber is cutting hair.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Customer {
        public static void run() {
            while (true) {
                try {
                    // Protect seats so only one customer tries to sit in a chair if that's the case.
                    seatsMutex.lock();
                    if (freeSeats > 0) {
                        // Sitting down.
                        freeSeats--;

                        // Notify the barber.
                        customers.release();

                        // Release the lock.
                        seatsMutex.unlock();

                        // Wait in the waiting room if the barber is busy.
                        barber.acquire();
                        // Customer is having hair cut.
                        System.out.println("Customer is having hair cut.");
                    } else {
                        // Release the lock.
                        seatsMutex.unlock();
                        // Customer leaves.
                        System.out.println("Customer leaves.");
                    }
                    Thread.sleep(1000); // Simulate some time between customer arrivals.
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

