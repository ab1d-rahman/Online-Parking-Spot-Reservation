package Services;


import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpSession;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ab1d_rahman
 */
public class editProfileService {
    
    public boolean editProfile(userInfo uI, HttpSession session) throws ClassNotFoundException {
        
        
        Connection con = null;
        PreparedStatement ps = null;        
        
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/logindb";
        String user = "root";
        String dbpsw = "root";

        //String sql = "insert into userinfo values('?', '?', '?', '?' ,'?')";
         //String sql = "insert into userinfo (email, password, firstName, lastName, phoneNo) values (?,?,?,?,?)";
         String sql;
         
         if(uI.password != ""){
             
            sql = "update userinfo set password=? where email=?";
        
            try{
                    Class.forName(driverName);
                    con = DriverManager.getConnection(url, user, dbpsw);
                    ps = con.prepareStatement(sql);
                    ps.setString(1, uI.password);
                    ps.setString(2, (String) session.getAttribute("currentEmail"));
                    
    //                rs = ps.executeQuery();    
                    int i = ps.executeUpdate();                    
                    ps.close();
                }
                catch(SQLException sqe)
                {
                    out.println(sqe);
                }           
         }
         
         if(uI.firstName != ""){
             
            sql = "update userinfo set firstName=? where email=?";
        
            try{
                    Class.forName(driverName);
                    con = DriverManager.getConnection(url, user, dbpsw);
                    ps = con.prepareStatement(sql);
                    ps.setString(1, uI.firstName);
                    ps.setString(2, (String) session.getAttribute("currentEmail"));
                    
    //                rs = ps.executeQuery();    
                    int i = ps.executeUpdate();                    
                    ps.close();
                }
                catch(SQLException sqe)
                {
                    out.println(sqe);
                }           
         }
         
         
         if(uI.lastName != ""){
             
            sql = "update userinfo set lastName=? where email=?";
        
            try{
                    Class.forName(driverName);
                    con = DriverManager.getConnection(url, user, dbpsw);
                    ps = con.prepareStatement(sql);
                    ps.setString(1, uI.lastName);
                    ps.setString(2, (String) session.getAttribute("currentEmail"));
                    
    //                rs = ps.executeQuery();    
                    int i = ps.executeUpdate();                    
                    ps.close();
                }
                catch(SQLException sqe)
                {
                    out.println(sqe);
                }           
         }
         
         
         if(uI.phoneNo != ""){
             
            sql = "update userinfo set phoneNo=? where email=?";
        
            try{
                    Class.forName(driverName);
                    con = DriverManager.getConnection(url, user, dbpsw);
                    ps = con.prepareStatement(sql);
                    ps.setString(1, uI.phoneNo);
                    ps.setString(2, (String) session.getAttribute("currentEmail"));
                    
    //                rs = ps.executeQuery();    
                    int i = ps.executeUpdate();                    
                    ps.close();
                }
                catch(SQLException sqe)
                {
                    out.println(sqe);
                }           
         }   
    
    return true;
    
    }
}
