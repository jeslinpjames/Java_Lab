/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_22;

/**
 *
 * @author jeslin
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.IOException;

public class RunWindows95Apps extends JFrame {
    private JButton notepadButton, calculatorButton, paintButton;

    public RunWindows95Apps() {
        setTitle("Open Windows 95 Apps");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        notepadButton = new JButton("Notepad");
        calculatorButton = new JButton("Calculator");
        paintButton = new JButton("Paint");

        notepadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openApplication("notepad.exe");
            }
        });

        calculatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openApplication("calc.exe");
            }
        });

        paintButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openApplication("mspaint.exe");
            }
        });

        add(notepadButton);
        add(calculatorButton);
        add(paintButton);

        setVisible(true);
    }

    private void openApplication(String executableName) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(executableName);
            processBuilder.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RunWindows95Apps();
            }
        });
    }
}
