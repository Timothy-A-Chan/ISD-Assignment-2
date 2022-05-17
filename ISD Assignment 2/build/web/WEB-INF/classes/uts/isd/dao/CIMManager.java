/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import uts.isd.model.CIM;

/**
 *
 * @author timmy
 */

/* 
* DBManager is the primary DAO class to interact with the database. 
* Complete the existing methods of this classes to perform CRUD operations with the db.
*/

public class CIMManager {
    private Statement st;
   
public CIMManager(Connection conn) throws SQLException {       
   st = conn.createStatement();   
}

//Find user by email   
public CIM findCIM(String email) throws SQLException {       
   //String fetch = "select * from USERS where EMAIL = '" + email + "'";
   String fetch = "SELECT * FROM USERS INNER JOIN CUSTOMER on USERS.USERID = CUSTOMERID WHERE Email = '"+email+"' ";

   ResultSet rs = st.executeQuery(fetch);
   
   while(rs.next()){
       String customerEmail = rs.getString(5);
       if(customerEmail.equals(email)){
           String customerFirstName = rs.getString(2);
           String customerLastName = rs.getString(3);
           String customerPassword = rs.getString(4);
           String customerPhoneNo = rs.getString(6);
           String customerDOB = rs.getString(7);
           String customerIsCustomer = rs.getString(8);
           String customerActive = rs.getString(9);
           String customerStreetNo = rs.getString(10);
           String customerStreetName = rs.getString(11);
           String customerPostcode = rs.getString(12);
           String customerState = rs.getString(13);
           String customerSuburb = rs.getString(14);
           String customerCountry = rs.getString(15);
           return new CIM(customerFirstName, customerLastName, customerPassword, customerEmail,Integer.parseInt(customerPhoneNo), customerDOB, Boolean.parseBoolean(customerIsCustomer), Boolean.parseBoolean(customerActive), Integer.parseInt(customerStreetNo), customerStreetName, Integer.parseInt(customerPostcode), customerState, customerSuburb, customerCountry);
       }
   }
   
   return null;   
}


//Add a user-data into the database   
public void addCIM(String fName, String lName, String password, String email, int phoneNo, String dob, boolean isCustomer, boolean active, int streetNo, String streetName, int postcode, String state, String suburb, String country) throws SQLException {                   //code for add-operation       

String insert = "INSERT INTO USERS(FIRST_NAME, LAST_NAME, PASSWORD, EMAIL, PHONENO, DATE_OF_BIRTH, ISCUSTOMER, ACTIVE)";
String values = "VALUES('"+fName+"', '"+lName+"', '"+password+"', '"+email+"', "+phoneNo+", '"+dob+"', '"+isCustomer+"', '"+active+"')";

st.executeUpdate(insert + values);

//String customerID = 

 ResultSet rs = st.executeQuery("SELECT USERID FROM USERS WHERE EMAIL = '"+email+"'");
        rs.next();
        int customerID = Integer.parseInt(rs.getString(1));

String insert2 = "INSERT INTO CUSTOMER(CUSTOMERID, STREET_NUMBER, STREET_NAME, POSTCODE, STATE, SUBURB, COUNTRY)";
String values2 = "VALUES("+customerID+", "+streetNo+", '"+streetName+"', "+postcode+", '"+state+"', '"+suburb+"', '"+country+"')";

st.executeUpdate(insert2 + values2);
}

//update a user details in the database   
public void updateCIM(String fName, String lName, String password, String email, int phoneNo, String dob, boolean isCustomer, boolean active) throws SQLException {       
    //st.executeUpdate("UPDATE ISDUSER.USERS SET NAME= '"+name+"', GENDER='"+gender+"', FAVOURITECOLOUR='"+favcol+"' WHERE EMAIL = '"+email+"' AND PASSWORD = '"+password+"' ");
    st.executeUpdate("UPDATE USERS SET FIRST_NAME= '"+fName+"', LAST_NAME='"+lName+"', PASSWORD='"+password+"', PHONENO="+phoneNo+", DATE_OF_BIRTH='"+dob+"', ISCUSTOMER='"+isCustomer+"', ACTIVE='"+active+"' WHERE EMAIL='"+email+"'");
}       

//delete a user from the database   
public void deleteCIM(String email) throws SQLException, Exception{       
//   st.executeUpdate("DELETE FROM USERS WHERE EMAIL ='" + email +"' "); 
//   
//   //st.executeUpdate("DELETE FROM USERS INNER JOIN CUSTOMER on USERS.USERID = CUSTOMERID WHERE EMAIL = '"+email+"' ");
//   
//   ResultSet rs = st.executeQuery("SELECT USERID FROM USERS WHERE EMAIL = '"+email+"'");
//   rs.next();
//   int customerID = Integer.parseInt(rs.getString(1));
//   
//   //st.executeUpdate("DELETE FROM USERS WHERE USERID =" + customerID +" ");
//   st.executeUpdate("DELETE FROM CUSTOMER WHERE USERID = "+customerID+" ");

ResultSet rs = st.executeQuery("SELECT UserID FROM USERS WHERE email='" + email + "'");
        if (rs.next()) {
            int customerID = Integer.parseInt(rs.getString(1));
            
            st.executeUpdate("DELETE FROM USERS WHERE USERID=" + customerID + "");
            st.executeUpdate("DELETE FROM CUSTOMER WHERE CUSTOMERID=" + customerID + "");
        }
        else {
            throw new Exception("Error: Account not found!");
        }
   
   
}

public ArrayList<CIM> fectCIM() throws SQLException{
    String fetch = "SELECT * FROM USERS INNER JOIN CUSTOMER on USERS.USERID = CUSTOMERID";
    ResultSet rs = st.executeQuery(fetch);
    ArrayList<CIM> temp = new ArrayList();
    
    while(rs.next()){
           String customerFirstName = rs.getString(2);
           String customerLastName = rs.getString(3);
           String customerPassword = rs.getString(4);
           String customerEmail = rs.getString(5);
           String customerPhoneNo = rs.getString(6);
           String customerDOB = rs.getString(7);
           String customerIsCustomer = rs.getString(8);
           String customerActive = rs.getString(9);
           String customerStreetNo = rs.getString(10);
           String customerStreetName = rs.getString(11);
           String customerPostcode = rs.getString(12);
           String customerState = rs.getString(13);
           String customerSuburb = rs.getString(14);
           String customerCountry = rs.getString(15); 
        temp.add(new CIM(customerFirstName, customerLastName, customerPassword, customerEmail, Integer.parseInt(customerPhoneNo), customerDOB, Boolean.parseBoolean(customerIsCustomer), Boolean.parseBoolean(customerActive), Integer.parseInt(customerStreetNo), customerStreetName, Integer.parseInt(customerPostcode), customerState, customerSuburb, customerCountry));
     }
    return temp;
}

public boolean checkCIM(String email) throws SQLException{
    String fetch = "SELECT * FROM USERS WHERE EMAIL = '" + email +"'";
    ResultSet rs = st.executeQuery(fetch);
    
    while(rs.next()){
        String userEmail = rs.getString(5);
        if(userEmail.equals(email)){
            return true;
        }
    }
    return false;
    
}

}



