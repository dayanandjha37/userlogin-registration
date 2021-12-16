<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Successful</title>
</head>
<body>
	<center>
		<%
		String uname = (String) session.getAttribute("uname");
		if (uname == null) {
			response.sendRedirect("index.jsp");
		}
		%>
		<h3>
			<i>Congratulations!</i> You have successfully registered.
		</h3>
		<h3>
			Let's go to your <a href="welcome.jsp">|Account|</a>
		</h3>
	</center>
</body>
</html>