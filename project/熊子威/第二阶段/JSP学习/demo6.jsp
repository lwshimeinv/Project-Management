<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.util.*,java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello JSP world!
	<%
		SimpleDateFormat demo6=new SimpleDateFormat("yyyy/MM/dd");
		Date now =new Date();
		out.print("now="+demo6.format(now));
		
	%>
</body>
</html>