/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoe;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class XO_GUI extends javax.swing.JFrame {

    String[][] Map = new String[3][3];
    String turn = "";
    int countMoves = 0;
    public XO_GUI() {
        initComponents();
        hhh();
        
    }
    
  
    
    public void hhh(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Map[i][j] = "";
            }
        }
    }
    
    
    
    
    public void checkingRows(){
        String x = "X", o = "O";
        int RowsXcount = 0, RowsOcount = 0, ColumnsXcount = 0, ColumnsOcount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(Map[i][j].equals(x)){
                    RowsXcount++;
                }
                if(Map[i][j].equals(o)){
                    RowsOcount++;
                }if(Map[j][i].equals(x)){
                    ColumnsXcount++;
                }
                if(Map[j][i].equals(o)){
                    ColumnsOcount++;
                }
            }
            
            if(RowsXcount == 3){
                btnColor();
                JOptionPane.showMessageDialog(null, "Player [ X ] win");
                change(false);
                break;
            }
            else if(RowsOcount == 3){
                btnColor();
                JOptionPane.showMessageDialog(null, "Player [ O ] win");
                change(false);
                break;
            }else if(ColumnsXcount == 3){
                btnColor();
                JOptionPane.showMessageDialog(null, "Player [ X ] win");
                change(false);
                break;
            }else if(ColumnsOcount == 3){
                btnColor();
                JOptionPane.showMessageDialog(null, "Player [ O ] win");
                change(false);
                break;
            }
            else{
                RowsXcount = 0;
                RowsOcount = 0;
                ColumnsXcount = 0;
                ColumnsOcount = 0;
            }
        }
        
        if(!lastChecking() && countMoves == 9 && RowsXcount < 3 && RowsOcount < 3 && ColumnsXcount < 3 && ColumnsOcount < 3){
            JOptionPane.showMessageDialog(null, "It's a draw");
        }
    }
    
    

    
     public boolean lastChecking(){
         boolean test = false;
         if(Map[0][0].equals("X") && Map[1][1].equals("X") && Map[2][2].equals("X")){
             btnColor();
             JOptionPane.showMessageDialog(null, "Player [ X ] win");
             change(false);
             test = true;
         }else if(Map[0][0].equals("O") && Map[1][1].equals("O") && Map[2][2].equals("O")){
             btnColor();
             JOptionPane.showMessageDialog(null, "Player [ O ] win");
             change(false);   
             test = true;
         }else if(Map[0][2].equals("X") && Map[1][1].equals("X") && Map[2][0].equals("X")){
             btnColor();
             JOptionPane.showMessageDialog(null, "Player [ X ] win");
             change(false);
             test = true;
         }else if(Map[0][2].equals("O") && Map[1][1].equals("O") && Map[2][0].equals("O")){
             btnColor();
             JOptionPane.showMessageDialog(null, "Player [ O ] win");
             change(false);   
             test = true;
         }
         return test;
     }
    
    public void change(boolean nn){
        
        btn1.setEnabled(nn);
        btn2.setEnabled(nn);
        btn3.setEnabled(nn);
        btn4.setEnabled(nn);
        btn5.setEnabled(nn);
        btn6.setEnabled(nn);
        btn7.setEnabled(nn);
        btn8.setEnabled(nn);
        btn9.setEnabled(nn);
        
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        
        btn1.setBackground(Color.white);
        btn2.setBackground(Color.white);
        btn3.setBackground(Color.white);
        btn4.setBackground(Color.white);
        btn5.setBackground(Color.white);
        btn6.setBackground(Color.white);
        btn7.setBackground(Color.white);
        btn8.setBackground(Color.white);
        btn9.setBackground(Color.white);
    }

    public void btnColor(){
        if(!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("") && btn1.getText().equals(btn2.getText()) && btn2.getText().equals(btn3.getText())){
            btn1.setBackground(Color.GREEN);
            btn2.setBackground(Color.GREEN);
            btn3.setBackground(Color.GREEN);
        }
        if(!btn4.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("") && btn4.getText().equals(btn5.getText()) && btn5.getText().equals(btn6.getText())){
            btn4.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn6.setBackground(Color.GREEN);
        }
        if(!btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals("") && btn7.getText().equals(btn8.getText()) && btn8.getText().equals(btn9.getText())){
            btn7.setBackground(Color.GREEN);
            btn8.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
        }
        if(!btn1.getText().equals("") && !btn4.getText().equals("") && !btn7.getText().equals("") && btn1.getText().equals(btn4.getText()) && btn4.getText().equals(btn7.getText())){
            btn1.setBackground(Color.GREEN);
            btn4.setBackground(Color.GREEN);
            btn7.setBackground(Color.GREEN);
        }
        if(!btn2.getText().equals("") && !btn5.getText().equals("") && !btn8.getText().equals("") && btn2.getText().equals(btn5.getText()) && btn5.getText().equals(btn8.getText())){
            btn2.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn8.setBackground(Color.GREEN);
        }
        if(!btn3.getText().equals("") && !btn6.getText().equals("") && !btn9.getText().equals("") && btn3.getText().equals(btn6.getText()) && btn6.getText().equals(btn9.getText())){
            btn3.setBackground(Color.GREEN);
            btn6.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
        }
        if(!btn1.getText().equals("") && !btn5.getText().equals("") && !btn9.getText().equals("") && btn1.getText().equals(btn5.getText()) && btn5.getText().equals(btn9.getText())){
            btn1.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
        }
        if(!btn3.getText().equals("") && !btn5.getText().equals("") && !btn7.getText().equals("") && btn3.getText().equals(btn5.getText()) && btn5.getText().equals(btn7.getText())){
            btn3.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn7.setBackground(Color.GREEN);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        countDown = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6);

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7);

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8);

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 320, 290));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("XO Game");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 140, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setText("replay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 100, 40));

        countDown.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        countDown.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(countDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 90, 40));

        setSize(new java.awt.Dimension(562, 552));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(btn1.getText().equals("")){
        if(turn.equals("") || turn.equals("O")){
        btn1.setText("X");
        }else{
        btn1.setText("O");
        }
        turn = btn1.getText();
        countMoves++;
        Map[0][0] = turn;
        checkingRows();
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(btn2.getText().equals("")){
        if(turn.equals("") || turn.equals("O")){
        btn2.setText("X");
        }else{
        btn2.setText("O");
        }
        turn = btn2.getText();
         countMoves++;
        Map[0][1] = turn;
        checkingRows();
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(btn3.getText().equals("")){
        if(turn.equals("") || turn.equals("O")){
        btn3.setText("X");
        }else{
        btn3.setText("O");
        }
        turn = btn3.getText();
         countMoves++;
        Map[0][2] = turn;
        checkingRows();
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(btn4.getText().equals("")){
        if(turn.equals("") || turn.equals("O")){
        btn4.setText("X");
        }else{
        btn4.setText("O");
        }
        turn = btn4.getText();
         countMoves++;
        Map[1][0] = turn;
        checkingRows();
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(btn5.getText().equals("")){
        if(turn.equals("") || turn.equals("O")){
        btn5.setText("X");
        }else{
        btn5.setText("O");
        }
        turn = btn5.getText();
         countMoves++;
        Map[1][1] = turn;
        checkingRows();
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(btn6.getText().equals("")){
        if(turn.equals("") || turn.equals("O")){
        btn6.setText("X");
        }else{
        btn6.setText("O");
        }
        turn = btn6.getText();
         countMoves++;
        Map[1][2] = turn;
        checkingRows();
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if(btn7.getText().equals("")){
        if(turn.equals("") || turn.equals("O")){
        btn7.setText("X");
        }else{
        btn7.setText("O");
        }
        turn = btn7.getText();
         countMoves++;
        Map[2][0] = turn;
        checkingRows();
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if(btn8.getText().equals("")){
        if(turn.equals("") || turn.equals("O")){
        btn8.setText("X");
        }else{
        btn8.setText("O");
        }
        turn = btn8.getText();
         countMoves++;
        Map[2][1] = turn;
        checkingRows();
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if(btn9.getText().equals("")){
        if(turn.equals("") || turn.equals("O")){
        btn9.setText("X");
        }else{
        btn9.setText("O");
        }
        turn = btn9.getText();
         countMoves++;
        Map[2][2] = turn;
        checkingRows();
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        change(true);
        hhh();
        countMoves = 0;
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(XO_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XO_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XO_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XO_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XO_GUI().setVisible(true);
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    public static javax.swing.JLabel countDown;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
