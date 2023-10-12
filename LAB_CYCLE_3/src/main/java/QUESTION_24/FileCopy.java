/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_24;

/**
 *
 * @author jeslin
 */
import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try(BufferedReader read = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter source File Name :");
            String sourceFileName = sc.nextLine();
            System.out.print("Enter destination File Name :");
            String destinationFileName = sc.nextLine();
            File sourceFile = new File(sourceFileName);
            File destinationFile = new File(destinationFileName);
            if(sourceFile.exists()){
                if(destinationFile.exists()){
                    System.out.print("The target file already exists. Overwrite? (y/n): ");
                    String response = sc.next();
                    if(!response.equalsIgnoreCase('y')){
                        System.out.println("File Copy Operation Cancelled");
                        return;
                    }
                }
                try (FileReader fileReader = new FileReader(sourceFile);
                     FileWriter fileWriter = new FileWriter(destinationFile)) {
                    char[] buffer = new char[1024];
                    int bytesRead;

                    while ((bytesRead = fileReader.read(buffer)) != -1) {
                        fileWriter.write(buffer, 0, bytesRead);
                    }

                    System.out.println("File copied successfully!");
                } catch (IOException e) {
                    System.err.println("Error copying the file: " + e.getMessage());
                }
            } else {
                System.err.println("Source file does not exist.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading user input: " + e.getMessage());
        }
    }
}






