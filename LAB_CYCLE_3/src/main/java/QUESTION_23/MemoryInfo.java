/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_23;

/**
 *
 * @author jeslin
 */
public class MemoryInfo {
    public static void main(String[] args) {
        // Get the runtime object
        Runtime runtime = Runtime.getRuntime();

        // Get the maximum memory
        long maxMemory = runtime.maxMemory();

        // Get the total memory
        long totalMemory = runtime.totalMemory();

        // Get the free memory
        long freeMemory = runtime.freeMemory();

        // Calculate used memory
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Max Memory: " + maxMemory + " bytes");
        System.out.println("Total Memory: " + totalMemory + " bytes");
        System.out.println("Free Memory: " + freeMemory + " bytes");
        System.out.println("Used Memory: " + usedMemory + " bytes");

        // Run the garbage collector
        runtime.gc();

        // Get free memory after running the garbage collector
        long freeMemoryAfterGC = runtime.freeMemory();

        System.out.println("Free Memory after Garbage Collection: " + freeMemoryAfterGC + " bytes");
    }
}
