package Services;


import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class cancelBookingService {
    
    public boolean deleteBooking(bookingInfo bI, HttpSession session) throws ClassNotFoundException {        
        
        if(checkBooking(bI.bookingID, session) == false) return false;
        
        boolean ret = false;
        Connection con = null;
        PreparedStatement ps = null;
//        ResultSet rs = null;
        
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/logindb";
        String user = "root";
        String dbpsw = "root";

       //////////////////////////////////////////////////////  
        
        String sql = "delete from bookinginfo where bookingID=?";
        
        try{
                Class.forName(driverName);
                con = DriverManager.getConnection(url, user, dbpsw);
                ps = con.prepareStatement(sql);
                ps.setString(1, bI.bookingID);
               
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
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(bookPrivateCar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
        
    }
    
    
    public boolean checkBooking(String bookingID, HttpSession session) throws ClassNotFoundException{
        
        boolean ret = false;
        
        String cost = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/logindb";
        String user = "root";
        String dbpsw = "root";

        String sql = "select * from bookinginfo where email=? and bookingID=?";
        
        
        try{
                Class.forName(driverName);
                con = DriverManager.getConnection(url, user, dbpsw);
                ps = con.prepareStatement(sql);
                ps.setString(1, (String)session.getAttribute("currentEmail"));
                ps.setString(2, bookingID);
                rs = ps.executeQuery();
                if(rs.next())
                {
                    cost = rs.getString("cost");
                    ret = true;             
                    int fine = Integer.parseInt(cost);
                    fine = (int) ((double)((double) fine * (double)(0.1)));
                    session.setAttribute("currentFine", Integer.toString(fine));
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
