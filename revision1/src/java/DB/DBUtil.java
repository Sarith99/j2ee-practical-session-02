/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class DBUtil {
    public static PreparedStatemant getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
        PreparedStatemant ps= null;
        Class.forName("com.mysql.jdbc.driver");
        String url="jdbc:mysql://localhost:3306/test_1?useSSL=false";
        String user = "root";
        String pass = "";
        
        Connection con = DriverManager.getConnection(url,user,pass);
        ps = (PreparedStatemant) con.prepareStatement(sql);
        
        return ps;
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        getPreparedStatement("select * from user");
    }
    
}
