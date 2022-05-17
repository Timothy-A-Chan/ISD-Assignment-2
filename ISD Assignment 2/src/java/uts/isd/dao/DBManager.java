/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.dao;

/**
 *
 * @author timmy
 */

import uts.isd.model.User;
import java.sql.*;

/* 
* DBManager is the primary DAO class to interact with the database. 
* Complete the existing methods of this classes to perform CRUD operations with the db.
*/

public class DBManager {

private Statement st;
   
public DBManager(Connection conn) throws SQLException {       
   st = conn.createStatement();   
}

//Find user by email and password in the database   
public User findUser(String email) throws SQLException {       
   String fetch = "select * from USERS where EMAIL = '" + email + "'";
   ResultSet rs = st.executeQuery(fetch);
   
   while(rs.next()){
       String userEmail = rs.getString(2);
       if(userEmail.equals(email)){
           String userFirstName = rs.getString(1);
           String userLastName = rs.getString(2);
           String userPassword = rs.getString(3);
           String userPhoneNo = rs.getString(5);
           String userDOB = rs.getString(6);
           return new User(userEmail, userFirstName, userLastName, userPassword, Integer.parseInt(userPhoneNo), userDOB);
       }
   }
   
   return null;   
}


//Add a user-data into the database   
public void addUser(String email, String fname, String lname, String password, int phoneNo, String DOB, int cardNo, String cardExp, int cardPin, Boolean isCustomer) throws SQLException {                   //code for add-operation       
String columns = "INSERT INTO USERS(FIRST_NAME, LAST_NAME, PASSWORD, EMAIL, PHONENO, DATE_OF_BIRTH, CARDNO, CARDEXPIRATION, CARD_PIN, ISCUSTOMER)"; 
String values = "VALUES ('"+fname+"', '"+lname+"', '"+password+"', '"+email+"', "+phoneNo+", '"+DOB+"', "+cardNo+", '"+cardExp+"', "+cardPin+", '"+isCustomer+"')";

//String columns = "INSERT INTO USERS(FIRST_NAME, LAST_NAME, PASSWORD, EMAIL, PHONENO, DATE_OF_BIRTH, CARDNO, CARDEXPIRATION, CARD_PIN, ISCUSTOMER)";
//String values = "VALUES('Tom', 'Chan', 't1234', 'timmyac940@gmail.com', 0432458221, '2000-04-09', 1234, '2020-05-05', 1234, 'True')";
st.executeUpdate(columns + values);



//st.executeUpdate("INSERT INTO USERS(FIRST_NAME, LAST_NAME, PASSWORD, EMAIL, PHONENO, DATE_OF_BIRTH, CARDNO, CARDEXPIRATION, CARD_PIN, ISCUSTOMER)"+"\nVALUES('Tom', 'Chan', 't1234', 'timmyac940@gmail.com', 0432458221, '2000-04-09', 1234, '2020-05-05', 1234, 'True')");

//INSERT INTO USERS(FIRST_NAME, LAST_NAME, PASSWORD, EMAIL, PHONENO, DATE_OF_BIRTH, CARDNO, CARDEXPIRATION, CARD_PIN, ISCUSTOMER)
//VALUES 
//('Jim', 'Chan', 't1234', 'timmyac940@gmail.com', 0432458221, '2000-04-09', 1234, '2020-05-05', 1234, 'True');

//st.executeUpdate("INSERT INTO USERS" + "VALUES ('" + fname + "', '" + lname + "', '" + password + "', '" + email + "', " + phoneNo + ", '" + DOB + "', " + cardNo + ", '" + cardExp + "', " + cardPin + ", " + isCustomer + ") ");   

}

//public void addCustomer(int userID, String dob, int streetNum, String streetName, int postCode, boolean registered) throws ParseException, SQLException {
//        String columns = "INSERT INTO CUSTOMERTABLE(USERID, DOB, STREETNUMBER, STREETNAME, POSTCODE, REGISTERED)";
//        Date d = DateFormat.getDateInstance().parse(dob);
//        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
//        String strDate = formatter.format(d);
//        String values = "VALUES (" + userID + ",'" + strDate + "'," + streetNum + ",'" + streetName + "'," + postCode + "," + registered + ")";
//        statement.executeUpdate(columns + values);
//    }



//update a user details in the database   
public void updateUser( String email, String name, String password, String gender, String favcol) throws SQLException {       
   //code for update-operation   

}       

//delete a user from the database   
public void deleteUser(String email) throws SQLException{       
   //code for delete-operation   

}


 

}
