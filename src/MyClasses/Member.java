
package MyClasses;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Member {
    
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String gender;
    
      public Member(){};
      
    public Member(int _id, String _fname, String _lname, String _phone, String _email, String _gender){
        
        this.id= _id;
        this.firstName= _fname;
        this.lastName=_lname;
        this.phone=_phone;
        this.email= _email;
        this.gender= _gender;
        
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

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void addMember(String _fname, String _lname, String _phone, String _email, String _gender){
      
        
        try {
             String insertquery ="INSERT INTO `members`(`firstName`, `lastName`, `phone`, `email`, `gender`) VALUES (?,?,?,?,?)";
            PreparedStatement ps= DB.getConnection().prepareStatement(insertquery);
            
ps.setString(1,_fname);
ps.setString(2,_lname);
ps.setString(3,_phone);
ps.setString(4,_email);
ps.setString(5,_gender);

if(ps.executeUpdate()!=0){
    JOptionPane.showMessageDialog(null, "Pjestari u shtua", "Add member", 1);
}
else{
    JOptionPane.showMessageDialog(null, "Pjestari nuk u shtua", "Add member", 2);
}


        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void editMember(int _id, String _fname, String _lname, String _phone, String _email, String _gender){
        
     String editQuery = "UPDATE `members` SET `firstName`=?,`lastName`=?,`phone`=?,`email`=?,`gender`=? WHERE `ID`=?";
        try {
          
            PreparedStatement ps= DB.getConnection().prepareStatement(editQuery);
ps.setString(1,_fname);
ps.setString(2,_lname);
ps.setString(3,_phone);
ps.setString(4,_email);
ps.setString(5,_gender);

int rowsAffected = ps.executeUpdate();

if(ps.executeUpdate()!=0){
    JOptionPane.showMessageDialog(null, "Member Edited", "Editmember", 1);
}else{
    JOptionPane.showMessageDialog(null, "Invalid Member ID", "Error", 2);
}
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
       public void deleteMember(int _id){
      //remove genre by id 
     String deleteQuery = "DELETE FROM `members` WHERE `id`=?";
        try {
          
            PreparedStatement ps= DB.getConnection().prepareStatement(deleteQuery);
            
ps.setInt(1,_id);

if(ps.executeUpdate()!=0){
    JOptionPane.showMessageDialog(null, "Member Deleted", "Delete meber", 1);
}else{
    JOptionPane.showMessageDialog(null, "Invalid Member ID", "Error", 2);
}


        } catch (SQLException ex) {
                Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
       //get member by id
      public Member getMemberById(Integer _id) {
    F_Class func = new F_Class();
    String query = "SELECT * FROM `members` WHERE `ID`=?";
    
    ResultSet rs = func.getDataa(query, _id);  // Pass _id as a parameter

    try {
        if (rs.next()) {
            return new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
        } else {
            // Handle the case where no member is found with the given ID
        }
    } catch (SQLException ex) {
        Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
}
      
      //nje tjeter funksion per te populluar ArrayList me members
      public ArrayList<Member> membersList(String query){
       
  
          
          ArrayList<Member> mList= new ArrayList<>();
            MyClasses.F_Class func= new F_Class();
            
            try {
            if(query.equals("")){//if the user enter empty string make this default select
                
             query= "SELECT * FROM `members`";
            
            }
        ResultSet rs= func.getData(query);
        Member member;
        while(rs.next()){
           member = new Member(rs.getInt("ID"), rs.getString("FirstName"), rs.getString("LastName"), rs.getString("phone"), rs.getString("email"),rs.getString("gender"));
        mList.add(member);
        }
        
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mList;
    }
    
}
   