<%-- 
    Document   : updateCIM
    Created on : 15/05/2022, 5:53:08 PM
    Author     : timmy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="model.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
    </head>
    <body>
        <h1>Update</h1>
        <form action ="createCIMServlet" method="post">
            <table>
                <tr>
                  <td>First Name </td>
                  <td> <input type="text" placeholder="" name="fName" required="true" > </td>  
                </tr>
                <tr>
                    <td>Last Name: </td>
                    <td> <input type="text" placeholder="" name="lName" required="true"> </td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td> <input type="text" placeholder="" name="password" required="true"> </td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td> <input type="text" placeholder="" name="email" required="true"> </td>
                </tr>
                <tr>
                    <td>Phone Number: </td>
                    <td> <input type="text" placeholder="" name="phoneNo" required="true"> </td>
                </tr>
                <tr>
                    <td>Date of Birth: </td>
                    <td> <input type="text" placeholder="" name="dob" required="true"> </td>
                </tr>
                <tr>
                    <td>Is Customer: </td>
                    <td> <input type="text" placeholder="" name="isCustomer" required="true"> </td>
                </tr>
                <tr>
                    <td>Active: </td>
                    <td> <input type="text" placeholder="" name="active" required="true"> </td>
                </tr>
                <tr>
                    <td>Street Number: </td>
                    <td> <input type="text" placeholder="" name="streetNo" required="true"> </td>
                </tr>
                <tr>
                    <td>Street Name: </td>
                    <td> <input type="text" placeholder="" name="streetName" required="true"> </td>
                </tr>
                <tr>
                    <td>Postcode: </td>
                    <td> <input type="text" placeholder="" name="postcode" required="true"> </td>
                </tr>
                <tr>
                    <td>State: </td>
                    <td> <input type="text" placeholder="" name="state" required="true"> </td>
                </tr>
                <tr>
                    <td>Suburb: </td>
                    <td> <input type="text" placeholder="" name="suburb" required="true"> </td>
                </tr>
                <tr>
                    <td>Country: </td>
                    <td> <input type="text" placeholder="" name="country" required="true"> </td>
                </tr>
                <tr>
                    <td>
                        <a href="CIM.jsp" class="button"> Cancel</a>
                        <input class="button" type="submit" value="Create">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
