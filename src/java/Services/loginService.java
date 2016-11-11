package Services;


import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ab1d_rahman
 */
public class loginService {
    
    public boolean authenticate(userInfo uI) throws ClassNotFoundException
    {
        boolean ret = false;
        String dbEmail = null;
        String dbPass = null;
     
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/logindb";
        String user = "root";
        String dbpsw = "root";

        String sql = "select * from userinfo where email=? and password=?";
        
        
        try{
                Class.forName(driverName);
                con = DriverManager.getConnection(url, user, dbpsw);
                ps = con.prepareStatement(sql);
                ps.setString(1, uI.email);
                ps.setString(2, uI.password);
                rs = ps.executeQuery();
                if(rs.next())
                {
                    dbEmail = rs.getString("email");
                    dbPass = rs.getString("password");
                    if(uI.email.equals(dbEmail) && uI.password.equals(dbPass))
                    {
                       ret = true;
                    }
                }
                else ret = false;
                rs.close();
                ps.close();
            }
            catch(SQLException sqe)
            {
                out.println(sqe);
            }
        return ret;
    }            
    
}
