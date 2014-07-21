/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battletank;

import battletank.geneticAlgorithm.Chromosome;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ManualBattle extends javax.swing.JFrame {

     public ManualGame game;
    
      DrawBattleScreen battleScreen;
    
    /**
     * Creates new form ManualBattle
     */
    public ManualBattle() {
        initComponents();
        game = new ManualGame();
        game.setReport( new Report(1));
        try {
            this.game.getReport().readSetting(game);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AutoGameScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setLocation(0, 0);
       
        this.getContentPane().setBackground(Color.BLACK);
        
        battleScreen = new DrawBattleScreen(game);
        battleScreen.setLocation(380, 120);
        battleScreen.setSize(800, 800);
        battleScreen.setBackground(Color.white);
        battleScreen.setVisible(true);
        game.generateGame();
        this.add(battleScreen);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDecisionBetA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDecisionBetB = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnExecuteBetB = new javax.swing.JButton();
        btnWriteBetFileB = new javax.swing.JButton();
        btnExecuteBetA = new javax.swing.JButton();
        btnWriteBetFileA = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDecisionPlaceB = new javax.swing.JTextArea();
        btnWritePlaceFileB = new javax.swing.JButton();
        btnExecutePlaceB = new javax.swing.JButton();
        btnExecutePlaceA = new javax.swing.JButton();
        btnWritePlaceFileA = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDecisionPlaceA1 = new javax.swing.JTextArea();
        btnExecuteActionB = new javax.swing.JButton();
        btnWriteActionFileB = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtDecisionActionB = new javax.swing.JTextArea();
        btnWriteActionFileA = new javax.swing.JButton();
        btnExecuteActionA = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDecisionActionA = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDecisionBetA.setColumns(20);
        txtDecisionBetA.setRows(5);
        txtDecisionBetA.setAutoscrolls(false);
        txtDecisionBetA.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jScrollPane1.setViewportView(txtDecisionBetA);

        txtDecisionBetB.setColumns(20);
        txtDecisionBetB.setRows(5);
        jScrollPane2.setViewportView(txtDecisionBetB);

        jLabel2.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("TEAM B");

        jLabel3.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("TEAM A");

        btnExecuteBetB.setText("Execute");

        btnWriteBetFileB.setText("Write->File");

        btnExecuteBetA.setText("Execute");

        btnWriteBetFileA.setText("Write->File");

        txtDecisionPlaceB.setColumns(20);
        txtDecisionPlaceB.setRows(5);
        txtDecisionPlaceB.setAutoscrolls(false);
        txtDecisionPlaceB.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jScrollPane3.setViewportView(txtDecisionPlaceB);

        btnWritePlaceFileB.setText("Write->File");

        btnExecutePlaceB.setText("Execute");

        btnExecutePlaceA.setText("Execute");

        btnWritePlaceFileA.setText("Write->File");

        txtDecisionPlaceA1.setColumns(20);
        txtDecisionPlaceA1.setRows(5);
        txtDecisionPlaceA1.setAutoscrolls(false);
        txtDecisionPlaceA1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jScrollPane4.setViewportView(txtDecisionPlaceA1);

        btnExecuteActionB.setText("Execute");

        btnWriteActionFileB.setText("Write->File");

        txtDecisionActionB.setColumns(20);
        txtDecisionActionB.setRows(5);
        jScrollPane5.setViewportView(txtDecisionActionB);

        btnWriteActionFileA.setText("Write->File");

        btnExecuteActionA.setText("Execute");

        txtDecisionActionA.setColumns(20);
        txtDecisionActionA.setRows(5);
        jScrollPane6.setViewportView(txtDecisionActionA);

        jButton1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("UPDATE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnWriteBetFileA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExecuteBetA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnWriteBetFileB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExecuteBetB))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnWritePlaceFileA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExecutePlaceA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnWritePlaceFileB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExecutePlaceB))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnWriteActionFileA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExecuteActionA)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 848, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnWriteActionFileB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExecuteActionB)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(502, 502, 502))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExecuteBetB)
                    .addComponent(btnWriteBetFileB)
                    .addComponent(btnExecuteBetA)
                    .addComponent(btnWriteBetFileA))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExecutePlaceB)
                    .addComponent(btnWritePlaceFileB)
                    .addComponent(btnExecutePlaceA)
                    .addComponent(btnWritePlaceFileA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExecuteActionB)
                            .addComponent(btnWriteActionFileB)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExecuteActionA)
                            .addComponent(btnWriteActionFileA))))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        game.generateGame();
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(ManualBattle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManualBattle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManualBattle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManualBattle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManualBattle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecuteActionA;
    private javax.swing.JButton btnExecuteActionB;
    private javax.swing.JButton btnExecuteBetA;
    private javax.swing.JButton btnExecuteBetB;
    private javax.swing.JButton btnExecutePlaceA;
    private javax.swing.JButton btnExecutePlaceB;
    private javax.swing.JButton btnWriteActionFileA;
    private javax.swing.JButton btnWriteActionFileB;
    private javax.swing.JButton btnWriteBetFileA;
    private javax.swing.JButton btnWriteBetFileB;
    private javax.swing.JButton btnWritePlaceFileA;
    private javax.swing.JButton btnWritePlaceFileB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea txtDecisionActionA;
    private javax.swing.JTextArea txtDecisionActionB;
    private javax.swing.JTextArea txtDecisionBetA;
    private javax.swing.JTextArea txtDecisionBetB;
    private javax.swing.JTextArea txtDecisionPlaceA1;
    private javax.swing.JTextArea txtDecisionPlaceB;
    // End of variables declaration//GEN-END:variables
 public void update () {
     
   
   
     if ( game.getSetting().getGameState()== Setting.GAME_STATE.BET ) {
         game.getTeamA().addDecisionBet( new DecisionBet(game.getSetting().getCurrentBetTurn(),Integer.parseInt( this.txtDecisionBetA.getText() ) ));
         game.getTeamB().addDecisionBet( new DecisionBet(game.getSetting().getCurrentBetTurn(),Integer.parseInt( this.txtDecisionBetB.getText() ) ));
         try {
             game.getReport().updateTeamReportBet(game);
         } catch (IOException ex) {
             Logger.getLogger(ManualBattle.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     game.updateGame();
     battleScreen.update(game);
     battleScreen.validate();
     
    }

}
