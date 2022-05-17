<%-- 
    Document   : Logout
    Created on : 04/05/2022, 2:33:15 PM
    Author     : timmy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="model.*" %>
<!DOCTYPE html>
<html>
    <% 
        User.resetUser();
        response.sendRedirect("index.jsp");
    %>
</html>
