/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_21;

/**
 *
 * @author jeslin<your.name at your.org>
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AWT extends JFrame {
    private JLabel nameLabel, ageLabel, phoneLabel, emailLabel;
    private JTextField nameField, ageField, phoneField, emailField;
    private JButton submitButton;
    private JLabel errorLabel;

    public AWT() {
        setTitle("Form Validation Example");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        nameLabel = new JLabel("Name:");
        ageLabel = new JLabel("Age:");
        phoneLabel = new JLabel("Phone Number:");
        emailLabel = new JLabel("Email ID:");

        nameField = new JTextField();
        ageField = new JTextField();
        phoneField = new JTextField();
        emailField = new JTextField();
        errorLabel = new JLabel("");

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String error = validateForm();
                if (error.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Form submitted successfully!");
                    errorLabel.setText(""); // Clear any previous error message
                } else {
                    errorLabel.setText("Invalid input: " + error);
                }
            }
        });

        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(phoneLabel);
        add(phoneField);
        add(emailLabel);
        add(emailField);
        add(new JLabel()); // Placeholder
        add(submitButton);
        add(errorLabel);

        setVisible(true);
    }

    private String validateForm() {
        StringBuilder error = new StringBuilder();

        String name = nameField.getText();
        String age = ageField.getText();
        String phoneNumber = phoneField.getText();
        String email = emailField.getText();

        if (name.isEmpty() || containsDigit(name)) {
            error.append("Name is invalid. ");
        }

        if (age.isEmpty() || !isNumeric(age) || Integer.parseInt(age) <= 0) {
            error.append("Age is invalid. ");
        }

        if (!isNumeric(phoneNumber) || phoneNumber.length() != 10) {
            error.append("Phone number is invalid. ");
        }

        if (!isValidEmail(email)) {
            error.append("Email is invalid.");
        }

        return error.toString();
    }

    public boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isValidEmail(String email) {
        String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email.matches(emailPattern);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AWT();
            }
        });
    }
}
