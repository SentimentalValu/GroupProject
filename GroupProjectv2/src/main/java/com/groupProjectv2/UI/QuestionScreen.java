package com.groupProjectv2.UI;

import com.groupProjectv2.model.Question;

/**
 *
 * @author jackf
 */
public class QuestionScreen extends javax.swing.JFrame {
    private String QuestionNoToDisplay = "";
    private String QuestionText;
    private String Option1;
    private String Option2;
    private String Option3;
    private int CorrectAnswer;
    private int Score;
    
    /**
     * Creates new form QuestionScreen
     * @param QuestionIn
     * @param CurrentScore
     */
    public QuestionScreen(Question QuestionIn, int CurrentScore, int TimeStart) {
        QuestionNoToDisplay = ""+QuestionIn.getQuestionNo()+"";
        QuestionText =  QuestionIn.getQuestion();
        Option1 = QuestionIn.getOption1();
        Option2 = QuestionIn.getOption2();
        Option3 = QuestionIn.getOption3();
        CorrectAnswer = QuestionIn.getCorrectAnswer();
        Score = CurrentScore;
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
        Option3Button = new javax.swing.JButton();
        Option2Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        QuestionDisplay = new javax.swing.JTextPane();
        QuestionNo = new javax.swing.JLabel();
        SocreText = new javax.swing.JLabel();
        Timertext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Exit.setText("Exit");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        Option1Button.setText("Option1");
        Option1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Option1ButtonMouseClicked(evt);
            }
        });

        Option3Button.setText("Option3");
        Option3Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Option3ButtonMouseClicked(evt);
            }
        });

        Option2Button.setText("Option2");
        Option2Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Option2ButtonMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(QuestionDisplay);

        QuestionNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuestionNo.setText("QUESTIONNO");

        SocreText.setText("Score");

        Timertext.setText("Timer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Exit)
                        .addGap(87, 87, 87)
                        .addComponent(SocreText, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(Timertext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Option1Button)
                            .addComponent(Option3Button)
                            .addComponent(Option2Button))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QuestionNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 13, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exit)
                    .addComponent(SocreText)
                    .addComponent(Timertext))
                .addGap(25, 25, 25)
                .addComponent(QuestionNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Option1Button)
                        .addGap(47, 47, 47)
                        .addComponent(Option2Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(Option3Button)
                        .addGap(49, 49, 49))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void Option1ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option1ButtonMouseClicked
        if (CorrectAnswer == 1){
            Score += 1;
        }
        // Continue
    }//GEN-LAST:event_Option1ButtonMouseClicked

    private void Option2ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option2ButtonMouseClicked
        if (CorrectAnswer == 2){
            Score += 1;
        }
        // Continue
    }//GEN-LAST:event_Option2ButtonMouseClicked

    private void Option3ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option3ButtonMouseClicked
        if (CorrectAnswer == 3){
            Score += 1;
        }
        // Continue
    }//GEN-LAST:event_Option3ButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(QuestionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
            //public void run() {
                //new QuestionScreen().setVisible(true);
            //}
        //});
   // }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Option1Button;
    private javax.swing.JButton Option2Button;
    private javax.swing.JButton Option3Button;
    private javax.swing.JTextPane QuestionDisplay;
    private javax.swing.JLabel QuestionNo;
    private javax.swing.JLabel SocreText;
    private javax.swing.JLabel Timertext;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
