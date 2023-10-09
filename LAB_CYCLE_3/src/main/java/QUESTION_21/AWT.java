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
import java.util.regex.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
import javax.swing.*;

public class AWT extends JFrame {
    private JLabel nameLabel, ageLabel, phoneLabel, emailLabel;
    private JTextField nameField, ageField, phoneField, emailField;
    private JButton submitButton;

    public AWT() {
        setTitle("Form Validation Example");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        nameLabel = new JLabel("Name:");
        ageLabel = new JLabel("Age:");
        phoneLabel = new JLabel("Phone Number:");
        emailLabel = new JLabel("Email ID:");

        nameField = new JTextField();
        ageField = new JTextField();
        phoneField = new JTextField();
        emailField = new JTextField();

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validateForm()) {
                    JOptionPane.showMessageDialog(null, "Form submitted successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please check the fields.");
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

        setVisible(true);
    }

    private boolean validateForm() {
        String name = nameField.getText();
        String age = ageField.getText();
        String phoneNumber = phoneField.getText();
        String email = emailField.getText();

        
        if (name.isEmpty() || containsDigit(name)) {
            return false;
        }

        if (age.isEmpty() || !isNumeric(age)||(Integer.parseInt(age)>=130)) {
            return false;
        }

       if (!isNumeric(phoneNumber) || phoneNumber.length() != 10) {
            return false;
        }

        if (!email.contains("@") || !email.contains(".")) {
            return false;
        }   

        return true;
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
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AWT();
            }
        });
    }
}
