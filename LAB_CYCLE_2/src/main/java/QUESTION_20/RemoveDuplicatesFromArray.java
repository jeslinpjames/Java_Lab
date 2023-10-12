/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_20;

/**
 *
 * @author jeslin
 */
import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        // Input string array with duplicates
        String[] stringArray = {"apple", "banana", "apple", "cherry", "banana"};

        // Create a TreeSet to remove duplicates
        TreeSet<String> uniqueSet = new TreeSet<>(Arrays.asList(stringArray));

        // Convert the TreeSet back to an array without duplicates
        String[] uniqueArray = uniqueSet.toArray(new String[0]);

        // Print the unique elements
        System.out.println("Original array with duplicates: " + Arrays.toString(stringArray));
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }
}

