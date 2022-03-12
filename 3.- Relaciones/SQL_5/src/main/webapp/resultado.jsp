<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.desafiolatam.modelo.*"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	List<Departamento> listaDeptos;
	listaDeptos = (List) request.getAttribute("deptoDao");

	//List<CursoDTO> cursos;
	//List<FormaDePagoDTO> formasPago;
	// capturamos informacion que viene desde el request
	//cursos     = (List)request.getAttribute("cursos");
	//formasPago = (List)request.getAttribute("formasPago");
	%>


	<h1>Resultado JSP</h1>


	<%
	for (Departamento dto : listaDeptos) {
	%>
	<p><%=dto.getNombreDepto()%> - <%=dto.getUbicacionDepto()%></p>
	<%
	}
	%>


</body>
</html>