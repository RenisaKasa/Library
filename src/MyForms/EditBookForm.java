
package MyForms;


import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;


public class EditBookForm extends javax.swing.JFrame {

     MyClasses.Book book= new MyClasses.Book();
    MyClasses.Member member= new MyClasses.Member();
    MyClasses.F_Class func= new MyClasses.F_Class();
    MyClasses.Genre genre= new MyClasses.Genre();
    HashMap<String, Integer> genresMap= genre.getGenresMap();
    
    String imagePath="";
    ResultSet rs;
    
      private byte[] cover;
    
    public EditBookForm() {
        initComponents();
        this.setLocationRelativeTo(null); //why is this used)
   
    Border panelHeaderBorder= BorderFactory.createMatteBorder(3,3,3,3, new Color(255,228,225));
    jPanel1.setBorder(panelHeaderBorder);
    
     fillJcomboBoxWithGenres();
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_ISBN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Author = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Autori = new javax.swing.JTextField();
        jTextField_Emri = new javax.swing.JTextField();
        jTextField_Publisher = new javax.swing.JTextField();
        jTextField_Cmimi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jComboBox_Genre = new javax.swing.JComboBox<>();
        jButton_Add = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jSpinner_Sasia = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_ImagePath = new javax.swing.JLabel();
        jButton_SelectPicture = new javax.swing.JButton();
        jButton_Search = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        jLabel_Genre = new javax.swing.JLabel();
        jLabel_ID = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(240, 255, 240));

