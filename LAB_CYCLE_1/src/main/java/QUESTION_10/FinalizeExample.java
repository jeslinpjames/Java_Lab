/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_10;

/**
 *
 * @author jeslin
 */
public class FinalizeExample {
    private String resourceName;

    public FinalizeExample(String resourceName) {
        this.resourceName = resourceName;
    }

    public void doSomeWork() {
        System.out.println("Doing some work with " + resourceName);
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            // Perform cleanup or resource release here
            System.out.println(resourceName + " is being finalized.");
        } finally {
            // Call the finalize method of the superclass
            super.finalize();
        }
    }

    public static void main(String[] args) {
        FinalizeExample example1 = new FinalizeExample("Resource1");
        FinalizeExample example2 = new FinalizeExample("Resource2");

        example1.doSomeWork();
        example2.doSomeWork();

        // Set references to null to make objects eligible for garbage collection
        example1 = null;
        example2 = null;

        // Suggest garbage collection (not guaranteed to trigger immediately)
        System.gc();

        // Sleep to allow time for the garbage collector to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
