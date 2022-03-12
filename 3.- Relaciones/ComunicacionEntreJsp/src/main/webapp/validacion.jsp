<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	.header {
    color: #36A0FF;
    font-size: 27px;
    padding: 10px;
}

.bigicon {
    font-size: 35px;
    color: #36A0FF;
}
</style>
<!-- Implementacion bootstrap css -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!-- Fin Implementacion bootstrap css -->
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
<title>CONTACTO</title>
</head>
<body>
<head>
		<!-- archivo css bootstrap -->
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

			<!-- tema bootstrao -->
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

			<!-- Javascript para bootstrap -->
			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

			<style>
				form{
					margin:0 auto;
					margin-top: 120px;
					width: 400px;
					padding: 1em;
					border: 1px solid #ccc;
					border-radius: 1em;
				}

				form div + div{
					margin-top: 1em;
				}

				label{
					display: inline-block;
					width: 90px;
					text-align: right;
				}

				input,textarea {
					font: 1em san-serif;
					width: 200px; 
					border: 1px solid #999;
				}

				 #boton{
				 	width: 200px;
					margin: 0 auto;
				}
			</style>
	</head>

	<body>

    
	<div class="container" style="border:1px solid black;height: 600px;">
		<h2>Recepcion de datos desde Contacto.jsp</h2>
		<%
			String nombre = request.getParameter("user");
			String comentario = request.getParameter("comentario");
		%>
		<form action="Contacto.jsp" method="post">
			<div>
				<label>Usuario</label>
				<input type="text" id="user" value="<%out.println(nombre);%>">
			</div>
			<div>
				<label>Comentario</label>
				<textarea id="comentario"><%out.println(comentario);%></textarea>
			</div>
			<div id="boton">
				<button type="submit" class="btn btn-secundary">Volver</button>
			</div>
		</form>
	</div>
		
	</body>
</html>