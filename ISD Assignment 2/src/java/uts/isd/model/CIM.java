/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.model;

/**
 *
 * @author timmy
 */
public class CIM {
    private String fName;
    private String lName;
    private String password;
    private String email;
    private int phoneNo;
    private String dob;
    private boolean isCustomer;
    private boolean active;
    
    private int streetNo;
    private String streetName;
    private int postcode;
    private String state;
    private String suburb;
    private String country;
    
    private int cardNo;
    private String cardName;
    private String cardExpiry;
    private int cardPin;

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public String getDob() {
        return dob;
    }

    public boolean isIsCustomer() {
        return isCustomer;
    }

    public boolean isActive() {
        return active;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setIsCustomer(boolean isCustomer) {
        this.isCustomer = isCustomer;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
//    public CIM(String fName, String lName, String password, String email, int phoneNo, String dob, boolean isCustomer, boolean active){
//        this.fName = fName;
//        this.lName = lName;
//        this.password = password;
//        this.email = email;
//        this.phoneNo = phoneNo;
//        this.dob = dob;
//        this.isCustomer = isCustomer;
//        this.active = active;
//    }
    
    public CIM(String fName, String lName, String password, String email, int phoneNo, String dob, boolean isCustomer, boolean active, int streetNo, String streetName, int postcode, String state, String suburb, String country){
        this.fName = fName;
        this.lName = lName;
        this.password = password;
        this.email = email;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.isCustomer = isCustomer;
        this.active = active;
        this.streetNo = streetNo;
        this.streetName = streetName;
        this.postcode = postcode;
        this.state = state;
        this.suburb = suburb;
        this.country = country;
    }
    
    
}
