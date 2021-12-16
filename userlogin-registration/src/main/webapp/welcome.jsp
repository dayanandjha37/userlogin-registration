<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<center>
<%@ include file="headerafterlogin.jsp" %>
</center>

Welcome: ${user.rname}<br>
Your username:${user.uname}<br>
Your password:${user.upwd}<br>
Your uemail:${user.uemail}<br>
Your umobile:${user.umobile}<br>
</body>
</html>