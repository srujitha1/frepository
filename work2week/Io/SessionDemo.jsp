<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>session demo
</h1>
<h2>id: <%=session.getId() %></h2>
created time: <%= session.getCreationTime() %>
</body>
</html>