
package MyForms;

import MyClasses.F_Class;
import MyClasses.Autore;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


public class AddMemberForm extends javax.swing.JFrame {
//krijoj nj eobjekt te ri member
    MyClasses.Member member = new MyClasses.Member();
    
    public AddMemberForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        Border panelHeaderBorder= BorderFactory.createMatteBorder(3,3,3,3,Color.gray);
        jPanel1.setBorder(panelHeaderBorder);
        
        MyClasses.F_Class func= new F_Class();
         func.displayImage(50, 50, "/images/png_genre.png", jLabel_FormTitle);
        //display image in the top
    
    
    //hide the jLabel"Vendoni nje zhaner"
    jLabel_Empty.setVisible(false);
    jLabel_Empty1.setVisible(false);
    jLabel_Empty2.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel_GenreClose = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_firstName = new javax.swing.JTextField();
        jLabel_Empty = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_lastName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_nrTelefoni = new javax.swing.JTextField();
        jLabel_Empty1 = new javax.swing.JLabel();
        jButton_Add = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox_Gjinia = new javax.swing.JComboBox<>();
        jLabel_Empty2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(201, 220, 200));

        jLabel_FormTitle.setFont(new java.awt.Font("Sylfaen", 1, 28)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Add Member");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel_GenreClose.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel_GenreClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_GenreClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_GenreClose.setText("X");
        jLabel_GenreClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_GenreClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_GenreClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_GenreCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel_GenreClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel_GenreClose, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(143, 188, 100));
        jLabel5.setText("Email:");

        jTextField_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_firstNameActionPerformed(evt);
            }
        });

        jLabel_Empty.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel_Empty.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Empty.setText("Vendosni nje emer*");
        jLabel_Empty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(143, 188, 100));
        jLabel6.setText("Emri:");

        jTextField_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_lastNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(143, 188, 100));
        jLabel7.setText("Mbiemri:");

        jTextField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EmailActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(143, 188, 100));
        jLabel8.setText("Nr.celular:");

        jTextField_nrTelefoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nrTelefoniActionPerformed(evt);
            }
        });

        jLabel_Empty1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel_Empty1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Empty1.setText("Vendosni nje mbiemer*");
        jLabel_Empty1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty1MouseClicked(evt);
            }
        });

        jButton_Add.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton_Add.setForeground(new java.awt.Color(153, 153, 153));
        jButton_Add.setText("ADD");
        jButton_Add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(143, 188, 100));
        jLabel9.setText("Gjinia:");

        jComboBox_Gjinia.setForeground(new java.awt.Color(153, 153, 153));
        jComboBox_Gjinia.setMaximumRowCount(2);
        jComboBox_Gjinia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox_Gjinia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_GjiniaActionPerformed(evt);
            }
        });

        jLabel_Empty2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel_Empty2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Empty2.setText("Vendosni nje numer kontakti*");
        jLabel_Empty2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Empty, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_nrTelefoni, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Empty1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox_Gjinia, 0, 320, Short.MAX_VALUE)
                                    .addComponent(jTextField_Email))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Empty2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Empty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Empty1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_nrTelefoni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel_Empty2)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_Gjinia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jButton_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_GenreCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GenreCloseMouseClicked
       //close the form genre
       this.dispose();
    }//GEN-LAST:event_jLabel_GenreCloseMouseClicked

    private void jTextField_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_firstNameActionPerformed

    
    
    
    
    
    private void jLabel_EmptyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyMouseClicked
        //hide this jLabel on clock
        jLabel_Empty.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyMouseClicked

    private void jTextField_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_lastNameActionPerformed

    private void jTextField_nrTelefoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nrTelefoniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nrTelefoniActionPerformed

    private void jLabel_Empty1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Empty1MouseClicked

    private void jTextField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EmailActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        String fname= jTextField_firstName.getText();
      String lname= jTextField_lastName.getText();
      String nrTel= jTextField_nrTelefoni.getText();
      String email= jTextField_Email.getText();
      String gender= jComboBox_Gjinia.getSelectedItem().toString();
      
      if(fname.isEmpty()){
          jLabel_Empty.setVisible(true);
      }else if(lname.isEmpty()){
          jLabel_Empty1.setVisible(true);
      }else if(nrTel.isEmpty()){
          jLabel_Empty2.setVisible(true);
      }
      else{
      member.addMember(fname, lname, nrTel, email, gender);
      }
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jComboBox_GjiniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_GjiniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_GjiniaActionPerformed

    private void jLabel_Empty2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Empty2MouseClicked

    
    
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
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMemberForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JComboBox<String> jComboBox_Gjinia;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Empty;
    private javax.swing.JLabel jLabel_Empty1;
    private javax.swing.JLabel jLabel_Empty2;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_GenreClose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_firstName;
    private javax.swing.JTextField jTextField_lastName;
    private javax.swing.JTextField jTextField_nrTelefoni;
    // End of variables declaration//GEN-END:variables
}
