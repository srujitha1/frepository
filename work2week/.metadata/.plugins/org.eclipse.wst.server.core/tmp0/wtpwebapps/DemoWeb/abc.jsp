<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>From jsp Tag</h1>
<h2>hello everybody</h2>
<h3>Scripting Elements</h3>
<hr>
<h4>
<%!
		int a=10;
		int b=20;
		int i=1;
%>
<%
		int sum=a+b;
%>

		value of a is: <%= a %>
		<br>
		value of b is: <%= b %>
		<br>
		value of c is: <%= sum %>
		you visited : <%= i++ %>
		

</h4>
</body>
</html>