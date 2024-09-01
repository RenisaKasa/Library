
package MyClasses;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Autore {
    
    private int id;
    private String firstName;
    private String lastName;
    private String fusha;
    private String about;
    
      public Autore(){};
      
    public Autore(int _id, String _fname, String _lname, String _fushaa, String _about){
        
        this.id= _id;
        this.firstName= _fname;
        this.lastName=_lname;
        this.fusha=_fushaa;
        this.about= _about;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFusha() {
        return fusha;
    }

    public String getAbout() {
        return about;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFusha(String fusha) {
        this.fusha = fusha;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
    
    public void addAuthor(String _fname, String _lname, String _fusha, String _about){
        try {
            String insertquery ="INSERT INTO `autore`( `FirstName`, `LastName`, `Fusha`, `About`) VALUES (?,?,?,?)";
            PreparedStatement ps= DB.getConnection().prepareStatement(insertquery);
            
ps.setString(1,_fname);
ps.setString(2,_lname);
ps.setString(3,_fusha);
ps.setString(4,_about);

if(ps.executeUpdate()!=0){
    JOptionPane.showMessageDialog(null, "Autori u shtua", "Add author", 1);
}
else{
    JOptionPane.showMessageDialog(null, "Autori nuk u shtua", "Add author", 2);
}


        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void editAuthor(int _id, String _fname, String _lname, String _fusha, String _about){
        
     String editQuery = "UPDATE `autore` SET `FirstName`=?,`LastName`=?,`Fusha`=?,`About`=? WHERE `id`=?";
        try {
          
            PreparedStatement ps= DB.getConnection().prepareStatement(editQuery);
            
ps.setString(1,_fname);
ps.setString(2,_lname);
ps.setString(3,_fusha);
ps.setString(4,_about);
ps.setInt(5,_id);
int rowsAffected = ps.executeUpdate();

if(ps.executeUpdate()!=0){
    JOptionPane.showMessageDialog(null, "Author Edited", "Edit genre", 1);
}else{
    JOptionPane.showMessageDialog(null, "Invalid Author ID", "Error", 2);
}
        } catch (SQLException ex) {
            Logger.getLogger(Autore.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public void deleteAuthor(int _id){
      //remove genre by id 
     String deleteQuery = "DELETE FROM `autore` WHERE `id`=?";
        try {
          
            PreparedStatement ps= DB.getConnection().prepareStatement(deleteQuery);
            
ps.setInt(1,_id);

if(ps.executeUpdate()!=0){
    JOptionPane.showMessageDialog(null, "Author Deleted", "Delete author", 1);
}else{
    JOptionPane.showMessageDialog(null, "Invalid Author ID", "Error", 2);
}


        } catch (SQLException ex) {
            Logger.getLogger(Autore.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
public ArrayList<Autore> authorList(){
       ArrayList<Autore> aList= new ArrayList<>();
       
            String selectQuery= "SELECT * FROM `autore`";
            PreparedStatement ps;
            ResultSet rs;
            
            try {
            
            ps=DB.getConnection().prepareStatement(selectQuery);
        rs=ps.executeQuery();
        
        Autore author;
        while(rs.next()){
           author = new Autore(rs.getInt("ID"), rs.getString("FirstName"), rs.getString("LastName"), rs.getString("Fusha"), rs.getString("About"));
        aList.add(author);
        }
        
        } catch (SQLException ex) {
            Logger.getLogger(Autore.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aList;
    }
    
}
