
package MyClasses;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class F_Class {
    public void displayImage(int width, int height, String imagePath, JLabel label){
     ImageIcon imgIco = new ImageIcon(imagePath);
    Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
    label.setIcon(new ImageIcon(image));
       
      
    }
    
    
    //create an  unction to select an image for the addbook class
    public String selectImage(){
                            
       JFileChooser fileChooser= new JFileChooser();
       fileChooser.setDialogTitle("Select Book Cover");
       
       fileChooser.setCurrentDirectory(new File("C:\\Users\\User\\Pictures\\Screenshots"));
       
       FileNameExtensionFilter extensionFilter= new FileNameExtensionFilter("Image", ".png",".jpg",".jpeg");
               fileChooser.addChoosableFileFilter(extensionFilter);
               
               int fileState= fileChooser.showSaveDialog(null);
               
               String path="";
               
               if(fileState == JFileChooser.APPROVE_OPTION){
                   
                  path=fileChooser.getSelectedFile().getAbsolutePath();
    }
               return path;
    }
    
    //create  afunction to return resultSet
    //we use this function to red
    
    public ResultSet getData(String query) {
        PreparedStatement ps;
        ResultSet rs = null;

        try {
            ps = DB.getConnection().prepareStatement(query);
           
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(F_Class.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }

    ResultSet getData(String query, Integer _id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public ResultSet getDataa(String query, Integer _id) {
        PreparedStatement ps;
        ResultSet rs = null;

        try {
            ps = DB.getConnection().prepareStatement(query);
            ps.setInt(1, _id);  // Set the ID parameter in the query
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(F_Class.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }
}

    


