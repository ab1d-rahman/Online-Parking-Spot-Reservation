package Services;


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
public interface bookingStrategy {

    boolean bookVehicle(bookingInfo bI, HttpSession session);    
    
}
