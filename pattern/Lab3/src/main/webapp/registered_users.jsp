<%@ page import="bond.web.DAOLoginPassword" %>
<%@ page import="bond.web.DAOLoginHash" %>
<%@ page import="bond.web.LoginHash" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of registered users</title>
    <%
        DAOLoginHash d = new DAOLoginHash();
        List<LoginHash> ul = d.getLogins();
            String ans = null;
            for (LoginHash u : ul) {
               ans = ans + "\n" + u.getLogin();
            }
    %>

</head>
<body>

<br/>
<h2><p align="center">List of registered users</p></h2>
<p align="center"><%=ans%></p>
<br/>

</body>
</html>
