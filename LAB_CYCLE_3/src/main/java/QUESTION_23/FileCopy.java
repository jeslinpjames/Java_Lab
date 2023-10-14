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

        // Get the total memory in bytes
        long totalMemory = runtime.totalMemory();

        // Get the free memory in bytes
        long freeMemory = runtime.freeMemory();

        // Run the garbage collector
        runtime.gc();

        // Get the free memory after running the garbage collector
        long freeMemoryAfterGC = runtime.freeMemory();

        // Convert to megabytes
        long megabyte = 1024 * 1024;
        totalMemory /= megabyte;
        freeMemory /= megabyte;
        freeMemoryAfterGC /= megabyte;

        System.out.println("Total Memory (MB): " + totalMemory);
        System.out.println("Free Memory (MB): " + freeMemory);
        System.out.println("Free Memory After GC (MB): " + freeMemoryAfterGC);
    }
}
