<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
update the values
</h1>
<form  action="servlet2"  method="post">
Username:<input type="text" name="t1" value=<%= request.getAttribute("name") %>> <br>
id:<input type="text" name="t2" value=<%= request.getAttribute("id") %>><br>
age:<input type="text" name="t3"value=<%= request.getAttribute("age") %>><br>
salary:<input type="text" name="t4" value=<%= request.getAttribute("salary") %>><br>

<input type="submit" name="b1" value="search" >
<input type="submit" name="b3" value="submit" > 
<input type="reset" name="b2" value="RESET">
</form>
</body>
</html>