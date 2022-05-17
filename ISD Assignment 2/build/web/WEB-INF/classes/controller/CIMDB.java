/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DBConnector;
import dao.CIMManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CIM;

/**
 *
 * @author timmy
 */
public class CIMDB {

private static Scanner in = new Scanner(System.in);
private DBConnector connector;
private Connection conn;
private CIMManager db;
 

public static void main(String[] args) throws SQLException, Exception {
    (new CIMDB()).runQueries();
}

public CIMDB(){
    try{
        connector = new DBConnector();
        conn = connector.openConnection();
        db = new CIMManager(conn);
    }
    
    catch(ClassNotFoundException | SQLException ex){
        Logger.getLogger(CIMDB.class.getName()).log(Level.SEVERE, null, ex);
    }
}

private char readChoice(){
    System.out.print("Operations CRUDS or * to exit:");
    return in.nextLine().charAt(0);
}

private void runQueries() throws SQLException, Exception{
    char c;
    
    while((c = readChoice()) != '*'){
        switch(c){
            case 'C': ;
                testAdd();
                break;
            case 'R': ;
                testRead();
                break;
            case 'U': ;
                testUpdate();
                break;
            case 'D': ;
                testDelete();
                break;
            case 'S': ;
                showAll();
                break;
            default:
                System.out.println("Unknown Command");
        }
    }
}

private void testAdd(){
System.out.print("User's First Name: ");

String fname = in.nextLine();

System.out.print("User's Last Name: ");

String lname = in.nextLine();

System.out.print("User's password: ");

String password = in.nextLine();

System.out.print("User's email: ");

String email = in.nextLine();

System.out.print("User's phone number: ");

String phoneNo = in.nextLine();

System.out.print("User's date of birth: ");

String dob = in.nextLine();

System.out.print("Is the user a customer?: ");

String isCustomer = in.nextLine();

System.out.print("Is the customer active?: ");

String active = in.nextLine();

System.out.print("Customer's street number: ");

String streetNo = in.nextLine();

System.out.print("Customer's street name: ");

String streetName = in.nextLine();

System.out.print("Customer postcode: ");

String postcode = in.nextLine();

System.out.print("Customer's state: ");

String state = in.nextLine();

System.out.print("Customer's suburb: ");

String suburb = in.nextLine();

System.out.print("Customer's country: ");

String country = in.nextLine();
    
    try{
        db.addCIM(fname, lname, password, email, Integer.parseInt(phoneNo), dob, Boolean.parseBoolean(isCustomer), Boolean.parseBoolean(active), Integer.parseInt(streetNo), streetName, Integer.parseInt(postcode), state, suburb, country);
    }
    catch(SQLException ex){
       Logger.getLogger(CIMDB.class.getName()).log(Level.SEVERE, null, ex); 
    }
    System.out.println("Customer is added to the database.");
}

private void testRead() throws SQLException{
    System.out.print("User email: ");
    String email = in.nextLine();
    CIM customerInformationManagement = db.findCIM(email);
    if(customerInformationManagement != null){
        System.out.println("User " + customerInformationManagement.getfName() +" exists in the database.");
    }
    else{
        System.out.println("User does not exist.");
    }
}

private void testUpdate(){
    System.out.print("User email: ");
    String email = in.nextLine();
    
    try{
        if(db.checkCIM(email)){
            System.out.print("User's First Name: ");

    String fname = in.nextLine();

    System.out.print("User's Last Name: ");

    String lname = in.nextLine();

    System.out.print("User's password: ");

    String password = in.nextLine();

    System.out.print("User's phone number: ");

    String phoneNo = in.nextLine();

    System.out.print("User's date of birth: ");

    String dob = in.nextLine();

    System.out.print("Is the user a customer?: ");

    String isCustomer = in.nextLine();

    System.out.print("Is the user active?: ");

String active = in.nextLine();
            db.updateCIM(fname, lname, password, email, Integer.parseInt(phoneNo), dob, Boolean.parseBoolean(isCustomer), Boolean.parseBoolean(active));
        }
        else{
            System.out.println("User does not exist");
        }
    }
    
    catch(SQLException ex){
        Logger.getLogger(CIMDB.class.getName()).log(Level.SEVERE, null, ex);
    }
}

private void testDelete() throws Exception{
    System.out.print("User email: ");
    String email = in.nextLine();
    
    try{
        if(db.checkCIM(email)){
            db.deleteCIM(email);
        }
        else{
            System.out.println("User does not exist");
        }
    }
    
    catch (SQLException ex){
        Logger.getLogger(CIMDB.class.getName()).log(Level.SEVERE, null, ex);
    }
}

private void showAll(){
    try{
        ArrayList<CIM> customers = db.fectCIM();
        System.out.println("Customer Information Management: ");
        customers.stream().forEach((customer) -> {
            System.out.printf("%-20s %-30s %-20s %-10s %-20s %-30s %-20s %-10s %-30s %-30s %-30s %-30s %-30s \n", customer.getfName(), customer.getlName(), customer.getPassword(), customer.getEmail(), customer.getPhoneNo(), customer.getDob(), customer.isIsCustomer(), customer.isActive(), customer.getStreetNo(), customer.getStreetName(), customer.getPostcode(), customer.getState(), customer.getSuburb(), customer.getCountry());
        });
        System.out.println();
    }
    catch(SQLException ex){
        Logger.getLogger(CIMDB.class.getName()).log(Level.SEVERE, null, ex);

    }
}

}