<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	td{
		border: solid 1px red;
	}
</style>
</head>
<body>
		<h1>${msg }</h1>
	<table>
		<c:forEach var="product" items="${allproduct }">
			<td>${product.id}</td>
			<td>${product.name}</td>
			<td>${product.price}</td>
		</c:forEach>	
	</table>
</body>
</html>