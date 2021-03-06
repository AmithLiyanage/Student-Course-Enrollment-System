/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package takehomeassignment;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class UpdateUndergraduateStudentFrame extends javax.swing.JFrame {

    DBOperation dbOpsU = new DBOperation();
    int mousepX;
    int mousepY;
    Student st;
    
    /**
     * Creates new form UpdateUndergraduateStudentFrame
     */
    public UpdateUndergraduateStudentFrame() {
        initComponents();
    }
    
    void setFields(UndergraduateStudent ustudent){
        st = ustudent;
        txtALExamYear.setText(new Integer(ustudent.getALYear()).toString());
        ddShy.setSelectedItem(ustudent.getShy());
        txtSubject1.setText(ustudent.getSubject1());
        txtSubject2.setText(ustudent.getSubject2());
        txtSubject3.setText(ustudent.getSubject3());
        ddResultEnglish.setSelectedItem(ustudent.getGeneralEnglish());
        txtZScore.setText(new Double(ustudent.getzScore()).toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTopBar2 = new javax.swing.JPanel();
        lblMinimize3 = new javax.swing.JLabel();
        lblClose2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSubject1 = new javax.swing.JTextField();
        txtSubject2 = new javax.swing.JTextField();
        txtSubject3 = new javax.swing.JTextField();
        ddResultEnglish = new javax.swing.JComboBox();
        txtZScore = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtALExamYear = new javax.swing.JTextField();
        ddShy = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

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

        lblClose2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblClose2.setForeground(new java.awt.Color(102, 102, 255));
        lblClose2.setText("x");
        lblClose2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose2MouseClicked(evt);
            }
        });

        jLabel16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel16MouseDragged(evt);
            }
        });
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTopBar2Layout = new javax.swing.GroupLayout(jPanelTopBar2);
        jPanelTopBar2.setLayout(jPanelTopBar2Layout);
        jPanelTopBar2Layout.setHorizontalGroup(
            jPanelTopBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopBar2Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblMinimize3)
                .addGap(10, 10, 10)
                .addComponent(lblClose2)
                .addContainerGap())
        );
        jPanelTopBar2Layout.setVerticalGroup(
            jPanelTopBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelTopBar2Layout.createSequentialGroup()
                .addGroup(jPanelTopBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMinimize3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblClose2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTopBar2);
        jPanelTopBar2.setBounds(0, 0, 440, 30);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Undergraduate Student details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Imprint MT Shadow", 0, 14), new java.awt.Color(0, 204, 102))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Subject 1");

        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Subject 2");

        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Subject 3");

        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("General English");

        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Z-Score");

        txtSubject1.setBackground(new java.awt.Color(240, 240, 240));
        txtSubject1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtSubject2.setBackground(new java.awt.Color(240, 240, 240));
        txtSubject2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSubject2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubject2ActionPerformed(evt);
            }
        });

        txtSubject3.setBackground(new java.awt.Color(240, 240, 240));
        txtSubject3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSubject3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubject3ActionPerformed(evt);
            }
        });

        ddResultEnglish.setBackground(new java.awt.Color(240, 240, 240));
        ddResultEnglish.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "S", "F", "AB" }));

        txtZScore.setBackground(new java.awt.Color(240, 240, 240));
        txtZScore.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ddResultEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZScore, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubject1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(txtSubject2)
                    .addComponent(txtSubject3))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ddResultEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtZScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Last year of A/L exam");

        txtALExamYear.setBackground(new java.awt.Color(240, 240, 240));
        txtALExamYear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtALExamYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtALExamYearActionPerformed(evt);
            }
        });

        ddShy.setBackground(new java.awt.Color(240, 240, 240));
        ddShy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st Shy", "2nd Shy", "3rd shy" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtALExamYear)
                        .addGap(18, 18, 18)
                        .addComponent(ddShy, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtALExamYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddShy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnSubmit.setBackground(new java.awt.Color(31, 58, 147));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(92, 151, 191));
        jLabel15.setText("Update Undegraduate Student");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 462, 500);

        setSize(new java.awt.Dimension(437, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimize3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimize3MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimize3MouseClicked

    private void lblClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose2MouseClicked
        this.dispose();
    }//GEN-LAST:event_lblClose2MouseClicked

    private void jLabel16MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseDragged
        int cordinateX = evt.getXOnScreen();
        int cordinateY = evt.getYOnScreen();

        this.setLocation(cordinateX - mousepX , cordinateY - mousepY);
    }//GEN-LAST:event_jLabel16MouseDragged

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jLabel16MousePressed

    private void txtSubject2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubject2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubject2ActionPerformed

    private void txtSubject3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubject3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubject3ActionPerformed

    private void txtALExamYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtALExamYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtALExamYearActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        UndergraduateStudent us = new UndergraduateStudent();

        //default take IndexNo from parent class "Student" in DBOperation.java
        us.setALYear(Integer.parseInt(txtALExamYear.getText()));
        us.setShy(ddShy.getSelectedItem().toString());
        us.setSubject1(txtSubject1.getText());
        us.setSubject2(txtSubject2.getText());
        us.setSubject3(txtSubject3.getText());
        us.setGeneralEnglish(ddResultEnglish.getSelectedItem().toString());
        us.setzScore(Double.parseDouble(txtZScore.getText()));

        boolean result = dbOpsU.updateUndergraduateStudent(us);

        if(result){
            JOptionPane.showMessageDialog(this, "Successfully Update the record !!");
            this.dispose();

        }else{
            JOptionPane.showMessageDialog(this, "Error, while Updateing !!");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateUndergraduateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUndergraduateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUndergraduateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUndergraduateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUndergraduateStudentFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox ddResultEnglish;
    private javax.swing.JComboBox ddShy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelTopBar2;
    private javax.swing.JLabel lblClose2;
    private javax.swing.JLabel lblMinimize3;
    private javax.swing.JTextField txtALExamYear;
    private javax.swing.JTextField txtSubject1;
    private javax.swing.JTextField txtSubject2;
    private javax.swing.JTextField txtSubject3;
    private javax.swing.JTextField txtZScore;
    // End of variables declaration//GEN-END:variables
}
