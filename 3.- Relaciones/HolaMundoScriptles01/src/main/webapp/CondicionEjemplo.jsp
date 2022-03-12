<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejemplo de condición</title>
</head>
<body>
	<!-- Codigo java -->
	<% 
		Date date = new Date();
		date.getMonth();
		if(date.getMonth() != 0){
	%>
	<!-- Codigo html -->
		<h1>Solo me mostrare si el dia es distinto a 0</h1>
	<% 
		}//codigo java
	%>
</body>
</html>