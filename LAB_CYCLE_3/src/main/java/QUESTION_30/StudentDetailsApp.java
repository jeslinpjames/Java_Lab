///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package QUESTION_30;
//
///**
// *
// * @author jeslin
// */
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Scanner;
//
//public class StudentDetailsApp {
//    private static Connection connection;
//
//    public static void main(String[] args) {
//        try {
//            // Connect to the SQLite database
//            connection = DriverManager.getConnection("jdbc:sqlite:students.db");
//            
//            // Read data from Excel and store it in the database
//            readExcelAndStoreInDatabase("student_details.xlsx");
//
//            // Prompt user for viewing student details
//            Scanner scanner = new Scanner(System.in);
//            while (true) {
//                System.out.print("Enter Roll Number to view student details (or 'exit' to quit): ");
//                String input = scanner.nextLine().trim();
//                if ("exit".equalsIgnoreCase(input)) {
//                    break;
//                }
//                int rollNumber = Integer.parseInt(input);
//                viewStudentDetails(rollNumber);
//            }
//
//            scanner.close();
//        } catch (SQLException | Exception e) {
//            e.printStackTrace();
//        } finally {
//            // Close the database connection
//            try {
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    private static void readExcelAndStoreInDatabase(String excelFileName) throws Exception {
//        FileInputStream excelFile = new FileInputStream(excelFileName);
//        Workbook workbook = new XSSFWorkbook(excelFile);
//
//        // Assuming the first sheet contains student details
//        Sheet sheet = workbook.getSheetAt(0);
//
//        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//            Row row = sheet.getRow(i);
//            int rollNumber = (int) row.getCell(0).getNumericCellValue();
//            String name = row.getCell(1).getStringCellValue();
//            int marks = (int) row.getCell(2).getNumericCellValue();
//
//            // Insert student details into the database
//            insertStudent(rollNumber, name, marks);
//        }
//
//        workbook.close();
//    }
//
//    private static void insertStudent(int rollNumber, String name, int marks) throws SQLException {
//        String sql = "INSERT INTO students (roll_number, name, marks) VALUES (?, ?, ?)";
//        PreparedStatement statement = connection.prepareStatement(sql);
//        statement.setInt(1, rollNumber);
//        statement.setString(2, name);
//        statement.setInt(3, marks);
//        statement.executeUpdate();
//    }
//
//    private static void viewStudentDetails(int rollNumber) throws SQLException {
//        String sql = "SELECT name, marks FROM students WHERE roll_number = ?";
//        PreparedStatement statement = connection.prepareStatement(sql);
//        statement.setInt(1, rollNumber);
//        ResultSet resultSet = statement.executeQuery();
//
//        if (resultSet.next()) {
//            String name = resultSet.getString("name");
//            int marks = resultSet.getInt("marks");
//            System.out.println("Student Details:");
//            System.out.println("Roll Number: " + rollNumber);
//            System.out.println("Name: " + name);
//            System.out.println("Marks: " + marks);
//        } else {
//            System.out.println("Student with Roll Number " + rollNumber + " not found.");
//        }
//    }
//}
