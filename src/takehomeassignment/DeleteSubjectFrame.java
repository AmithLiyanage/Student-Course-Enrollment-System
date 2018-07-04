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
public class DeleteSubjectFrame extends javax.swing.JFrame {

    DBOperation dbOps = new DBOperation();
    
    int mousepX;
    int mousepY;
    Subject c;
    
    /**
     * Creates new form DeleteSubjectFrame
     */
    public DeleteSubjectFrame() {
        initComponents();
    }
    
    void setFields(Subject co){
        c = co;
        c.setOldCourseID(co.getSubjectID());
        txtSubjectID.setText(co.getSubjectID());
        txtSubjectName.setText(co.getSubjectName());
        txtDegreeType.setText(co.getDegree());
        txtYear.setText(new Integer(co.getYear()).toString());
        txtSemester.setText(new Integer(co.getSemester()).toString());
        txtFees.setText(new Integer(co.getFees()).toString());
        txtLecturer.setText(co.getLecturer());
        txtInstructers.setText(co.getInstructors());
        txtTimeSchedule.setText(co.getTimeSchedule());
        txtNoOfAssignment.setText(new Integer(co.getNoOfAssignment()).toString());
        txtCredits.setText(new Integer(co.getCredit()).toString());
        txtCompulsoryType.setText(co.getcompulsoryType());
        txtPlaceLecture.setText(co.getPlaceLecture());
        txtPlacePractical.setText(co.getPlacePractical());
        txtNote.setText(co.getNote());
        System.out.println("In course Delete fields");
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
        lblClose1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSubjectID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFees = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPlaceLecture = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSubjectName = new javax.swing.JTextField();
        txtInstructers = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtLecturer = new javax.swing.JTextField();
        txtCompulsoryType = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPlacePractical = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        txtDegreeType = new javax.swing.JTextField();
        txtNoOfAssignment = new javax.swing.JTextField();
        txtCredits = new javax.swing.JTextField();
        txtTimeSchedule = new javax.swing.JTextField();
        txtSemester = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ddCompulsoryType = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        ddCompulsoryType1 = new javax.swing.JComboBox();

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
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblMinimize3)
                .addGap(10, 10, 10)
                .addComponent(lblClose1)
                .addContainerGap())
        );
        jPanelTopBar2Layout.setVerticalGroup(
            jPanelTopBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelTopBar2Layout.createSequentialGroup()
                .addGroup(jPanelTopBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMinimize3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblClose1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTopBar2);
        jPanelTopBar2.setBounds(0, 0, 660, 30);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Imprint MT Shadow", 0, 14), new java.awt.Color(0, 204, 102))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Subject ID");

        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Subject Name");

        txtSubjectID.setEditable(false);
        txtSubjectID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSubjectID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubjectIDActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Fees");

        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Instructors");

        txtFees.setEditable(false);
        txtFees.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFeesActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Place Lecture");

        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Note");

        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Degree Type");

        txtPlaceLecture.setEditable(false);
        txtPlaceLecture.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPlaceLecture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaceLectureActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Lecturer");

        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Time Schedule");

        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("No of Assignments");

        txtSubjectName.setEditable(false);
        txtSubjectName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSubjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubjectNameActionPerformed(evt);
            }
        });

        txtInstructers.setEditable(false);
        txtInstructers.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtInstructers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstructersActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(0, 0, 153));
        jLabel16.setText("Credits");

        txtLecturer.setEditable(false);
        txtLecturer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLecturerActionPerformed(evt);
            }
        });

        txtCompulsoryType.setEditable(false);
        txtCompulsoryType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCompulsoryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompulsoryTypeActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(0, 0, 153));
        jLabel17.setText("Compulsory or Not?");

        jLabel18.setForeground(new java.awt.Color(0, 0, 153));
        jLabel18.setText("Place Practical");

        txtPlacePractical.setEditable(false);
        txtPlacePractical.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPlacePractical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacePracticalActionPerformed(evt);
            }
        });

        txtNote.setEditable(false);
        txtNote.setBackground(new java.awt.Color(240, 240, 240));
        txtNote.setColumns(20);
        txtNote.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNote.setRows(5);
        jScrollPane3.setViewportView(txtNote);

        txtDegreeType.setEditable(false);
        txtDegreeType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDegreeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDegreeTypeActionPerformed(evt);
            }
        });

        txtNoOfAssignment.setEditable(false);
        txtNoOfAssignment.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNoOfAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfAssignmentActionPerformed(evt);
            }
        });

        txtCredits.setEditable(false);
        txtCredits.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditsActionPerformed(evt);
            }
        });

        txtTimeSchedule.setEditable(false);
        txtTimeSchedule.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTimeSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeScheduleActionPerformed(evt);
            }
        });

        txtSemester.setEditable(false);
        txtSemester.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemesterActionPerformed(evt);
            }
        });

        txtYear.setEditable(false);
        txtYear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(0, 0, 153));
        jLabel21.setText("Year");

        jLabel22.setForeground(new java.awt.Color(0, 0, 153));
        jLabel22.setText("Semester");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSubjectName)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSubjectID, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtLecturer, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtFees, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                                    .addComponent(txtDegreeType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel21)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel22)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel16))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPlaceLecture, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                            .addComponent(txtTimeSchedule))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPlacePractical, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                            .addComponent(txtNoOfAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCompulsoryType)))
                                    .addComponent(txtInstructers)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSubjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDegreeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtInstructers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel16))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtTimeSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtPlaceLecture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtPlacePractical, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtNoOfAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtCompulsoryType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel18)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 600, 490));

        btnDelete.setBackground(new java.awt.Color(31, 58, 147));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, 90, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(92, 151, 191));
        jLabel14.setText("Delete Subject ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Compulsory or Not?");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ddCompulsoryType.setBackground(new java.awt.Color(92, 151, 191));
        ddCompulsoryType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Compulsory", "Optional" }));
        ddCompulsoryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCompulsoryTypeActionPerformed(evt);
            }
        });
        jPanel2.add(ddCompulsoryType, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Compulsory or Not?");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ddCompulsoryType1.setBackground(new java.awt.Color(92, 151, 191));
        ddCompulsoryType1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Compulsory", "Optional" }));
        ddCompulsoryType1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCompulsoryType1ActionPerformed(evt);
            }
        });
        jPanel2.add(ddCompulsoryType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 660, 720);

        setSize(new java.awt.Dimension(659, 654));
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

    private void txtSubjectIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubjectIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubjectIDActionPerformed

    private void txtFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeesActionPerformed

    private void txtPlaceLectureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaceLectureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaceLectureActionPerformed

    private void txtSubjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubjectNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubjectNameActionPerformed

    private void txtInstructersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstructersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstructersActionPerformed

    private void txtLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLecturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLecturerActionPerformed

    private void txtCompulsoryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompulsoryTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompulsoryTypeActionPerformed

    private void txtPlacePracticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacePracticalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacePracticalActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (dbOps.deleteSubject(this.c)) {
            JOptionPane.showMessageDialog(this, "Successfully Deleted !!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error, while Deleteing !!");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        this.dispose();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtDegreeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDegreeTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDegreeTypeActionPerformed

    private void txtNoOfAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfAssignmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfAssignmentActionPerformed

    private void txtCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditsActionPerformed

    private void txtTimeScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeScheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeScheduleActionPerformed

    private void ddCompulsoryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCompulsoryTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddCompulsoryTypeActionPerformed

    private void ddCompulsoryType1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCompulsoryType1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddCompulsoryType1ActionPerformed

    private void txtSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemesterActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteSubjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteSubjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteSubjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteSubjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteSubjectFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox ddCompulsoryType;
    private javax.swing.JComboBox ddCompulsoryType1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTopBar2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblClose1;
    private javax.swing.JLabel lblMinimize3;
    private javax.swing.JTextField txtCompulsoryType;
    private javax.swing.JTextField txtCredits;
    private javax.swing.JTextField txtDegreeType;
    private javax.swing.JTextField txtFees;
    private javax.swing.JTextField txtInstructers;
    private javax.swing.JTextField txtLecturer;
    private javax.swing.JTextField txtNoOfAssignment;
    private javax.swing.JTextArea txtNote;
    private javax.swing.JTextField txtPlaceLecture;
    private javax.swing.JTextField txtPlacePractical;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtSubjectID;
    private javax.swing.JTextField txtSubjectName;
    private javax.swing.JTextField txtTimeSchedule;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}