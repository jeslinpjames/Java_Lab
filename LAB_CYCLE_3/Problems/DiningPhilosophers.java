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

public class DiningPhilosophers {
    private static final int NUM_PHILOSOPHERS = 5;
    private static Semaphore[] forks = new Semaphore[NUM_PHILOSOPHERS];

    public static void main(String[] args) {
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new Semaphore(1);
        }

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            final int philosopher = i;
            Thread philosopherThread = new Thread(() -> {
                while (true) {
                    think(philosopher);
                    takeForks(philosopher);
                    eat(philosopher);
                    putForks(philosopher);
                }
            });
            philosopherThread.start();
        }
    }

    private static void think(int philosopher) {
        System.out.println("Philosopher " + philosopher + " is thinking.");
    }

    private static void takeForks(int philosopher) {
        int leftFork = philosopher;
        int rightFork = (philosopher + 1) % NUM_PHILOSOPHERS;

        try {
            forks[leftFork].acquire();
            forks[rightFork].acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void eat(int philosopher) {
        System.out.println("Philosopher " + philosopher + " is eating.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void putForks(int philosopher) {
        int leftFork = philosopher;
        int rightFork = (philosopher + 1) % NUM_PHILOSOPHERS;

        forks[leftFork].release();
        forks[rightFork].release();
    }
}
