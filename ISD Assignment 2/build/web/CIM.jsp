<%-- 
    Document   : CustomerInformationManagement
    Created on : 12/05/2022, 3:36:35 PM
    Author     : timmy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CIM</title>
    </head>
    <body>
        <h1>Welcome to Customer Information Management</h1>
        
        <a href="createCIM.jsp"> Create </a> <br>
        <a href="readCIM.jsp"> Read </a> <br>
        <a href="updateCIM.jsp"> Update </a> <br>
        <a href="deleteCIM.jsp"> Delete </a> <br>
        
        <jsp:include page="/ConnServlet" flush="true"/>

        
    </body>
</html>
