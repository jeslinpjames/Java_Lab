/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QUESTION_19;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jeslinpjames
 */
public class TicTacToe extends javax.swing.JFrame {
    private int Xcount=0;
    private int Ocount=0;
    private String startGame = "X";
    private int totalMoves = 0;
    private boolean winCheck = false;
    
    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
    }
    private void gameScore(){
        playero.setText(String.valueOf(Ocount));
        playerx.setText(String.valueOf(Xcount));
    }
    private void choosePlayer(){
        if(startGame.equalsIgnoreCase("X")){
            startGame="O";
        }
        else
            startGame="X";
    }

    private void winningGame(){
        String b1 =txtbtn1.getText();
        String b2 =txtbtn2.getText();
        String b3 =txtbtn3.getText();
        String b4 =txtbtn4.getText();
        String b5 =txtbtn5.getText();
        String b6 =txtbtn6.getText();
        String b7 =txtbtn7.getText();
        String b8 =txtbtn8.getText();
        String b9 =txtbtn9.getText();
        //X Wins
        if((b1=="X")&&(b2=="X")&&(b3=="X")){
            JOptionPane.showMessageDialog(this,"Player X Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Xcount++;
            winCheck=true;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);

        }
        if((b4=="X")&&(b5=="X")&&(b6=="X")){
            JOptionPane.showMessageDialog(this,"Player X Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Xcount++;
            winCheck=true;
            gameScore();
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);

        }
        if((b7=="X")&&(b8=="X")&&(b9=="X")){
            JOptionPane.showMessageDialog(this,"Player X Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Xcount++;
            winCheck=true;
            gameScore();
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);

        }
        if((b1=="X")&&(b4=="X")&&(b7=="X")){
            JOptionPane.showMessageDialog(this,"Player X Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Xcount++;
            winCheck=true;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);

        }
        if((b2=="X")&&(b5=="X")&&(b8=="X")){
            JOptionPane.showMessageDialog(this,"Player X Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Xcount++;
            winCheck=true;
            gameScore();
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);

        }
        if((b3=="X")&&(b6=="X")&&(b9=="X")){
            JOptionPane.showMessageDialog(this,"Player X Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Xcount++;
            winCheck=true;
            gameScore();
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);

        }
        if((b1=="X")&&(b5=="X")&&(b9=="X")){
            JOptionPane.showMessageDialog(this,"Player X Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Xcount++;
            winCheck=true;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);

        }if((b3=="X")&&(b5=="X")&&(b7=="X")){
            JOptionPane.showMessageDialog(this,"Player X Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Xcount++;
            winCheck=true;
            gameScore();
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
        }
        
        //O Wins
        if((b1=="O")&&(b2=="O")&&(b3=="O")){
            JOptionPane.showMessageDialog(this,"Player O Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            winCheck=true;
            gameScore();
            txtbtn1.setBackground(Color.GREEN);
            txtbtn2.setBackground(Color.GREEN);
            txtbtn3.setBackground(Color.GREEN);

        }
        if((b4=="O")&&(b5=="O")&&(b6=="O")){
            JOptionPane.showMessageDialog(this,"Player O Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            winCheck=true;
            gameScore();
            txtbtn4.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn6.setBackground(Color.GREEN);

        }
        if((b7=="O")&&(b8=="O")&&(b9=="O")){
            JOptionPane.showMessageDialog(this,"Player O Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            winCheck=true;
            gameScore();
            txtbtn7.setBackground(Color.GREEN);
            txtbtn8.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN);

        }
        if((b1=="O")&&(b4=="O")&&(b7=="O")){
            JOptionPane.showMessageDialog(this,"Player O Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            winCheck=true;
            gameScore();
            txtbtn1.setBackground(Color.GREEN);
            txtbtn4.setBackground(Color.GREEN);
            txtbtn7.setBackground(Color.GREEN);

        }
        if((b2=="O")&&(b5=="O")&&(b8=="O")){
            JOptionPane.showMessageDialog(this,"Player O Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            winCheck=true;
            gameScore();
            txtbtn2.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn8.setBackground(Color.GREEN);

        }
        if((b3=="O")&&(b6=="O")&&(b9=="O")){
            JOptionPane.showMessageDialog(this,"Player O Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            winCheck=true;
            gameScore();
            txtbtn3.setBackground(Color.GREEN);
            txtbtn6.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN);

        }
        if((b1=="O")&&(b5=="O")&&(b9=="O")){
            JOptionPane.showMessageDialog(this,"Player O Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            winCheck=true;
            gameScore();
            txtbtn1.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN);

        }if((b3=="O")&&(b5=="O")&&(b7=="O")){
            JOptionPane.showMessageDialog(this,"Player O Wins " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            winCheck=true;
            gameScore();
            txtbtn3.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn7.setBackground(Color.GREEN);
        }
        
       
                
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn1 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
        );

        txtbtn1.setFont(new java.awt.Font("Dialog", 0, 40)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Dialog", 0, 40)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Dialog", 0, 40)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Dialog", 0, 40)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Dialog", 0, 40)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Dialog", 0, 40)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Dialog", 0, 40)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(153, 0, 0));
        exit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Dialog", 0, 40)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Dialog", 0, 40)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(0, 102, 153));
        reset.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.darkGray));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("PLAYER 1:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("PLAYER 2:");

        playerx.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerx.setForeground(new java.awt.Color(51, 102, 255));
        playerx.setText("XXXX");

        playero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playero.setForeground(new java.awt.Color(51, 102, 255));
        playero.setText("XXXX");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(playero))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(playerx)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(startGame);
         if(startGame.equalsIgnoreCase("X")){
            txtbtn1.setForeground(Color.red);
        }
        else
            txtbtn1.setForeground(Color.BLUE);
        choosePlayer();
        winningGame();
        totalMoves++;
        if (totalMoves == 9) {
            if(winCheck==false){            
                JOptionPane.showMessageDialog(this, "It's a draw!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            }
            resetActionPerformed(evt); 
        }
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        txtbtn3.setText(startGame);
         if(startGame.equalsIgnoreCase("X")){
            txtbtn3.setForeground(Color.red);
        }
        else
            txtbtn3.setForeground(Color.BLUE);
        choosePlayer();
        winningGame();   
        totalMoves++;
        if (totalMoves == 9) {
            if(winCheck==false){            
                JOptionPane.showMessageDialog(this, "It's a draw!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            }
            resetActionPerformed(evt); 
        }
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        txtbtn2.setText(startGame);
         if(startGame.equalsIgnoreCase("X")){
            txtbtn2.setForeground(Color.red);
        }
        else
            txtbtn2.setForeground(Color.blue);
        choosePlayer();
        winningGame();
        totalMoves++;
        if (totalMoves == 9) {
            if(winCheck==false){            
                JOptionPane.showMessageDialog(this, "It's a draw!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            }
            resetActionPerformed(evt); 
        }
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
       
        txtbtn4.setText(startGame);
         if(startGame.equalsIgnoreCase("X")){
            txtbtn4.setForeground(Color.red);
        }
        else
            txtbtn4.setForeground(Color.BLUE);
        choosePlayer(); 
        winningGame();
         totalMoves++;
        if (totalMoves == 9) {
            if(winCheck==false){            
                JOptionPane.showMessageDialog(this, "It's a draw!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            }
            resetActionPerformed(evt); 
        }
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        
        txtbtn6.setText(startGame);
         if(startGame.equalsIgnoreCase("X")){
            txtbtn6.setForeground(Color.red);
        }
        else
            txtbtn6.setForeground(Color.BLUE);
        choosePlayer();  
        winningGame();
        totalMoves++;
        if (totalMoves == 9) {
            if(winCheck==false){            
                JOptionPane.showMessageDialog(this, "It's a draw!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            }
            resetActionPerformed(evt); 
        }
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        
        txtbtn5.setText(startGame);
         if(startGame.equalsIgnoreCase("X")){
            txtbtn5.setForeground(Color.red);
        }
        else
            txtbtn5.setForeground(Color.BLUE);
         choosePlayer();
         winningGame();totalMoves++;
        if (totalMoves == 9) {
            if(winCheck==false){            
                JOptionPane.showMessageDialog(this, "It's a draw!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            }
            resetActionPerformed(evt); 
        }
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        
        txtbtn8.setText(startGame);
         if(startGame.equalsIgnoreCase("X")){
            txtbtn8.setForeground(Color.red);
        }
        else
            txtbtn8.setForeground(Color.BLUE);
        choosePlayer(); 
        winningGame();
        totalMoves++;
        if (totalMoves == 9) {
            if(winCheck==false){            
                JOptionPane.showMessageDialog(this, "It's a draw!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            }
            resetActionPerformed(evt); 
        }
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm to Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
            System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        
        txtbtn7.setText(startGame);
         if(startGame.equalsIgnoreCase("X")){
            txtbtn7.setForeground(Color.red);
        }
        else
            txtbtn7.setForeground(Color.BLUE);
        choosePlayer(); 
        winningGame();
        totalMoves++;         
        if (totalMoves == 9) {
            if(winCheck==false){            
                JOptionPane.showMessageDialog(this, "It's a draw!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            }
            resetActionPerformed(evt); 
        }
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        
        txtbtn9.setText(startGame);
         if(startGame.equalsIgnoreCase("X")){
            txtbtn9.setForeground(Color.red);
        }
        else
            txtbtn9.setForeground(Color.BLUE);
        choosePlayer();
        winningGame();
        totalMoves++;
        if (totalMoves == 9) {
            if(winCheck==false){            
                JOptionPane.showMessageDialog(this, "It's a draw!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            }
            resetActionPerformed(evt); 
        }
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        totalMoves=0;
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);

        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
        winCheck=false;
                
    }//GEN-LAST:event_resetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton reset;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    // End of variables declaration//GEN-END:variables
}
