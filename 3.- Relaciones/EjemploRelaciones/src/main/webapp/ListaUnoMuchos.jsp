<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.desafiolatam.modelo.DepartamentoEmpleado" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- importamos bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>
.fakeimg {
	height: 200px;
	background: #aaa;
}
</style>
<%
		List<DepartamentoEmpleado> deptos = new ArrayList<DepartamentoEmpleado>();
		deptos = (List)request.getAttribute("departamentoEmpleado");
%>
</head>
<body>

	<div class="jumbotron text-center" style="margin-bottom: 0">
		<h1>Ejemplo relaciones con JSP</h1>
		<p>Para el curso de JEE</p>
	</div>

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<a class="navbar-brand" href="#">Navegacion</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="#">Uno a
						muchos</a></li>
				<li class="nav-item"><a class="nav-link" href="#">En
						construcción</a></li>
				<li class="nav-item"><a class="nav-link" href="#">En
						construcción</a></li>
			</ul>
		</div>
	</nav>

	<div class="container" style="margin-top: 30px">
		<div class="row">
	  		<div class="col-sm-3">
	  			<h2>departamento</h2>	
	  		</div>
	  	
	  		<div class="col-sm-9">
	  			<h2>resultados</h2>
	  		</div>
  		</div>
  		<br>
  	<form action="procesaBusquedaEmplDept" method="post">
		<div class="row">
			  		<div class="col-sm-3">
			  			<label for="NOMBRE DEPARTAMENTO">Nombre Departamento:</label>
		  				<input type="text" class="form-control" id="nomDepto" name="nomDepto">
		  				<br>
		  				<button type="submit" class="btn btn-primary">Buscar</button>
			  		</div>
			  		<div class="col-sm-9">
			  			<div id="tabla">
								<br>
								<table class="table table-sm table-dark">
									<thead>
										<tr>
											<th scope="col">Numero Empleado</th>
											<th scope="col">Nombre Empleado</th>
											<th scope="col">Nombre Departamento</th>
										</tr>
									</thead>
									<tbody>
										<% 
											if(deptos != null){
											for(DepartamentoEmpleado depto: deptos){
										%>
									<tr>
										<td><%=depto.getEmpleado().getNumEmpleado()%></td>
										<td><%=depto.getEmpleado().getNombreEmpleado()%></td>
										<td><%=depto.getDepartamento().getNombreDepto()%></td>
									</tr>
			    						<%}}%>
									</tbody>
								</table>
					   </div>
			  		</div>
		</div>
	</div>
 </form>

</body>
</html>