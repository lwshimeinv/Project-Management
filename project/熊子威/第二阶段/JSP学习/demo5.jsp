<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<%--jsp声明语句块 --%>
<%!  private int a=3; %>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<% double b=3.5; %>
</head>
<% double count=0; %>
<body>
	Hello Hello Hello!
	<!-- HTML注释 -->
	<%--JSP注释 --%>
	
	<%--Java代码段可以写到到任意位置 --%>
	<%
		//request.setCharacterEncoding("utf-8");
		//response.setContentType("text/html;charset=utf-8");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
	%>
	<% count=a*b; %>
	<br>
	<%--jsp表达式 --%>
	count=<%=count %>
</body>
</html>
<% System.out.println("count=:"+count); %>






