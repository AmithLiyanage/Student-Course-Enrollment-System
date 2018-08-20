/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package takehomeassignment;

import javax.swing.JFrame;

/**
 *
 * @author Acer
 */
public class UpdateMarksFrame extends javax.swing.JFrame {

    DBOperation dbOps = new DBOperation();
    
    int mousepX;
    int mousepY;
    Marks m;
    
    /**
     * Creates new form UpdateMarksFrame
     */
    public UpdateMarksFrame() {
        initComponents();
    }
    
    void setFields(Marks mr){
        m = mr;
        
        txtIndexNo.setText(new Integer(mr.getIndexNo()).toString());
        txtSemester.setText(new Integer(mr.getSemester()).toString());
        ddSubject1.setSelectedItem(mr.getSubject1());
        ddSubject2.setSelectedItem(mr.getSubject2());
        ddSubject3.setSelectedItem(mr.getSubject3());
        ddSubject4.setSelectedItem(mr.getSubject4());
        ddSubject5.setSelectedItem(mr.getSubject5());
        ddSubject6.setSelectedItem(mr.getSubject6());
        txtGPA.setText(new Double(mr.getGPA()).toString());
        txtEmail.setText(mr.getEmail());
        txtSendEmail.setText(mr.getSendOrNot());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIndexNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ddSubject1 = new javax.swing.JComboBox();
        txtSemester = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ddSubject3 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        ddSubject5 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        ddSubject2 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        ddSubject4 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        ddSubject6 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        txtGPA = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtSendEmail = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        jPanelTopBar2 = new javax.swing.JPanel();
        lblMinimize3 = new javax.swing.JLabel();
        lblClose1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setToolTipText("");

        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Index No");

        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Semester");

        txtIndexNo.setEditable(false);
        txtIndexNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtIndexNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndexNoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Subject 1");

        ddSubject1.setBackground(new java.awt.Color(240, 240, 240));
        ddSubject1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "AB", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));

        txtSemester.setEditable(false);
        txtSemester.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemesterActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Subject 3");

        ddSubject3.setBackground(new java.awt.Color(240, 240, 240));
        ddSubject3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "AB", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));

        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Subject 5");

        ddSubject5.setBackground(new java.awt.Color(240, 240, 240));
        ddSubject5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "AB", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));

        jLabel16.setForeground(new java.awt.Color(0, 0, 153));
        jLabel16.setText("Subject 2");

        ddSubject2.setBackground(new java.awt.Color(240, 240, 240));
        ddSubject2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "AB", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));

        jLabel17.setForeground(new java.awt.Color(0, 0, 153));
        jLabel17.setText("Subject 4");

        ddSubject4.setBackground(new java.awt.Color(240, 240, 240));
        ddSubject4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "AB", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));

        jLabel18.setForeground(new java.awt.Color(0, 0, 153));
        jLabel18.setText("Subject 6");

        ddSubject6.setBackground(new java.awt.Color(240, 240, 240));
        ddSubject6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "AB", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));

        jLabel19.setForeground(new java.awt.Color(0, 0, 153));
        jLabel19.setText("GPA");

        txtGPA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGPAActionPerformed(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(0, 0, 153));
        jLabel20.setText("Email");

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(0, 0, 153));
        jLabel21.setText("Send Result?");

        txtSendEmail.setEditable(false);
        txtSendEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSendEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(txtSendEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtGPA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(ddSubject1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ddSubject5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ddSubject3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIndexNo, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel16))
                                    .addComponent(jLabel2))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ddSubject2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ddSubject6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ddSubject4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtSemester, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtEmail))
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ddSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ddSubject4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ddSubject6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ddSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ddSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ddSubject5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtSendEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 390, 280));

        btnOK.setBackground(new java.awt.Color(31, 58, 147));
        btnOK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOK.setForeground(new java.awt.Color(255, 255, 255));
        btnOK.setText("OK");
        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        jPanel2.add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 90, 30));

        jPanelTopBar2.setBackground(new java.awt.Color(102, 255, 102));
        jPanelTopBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMinimize3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMinimize3.setForeground(new java.awt.Color(102, 102, 255));
        lblMinimize3.setText("-");
        lblMinimize3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimize3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimize3MouseClicked(evt);
            }
        });

        lblClose1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblClose1.setForeground(new java.awt.Color(102, 102, 255));
        lblClose1.setText("x");
        lblClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose1MouseClicked(evt);
            }
        });

        jLabel15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel15MouseDragged(evt);
            }
        });
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTopBar2Layout = new javax.swing.GroupLayout(jPanelTopBar2);
        jPanelTopBar2.setLayout(jPanelTopBar2Layout);
        jPanelTopBar2Layout.setHorizontalGroup(
            jPanelTopBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopBar2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblMinimize3)
                .addGap(10, 10, 10)
                .addComponent(lblClose1)
                .addContainerGap())
        );
        jPanelTopBar2Layout.setVerticalGroup(
            jPanelTopBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopBar2Layout.createSequentialGroup()
                .addGroup(jPanelTopBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMinimize3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblClose1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanelTopBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(92, 151, 191));
        jLabel14.setText("Update Marks");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 444));

        setSize(new java.awt.Dimension(431, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIndexNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndexNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndexNoActionPerformed

    private void txtSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemesterActionPerformed

    private void txtGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGPAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGPAActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtSendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSendEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSendEmailActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        Marks m = new Marks();

        m.setIndexNo(Integer.parseInt(txtIndexNo.getText()));
        m.setSemester(Integer.parseInt(txtSemester.getText()));
        m.setSubject1(ddSubject1.getSelectedItem().toString());
        m.setSubject2(ddSubject2.getSelectedItem().toString());
        m.setSubject3(ddSubject3.getSelectedItem().toString());
        m.setSubject4(ddSubject4.getSelectedItem().toString());
        m.setSubject5(ddSubject5.getSelectedItem().toString());
        m.setSubject6(ddSubject6.getSelectedItem().toString());
        m.setGPA(Double.parseDouble(txtGPA.getText()));
        System.out.println(txtEmail.getText());
        m.setEmail(txtEmail.getText());
        m.setSendOrNot(txtSendEmail.getText());

        dbOps.updateMarks(m);
        this.dispose();
    }//GEN-LAST:event_btnOKActionPerformed

    private void lblMinimize3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimize3MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimize3MouseClicked

    private void lblClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose1MouseClicked
        this.dispose();
    }//GEN-LAST:event_lblClose1MouseClicked

    private void jLabel15MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseDragged
        int cordinateX = evt.getXOnScreen();
        int cordinateY = evt.getYOnScreen();

        this.setLocation(cordinateX - mousepX , cordinateY - mousepY);
    }//GEN-LAST:event_jLabel15MouseDragged

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jLabel15MousePressed

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
            java.util.logging.Logger.getLogger(UpdateMarksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMarksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMarksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMarksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMarksFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox ddSubject1;
    private javax.swing.JComboBox ddSubject2;
    private javax.swing.JComboBox ddSubject3;
    private javax.swing.JComboBox ddSubject4;
    private javax.swing.JComboBox ddSubject5;
    private javax.swing.JComboBox ddSubject6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTopBar2;
    private javax.swing.JLabel lblClose1;
    private javax.swing.JLabel lblMinimize3;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGPA;
    private javax.swing.JTextField txtIndexNo;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtSendEmail;
    // End of variables declaration//GEN-END:variables
}
