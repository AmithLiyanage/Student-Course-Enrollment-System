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
public class PostgraduateStudentFrame extends javax.swing.JFrame {

    DBOperation dbOpsP = new DBOperation();
    
    private String status;
    int mousepX;
    int mousepY;   
    
    /**
     * Creates new form PostgraduateStudentFrame
     */
    public PostgraduateStudentFrame() {
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

        buttonGroupStatus = new javax.swing.ButtonGroup();
        jPanelTopBar2 = new javax.swing.JPanel();
        lblMinimize3 = new javax.swing.JLabel();
        lblClose1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQualificatinType = new javax.swing.JTextField();
        txtInstitute = new javax.swing.JTextField();
        txtYearOFCompletion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        radioMarried = new javax.swing.JRadioButton();
        radioUnmarried = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Postgraduate Student Registration");
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

        lblClose1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblClose1.setForeground(new java.awt.Color(102, 102, 255));
        lblClose1.setText("x");
        lblClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose1MouseClicked(evt);
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
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblMinimize3)
                .addGap(10, 10, 10)
                .addComponent(lblClose1)
                .addContainerGap())
        );
        jPanelTopBar2Layout.setVerticalGroup(
            jPanelTopBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopBar2Layout.createSequentialGroup()
                .addGroup(jPanelTopBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMinimize3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblClose1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTopBar2);
        jPanelTopBar2.setBounds(-5, 0, 430, 30);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        btnBack.setBackground(new java.awt.Color(31, 58, 147));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Postgraduate Student details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Imprint MT Shadow", 0, 14), new java.awt.Color(0, 204, 102))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Qualification Type");

        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Institute");

        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Year of Completion");

        txtQualificatinType.setBackground(new java.awt.Color(240, 240, 240));
        txtQualificatinType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtQualificatinType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQualificatinTypeActionPerformed(evt);
            }
        });

        txtInstitute.setBackground(new java.awt.Color(240, 240, 240));
        txtInstitute.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtInstitute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstituteActionPerformed(evt);
            }
        });

        txtYearOFCompletion.setBackground(new java.awt.Color(240, 240, 240));
        txtYearOFCompletion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtYearOFCompletion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearOFCompletionActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Status");

        buttonGroupStatus.add(radioMarried);
        radioMarried.setForeground(new java.awt.Color(0, 0, 153));
        radioMarried.setText("Married");
        radioMarried.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioMarried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMarriedActionPerformed(evt);
            }
        });

        buttonGroupStatus.add(radioUnmarried);
        radioUnmarried.setForeground(new java.awt.Color(0, 0, 153));
        radioUnmarried.setText("Unmarried");
        radioUnmarried.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioUnmarried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUnmarriedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtQualificatinType, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addComponent(txtInstitute))
                    .addComponent(txtYearOFCompletion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioMarried)
                        .addGap(18, 18, 18)
                        .addComponent(radioUnmarried)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtQualificatinType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtInstitute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtYearOFCompletion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radioMarried)
                    .addComponent(radioUnmarried))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(92, 151, 191));
        jLabel15.setText("Student Registration");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel15)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel15)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-4, 0, 430, 420);

        setSize(new java.awt.Dimension(422, 394));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtQualificatinTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQualificatinTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQualificatinTypeActionPerformed

    private void txtInstituteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstituteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstituteActionPerformed

    private void txtYearOFCompletionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearOFCompletionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearOFCompletionActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        StudentRegFrame s = new StudentRegFrame();
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        PostgraduateStudent ps = new PostgraduateStudent();
        
        //default take IndexNo from parent class "Student" in DBOperation.java
        ps.setQualificationType(txtQualificatinType.getText());
        ps.setInstitute(txtInstitute.getText());
        ps.setYearOfCompletion(Integer.parseInt(txtYearOFCompletion.getText()));
        ps.setStatus(this.status);
        
        boolean result = dbOpsP.addPostgraduateStudent(ps);
        
        if(result){
            //Data Inserted Successfully
            JOptionPane.showMessageDialog(this, "<html> Successfully Registered !!. <br>   Your Index No <color=\"#00FFFF\">'"+dbOpsP.index+"'</color> <html>");
            HomeFrame h = new HomeFrame();
            h.setVisible(true);
            this.dispose();
        }else{
            //Data Insert not Successful
            JOptionPane.showMessageDialog(this, "Oops, Error occured while Inserting");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void radioMarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMarriedActionPerformed
        this.status = "Married";
    }//GEN-LAST:event_radioMarriedActionPerformed

    private void radioUnmarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUnmarriedActionPerformed
        this.status = "Unmarried";
    }//GEN-LAST:event_radioUnmarriedActionPerformed

    private void lblMinimize3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimize3MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimize3MouseClicked

    private void lblClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose1MouseClicked
        this.dispose();
    }//GEN-LAST:event_lblClose1MouseClicked

    private void jLabel16MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseDragged
        int cordinateX = evt.getXOnScreen();
        int cordinateY = evt.getYOnScreen();

        this.setLocation(cordinateX - mousepX , cordinateY - mousepY);
    }//GEN-LAST:event_jLabel16MouseDragged

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jLabel16MousePressed

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
            java.util.logging.Logger.getLogger(PostgraduateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostgraduateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostgraduateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostgraduateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostgraduateStudentFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroupStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTopBar2;
    private javax.swing.JLabel lblClose1;
    private javax.swing.JLabel lblMinimize3;
    private javax.swing.JRadioButton radioMarried;
    private javax.swing.JRadioButton radioUnmarried;
    private javax.swing.JTextField txtInstitute;
    private javax.swing.JTextField txtQualificatinType;
    private javax.swing.JTextField txtYearOFCompletion;
    // End of variables declaration//GEN-END:variables
}
