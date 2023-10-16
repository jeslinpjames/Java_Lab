/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_29;

/**
 *
 * @author jeslin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookApp {
    private Connection connection;
    private JTextField accessionField, nameField, authorField, publisherField, prefaceField;
    private JTextArea outputArea;

    public BookApp() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "your_username", "your_password");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Book Database");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new GridLayout(6, 2));
        inputPanel.add(new JLabel("Accession Number"));
        accessionField = new JTextField();
        inputPanel.add(accessionField);
        inputPanel.add(new JLabel("Name"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Author"));
        authorField = new JTextField();
        inputPanel.add(authorField);
        inputPanel.add(new JLabel("Publisher"));
        publisherField = new JTextField();
        inputPanel.add(publisherField);
        inputPanel.add(new JLabel("Preface"));
        prefaceField = new JTextField();
        inputPanel.add(prefaceField);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addBook();
            }
        });

        JButton viewButton = new JButton("View");
        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewBooks();
            }
        });

        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteBook();
            }
        });

        JButton updateButton = new JButton("Update");
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateBook();
            }
        });

        outputArea = new JTextArea(10, 40);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(viewButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(updateButton);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    private void addBook() {
        try {
            String accession = accessionField.getText();
            String name = nameField.getText();
            String author = authorField.getText();
            String publisher = publisherField.getText();
            String preface = prefaceField.getText();

            String sql = "INSERT INTO books (accession, name, author, publisher, preface) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, accession);
            statement.setString(2, name);
            statement.setString(3, author);
            statement.setString(4, publisher);
            statement.setString(5, preface);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                outputArea.append("Book added successfully.\n");
            } else {
                outputArea.append("Failed to add book.\n");
            }

            clearFields();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void viewBooks() {
        try {
            String sql = "SELECT * FROM books";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            outputArea.setText("Books in the database:\n");
            while (resultSet.next()) {
                outputArea.append("Accession: " + resultSet.getString("accession") + "\n");
                outputArea.append("Name: " + resultSet.getString("name") + "\n");
                outputArea.append("Author: " + resultSet.getString("author") + "\n");
                outputArea.append("Publisher: " + resultSet.getString("publisher") + "\n");
                outputArea.append("Preface: " + resultSet.getString("preface") + "\n\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void deleteBook() {
        String accession = accessionField.getText();
        try {
            String sql = "DELETE FROM books WHERE accession = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, accession);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                outputArea.append("Book deleted successfully.\n");
            } else {
                outputArea.append("Book not found or deletion failed.\n");
            }
            clearFields();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateBook() {
        String accession = accessionField.getText();
        String name = nameField.getText();
        String author = authorField.getText();
        String publisher = publisherField.getText();
        String preface = prefaceField.getText();

        try {
            String sql = "UPDATE books SET name = ?, author = ?, publisher = ?, preface = ? WHERE accession = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, author);
            statement.setString(3, publisher);
            statement.setString(4, preface);
            statement.setString(5, accession);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                outputArea.append("Book updated successfully.\n");
            } else {
                outputArea.append("Book not found or update failed.\n");
            }
            clearFields();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void clearFields() {
        accessionField.setText("");
        nameField.setText("");
        authorField.setText("");
        publisherField.setText("");
        prefaceField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BookApp();
            }
        });
    }
}

