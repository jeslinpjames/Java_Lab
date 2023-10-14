///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package QUESTION_25;
//
///**
// *
// * @author jeslin
// */
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.io.*;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class NumberWriterGUI extends JFrame {
//    private JTextField numberField;
//    private JButton writeButton;
//    private JButton openEvenButton;
//    private JButton openOddButton;
//
//    public NumberWriterGUI() {
//        setTitle("Even and Odd Number Writer");
//        setSize(400, 150);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        numberField = new JTextField(10);
//        writeButton = new JButton("Write Numbers");
//        openEvenButton = new JButton("Open EVEN.txt");
//        openOddButton = new JButton("Open ODD.txt");
//
//        JPanel panel = new JPanel();
//        panel.add(new JLabel("Enter a number: "));
//        panel.add(numberField);
//        panel.add(writeButton);
//        panel.add(openEvenButton);
//        panel.add(openOddButton);
//
//        add(panel);
//        setLayout(new FlowLayout());
//
//        writeButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                int number = Integer.parseInt(numberField.getText());
//                ExecutorService executor = Executors.newFixedThreadPool(2);
//                executor.execute(new NumberWriter("EVEN.txt", number, true));
//                executor.execute(new NumberWriter("ODD.txt", number, false));
//                executor.shutdown();
//            }
//        });
//
//        openEvenButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                openFile("EVEN.txt");
//            }
//        });
//
//        openOddButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                openFile("ODD.txt");
//            }
//        });
//    }
//
//    private void openFile(String fileName) {
//        try {
//            Desktop.getDesktop().open(new File(fileName));
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            NumberWriterGUI gui = new NumberWriterGUI();
//            gui.setVisible(true);
//        });
//    }
//}
//
//class NumberWriter implements Runnable {
//    private String fileName;
//    private int maxNumber;
//    private boolean writeEven;
//
//    public NumberWriter(String fileName, int maxNumber, boolean writeEven) {
//        this.fileName = fileName;
//        this.maxNumber = maxNumber;
//        this.writeEven = writeEven;
//    }
//
//    @Override
//    public void run() {
//        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName)) {
//            for (int i = 1; i < maxNumber; i++) {
//                if ((i % 2 == 0 && writeEven) || (i % 2 != 0 && !writeEven)) {
//                    writer.println(i);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
