/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

/**
 *
 * @author ab1d_rahman
 */
public class bookingInfo {
    
    String site;
    String vehicleType;
    String numPlate;
    String bookFrom;
    String bookUntil;
    String bookingID;
    
    public bookingInfo(String s, String v, String nP, String bF, String bU, String bID) {
        
        this.site = s;
        this.vehicleType = v;
        this.numPlate = nP;
        this.bookFrom = bF;
        this.bookUntil = bU;
        this.bookingID = bID;
    }
}
