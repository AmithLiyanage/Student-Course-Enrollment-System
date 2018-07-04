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
public class UpdateStudentFrame extends javax.swing.JFrame {

    DBOperation dbOpsU = new DBOperation();
    
    private String gender;
    int mousepX;
    int mousepY;
    String sex;
    String CourseType;
    
    /**
     * Creates new form UpdateStudentFrame
     */
    public UpdateStudentFrame() {
        initComponents();
    }
    
    void setFields(Student student){
        System.out.println("#detail-->"+student);
        txtIndexNo.setText(new Integer(student.getIndexNo()).toString());
        txtName.setText(student.getName());
        txtFullName.setText(student.getFullName());
        ddFaculty.setSelectedItem(student.getFaculty());
        txtNIC.setText(student.getNic());
        sex = student.getGender();
        this.gender = sex;
        if("Male".equals(sex)){
            radioMale.setSelected(rootPaneCheckingEnabled);
        }else{
            radioFemale.setSelected(rootPaneCheckingEnabled);
        }
        txtAddress.setText(student.getAddress());
        txtContactNo.setText(new Integer(student.getContactNo()).toString());
        txtEmail.setText(student.getEmail());
        ddYear.setSelectedItem(student.getYear());
        ddBatch.setSelectedItem(student.getBatch());
        CourseType = student.getCourseType();
        txtCourseType.setText(CourseType);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanelTopBar2 = new javax.swing.JPanel();
        lblMinimize3 = new javax.swing.JLabel();
        lblClose1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFullName = new javax.swing.JTextArea();
        ddFaculty = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ddBatch = new javax.swing.JComboBox();
        ddYear = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        txtIndexNo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCourseType = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

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
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
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

        getContentPane().add(jPanelTopBar2);
        jPanelTopBar2.setBounds(0, 0, 510, 30);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Imprint MT Shadow", 0, 14), new java.awt.Color(0, 204, 102))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Name with Initial");

        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Full Name");

        txtName.setBackground(new java.awt.Color(240, 240, 240));
        txtName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Faculty");

        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("NIC");

        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Address");

        txtNIC.setBackground(new java.awt.Color(240, 240, 240));
        txtNIC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNICActionPerformed(evt);
            }
        });

        txtFullName.setBackground(new java.awt.Color(240, 240, 240));
        txtFullName.setColumns(20);
        txtFullName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFullName.setRows(5);
        jScrollPane1.setViewportView(txtFullName);

        ddFaculty.setBackground(new java.awt.Color(240, 240, 240));
        ddFaculty.setEditable(true);
        ddFaculty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "School of Business", "School of Computing", "School of Engineering" }));

        txtAddress.setBackground(new java.awt.Color(240, 240, 240));
        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Contact No");

        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("email");

        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Year");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Batch");

        ddBatch.setBackground(new java.awt.Color(240, 240, 240));
        ddBatch.setEditable(true);
        ddBatch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "February", "July" }));

        ddYear.setBackground(new java.awt.Color(240, 240, 240));
        ddYear.setEditable(true);
        ddYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2018", "2019", "2020", "2021", "2022" }));

        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Course Type");

        txtEmail.setBackground(new java.awt.Color(240, 240, 240));
        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtContactNo.setBackground(new java.awt.Color(240, 240, 240));
        txtContactNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Gender");

        buttonGroupGender.add(radioMale);
        radioMale.setForeground(new java.awt.Color(0, 0, 153));
        radioMale.setText("Male");
        radioMale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });

        buttonGroupGender.add(radioFemale);
        radioFemale.setForeground(new java.awt.Color(0, 0, 153));
        radioFemale.setText("Female");
        radioFemale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Index No");

        txtIndexNo.setEditable(false);

        jLabel13.setForeground(new java.awt.Color(0, 204, 51));
        jLabel13.setText("Cant Edit this in this View ..!!");

        txtCourseType.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContactNo)
                            .addComponent(txtEmail)
                            .addComponent(txtName)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(txtNIC)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(radioMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioFemale))
                                    .addComponent(ddFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ddYear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(ddBatch, 0, 1, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtCourseType, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ddFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(radioMale)
                    .addComponent(radioFemale))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ddBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ddYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(txtCourseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 470, 560));

        btnUpdate.setBackground(new java.awt.Color(31, 58, 147));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 670, 90, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(92, 151, 191));
        jLabel14.setText("Update Student");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 510, 720);

        setSize(new java.awt.Dimension(509, 725));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNICActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        this.gender = "Male";
    }//GEN-LAST:event_radioMaleActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        this.gender = "Famale";
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Student em = new Student();
        em.setIndexNo(Integer.parseInt(txtIndexNo.getText()));
        em.setName(txtName.getText());
        em.setFullName(txtFullName.getText());
        em.setFaculty(ddFaculty.getSelectedItem().toString());
        em.setNic(txtNIC.getText());
        em.setGender(this.gender);  // do that thing "radioMaleActionPerformed", "radioFemaleActionPerformed" method
        System.out.println("toDB"+em.getGender());
        em.setAddress(txtAddress.getText());
        em.setContactNo(Integer.parseInt(txtContactNo.getText()));
        em.setEmail(txtEmail.getText());
        em.setYear(Integer.parseInt(ddYear.getSelectedItem().toString()));
        em.setBatch(ddBatch.getSelectedItem().toString());
        em.setCourseType(CourseType);
        
        if(dbOpsU.updateStudent(em)){
            JOptionPane.showMessageDialog(this, "Successfully Update the record !!");
            this.dispose();

        }else{
            JOptionPane.showMessageDialog(this, "Error, while Updateing !!");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        
        
        this.dispose();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStudentFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JComboBox ddBatch;
    private javax.swing.JComboBox ddFaculty;
    private javax.swing.JComboBox ddYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTopBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClose1;
    private javax.swing.JLabel lblMinimize3;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtCourseType;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtFullName;
    private javax.swing.JTextField txtIndexNo;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}