package controller;

import java.io.IOException;

import java.sql.SQLException;

import java.util.logging.Level;

import java.util.logging.Logger;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import model.CIM;

import dao.CIMManager;

public class ShowCIMServlet extends HttpServlet {

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        //ValidatorCIM validator = new ValidatorCIM();

        String fName = request.getParameter("fName");
        String lName = request.getParameter("lName");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String phoneNo = request.getParameter("phoneNo");
        String dob = request.getParameter("dob");
        String isCustomer = request.getParameter("isCustomer");
        String active = request.getParameter("active");
        String streetNo = request.getParameter("streetNo");
        String streetName = request.getParameter("streetName");
        String postcode = request.getParameter("postcode");
        String state = request.getParameter("state");
        String suburb = request.getParameter("suburb");
        String country = request.getParameter("fName");
        //5- retrieve the manager instance from session    
        CIMManager manager = (CIMManager) session.getAttribute("manager");
        //CIM cim = null;
//        validator.clear(session);
//
//        if (!validator.validateEmail(email)) {
//
//            session.setAttribute("emailErr", "Error: Email format incorrect");
//            request.getRequestDispatcher("login.jsp").include(request, response);
//        } else if (!validator.validatePassword(password)) {
//            session.setAttribute("passErr", "Error: Pasword format incorrect");
//            request.getRequestDispatcher("login.jsp").include(request, response);
//
//        } else {
        try {

            manager.addCIM(fName, lName, password, email, Integer.parseInt(phoneNo), dob, Boolean.parseBoolean(isCustomer), Boolean.parseBoolean(active), Integer.parseInt(streetNo), streetName, Integer.parseInt(postcode), state, suburb, country);
            request.getRequestDispatcher("CIM.jsp").include(request, response);
        } 
        catch (SQLException ex) {

            Logger.getLogger(CreateCIMServlet.class.getName()).log(Level.SEVERE, null, ex);
            //System.out.println(ex.getMessage() == null ? "User does no exist" : "welcome");

        }
        
        //request.getRequestDispatcher("CIM.jsp").include(request, response);

    }

}

