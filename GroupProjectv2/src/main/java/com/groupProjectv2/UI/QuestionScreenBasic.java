/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupProjectv2.UI;

import com.groupProjectv2.model.Controller;
import com.groupProjectv2.model.Deck;
import javax.swing.SwingUtilities;

/**
 *
 * @author jackf
 */
public class QuestionScreenBasic extends javax.swing.JFrame {
    private Deck deck = Controller.getDeck("Basic");
    private int QuestionNo = 1;
    private String StringQuestionNo = "Question " +deck.getQuestions().get(0).getQuestionNo();
    private int GetQuestionNo = 0;
    private String Question = deck.getQuestions().get(0).getQuestion();
    private String Option1 = deck.getQuestions().get(0).getOption1();
    private String Option2 = deck.getQuestions().get(0).getOption2();
    private String Option3 = deck.getQuestions().get(0).getOption3();
    private int CorrectAnswer = deck.getQuestions().get(0).getCorrectAnswer();
    private int CurrentScore = 0;
    private int Time;
    /**
     * Creates new form QuestionScreenBasic
     */
    public QuestionScreenBasic() {
        //System.out.println("Howdy" + Option1);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Exit = new javax.swing.JButton();
        Option1Button = new javax.swing.JButton();
        Option2Button = new javax.swing.JButton();
        Option3Button = new javax.swing.JButton();
        QuestionNoText = new javax.swing.JLabel();
        ScoreText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Exit.setText("Exit");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        Option1Button.setText(Option1);
        Option1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Option1ButtonMouseClicked(evt);
            }
        });

        Option2Button.setText(Option2);
        Option2Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Option2ButtonMouseClicked(evt);
            }
        });

        Option3Button.setText(Option3);
        Option3Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Option3ButtonMouseClicked(evt);
            }
        });

        QuestionNoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuestionNoText.setText(StringQuestionNo);

        ScoreText.setText("Score: " + CurrentScore);

        jLabel1.setText("<html>" + Question.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("/n", "<br/>") + "</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Option2Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Option1Button)
                            .addComponent(Option3Button))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ScoreText, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(QuestionNoText, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Exit)
                        .addGap(39, 39, 39)
                        .addComponent(Option1Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ScoreText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuestionNoText)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Option2Button)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Option3Button)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void Option1ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option1ButtonMouseClicked

        if (CorrectAnswer == 1){
            CurrentScore += 1;
        }
        if (GetQuestionNo+1 >= deck.getQuestions().size()){
            Controller.storeInfo(CurrentScore, Time);
            EndScreen ES = new EndScreen();
            ES.setVisible(true);
            this.setVisible(false);
        }
        else{
            ChangeQuestions(GetQuestionNo+1);
            Option1Button.setText(Option1);
            Option2Button.setText(Option2);
            Option3Button.setText(Option3);
            QuestionNoText.setText("Question "+QuestionNo);
            ScoreText.setText("Score: "+CurrentScore);
            jLabel1.setText("<html>" + Question.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("/n", "<br/>") + "</html>");
        }

        
    }//GEN-LAST:event_Option1ButtonMouseClicked

    private void Option2ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option2ButtonMouseClicked
        if (CorrectAnswer == 2){
            CurrentScore += 1;
        }
        if (GetQuestionNo+1 >= deck.getQuestions().size()){
            Controller.storeInfo(CurrentScore, Time);
            EndScreen ES = new EndScreen();
            ES.setVisible(true);
            this.setVisible(false);
        }
        else{
            ChangeQuestions(GetQuestionNo+1);
            Option1Button.setText(Option1);
            Option2Button.setText(Option2);
            Option3Button.setText(Option3);
            QuestionNoText.setText("Question "+QuestionNo);
            ScoreText.setText("Score: "+CurrentScore);
            jLabel1.setText("<html>" + Question.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("/n", "<br/>") + "</html>");
        }
    }//GEN-LAST:event_Option2ButtonMouseClicked

    private void Option3ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option3ButtonMouseClicked
        if (CorrectAnswer == 3){
            CurrentScore += 1;
        }
        if (GetQuestionNo+1 >= deck.getQuestions().size()){
            Controller.storeInfo(CurrentScore, Time);
            EndScreen ES = new EndScreen();
            this.setVisible(false);
            ES.setVisible(true);
        }
        else{
            ChangeQuestions(GetQuestionNo+1);
            Option1Button.setText(Option1);
            Option2Button.setText(Option2);
            Option3Button.setText(Option3);
            QuestionNoText.setText("Question "+QuestionNo);
            ScoreText.setText("Score: "+CurrentScore);
            jLabel1.setText("<html>" + Question.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("/n", "<br/>") + "</html>");
        }
    }//GEN-LAST:event_Option3ButtonMouseClicked

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
            java.util.logging.Logger.getLogger(QuestionScreenBasic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionScreenBasic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionScreenBasic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionScreenBasic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionScreenBasic().setVisible(true);
            }
        });
    }
    
    public void ChangeQuestions(int IndexPos){
        QuestionNo += 1;
        GetQuestionNo += 1;
        Question = deck.getQuestions().get(IndexPos).getQuestion();
        Option1 = deck.getQuestions().get(IndexPos).getOption1();
        Option2 = deck.getQuestions().get(IndexPos).getOption2();
        Option3 = deck.getQuestions().get(IndexPos).getOption3();
        CorrectAnswer = deck.getQuestions().get(IndexPos).getCorrectAnswer();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Option1Button;
    private javax.swing.JButton Option2Button;
    private javax.swing.JButton Option3Button;
    private javax.swing.JLabel QuestionNoText;
    private javax.swing.JLabel ScoreText;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
