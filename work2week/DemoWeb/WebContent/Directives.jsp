<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@page import = "java.util.Date" %>
<%@page isErrorPage="true" %>

<body>
<h1>Directive Demo</h1>
<hr>
<h2>
<%= new Date() %>
<%= exception  %>
</h2>
</body>
</html>