/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timmy
 */
package uts.isd.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String email;
    private String fname;
    private String lname;
    private String password;
    private Integer phoneNo;
    private String DOB;
    private Boolean isCustomer;
    private Integer cardNo;
    private String cardExp;
    private Integer cardPin;
    private static List<User> cachedUsers = new ArrayList<User>();
    private static User activeUser;
    
    public User(String email, String fname, String lname, String password, Integer phoneNo, String DOB) {

        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.password = password;
        this.phoneNo = phoneNo;
        this.DOB = DOB;
    }
    
    public User(String email, String fname, String lname, String password, Integer phoneNo, String DOB, Integer cardNo, String cardExp, Integer cardPin, Boolean isCustomer) {
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.password = password;
        this.phoneNo = phoneNo;
        this.DOB = DOB;
        this.cardNo = cardNo;
        this.cardExp = cardExp;
        this.cardPin = cardPin;
        this.isCustomer = isCustomer;
    }
    
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setIsCustomer(Boolean isCustomer) {
        this.isCustomer = isCustomer;
    }

    public static void setCachedUsers(List<User> cachedUsers) {
        User.cachedUsers = cachedUsers;
    }

    public static void setActiveUser(User activeUser) {
        User.activeUser = activeUser;
    }

    public void setCardNo(Integer cardNo) {
        this.cardNo = cardNo;
    }

    public void setCardExp(String cardExp) {
        this.cardExp = cardExp;
    }

    public void setCardPin(Integer cardPin) {
        this.cardPin = cardPin;
    }
    
    public User(String email, String fname, String lname, String password, int phoneNo, String DOB, Boolean isCustomer) {
        this(email,fname,lname,password,phoneNo,DOB);
        this.isCustomer = isCustomer;
        cachedUsers.add(this);
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return fname + " " + lname;
    }

    public String getPassword() {
        return password;
    }
    
    private String invertColor(String myColorString) {
        myColorString = myColorString.substring(1);
        int color = (int)Long.parseLong(myColorString, 16);
        int r = (color >> 16) & 0xFF;
        int g = (color >> 8) & 0xFF;
        int b = (color) & 0xFF;

        double luma = (0.299*r + 0.587*g + 0.114*b);
        
        if(luma < 50){
            return "#fdfdfd";
        }
        return "#2f2f2f";
    }
    
    public static void setUser(String email, String password){
        for(int i = 0;i < User.cachedUsers.size();i++){
            if(email.equals(User.cachedUsers.get(i).getEmail()) && password.equals(User.cachedUsers.get(i).getPassword())){
                User.activeUser = User.cachedUsers.get(i);
            }
        }
    }
    
    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public String getDOB() {
        return DOB;
    }
    
    public static User getUser(){
        return User.activeUser;
    }
    
    public static void resetUser(){
        User.activeUser = null;
    }

    @Override
    public String toString() {
        return email + ": " + this.getName();
    }

    public Boolean getIsCustomer() {
        return isCustomer;
    }

    public int getCardNo() {
        return cardNo;
    }

    public String getCardExp() {
        return cardExp;
    }

    public int getCardPin() {
        return cardPin;
    }

    public static List<User> getCachedUsers() {
        return cachedUsers;
    }

    public static User getActiveUser() {
        return activeUser;
    }
    
    

}