/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problems;

/**
 *
 * @author jeslin
 */
import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    public static void main(String[] args) {
        final PC pc = new PC();
        Thread producerThread = new Thread(() -> {
            while (true) {
                pc.produce();
            }
        });

        Thread consumerThread = new Thread(() -> {
            while (true) {
                pc.consume();
            }
        });

        producerThread.start();
        consumerThread.start();
    }

    static class PC {
        private final Queue<Integer> buffer = new LinkedList<>();
        private final int capacity = 2;

        public void produce() {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int item = (int) (Math.random() * 100);
                buffer.offer(item);
                System.out.println("Produced: " + item);
                notify();
            }
        }

        public void consume() {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int item = buffer.poll();
                System.out.println("Consumed: " + item);
                notify();
            }
        }
    }
}
