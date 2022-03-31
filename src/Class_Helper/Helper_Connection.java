/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Helper;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 98tae
 */
public class Helper_Connection {
     public static Connection Connec(){
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("123");
        ds.setPortNumber(1433);
        ds.setDatabaseName("EduSys");
        ds.setServerName("localhost");
        try {
            Connection con = ds.getConnection();
            return con;
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        }
        
        
        return null;
        
    
    }
}
