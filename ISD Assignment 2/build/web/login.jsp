<%-- 
    Document   : Login
    Created on : 04/05/2022, 2:32:56 PM
    Author     : timmy
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <a href="index.jsp">Homepage</a>
        <a href="register.jsp">Register</a>
        <p style="color:red">
            <%String formType = request.getParameter("form"); %>
            <%if(formType != null){ %>
                Error: Invalid credentials
            <%}%>
        </p>
        <h1>Login</h1>
        <form method="POST" action="index.jsp">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email"> <br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password"> <br>
            <input type="hidden" id="form" name="form" value="login">
            <input type="submit" value="Login">
        </form>
    </body>
</html>
