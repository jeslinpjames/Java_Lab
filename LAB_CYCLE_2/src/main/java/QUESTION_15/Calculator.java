/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_15;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;



/**
 *
 * @author jeslinpjames
 */
public class Calculator extends JFrame{
    JPanel myPanel;
    JButton addButton; 
    JButton subButton; 
    JButton mulButton; 
    JButton divButton; 
    JButton equalsButton;
    JTextField inputTextField;
    String firstNumber;
    double secondNumber;
    
    public Calculator(){
        this.setTitle("Calculator");
        this.setSize(500,500);
        this.setLocation(500,100);
        
       
        
        inputTextField = new JTextField();
        inputTextField.setBounds(50, 50, 360, 80);
        inputTextField.setFont(new Font("Arial", Font.PLAIN, 25));
        
        addButton = new JButton("+");
        addButton.setBounds(320, 180, 100, 100);

        subButton = new JButton("-");
        subButton.setBounds(80, 180, 100, 100);

        mulButton = new JButton("*");
        mulButton.setBounds(320, 330, 100, 100);

        divButton = new JButton("/");
        divButton.setBounds(80, 330, 100, 100);
        
        equalsButton = new JButton("=");
        equalsButton.setBounds(430,60,50,50);

        
        myPanel = new JPanel();
        myPanel.setLayout(null);
        myPanel.add(addButton);
        myPanel.add(subButton);
        myPanel.add(mulButton);
        myPanel.add(divButton);
        myPanel.add(equalsButton);
        myPanel.add(inputTextField);
        this.add(myPanel);
        this.setVisible(true);
         
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               firstNumber = inputTextField.getText();
               inputTextField.setText(firstNumber+"+");
            }
        });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = inputTextField.getText();
                inputTextField.setText(firstNumber+"-");
            }
        });
        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber =inputTextField.getText();
                inputTextField.setText(firstNumber+"x");
            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = inputTextField.getText();
                inputTextField.setText(firstNumber+"/");
            }
        });
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String txt = inputTextField.getText();
              int i =0;
              char oper=' ';
              for(i=0;i<txt.length();i++)
              {        
                  char c;
                  c = txt.charAt(i);
                  if((c=='+')||(c=='/')||(c=='x')||(c=='-')||(c=='*')){
                      oper = c;
                      break;
                  }
              }
              Double x = Double.valueOf(txt.substring(0,i));
              Double y = Double.valueOf(txt.substring(i+1,txt.length()));
              Double r = null;
            switch (oper) {
                case '+':
                    r=x+y;
                    break;
                case '-':
                    r=x-y;
                    break;
                case '/':
                    r=x/y;
                    break;
                case '*':
                    r=x*y;
                    break;
                case 'x':
                    r=x*y;
                    break;
                default:
                    r=0.0;
                    break;
            }
              inputTextField.setText(Double.toString(r));
            }
        });
    }
                
     public static void main(String args[]){
            new Calculator();
        }

}