        jLabel_FormTitle.setFont(new java.awt.Font("Sylfaen", 1, 28)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Add New Book");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel1.setText("ISBN:");

        jTextField_ISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ISBNActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel2.setText("Emri");

        jLabel_Author.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel_Author.setText("Autori:");

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel5.setText("Sasia:");

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel6.setText("Publisher:");

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel7.setText("Cmimi:");

        jTextField_Autori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AutoriActionPerformed(evt);
            }
        });

        jTextField_Emri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EmriActionPerformed(evt);
            }
        });

        jTextField_Publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PublisherActionPerformed(evt);
            }
        });

        jTextField_Cmimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CmimiActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel9.setText("Book Description:");

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jTextArea_Description.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Description);

        jComboBox_Genre.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jComboBox_Genre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_Genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_GenreActionPerformed(evt);
            }
        });

        jButton_Add.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Add.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton_Add.setForeground(new java.awt.Color(102, 102, 102));
        jButton_Add.setText("ADD");
        jButton_Add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Add.setOpaque(true);
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Clear.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Clear.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton_Clear.setForeground(new java.awt.Color(102, 102, 102));
        jButton_Clear.setText("CLEAR");
        jButton_Clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Clear.setOpaque(true);
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel10.setText("Cover:");

        jLabel_Image.setBackground(new java.awt.Color(240, 255, 240));
        jLabel_Image.setOpaque(true);

        jLabel_ImagePath.setBackground(new java.awt.Color(128, 158, 129));
        jLabel_ImagePath.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        jLabel_ImagePath.setForeground(new java.awt.Color(128, 158, 129));
        jLabel_ImagePath.setText("picture path...");

        jButton_SelectPicture.setBackground(new java.awt.Color(204, 204, 204));
        jButton_SelectPicture.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton_SelectPicture.setForeground(new java.awt.Color(102, 102, 102));
        jButton_SelectPicture.setText("Select picture");
        jButton_SelectPicture.setOpaque(true);
        jButton_SelectPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectPictureActionPerformed(evt);
            }
        });

        jButton_Search.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Search.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        jButton_Search.setText("Search by id or isbn");
        jButton_Search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Search.setOpaque(true);
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        jButton_Cancel.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Cancel.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton_Cancel.setForeground(new java.awt.Color(102, 102, 102));
        jButton_Cancel.setText("CANCEL");
        jButton_Cancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Cancel.setOpaque(true);
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jLabel_Genre.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel_Genre.setText("Genre:");

        jLabel_ID.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel_ID.setText("ID:");

        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Change");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_ID))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jSpinner_Sasia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_Publisher))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField_Cmimi, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox_Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Autori, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Emri)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton_SelectPicture)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel_ImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_ID)
                                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_Emri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Author)
                            .addComponent(jTextField_Autori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Genre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox_Genre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jSpinner_Sasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField_Cmimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel_ImagePath))
                            .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_SelectPicture)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_ISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ISBNActionPerformed

    private void jTextField_AutoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AutoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AutoriActionPerformed

    private void jTextField_EmriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EmriActionPerformed
    
    }//GEN-LAST:event_jTextField_EmriActionPerformed

    private void jTextField_PublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PublisherActionPerformed
    
    }//GEN-LAST:event_jTextField_PublisherActionPerformed

    private void jTextField_CmimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CmimiActionPerformed
      
    }//GEN-LAST:event_jTextField_CmimiActionPerformed

    private void jButton_SelectPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SelectPictureActionPerformed
       String path= func.selectImage();
       jLabel_ImagePath.setText(path);
       
       func.displayImage(165, 110, path, jLabel_Image);
           imagePath= path;    
    }//GEN-LAST:event_jButton_SelectPictureActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
      jTextField_ISBN.setText("");
      jTextField_Emri.setText("");
      jTextField_Autori.setText("");
      jComboBox_Genre.setSelectedIndex(0);
      jTextField_Cmimi.setText("");
      jTextField_Publisher.setText("");
      jTextArea_Description.setText("");
      jSpinner_Sasia.setValue(0);
      
      jLabel_Image.setIcon(null);
      
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
    MyClasses.Book book= new MyClasses.Book();
     String isbn= jTextField_ISBN.getText();
      if(!verif()) {
          
   JOptionPane.showMessageDialog(null, "One or more Fields are empty","Empty fields", 2);
      }else if(book.isISBNexists(isbn)){
           JOptionPane.showMessageDialog(null, "This ISBN already exists","Wrong ISBN", 2);
      }
      
      else{
           try {
                
      String emri= jTextField_Emri.getText();
      String publisher= jTextField_Publisher.getText();
      String description= jTextArea_Description.getText();
      
      String autor_id= jTextField_Autori.getText();
      String genre_id=(String) jComboBox_Genre.getSelectedItem();
      Integer sasia= Integer.parseInt(jSpinner_Sasia.getValue().toString());
      double cmimi= Double.parseDouble(jTextField_Cmimi.getText());
            
      Path path= Paths.get(imagePath);
            byte[] img= Files.readAllBytes(path);
      book.addBook(isbn, emri, autor_id, genre_id, sasia, publisher,cmimi, description, cover);
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, "Make sure to Add a Cover Image","Empty fields", 2);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "You Enterd Wrong dataIn a Number Field","Wrong Data", 2);
        }
      }
      
       
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
      //search book by id or ISBN
      
     int id= Integer.parseInt(jTextField_ID.getText());
     String isbn= jTextField_ISBN.getText();
        MyClasses.Book selectedBook= book.searchBookbyID_Isbn(id,isbn);
  
        jTextField_ID.setText(String.valueOf(selectedBook.getId()));
        jTextField_ISBN.setText(selectedBook.getIsbn());
        jTextField_Emri.setText(selectedBook.getEmri());
        jTextField_Publisher.setText(selectedBook.getPublisher());
        jTextField_Cmimi.setText(Double.toString(selectedBook.getCmimi()));
        
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void jComboBox_GenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_GenreActionPerformed
      try{
          int genreID= genresMap.get(jComboBox_Genre.getSelectedItem().toString());
          jLabel_Genre.setText(String.valueOf(genreID));
      }catch(Exception ex){
          System.out.println("Error From jComboBox_Genre_ActionPerformed"+ex.getMessage());
      }
    }//GEN-LAST:event_jComboBox_GenreActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     AutorListForm autorsForm= new AutorListForm();
       
       autorsForm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
//pasi shfaqet lista duhet te shfaqim emrin dhe mbiemrin e autorit tek TextField
    
    public static void displayAuthorData(int id,String fullName){
        
        jTextField_Autori.setText(fullName);
        
    }
    
    //create a function to verify the requried fields
    public boolean verif(){
      if(jTextField_ISBN.getText().equals("")||jTextField_Autori.getText().equals("")|| jTextField_Cmimi.getText().equals("")||jTextField_Emri.equals("")|| jLabel_Genre.getText().equals("ID"))  {
        return false;  
      }
      else{
          return true;
      }
    }
    
    //Tani vendos zhanerat per te perzgjedhur
    public void fillJcomboBoxWithGenres(){
           jComboBox_Genre.removeAllItems(); //heq item qe kishte ne fillim
        for(String gereName: genresMap.keySet()){
            jComboBox_Genre.addItem(gereName);
        }
    }
  
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
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Search;
    private javax.swing.JButton jButton_SelectPicture;
    private javax.swing.JComboBox<String> jComboBox_Genre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Author;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_Genre;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_ImagePath;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_Sasia;
    private javax.swing.JTextArea jTextArea_Description;
    private static javax.swing.JTextField jTextField_Autori;
    private javax.swing.JTextField jTextField_Cmimi;
    private javax.swing.JTextField jTextField_Emri;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_ISBN;
    private javax.swing.JTextField jTextField_Publisher;
    // End of variables declaration//GEN-END:variables
}
