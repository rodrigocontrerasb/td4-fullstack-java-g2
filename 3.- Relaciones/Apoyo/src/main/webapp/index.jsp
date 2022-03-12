<%@page import="com.desafiolatam.entidades.CursoDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.desafiolatam.daos.CursoDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
CursoDao cursodao= new CursoDao();
CursoDTO cursodto = new CursoDTO();
List<CursoDTO> salida = cursodao.obtieneCursos();
%>

<%

for(int x = 0; x < salida.size(); x++ ){
	String texto = salida.get(x).getDescricion();
	
	System.out.println("SALIDA ES --> " + salida.get(x).getDescricion());
	
	%>
	<p><%=texto %></p>
	<% 
}

%>

</body>
</html>