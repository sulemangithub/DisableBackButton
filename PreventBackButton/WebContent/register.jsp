<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>validate page</title>
</head>
<body>

<jsp:useBean id="user" class="com.kpit.beans.UserBean" scope="session"/>
<jsp:setProperty property="*" name="user"/>
<%
String status = user.register();
response.sendRedirect(status);
%>

</body>
</html>