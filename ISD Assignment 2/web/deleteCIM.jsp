<%-- 
    Document   : deleteCIM
    Created on : 15/05/2022, 5:53:17 PM
    Author     : timmy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="model.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete</title>
    </head>
    <body>
        <h1>Delete</h1>
        <form action ="deleteCIMServlet" method="post">
            <table>
                <tr>
                  <td>Customer Email </td>
                  <td> <input type="text" placeholder="" name="email" required="true" > </td>  
                </tr>
            </table>
        </form>
    </body>
</html>
