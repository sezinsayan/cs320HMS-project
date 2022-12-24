import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import project.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author erens
 */
public class CustomerCheckOut extends javax.swing.JFrame {

        /**
         * Creates new form CustomerCheckOut
         */
        public CustomerCheckOut() {
                initComponents();
                jTextField2.setEditable(false);
                jTextField3.setEditable(false);
                jTextField4.setEditable(false);
                jTextField5.setEditable(false);
                jTextField6.setEditable(false);
                jTextField7.setEditable(false);
                jTextField8.setEditable(false);
                jTextField9.setEditable(false);
        }
        int id = 0;
        String Query;
        String roomType;
        String bed;
        String roomNo;

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {
                java.awt.GridBagConstraints gridBagConstraints;

                jLabel1 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jButton2 = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jLabel3 = new javax.swing.JLabel();
                jTextField2 = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                jTextField3 = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                jTextField4 = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                jTextField5 = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jTextField6 = new javax.swing.JTextField();
                jLabel10 = new javax.swing.JLabel();
                jTextField7 = new javax.swing.JTextField();
                jTextField8 = new javax.swing.JTextField();
                jTextField9 = new javax.swing.JTextField();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setLocation(new java.awt.Point(50, 118));
                setUndecorated(true);
                addComponentListener(new java.awt.event.ComponentAdapter() {
                        public void componentShown(java.awt.event.ComponentEvent evt) {
                                formComponentShown(evt);
                        }
                });
                getContentPane().setLayout(new java.awt.GridBagLayout());

                jLabel1.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 14)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 153, 0));
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer Check Out.png"))); // NOI18N
                jLabel1.setText("Customer Check Out");
                jLabel1.setToolTipText("");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.gridwidth = 6;
                gridBagConstraints.gridheight = 2;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(15, 20, 0, 0);
                getContentPane().add(jLabel1, gridBagConstraints);

                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 21;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(20, 24, 0, 0);
                getContentPane().add(jButton1, gridBagConstraints);

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel2.setText("Room Number");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 7;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.gridwidth = 2;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(28, 151, 0, 0);
                getContentPane().add(jLabel2, gridBagConstraints);

                jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField1ActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 9;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.gridwidth = 6;
                gridBagConstraints.gridheight = 2;
                gridBagConstraints.ipadx = 66;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(25, 18, 0, 0);
                getContentPane().add(jTextField1, gridBagConstraints);

                jButton2.setBackground(new java.awt.Color(102, 255, 255));
                jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton2.setForeground(new java.awt.Color(255, 255, 255));
                jButton2.setText("Search");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 15;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.gridheight = 3;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(25, 18, 0, 0);
                getContentPane().add(jButton2, gridBagConstraints);

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "ID", "Name", "Phone Number", "Gender", "Email", "ID Proof", "Address", "Check In Date", "Room Number", "Bed", "Room Type", "Price Per Day", "Num Of Days Stay", "Total Payment", "Check Out Date"
                        }
                ));
                jTable1.setMaximumSize(new java.awt.Dimension(1366, 768));
                jScrollPane1.setViewportView(jTable1);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 11;
                gridBagConstraints.gridwidth = 23;
                gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
                gridBagConstraints.ipadx = 1338;
                gridBagConstraints.ipady = 377;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.weightx = 1.0;
                gridBagConstraints.weighty = 1.0;
                gridBagConstraints.insets = new java.awt.Insets(18, 6, 6, 6);
                getContentPane().add(jScrollPane1, gridBagConstraints);

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel3.setText("Customer Name");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 5;
                gridBagConstraints.gridwidth = 3;
                gridBagConstraints.gridheight = 2;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(33, 50, 0, 0);
                getContentPane().add(jLabel3, gridBagConstraints);

                jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jTextField2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField2ActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 7;
                gridBagConstraints.gridwidth = 7;
                gridBagConstraints.ipadx = 146;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(10, 50, 0, 0);
                getContentPane().add(jTextField2, gridBagConstraints);

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel4.setText("Check In Date");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 7;
                gridBagConstraints.gridy = 5;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(23, 150, 0, 0);
                getContentPane().add(jLabel4, gridBagConstraints);

                jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jTextField3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField3ActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 7;
                gridBagConstraints.gridy = 7;
                gridBagConstraints.gridwidth = 5;
                gridBagConstraints.ipadx = 146;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(10, 150, 0, 0);
                getContentPane().add(jTextField3, gridBagConstraints);

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel5.setText("Check Out Date (Today)");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 16;
                gridBagConstraints.gridy = 5;
                gridBagConstraints.gridwidth = 2;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(23, 19, 0, 0);
                getContentPane().add(jLabel5, gridBagConstraints);

                jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 16;
                gridBagConstraints.gridy = 7;
                gridBagConstraints.gridwidth = 3;
                gridBagConstraints.ipadx = 136;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(10, 19, 0, 0);
                getContentPane().add(jTextField4, gridBagConstraints);

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel6.setText("Customer Phone Number");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 19;
                gridBagConstraints.gridy = 5;
                gridBagConstraints.gridwidth = 2;
                gridBagConstraints.gridheight = 2;
                gridBagConstraints.ipadx = 37;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(33, 110, 0, 0);
                getContentPane().add(jLabel6, gridBagConstraints);

                jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 19;
                gridBagConstraints.gridy = 7;
                gridBagConstraints.gridwidth = 2;
                gridBagConstraints.ipadx = 142;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(10, 110, 0, 0);
                getContentPane().add(jTextField5, gridBagConstraints);

                jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel7.setText("Price Per Day");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 8;
                gridBagConstraints.gridwidth = 2;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(24, 50, 0, 0);
                getContentPane().add(jLabel7, gridBagConstraints);

                jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel8.setText("Number of Days Stay");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 7;
                gridBagConstraints.gridy = 8;
                gridBagConstraints.gridwidth = 3;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(24, 150, 0, 0);
                getContentPane().add(jLabel8, gridBagConstraints);

                jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel9.setText("Total Payment");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 16;
                gridBagConstraints.gridy = 8;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(24, 19, 0, 0);
                getContentPane().add(jLabel9, gridBagConstraints);

                jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 9;
                gridBagConstraints.gridwidth = 7;
                gridBagConstraints.ipadx = 146;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(20, 50, 0, 0);
                getContentPane().add(jTextField6, gridBagConstraints);

                jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel10.setText("Email");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 19;
                gridBagConstraints.gridy = 8;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(24, 110, 0, 0);
                getContentPane().add(jLabel10, gridBagConstraints);

                jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 7;
                gridBagConstraints.gridy = 9;
                gridBagConstraints.gridwidth = 5;
                gridBagConstraints.ipadx = 146;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(20, 150, 0, 0);
                getContentPane().add(jTextField7, gridBagConstraints);

                jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 16;
                gridBagConstraints.gridy = 9;
                gridBagConstraints.gridwidth = 3;
                gridBagConstraints.ipadx = 136;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(20, 19, 0, 0);
                getContentPane().add(jTextField8, gridBagConstraints);

                jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 19;
                gridBagConstraints.gridy = 9;
                gridBagConstraints.gridwidth = 2;
                gridBagConstraints.ipadx = 142;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(20, 110, 0, 0);
                getContentPane().add(jTextField9, gridBagConstraints);

                jButton3.setBackground(new java.awt.Color(102, 255, 255));
                jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton3.setForeground(new java.awt.Color(255, 255, 255));
                jButton3.setText("Check Out");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 10;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(24, 20, 0, 0);
                getContentPane().add(jButton3, gridBagConstraints);

                jButton4.setBackground(new java.awt.Color(102, 255, 255));
                jButton4.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 14)); // NOI18N
                jButton4.setForeground(new java.awt.Color(255, 255, 255));
                jButton4.setText("Clear");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 10;
                gridBagConstraints.gridwidth = 4;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(24, 18, 0, 0);
                getContentPane().add(jButton4, gridBagConstraints);

                pack();
        }// </editor-fold>

        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                setVisible(false);
        }

        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void formComponentShown(java.awt.event.ComponentEvent evt) {
                // TODO add your handling code here:
                ResultSet rs = Select.getData("select *from customer where checkOut is NULL");
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                try
                {
                        while(rs.next())
                        {
                                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(6),rs.getString(5),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15)});
                        }
                        rs.close();
                }
                catch(Exception e)
                {
                        JOptionPane.showMessageDialog(null, e);
                }
        }

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                String roomNo=jTextField1.getText();
                try
                {
                        ResultSet rs=Service.SelectCustomer(roomNo);
                        if(rs.next()){
                                jTextField1.setEditable(false);
                                id=rs.getInt(1);
                                jTextField2.setText(rs.getString(2));
                                jTextField3.setText(rs.getString(8));
                                jTextField5.setText(rs.getString(3));
                                jTextField6.setText(rs.getString(12));

                                SimpleDateFormat myFormat= new SimpleDateFormat("yyyy/MM/dd");
                                Calendar cal = Calendar.getInstance();
                                jTextField4.setText(myFormat.format(cal.getTime()));
                                String dateBeforeString=rs.getString(8);
                                java.util.Date dateBefore=myFormat.parse(dateBeforeString);
                                String dateAfterString=myFormat.format(cal.getTime());
                                java.util.Date dateAfter=myFormat.parse(dateAfterString);
                                long difference = dateAfter.getTime() - dateBefore.getTime();
                                int noOfDayStay=(int) (difference/(1000*60*60*24));
                                if(noOfDayStay==0) {
                                        noOfDayStay = 1;
                                }
                                jTextField7.setText(String.valueOf(noOfDayStay));
                                float price = Float.parseFloat(jTextField6.getText());

                                jTextField8.setText(String.valueOf(noOfDayStay*price));
                                jTextField9.setText(rs.getString(6));
                                roomType=rs.getString(11);
                                bed=rs.getString(10);
                        }
                        else {
                                JOptionPane.showMessageDialog(null,"Room Number is not Booked or Room Number Does not Exist");
                        }
                }
                catch(Exception e)
                {
                        JOptionPane.showMessageDialog(null,e);
                }
        }

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                setVisible(false);
                new CustomerCheckOut().setVisible(true);
        }

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                String name=jTextField2.getText();
                String mobileNumber=jTextField5.getText();
                String email=jTextField9.getText();

                String checkOut=jTextField4.getText();
                String numberOfDaysStay=jTextField7.getText();
                String totalAmount=jTextField8.getText();
                roomNo=jTextField1.getText();
                Service.CheckOut(numberOfDaysStay, totalAmount, checkOut, id, roomNo);

                setVisible(false);
                new CustomerCheckOut().setVisible(true);
        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                setVisible(false);
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
                        java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new CustomerCheckOut().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable1;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JTextField jTextField5;
        private javax.swing.JTextField jTextField6;
        private javax.swing.JTextField jTextField7;
        private javax.swing.JTextField jTextField8;
        private javax.swing.JTextField jTextField9;
        // End of variables declaration
}
