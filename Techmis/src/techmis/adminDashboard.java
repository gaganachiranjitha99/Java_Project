/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package techmis;

/**
 *
 * @author ASUS
 */
public class adminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form adminDashboard
     */
    public adminDashboard() {
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

        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        btn_adduser2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_viewuser = new javax.swing.JButton();
        btn_course = new javax.swing.JButton();
        btn_notice = new javax.swing.JButton();
        btn_timetable = new javax.swing.JButton();
        btn_adduser = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_addadmin = new javax.swing.JButton();
        btn_addlecturer = new javax.swing.JButton();
        btn_addtecoff = new javax.swing.JButton();
        btn_addstudent = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jPasswordField1.setText("jPasswordField1");

        btn_adduser2.setBackground(new java.awt.Color(204, 0, 51));
        btn_adduser2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_adduser2.setForeground(new java.awt.Color(255, 255, 0));
        btn_adduser2.setText("Add User");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techmis/admin.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Administrator Dashboard");

        btn_back.setBackground(new java.awt.Color(0, 102, 102));
        btn_back.setForeground(new java.awt.Color(204, 255, 255));
        btn_back.setText("<-- Back ");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_viewuser.setBackground(new java.awt.Color(204, 0, 51));
        btn_viewuser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_viewuser.setForeground(new java.awt.Color(255, 255, 0));
        btn_viewuser.setText("View User");
        btn_viewuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewuserActionPerformed(evt);
            }
        });

        btn_course.setBackground(new java.awt.Color(204, 0, 51));
        btn_course.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_course.setForeground(new java.awt.Color(255, 255, 0));
        btn_course.setText("Course details");
        btn_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_courseActionPerformed(evt);
            }
        });

        btn_notice.setBackground(new java.awt.Color(204, 0, 51));
        btn_notice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_notice.setForeground(new java.awt.Color(255, 255, 0));
        btn_notice.setText("Notice details");
        btn_notice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_noticeActionPerformed(evt);
            }
        });

        btn_timetable.setBackground(new java.awt.Color(204, 0, 51));
        btn_timetable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_timetable.setForeground(new java.awt.Color(255, 255, 0));
        btn_timetable.setText("Time table");
        btn_timetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timetableActionPerformed(evt);
            }
        });

        btn_adduser.setBackground(new java.awt.Color(204, 0, 51));
        btn_adduser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_adduser.setForeground(new java.awt.Color(255, 255, 0));
        btn_adduser.setText("Add User");
        btn_adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adduserActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Faculty of Technology - University of Ruhuna");

        btn_addadmin.setBackground(new java.awt.Color(204, 0, 51));
        btn_addadmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_addadmin.setForeground(new java.awt.Color(255, 255, 0));
        btn_addadmin.setText("Add Admin");
        btn_addadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addadminActionPerformed(evt);
            }
        });

        btn_addlecturer.setBackground(new java.awt.Color(204, 0, 51));
        btn_addlecturer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_addlecturer.setForeground(new java.awt.Color(255, 255, 0));
        btn_addlecturer.setText("Add Lecturer");
        btn_addlecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addlecturerActionPerformed(evt);
            }
        });

        btn_addtecoff.setBackground(new java.awt.Color(204, 0, 51));
        btn_addtecoff.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_addtecoff.setForeground(new java.awt.Color(255, 255, 0));
        btn_addtecoff.setText("Add Technical Officer");
        btn_addtecoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addtecoffActionPerformed(evt);
            }
        });

        btn_addstudent.setBackground(new java.awt.Color(204, 0, 51));
        btn_addstudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_addstudent.setForeground(new java.awt.Color(255, 255, 0));
        btn_addstudent.setText("Add Student");
        btn_addstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addstudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_notice, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(btn_course, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_viewuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_adduser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_addlecturer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_addadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_addtecoff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_addstudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_timetable, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_back)
                                .addGap(152, 152, 152)
                                .addComponent(jLabel3)))))
                .addGap(138, 138, 138))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_adduser)
                            .addComponent(btn_addadmin))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_viewuser)
                            .addComponent(btn_addlecturer))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_course)
                            .addComponent(btn_addtecoff))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_notice)
                            .addComponent(btn_addstudent))
                        .addGap(18, 18, 18)
                        .addComponent(btn_timetable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_back)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        setVisible(false);
        adminLogin object = new adminLogin();
        object.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_adduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adduserActionPerformed
<<<<<<< HEAD
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_adduserActionPerformed

    private void btn_viewuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_viewuserActionPerformed

=======
        setVisible(false);
        adminAddUser object = new AdminAddUser();
        object.setVisible(true);
    }//GEN-LAST:event_btn_adduserActionPerformed

    private void btn_viewuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewuserActionPerformed
        setVisible(false);
        adminViewUser object = new adminViewUser();
        object.setVisible(true);
    }//GEN-LAST:event_btn_viewuserActionPerformed

    private void btn_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_courseActionPerformed
        setVisible(false);
        adminCourse object = new adminCourse();
        object.setVisible(true);
    }//GEN-LAST:event_btn_courseActionPerformed

    private void btn_noticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_noticeActionPerformed
        setVisible(false);
        adminNotice object = new adminNotice();
        object.setVisible(true);
    }//GEN-LAST:event_btn_noticeActionPerformed

    private void btn_addadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addadminActionPerformed
        setVisible(false);
        adminAddAdmin object = new adminAddAdmin();
        object.setVisible(true);
    }//GEN-LAST:event_btn_addadminActionPerformed

    private void btn_addlecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addlecturerActionPerformed
        setVisible(false);
        adminAddLecturer object = new adminAddLecturer();
        object.setVisible(true);
    }//GEN-LAST:event_btn_addlecturerActionPerformed

    private void btn_addtecoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addtecoffActionPerformed
        setVisible(false);
        adminAddTechofficer object = new adminAddTechofficer();
        object.setVisible(true);
    }//GEN-LAST:event_btn_addtecoffActionPerformed

    private void btn_addstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addstudentActionPerformed
        setVisible(false);
        adminAddStudent object = new adminAddStudent();
        object.setVisible(true);
    }//GEN-LAST:event_btn_addstudentActionPerformed

    private void btn_timetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timetableActionPerformed
        setVisible(false);
        adminTimetable object = new adminTimetable();
        object.setVisible(true);
    }//GEN-LAST:event_btn_timetableActionPerformed

>>>>>>> 6bd8336f2e4aa6daf7aca1f4f548f79fde7890db
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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addadmin;
    private javax.swing.JButton btn_addlecturer;
    private javax.swing.JButton btn_addstudent;
    private javax.swing.JButton btn_addtecoff;
    private javax.swing.JButton btn_adduser;
    private javax.swing.JButton btn_adduser2;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_course;
    private javax.swing.JButton btn_notice;
    private javax.swing.JButton btn_timetable;
    private javax.swing.JButton btn_viewuser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
