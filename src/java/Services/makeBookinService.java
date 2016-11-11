package Services;


import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ab1d_rahman
 */
public class makeBookinService {
    
    public boolean registerUser(String email, String password, String firstName, String lastName, String phoneNo) throws ClassNotFoundException
    {    
        boolean ret = false;
        Connection con = null;
        PreparedStatement ps = null;
        Statement stmnt;
//        ResultSet rs = null;
        
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/logindb";
        String user = "root";
        String dbpsw = "root";

        //String sql = "insert into userinfo values('?', '?', '?', '?' ,'?')";
         //String sql = "insert into userinfo (email, password, firstName, lastName, phoneNo) values (?,?,?,?,?)";
         String sql = "insert into userinfo values (?, ?, ?, ?, ?)";
        
        try{
                Class.forName(driverName);
                con = DriverManager.getConnection(url, user, dbpsw);
                ps = con.prepareStatement(sql);
//                stmnt = con.createStatement();
//                stmnt.executeUpdate(sql)
                ps.setString(1, email);
                ps.setString(2, password);
                ps.setString(3, firstName);
                ps.setString(4, lastName);
                ps.setString(5, phoneNo);
//                rs = ps.executeQuery();    
                int i = ps.executeUpdate();
                if(i > 0){
                    ret= true;
                    
                }
                else ret= false;
                ps.close();
            }
            catch(SQLException sqe)
            {
                out.println(sqe);
            }
        return ret;
    }            
    
}
