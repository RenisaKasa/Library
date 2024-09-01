
package MyClasses;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class Genre {
    
    private int id;
    private String genre; 
    
    
    //constructors
    public Genre(){
        
    }
    
    public Genre(int _id, String _genre){
        this.id= _id;
        this.genre= _genre;
    }
    
    public int getId(){
        return id;
    }
    public String getGenre(){
        return genre;
    }
    
    public void setId(int _id){
        this.id=_id;
    }
    public void setGenre(String _genre){
        this.genre= _genre;
    }
    
    MyClasses.F_Class func= new F_Class();
    
    //funksionet
    public void addGenre(String _genre){
        try {
            String insertquery ="INSERT INTO `bookgenre`( `Genre`) VALUES (?)";
            PreparedStatement ps= DB.getConnection().prepareStatement(insertquery);
            
ps.setString(1,_genre);
if(ps.executeUpdate()!=0){
    JOptionPane.showMessageDialog(null, "Genre Added", "Add genre", 1);
}
else{
    JOptionPane.showMessageDialog(null, "Genre Not Added", "Add genre", 2);
}


        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public void editGenre(int _id, String _genre){
        
     String editQuery = "UPDATE `bookgenre` SET `Genre`=? WHERE `id` = ?";
        try {
          
            PreparedStatement ps= DB.getConnection().prepareStatement(editQuery);
            
ps.setString(1,_genre);
ps.setInt(2,_id);

if(ps.executeUpdate()!=0){
    JOptionPane.showMessageDialog(null, "Genre Edited", "Edit genre", 1);
}else{
    JOptionPane.showMessageDialog(null, "Invalid Genre ID", "Error", 2);
}
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void deleteGenre(int _id){
      //remove genre by id 
     String deleteQuery = "DELETE FROM `bookgenre` WHERE `ID`=?";
        try {
          
            PreparedStatement ps= DB.getConnection().prepareStatement(deleteQuery);
            
ps.setInt(1,_id);

if(ps.executeUpdate()!=0){
    JOptionPane.showMessageDialog(null, "Genre Deleted", "Delete genre", 1);
}else{
    JOptionPane.showMessageDialog(null, "Invalid Genre ID", "Error", 2);
}


        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    
    //function to add an arrayList with genres
    public ArrayList<Genre> genreList(){
       ArrayList<Genre> gList= new ArrayList<>();
       
            String selectQuery= "SELECT * FROM `bookgenre`";
            PreparedStatement ps;
            ResultSet rs;
            
            try {
            
            ps=DB.getConnection().prepareStatement(selectQuery);
        rs=ps.executeQuery();
        
        Genre genre;
        while(rs.next()){
            genre = new Genre(rs.getInt("id"), rs.getString("genre"));
        gList.add(genre);
        }
        
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return gList;
    }
 
    
    
    //krijojm nje funksion per te rikthyer nje hashmap
    //string is teh key
    //integer is the value
    
    public HashMap<String,Integer> getGenresMap(){
          HashMap<String, Integer> map = new HashMap<>();

    ResultSet rs = func.getData("SELECT * FROM `bookgenre`");
    try {
        while (rs.next()) {
            int id = rs.getInt("id");
            String genreName = rs.getString("genre");
            map.put(genreName, id);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
    }
    return map;
    }
}
