package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Services.bookMotorcycle;
import Services.bookingStrategy;
import Services.bookMicrobus;
import Services.bookSUV;
import Services.bookPrivateCar;
import Services.bookingInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ab1d_rahman
 */
@WebServlet(urlPatterns = {"/makeBookingServlet"})
public class makeBookingServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet makeBookingServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet makeBookingServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String site, vehicleType, numPlate, bookFrom, bookUntil;
        site = request.getParameter("site");
        vehicleType = request.getParameter("vehicleType");
        numPlate = request.getParameter("numPlate");
        bookFrom = request.getParameter("bookFrom");
        bookUntil = request.getParameter("bookUntil");
        
        bookFrom += ":00:00";        
        bookUntil += ":00:00";
        
        bookingInfo bI = new bookingInfo(site, vehicleType, numPlate, bookFrom, bookUntil, null);
        
        HttpSession session = request.getSession();
        bookingStrategy BookingStrategy = null;
        if(vehicleType.equals("Private Car")) BookingStrategy = new bookPrivateCar();
        if(vehicleType.equals("SUV")) BookingStrategy = new bookSUV();
        if(vehicleType.equals("Microbus")) BookingStrategy = new bookMicrobus();
        if(vehicleType.equals("Motorcycle")) BookingStrategy = new bookMotorcycle();
        
        boolean result = false;
        
        result = BookingStrategy.bookVehicle(bI, session);
       

       if(result) response.sendRedirect("bookingSuccessful.jsp");
       else response.sendRedirect("bookingUnsuccessful.jsp");
        
        processRequest(request, response);
    }
}

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */



