<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@page import ="java.util.Date"  %>
<body>
<h1>session demo
</h1>
<h2>id: <%=session.getId() %></h2>
<h3>created time: <%= new Date(session.getCreationTime()) %></h3>
<h3>last accessed: <%= new Date(session.getLastAccessedTime()) %></h3>
<h3>new <%= session.isNew() %></h3>
<% session.invalidate(); %>
</body>
</html>