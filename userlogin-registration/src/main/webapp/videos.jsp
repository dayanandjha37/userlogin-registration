<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videos</title>
</head>
<body>
<%-- <%

String uname =(String)session.getAttribute("uname");
if(uname==null){
	response.sendRedirect("index.jsp");
}
%> --%>
<center>
<%@include file="headerafterlogin.jsp" %>
</center>
<iframe width="560" height="315" src="https://www.youtube.com/embed/EqNZKZjPWq0" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

</body>
</html>