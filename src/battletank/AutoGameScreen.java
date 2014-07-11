/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battletank;

import battletank.geneticAlgorithm.Population;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import battletank.geneticAlgorithm.*;
/**
 *
 * @author Asus
 */
public class AutoGameScreen extends javax.swing.JFrame {

    /**
     * Creates new form AutoGameScreen
     */
    AutoGame game;
    
    DrawBattleScreen battleScreen;
    
    Population population ;
    
    
    
    public AutoGameScreen() {
        initComponents();
        this.game = new AutoGame();
     
        game.setReport( new Report(1));
        try {
            this.game.getReport().readSetting(game);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AutoGameScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setLocation(0, 0);
        
        game.createNextMatch();
        
    }
  
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtActionInfo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtChromosomeInfo = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPointInfo = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtTanknInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 650));
        setMinimumSize(new java.awt.Dimension(1200, 650));
        setPreferredSize(new java.awt.Dimension(1200, 650));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton2.setText("NEXT TURN !");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        txtActionInfo.setColumns(20);
        txtActionInfo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtActionInfo.setRows(5);
        jScrollPane1.setViewportView(txtActionInfo);

        txtChromosomeInfo.setColumns(20);
        txtChromosomeInfo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtChromosomeInfo.setRows(5);
        jScrollPane2.setViewportView(txtChromosomeInfo);

        txtPointInfo.setColumns(20);
        txtPointInfo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPointInfo.setRows(5);
        jScrollPane3.setViewportView(txtPointInfo);

        txtTanknInfo.setColumns(20);
        txtTanknInfo.setRows(5);
        jScrollPane4.setViewportView(txtTanknInfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 720, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton2)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        battleScreen = new DrawBattleScreen(game);
        battleScreen.setLocation(300, 0);
        battleScreen.setSize(800, 800);
        battleScreen.setBackground(Color.white);
        battleScreen.setVisible(true);
        this.add(battleScreen);
        battleScreen.validate();    
         System.out.println("OPENNED"); 
       // TODO add your handling code here:
        // update chromosome 
         chromosomeInfo="";
   chromosomeInfo+= "CHROMOSOME A : "+game.getC1()+"\n";
   for (int i =0; i < Chromosome.numOfGen; i ++)
   chromosomeInfo+= game.getPopulation().getChromosomes()[game.getC1()].getGen(i) + " ";
   
   chromosomeInfo+= "\nCHROMOSOME B : "+game.getC2()+"\n";
   for (int i =0; i < Chromosome.numOfGen; i ++)
   chromosomeInfo+= game.getPopulation().getChromosomes()[game.getC2()].getGen(i) + " ";
      this.txtChromosomeInfo.setText(chromosomeInfo);
  
      
    }//GEN-LAST:event_formWindowOpened

    
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        update();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        System.out.println("Click!");        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(AutoGameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutoGameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutoGameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutoGameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutoGameScreen().setVisible(true);
                   System.out.println("DONE");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtActionInfo;
    private javax.swing.JTextArea txtChromosomeInfo;
    private javax.swing.JTextArea txtPointInfo;
    private javax.swing.JTextArea txtTanknInfo;
    // End of variables declaration//GEN-END:variables

    String actionInfo="";
    String chromosomeInfo="";
    String pointInfo = "";
    String tankInfo = "";
void update () {
    game.updateGame();
     battleScreen.update(game);
     battleScreen.validate();
    
    actionInfo = "";
   if (game.getSetting().getCurrentTeamAction() == "B") {
       actionInfo = "TEAM A\n";
       actionInfo += game.getTeamA().getDecisionAction().getCommand()+"\n";
       actionInfo += "("+game.getTeamA().getDecisionAction().getSource().getX()+","+game.getTeamA().getDecisionAction().getSource().getX()+")" ;
       actionInfo += "("+game.getTeamA().getDecisionAction().getDestination().getX()+","+game.getTeamA().getDecisionAction().getDestination().getX()+")" ;
   }
   else {
       actionInfo = "TEAM B\n";
       actionInfo += game.getTeamB().getDecisionAction().getCommand()+"\n";
       actionInfo += "("+game.getTeamB().getDecisionAction().getSource().getX()+","+game.getTeamB().getDecisionAction().getSource().getX()+")" ;
       actionInfo += "("+game.getTeamB().getDecisionAction().getDestination().getX()+","+game.getTeamB().getDecisionAction().getDestination().getX()+")" ;
   
   }
   
   tankInfo = "";
   tankInfo += "TANKS's TEAM A\n";
   for (int i =0; i < game.getTeamA().numOfTank; i ++)
      tankInfo+= game.getTeamA().getTanks()[i].getAmor() +" "+ game.getTeamA().getTanks()[i].getDamange() +" "+ game.getTeamA().getTanks()[i].getAttackRange()+" "+
                 game.getTeamA().getTanks()[i].getPosition().getX() +" " +game.getTeamA().getTanks()[i].getPosition().getY()+"\n";
   
   tankInfo += "TANKS's TEAM B\n";
   for (int i =0; i < game.getTeamB().numOfTank; i ++)
      tankInfo+= game.getTeamB().getTanks()[i].getAmor() +" "+ game.getTeamB().getTanks()[i].getDamange() +" "+ game.getTeamB().getTanks()[i].getAttackRange()+" "+
                  + game.getTeamB().getTanks()[i].getPosition().getX() +" " +game.getTeamB().getTanks()[i].getPosition().getY()+"\n";
   
   
   pointInfo ="";
   pointInfo += "TEAM A : " + game.getTeamA().getPoint() +"\n";
   pointInfo += "TEAM B : " + game.getTeamB().getPoint() +"\n";
     
     this.txtActionInfo.setText(actionInfo);
     this.txtChromosomeInfo.setText(chromosomeInfo);
     this.txtPointInfo.setText(pointInfo);
     this.txtTanknInfo.setText(tankInfo);
}

}