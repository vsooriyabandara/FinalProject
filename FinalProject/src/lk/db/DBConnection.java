package lk.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *@author Veranga Sooriyabandara
 *Our Java Class
 */
public class DBConnection {
    public Connection getConnection(){
        String dbURL = "jdbc:mysql://localhost:3306/mcash";
        String dbUsername="root";
        String dbPassword ="root";
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        return con;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
        
    }
}
