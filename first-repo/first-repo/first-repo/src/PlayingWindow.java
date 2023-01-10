
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class PlayingWindow extends javax.swing.JFrame {
    private Deck deck;
    private Dealer dealer;
    private Player player;
    private String name1;
    /**
     * Creates new form PlayingWindow
     */
    public PlayingWindow() {
        initComponents();
        deck = new Deck();
        player = new Player();
        dealer = new Dealer();
        NewRoundBtn.setEnabled(false);
        deck.shuffle();
        
        name1 = JOptionPane.showInputDialog(this, "Въведете име!");
        String regex = "^\\S+$";
        if (name1 != null && name1.matches(regex)) {
            this.name1 = name1;
        }
        player.set_name(name1+": ");
        
        
        dealer.getHand().takeCardFromDeck(deck);
        player.getHand().takeCardFromDeck(deck);
        dealer.getHand().takeCardFromDeck(deck);
        player.getHand().takeCardFromDeck(deck);
        jLabel2.setText(player.get_Name());
        dealerHandLabel.setText(dealer.getHand().getCard(0).toString());
        playerhandlabel.setText(player.getHand().getCard(0).toString());
        playerhandlabel.setText(playerhandlabel.getText() + player.getHand().getLastCard());
        dealerResultLabel.setText(dealer.getHand().getCard(0).getValue() + "");
        playerResultLabel.setText(player.getHand().calculateValue() + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        stopBtn = new javax.swing.JButton();
        takeCardBtn = new javax.swing.JButton();
        dealerHandLabel = new javax.swing.JLabel();
        playerhandlabel = new javax.swing.JLabel();
        dealerResultLabel = new javax.swing.JLabel();
        playerResultLabel = new javax.swing.JLabel();
        resultlabel = new javax.swing.JLabel();
        NewRoundBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(53, 101, 77));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Dealer's hand:");
        jLabel1.setPreferredSize(new java.awt.Dimension(170, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Player's hand:");
        jLabel2.setToolTipText("");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setMaximumSize(new java.awt.Dimension(153, 76));
        jLabel2.setPreferredSize(new java.awt.Dimension(170, 70));

        stopBtn.setBackground(new java.awt.Color(128, 128, 128));
        stopBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stopBtn.setText("Stand");
        stopBtn.setActionCommand("");
        stopBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stopBtn.setBorderPainted(false);
        stopBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopBtnMouseClicked(evt);
            }
        });

        takeCardBtn.setBackground(new java.awt.Color(128, 128, 128));
        takeCardBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        takeCardBtn.setText("Hit");
        takeCardBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        takeCardBtn.setBorderPainted(false);
        takeCardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeCardBtnActionPerformed(evt);
            }
        });

        dealerHandLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dealerHandLabel.setPreferredSize(new java.awt.Dimension(20, 20));

        playerhandlabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        playerhandlabel.setPreferredSize(new java.awt.Dimension(20, 20));

        dealerResultLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        dealerResultLabel.setForeground(new java.awt.Color(153, 0, 0));
        dealerResultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dealerResultLabel.setPreferredSize(new java.awt.Dimension(20, 20));

        playerResultLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        playerResultLabel.setForeground(new java.awt.Color(153, 0, 0));
        playerResultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerResultLabel.setToolTipText("");
        playerResultLabel.setMaximumSize(new java.awt.Dimension(20, 20));
        playerResultLabel.setPreferredSize(new java.awt.Dimension(20, 20));

        resultlabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        resultlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        NewRoundBtn.setBackground(new java.awt.Color(128, 128, 128));
        NewRoundBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NewRoundBtn.setText("New Round");
        NewRoundBtn.setActionCommand("");
        NewRoundBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NewRoundBtn.setBorderPainted(false);
        NewRoundBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewRoundBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerhandlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dealerHandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dealerResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(playerResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(resultlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(takeCardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(NewRoundBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(dealerHandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dealerResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(resultlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playerResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(playerhandlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(takeCardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewRoundBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(194, 194, 194))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewRoundBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewRoundBtnMouseClicked
     this.dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayingWindow().setVisible(true);
            }
        });  
    }//GEN-LAST:event_NewRoundBtnMouseClicked

    private void takeCardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeCardBtnActionPerformed
        player.getHand().takeCardFromDeck(deck);
        
        playerhandlabel.setText(playerhandlabel.getText() + player.getHand().getLastCard());
        int playerResult = player.getHand().calculateValue();
        playerResultLabel.setText(playerResult + "");
        
        if(playerResult > 21) {
           resultlabel.setText("Dealer Wins");
           takeCardBtn.setEnabled(false);
           stopBtn.setEnabled(false);
           NewRoundBtn.setEnabled(true);
           
           
           
        
        
         try (FileWriter fileWriter = new FileWriter("E:\\Java\\first-repo\\first-repo\\first-repo\\src\\Result.txt", true);
                PrintWriter printWriter = new PrintWriter(fileWriter)) {
            
                printWriter.printf("%-10s %-15s %-15s\n","dealer", " wins");
            
            
        } catch (IOException e) {
            // handle the exception here.
        }
        }
    }//GEN-LAST:event_takeCardBtnActionPerformed

    private void stopBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopBtnMouseClicked

        dealerHandLabel.setText(dealerHandLabel.getText() + dealer.getHand().getLastCard());
        while(dealer.getHand().calculateValue() < 17) {
            dealer.getHand().takeCardFromDeck(deck);
            dealerHandLabel.setText(dealerHandLabel.getText() + dealer.getHand().getLastCard());
            

        }
        int playerHandValue = player.getHand().calculateValue();
        int dealerHandValue = dealer.getHand().calculateValue();
        
        dealerResultLabel.setText(dealerHandValue + "");
        
        if(dealerHandValue> 21) {
            resultlabel.setText("Player Wins");
            takeCardBtn.setEnabled(false);
            stopBtn.setEnabled(false);
            NewRoundBtn.setEnabled(true);
            
            
            try (FileWriter fileWriter = new FileWriter("E:\\Java\\first-repo\\first-repo\\first-repo\\src\\Result.txt", true);
                PrintWriter printWriter = new PrintWriter(fileWriter)) {
            
                printWriter.printf("%-10s %-15s %-15s\n",player.get_Name(), " wins");
            
            
        } catch (IOException e) {
            // handle the exception here.
        }
            
        }
        else if(playerHandValue > dealerHandValue){
            resultlabel.setText("Player Wins");
            takeCardBtn.setEnabled(false);
            stopBtn.setEnabled(false);
            NewRoundBtn.setEnabled(true);
            
            
            try (FileWriter fileWriter = new FileWriter("E:\\Java\\first-repo\\first-repo\\first-repo\\src\\Result.txt", true);
                PrintWriter printWriter = new PrintWriter(fileWriter)) {
            
                printWriter.printf("%-10s %-15s %-15s\n",player.get_Name(), " wins");
            
            
        } catch (IOException e) {
            // handle the exception here.
        }
        }
        else if(playerHandValue < dealerHandValue){
            resultlabel.setText("Dealer Wins");
            takeCardBtn.setEnabled(false);
            stopBtn.setEnabled(false);
            NewRoundBtn.setEnabled(true);
            
            
            
            try (FileWriter fileWriter = new FileWriter("E:\\Java\\first-repo\\first-repo\\first-repo\\src\\Result.txt", true);
                PrintWriter printWriter = new PrintWriter(fileWriter)) {
                
                printWriter.printf("%-10s %-15s %-15s\n","dealer", " wins", "\n");
            
            
        } catch (IOException e) {
            // handle the exception here.
        }
        }   
        else {
            resultlabel.setText("Tie");
            takeCardBtn.setEnabled(false);
            stopBtn.setEnabled(false);
            NewRoundBtn.setEnabled(true);
            
            
        }    
            
        
        
        
    }//GEN-LAST:event_stopBtnMouseClicked

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
            java.util.logging.Logger.getLogger(PlayingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayingWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewRoundBtn;
    private javax.swing.JLabel dealerHandLabel;
    private javax.swing.JLabel dealerResultLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel playerResultLabel;
    private javax.swing.JLabel playerhandlabel;
    private javax.swing.JLabel resultlabel;
    private javax.swing.JButton stopBtn;
    private javax.swing.JButton takeCardBtn;
    // End of variables declaration//GEN-END:variables
}
