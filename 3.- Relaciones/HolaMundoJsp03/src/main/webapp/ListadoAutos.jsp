<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table,thead,tbody,tr,td{
		border: 1px solid;
		collapse:collapse;
		text-align: center;
		background-color:orange;
	}
	
	#contenido{
		width: 600px;
		heigth: 300px;
		margin:0 auto;
		background-color:silver;
		text-align:center;
	}
</style>
</head>
<body>
	<% 
		//declaracion de una lista de marcas de vehiculos
		List<String> autos = new ArrayList<String>();
		autos.add("Chevlolet");
		autos.add("Mazda");
		autos.add("Toyota");
		autos.add("Subaru");
		autos.add("Skoda");
		autos.add("Fiat");
	%>
	<!-- comienza el HTML -->
	
	<div id="contenido">
	<p>Contenido de tabla generado con java ;)</p>
		<table>
			<thead>
				<tr>
					<td>Marca mas vendida</td>
					<td>Marca mas revendida</td>
					<td>Marca mas famosa</td>
					<td>Marca mas robada</td>
					<td>Marca mas arrendada</td>
					<td>Marca mas segura</td>
				</tr>
			</thead>
			<tbody>
					<tr>			
					<% 
						for(int i = 0; i < autos.size(); i ++){
							out.println("<td>" + autos.get(i)+ "</td>");
						}
					%>
					</tr>
			</tbody>
		</table>
	</div>
</body>
</html>