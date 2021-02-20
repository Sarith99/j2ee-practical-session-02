<%-- 
    Document   : welcome.jsp
    Created on : Jul 1, 2020, 9:47:36 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        welcome <%=(String)request.getAttribute("uname") %>
    </body>
</html>
