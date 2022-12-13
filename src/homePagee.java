/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;

/**
 *
 * @author pasansancak
 */
public class homePagee extends javax.swing.JFrame {

    /**
     * Creates new form homePagee
     */
    public homePagee() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        manageRoomButton = new javax.swing.JButton();
        checkInButton = new javax.swing.JButton();
        checkOutButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);

        manageRoomButton.setBackground(new java.awt.Color(240, 240, 240));
        manageRoomButton.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 14)); // NOI18N
        manageRoomButton.setText("Manage Room");
        manageRoomButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 51)));
        manageRoomButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        manageRoomButton.setSize(new java.awt.Dimension(100, 45));
        manageRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRoomButtonActionPerformed(evt);
            }
        });

        checkInButton.setBackground(new java.awt.Color(240, 240, 240));
        checkInButton.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 14)); // NOI18N
        checkInButton.setText("Customer Check In");
        checkInButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 51)));
        checkInButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        checkInButton.setSize(new java.awt.Dimension(100, 45));
        checkInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInButtonActionPerformed(evt);
            }
        });

        checkOutButton.setBackground(new java.awt.Color(240, 240, 240));
        checkOutButton.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 14)); // NOI18N
        checkOutButton.setText("Customer Check Out");
        checkOutButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 51)));
        checkOutButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        checkOutButton.setSize(new java.awt.Dimension(100, 45));
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(240, 240, 240));
        logoutButton.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 14)); // NOI18N
        logoutButton.setText("LOGOUT");
        logoutButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 51)));
        logoutButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        logoutButton.setSize(new java.awt.Dimension(100, 45));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(240, 240, 240));
        exitButton.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 14)); // NOI18N
        exitButton.setText("EXIT");
        exitButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 51)));
        exitButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        exitButton.setSize(new java.awt.Dimension(100, 45));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(manageRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200)
                                .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                                .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171)
                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(manageRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(683, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void manageRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //  new manageRoom().setVisible(true);
    }

    private void checkInButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //     new checkIn().setVisible(true);
    }

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int st = JOptionPane.showConfirmDialog(null, "Do you really want to Logout?", "Select", JOptionPane.YES_NO_OPTION);

        if (st == 0){
            setVisible(false);
            new loginPage().setVisible(true);
        }
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int st = JOptionPane.showConfirmDialog(null, "Do you really want to Exit?", "Select", JOptionPane.YES_NO_OPTION);

        if (st == 0){
            System.exit(0);
        }
    }

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //    new checkOut().setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(homePagee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePagee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePagee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePagee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homePagee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton checkInButton;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageRoomButton;
    // End of variables declaration
}

