<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	Hello demo7 world!
	<br>
	<%ss
		session.setAttribute("user", "Sandy");
		pageContext.setAttribute("ss", "aaa");
		int number=10;
		out.print("number="+number);
	%>
</body>
</html>
<%
	String data=(String)pageContext.getAttribute("sss");
%>