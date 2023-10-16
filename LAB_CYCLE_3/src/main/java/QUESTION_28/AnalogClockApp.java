/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_28;

/**
 *
 * @author jeslin
 */
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AnalogClockApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Analog Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        AnalogClockPanel clockPanel = new AnalogClockPanel();
        frame.add(clockPanel);

        Timer timer = new Timer(1000, e -> clockPanel.repaint());
        timer.start();

        frame.setVisible(true);
    }
}

class AnalogClockPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = Math.min(centerX, centerY) - 20;

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw clock face
        g.setColor(Color.BLACK);
        g.drawOval(centerX - radius, centerY - radius,
       
        radius * 2, radius * 2);

        // Draw clock numbers
        g.setFont(new Font("Serif", Font.BOLD, 20));
        for (int i = 1; i <= 12; i++) {
            double angle = Math.toRadians(90 - i * 30);
            int numX = (int) (centerX + (radius - 20) * Math.cos(angle));
            int numY = (int) (centerY - (radius - 20) * Math.sin(angle));
            g.drawString(Integer.toString(i), numX - 10, numY + 5);
        }

        // Get current time
        Calendar calendar = Calendar.getInstance();
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);

        // Draw clock hands
        drawClockHands(g, centerX, centerY, radius, hours, minutes, seconds);
    }

    private void drawClockHands(Graphics g, int centerX,
    int centerY, int radius, int hours, int minutes, int seconds) {
        double hourAngle = Math.toRadians(90 - (hours % 12) * 30 - minutes / 2);
        double minuteAngle = Math.toRadians(90 - minutes
        * 6 - seconds / 10);
        double secondAngle = Math.toRadians(90 - seconds
        * 6);

        int hourHandLength = (int) (radius * 0.5);
        int minuteHandLength = (int) (radius * 0.7);
        int secondHandLength = (int) (radius * 0.9);

        int hourHandX = centerX + (int) (hourHandLength
        * Math.cos(hourAngle));
        int hourHandY = centerY - (int) (hourHandLength
        * Math.sin(hourAngle));
        int minuteHandX = centerX + (int) (minuteHandLength
        * Math.cos(minuteAngle));
        int minuteHandY = centerY - (int) (minuteHandLength
        * Math.sin(minuteAngle));
        int secondHandX = centerX + (int) (secondHandLength
        * Math.cos(secondAngle));
        int secondHandY = centerY - (int) (secondHandLength
        * Math.sin(secondAngle));

        g.setColor(Color.BLUE);
        g.drawLine(centerX, centerY, hourHandX, hourHandY);
        g.setColor(Color.RED);
        g.drawLine(centerX, centerY, minuteHandX, minuteHandY);
        g.setColor(Color.BLACK);
        g.drawLine(centerX, centerY, secondHandX, secondHandY);
    }
}
