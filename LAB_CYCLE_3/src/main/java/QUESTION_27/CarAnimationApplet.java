/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package QUESTION_27;

import java.applet.Applet;

/**
 *
 * @author jeslin
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CarAnimationApplet extends Applet implements ActionListener, Runnable {

    private int carX = 0; // Initial x-coordinate of the car
    private int carSpeed = 5; // Speed of the car
    private Thread carThread;
    private boolean isRunning = false;

    private Button startButton;
    private Button pauseButton;
    private Button stopButton;

    public void init() {
        startButton = new Button("Start");
        pauseButton = new Button("Pause");
        stopButton = new Button("Stop");

        startButton.addActionListener(this);
        pauseButton.addActionListener(this);
        stopButton.addActionListener(this);

        add(startButton);
        add(pauseButton);
        add(stopButton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (carThread == null) {
                isRunning = true;
                carThread = new Thread(this);
                carThread.start();
            }
        } else if (e.getSource() == pauseButton) {
            isRunning = !isRunning;
        } else if (e.getSource() == stopButton) {
            isRunning = false;
            carThread = null;
            carX = 0;
        }
    }

    public void run() {
        while (isRunning) {
            carX += carSpeed;
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        // Draw the road
        g.setColor(Color.GRAY);
        g.fillRect(0, 100, getWidth(), 50);

        // Draw the car
        g.setColor(Color.RED);
        g.fillRect(carX, 80, 50, 20);
    }
}
