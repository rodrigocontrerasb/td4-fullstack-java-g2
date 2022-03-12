<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Autores desde xml</title>
<!-- Implementacion bootstrap css -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!-- Fin Implementacion bootstrap css -->
</head>

<body>
	<c:import var="lib" url="autores.xml" />
	<x:parse var="doc" xml='${lib}' />
	
	<div class="container">
		<h2>Estos elementos son leidos desde un archivo XML con jstl</h2>
		<table class="table table-dark">
			<thead>
				<tr>
					<th scope="col">Titulo</th>
					<th scope="col">Autor</th>
					<th scope="col">Paginas</th>
				</tr>
			</thead>
			<tbody>
			<x:forEach var="ob" select="$doc/autores/libros">
				<tr>
					<td><x:out select="$ob/titulo" /></td>
					<td><x:out select="$ob/autor" /></td>
					<td><x:out select="$ob/paginas" /></td>
				</tr>
			</x:forEach>
			</tbody>
		</table>
	</div>

	

	<!-- Implementacion bootstrap js -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	<!-- Fin Implementacion bootstrap js -->

</body>
</html>