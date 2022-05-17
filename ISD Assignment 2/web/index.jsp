<%-- 
    Document   : index
    Created on : 04/05/2022, 2:34:18 PM
    Author     : timmy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="model.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IoTBay Home</title>
    </head>
    <body>
        <%String formType = request.getParameter("form"); %>
        <%String email; %>
        <%String password; %>
        <%if(formType != null && formType.equals("register")){ %>
            <%email = request.getParameter("email");%>
            <%String fname = request.getParameter("fname");%>
            <%String lname = request.getParameter("lname");%>
            <%password = request.getParameter("password");%>
            <%String phoneNo = request.getParameter("phoneNo");%>
            <%String DOB = request.getParameter("DOB");%>
            <%String tos = request.getParameter("tos");%>
            <%if(tos != null){%>
                <%new User(email,fname,lname,password,Integer.parseInt(phoneNo),DOB,true);%>
                <%User.setUser(email, password);%>
            <%} else {%>
                <jsp:forward page="register.jsp" />
            <%}%>
        <%}else if(formType != null && formType.equals("login")) {%>
            <%email = request.getParameter("email");%>
            <%password = request.getParameter("password");%>
            <%User.setUser(email, password);%>
            <%if(User.getUser() == null){%>
                <jsp:forward page="login.jsp" />
            <%}%>
        <%}%>
        <%User u = User.getUser();%>
        
        <% if(u == null){ %>
            <a href="login.jsp">Login</a>
            <a href="register.jsp">Register</a>
        <%} else { %>
            <a href="logout.jsp">Logout</a>
        <%}%>
        <h1>Welcome</h1>
        
        <% if(u != null){ %>
            <h2><%= u.getName() %></h2>
            <p>Your email is <%= u.getEmail() %> and your date of birth is <%= u.getDOB() %>. Also your phone number is <%= u.getPhoneNo() %>.</p>

        <%} else { %>
            <h2>Guest</h2>
            
        <%}%>
        
        <a href =CIM.jsp> CIM </a>
        
        <jsp:include page="/ConnServlet" flush="true"/>
        <style>
            body {background: #fdfdfd; color: #2f2f2f;}
        </style>
    </body>
</html>
