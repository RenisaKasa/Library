
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


public class AutorListForm extends javax.swing.JFrame {
//krijoj nj eobjekt te ri
    MyClasses.Autore author = new MyClasses.Autore();
    
    public AutorListForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        Border panelHeaderBorder= BorderFactory.createMatteBorder(3,3,3,3,Color.gray);
        jPanel1.setBorder(panelHeaderBorder);
        
        MyClasses.F_Class func= new F_Class();
         func.displayImage(50, 50, "/images/png_genre.png", jLabel_FormTitle);
        //display image in the top
        
        
        //edit the jTable
        jTable_Autore.setSelectionBackground(Color.LIGHT_GRAY);
       jTable_Autore.setSelectionForeground(Color.white);
        jTable_Autore.setRowHeight(30);
        jTable_Autore.setShowGrid(false);
    jTable_Autore.setBackground(new Color(173,216,230));
    jTable_Autore.setShowHorizontalLines(true);
    
    //costumize the jtable header
    jTable_Autore.getTableHeader().setBackground(Color.LIGHT_GRAY);
     jTable_Autore.getTableHeader().setForeground(Color.white);
    jTable_Autore.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 15));
    jTable_Autore.getTableHeader().setOpaque(false);
    

        
      addTableAuthors();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Autore = new javax.swing.JTable();
        jButton_SelectAuthor = new javax.swing.JButton();

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

        jPanel2.setBackground(new java.awt.Color(173, 216, 230));

        jLabel_FormTitle.setFont(new java.awt.Font("Sylfaen", 1, 28)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Authors List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(44, 44, 44)
                .addComponent(jLabel_GenreClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel_GenreClose, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTable_Autore.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jTable_Autore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Autore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_AutoreMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Autore);

        jButton_SelectAuthor.setBackground(new java.awt.Color(204, 204, 204));
        jButton_SelectAuthor.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton_SelectAuthor.setForeground(new java.awt.Color(102, 102, 102));
        jButton_SelectAuthor.setText("Select Author");
        jButton_SelectAuthor.setOpaque(true);
        jButton_SelectAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectAuthorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jButton_SelectAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_SelectAuthor)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_GenreCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GenreCloseMouseClicked
       //close the form genre
       this.dispose();
    }//GEN-LAST:event_jLabel_GenreCloseMouseClicked

    private void jTable_AutoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_AutoreMouseClicked

    }//GEN-LAST:event_jTable_AutoreMouseClicked

    private void jButton_SelectAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SelectAuthorActionPerformed
int index= jTable_Autore.getSelectedRow();


      int id= Integer.parseInt(jTable_Autore.getValueAt(index, 0).toString());
      String firstName= jTable_Autore.getValueAt(index, 1).toString();
      String lastName= jTable_Autore.getValueAt(index, 2).toString();
     
      String full_name= firstName+" "+lastName;
      AddBookForm.displayAuthorData(index, full_name);
      
      this.dispose();
    }//GEN-LAST:event_jButton_SelectAuthorActionPerformed
    //create a unction to poplate the jtable with genres
    public void addTableAuthors(){
       ArrayList<MyClasses.Autore>  authorList= author.authorList();
       
       //jtable colums
      String[] colNames= {"ID", "Emri", "Mbiemri", "Fusha", "About"};
       
       //jtable rows
      Object[][] rows= new Object[authorList.size()][colNames.length];
    
      for(int i=0; i<authorList.size(); i++){
        rows[i][0]= authorList.get(i).getId();
        rows[i][1]= authorList.get(i).getFirstName();
        rows[i][2]= authorList.get(i).getLastName();
        rows[i][3]= authorList.get(i).getFusha();
        rows[i][4]= authorList.get(i).getAbout();
        
    }
      DefaultTableModel model = new DefaultTableModel(rows, colNames);
    jTable_Autore.setModel(model);
    
    
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
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AutorListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutorListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutorListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutorListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutorListForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_SelectAuthor;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_GenreClose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable jTable_Autore;
    // End of variables declaration//GEN-END:variables
}