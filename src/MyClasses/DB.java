
package MyClasses;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;


public class DB {
    private static String serverName="localhost";
    private static String username="root";
    private  static String dbName="java_library_system";
    private static Integer portNumber=3306; //numri para MYSQL tek XAMPP
    private static String password= "";
    
    //create a unction to create & return the connection
    public static Connection getConnection(){
      Connection connection= null;
      
      MysqlDataSource datasource= new MysqlDataSource();
      
      datasource.setServerName(serverName);
      datasource.setUser(username);
      datasource.setDatabaseName(dbName);
      datasource.setPortNumber(portNumber);
      datasource.setPassword(password);
      

        try {
            connection= (Connection) datasource.getConnection();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
       
      return connection;
    }
}
