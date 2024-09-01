
package MyClasses;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class Book {
    
    private Integer id;
    private String isbn;
    private String emri;
    private Integer autor_id;
    private Integer genre_id;
    private Integer sasia;
    private String publisher;
    private double cmimi;
    private String description;
    private byte[] cover;
    
    
    public Book(){}//krijojmnje konstruktor /pse??
    
    public Book(Integer _id, String _isbn, String _emri, Integer _autor_id, Integer _genre_id, Integer _sasia, String _publisher, double _cmimi, String _description, byte[] _cover){
       
        this.id= _id;
        this.isbn= _isbn;
        this.emri=_emri;
        this.autor_id= _autor_id;
        this.genre_id= _genre_id;
        this.sasia= _sasia;
        this.publisher= _publisher;
        this.cmimi= _cmimi;
        this.description= _description;
        this.cover= _cover;
    }
    
    //vendos getters dhe setters per te marr variablat e caktuara si private

    
    public Integer getId(){
        return id;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public String getEmri() {
        return emri;
    }

    public Integer getAutor_id() {
        return autor_id;
    }

    public Integer getGenre_id() {
        return genre_id;
    }

    public Integer getSasia() {
        return sasia;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getCmimi() {
        return cmimi;
    }

    public String getDescription() {
        return description;
    }

    public byte[] getCover() {
        return cover;
    }
     
    //vendos dhe setters
public void setId(Integer id) {
    this.id = id;
}

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public void setAutor_id(Integer autor_id) {
        this.autor_id = autor_id;
    }

    public void setGenre_id(Integer genre_id) {
        this.genre_id = genre_id;
    }

    public void setSasia(Integer sasia) {
        this.sasia = sasia;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCmimi(double cmimi) {
        this.cmimi = cmimi;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }
    
    
    F_Class func= new F_Class();
    
     public void addBook( String _isbn, String _emri, String _autor_id, String _genre_id, Integer _sasia,
                    String _publisher, double _cmimi, String _description, byte[] _cover) {

   try {
        String insertquery = "INSERT INTO `books`(`isbn`, `emri`, `autor_id`, `genre_id`, `sasia`, `publisher`, `cmimi`, `description`, `cover`) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = DB.getConnection().prepareStatement(insertquery);

        // Check if _cover is not null before setting it in the PreparedStatement
        if (_cover != null) {
            ps.setBytes(9, _cover);
        } else {
            // Handle the case where _cover is null (you may want to set a default value or handle it accordingly)
            ps.setNull(9, java.sql.Types.BLOB);
        }

        // Set other parameters
        ps.setString(1, _isbn);
        ps.setString(2, _emri);
        ps.setString(3, _autor_id);
        ps.setString(4, _genre_id);
        ps.setInt(5, _sasia);
        ps.setString(6, _publisher);
        ps.setDouble(7, _cmimi);
        ps.setString(8, _description);

        int result = ps.executeUpdate(); // Execute the query

        if (result != 0) {
            JOptionPane.showMessageDialog(null, "Libri u shtua", "Add book", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Libri nuk u shtua", "Add book", 2);
        }

    } catch (SQLException ex) {
        Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
    }
}
     
     
     //create a unction to check if the isbn already exists
     public boolean isISBNexists(String _isbn){
         
         String query= "SELECT * FROM `books` WHERE `isbn`='"+_isbn+ "'";
         ResultSet rs = func.getData(query);
        try {
            if(rs.next()){
                return true;
            }else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
     }
     
     public Book searchBookbyID_Isbn(int _id, String _isbn){
                
       String query = "SELECT * FROM `books` WHERE `id`='" + _id + "' OR `isbn`='" + _isbn + "'";

       
         
         ResultSet rs = func.getData(query);
         Book book= null;
        try {
            if(rs.next()){
               book= new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),rs.getInt(5), rs.getInt(6), rs.getString(7),rs.getDouble(8), rs.getString(9), rs.getBytes(10));
            }else 
            {
             return book;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return book;
     }
}

