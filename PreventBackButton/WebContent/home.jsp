<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>validate page</title>
</head>
<body>

<%
	response.setHeader("Cache-Control", "no-store");
	//set this value programmatically, html meta tag doesn't work because while sending the response server will overwrite the headers.
%>

<%

if(session.isNew())
{
	out.println("You are not allowed to view this page.....");
}
else
{

%>


<jsp:useBean id="user" class="com.kpit.beans.UserBean" scope="session"/>

<h3>Your details are : </h3>
<p>NAME : ${user.name}</p>
<p>AGE : ${user.age}</p>
<p>EMAIL : ${user.email}</p>
<p>CITY : ${user.city}</p>
<p>PHONE : ${user.phone}</p>


<br><br>

<a href="next.jsp">next page</a>

<%} %>

</body>
</html>