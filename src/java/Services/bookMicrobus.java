package Services;


import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class bookMicrobus implements bookingStrategy{

    
    @Override
    public boolean bookVehicle(bookingInfo bI, HttpSession session) {        
        int perHourCost = 25;
        int totalCost = 0;
        String spaceID = null;
        try {
            spaceID = checkSpace(bI);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(bookPrivateCar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(spaceID.equals("fail")) return false;
        timeDiff TimeDiff = new timeDiff();
        totalCost = perHourCost * TimeDiff.getHourDifference(bI.bookFrom, bI.bookUntil);
        if(totalCost <= 0) return false;
//        System.out.println(spaceID);
        String email = (String) session.getAttribute("currentEmail");
        bookingIDGenerator.bookID++;
        String bookingID = "B" + Integer.toString(bookingIDGenerator.bookID);
        session.setAttribute("currentCost", Integer.toString(totalCost));
        session.setAttribute("currentBookingID", bookingID);
        
        boolean ret = false;
        Connection con = null;
        PreparedStatement ps = null;
//        ResultSet rs = null;
        
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/logindb";
        String user = "root";
        String dbpsw = "root";

       //////////////////////////////////////////////////////  
        
        String sql = "insert into bookinginfo values (?, ?, ?, ?, ?, ?)";
        
        try{
                Class.forName(driverName);
                con = DriverManager.getConnection(url, user, dbpsw);
                ps = con.prepareStatement(sql);
//                stmnt = con.createStatement();
//                stmnt.executeUpdate(sql)
                ps.setString(1, bookingID);
                ps.setString(2, email);
                ps.setString(3, bI.bookFrom);
                ps.setString(4, bI.bookUntil);
                ps.setString(5, bI.site);
                ps.setString(6, Integer.toString(totalCost));
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
        
        
        sql = "insert into microbus values (?, ?, ?, ?, ?, ?)";
        
        try{
                Class.forName(driverName);
                con = DriverManager.getConnection(url, user, dbpsw);
                ps = con.prepareStatement(sql);
//                stmnt = con.createStatement();
//                stmnt.executeUpdate(sql)
                ps.setString(1, bI.site);
                ps.setString(2, spaceID);
                ps.setString(3, bI.numPlate);
                ps.setString(4, bI.bookFrom);
                ps.setString(5, bI.bookUntil);
                ps.setString(6, bookingID);
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
    
    
    public String checkSpace(bookingInfo bI) throws ClassNotFoundException{
        
        String ret = "fail";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/logindb";
        String user = "root";
        String dbpsw = "root";
        String sID = "B";
        
        for(int i=1; i<=5; i++){
            String spaceID = sID + Integer.toString(i);
            String sql = "select * from microbus where site=? and spaceID=? and ((bookFrom>=? and bookUntil<=?) or (?>=bookFrom and ?<=bookUntil) or (?>=bookFrom and ?<bookUntil) or (?>bookFrom and ? <= bookUntil))";


            try{
                    Class.forName(driverName);
                    con = DriverManager.getConnection(url, user, dbpsw);
                    ps = con.prepareStatement(sql);
                    ps.setString(1, bI.site);
                    ps.setString(2, spaceID);
                    ps.setString(3, bI.bookFrom);
                    ps.setString(4, bI.bookUntil);
                    ps.setString(5, bI.bookFrom);
                    ps.setString(6, bI.bookUntil);
                    ps.setString(7, bI.bookFrom);
                    ps.setString(8, bI.bookUntil);
                    ps.setString(9, bI.bookFrom);
                    ps.setString(10, bI.bookUntil);
                    
                    rs = ps.executeQuery();
                    if(rs.next())
                    {                        
                                               
                    }
                    else 
                    {
                        ret = spaceID;
                        rs.close();
                        ps.close();
                        return ret;
                    }
                    rs.close();
                    ps.close();
                }
                catch(SQLException sqe)
                {
                    out.println(sqe);
                }
        }
        
        return ret;
    }
    
}
