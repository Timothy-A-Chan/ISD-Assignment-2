/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller;

/**
 *
 * @author timmy
 */

import uts.isd.dao.DBConnector;
import uts.isd.dao.DBManager;
import java.sql.*;

import java.util.*;

import java.util.logging.*;

 

public class TestDB {

private static Scanner in = new Scanner(System.in);

 

public static void main(String[] args) {

try {

DBConnector connector = new DBConnector();

Connection conn = connector.openConnection();

DBManager db = new DBManager(conn);

System.out.print("User's First Name: ");

String fname = in.nextLine();

System.out.print("User's Last Name: ");

String lname = in.nextLine();

System.out.print("User's password: ");

String password = in.nextLine();

System.out.print("User's email: ");

String email = in.nextLine();

System.out.print("User's phone number: ");

//String phoneNoString = in.nextLine();

String phoneNo = in.nextLine();

//int phoneNo = Integer.parseInt(phoneNoString);

System.out.print("User's date of birth: ");

String dob = in.nextLine();

System.out.print("User's card number: ");

String cardNo = in.nextLine();

System.out.print("User's card expiration: ");

String cardExp = in.nextLine();

System.out.print("User's card pin: ");

String cardPin = in.nextLine();

System.out.print("Is the user a customer?: ");

String isCustomerString = in.nextLine();

Boolean isCustomer = Boolean.parseBoolean(isCustomerString);

db.addUser(email, fname, lname, password, Integer.parseInt(phoneNo), dob, Integer.parseInt(cardNo), cardExp, Integer.parseInt(cardPin), isCustomer);

System.out.println("User is added to the database.");

connector.closeConnection();

 

} catch (ClassNotFoundException | SQLException ex) {

Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);

}

}

}
