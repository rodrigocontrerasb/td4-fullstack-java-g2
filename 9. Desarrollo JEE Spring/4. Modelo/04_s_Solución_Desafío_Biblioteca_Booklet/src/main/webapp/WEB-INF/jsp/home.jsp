<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.latam.booklet.modelo.Libro"%>
<%@page import="com.latam.booklet.vo.LibroVO"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="charset=ISO-8859-1">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet"
          href="/webjars/bootstrap/4.3.0/css/bootstrap.min.css" />
    <title>Booklet</title>
</head>
<body>
<!-- Inicio Header -->
<nav class="navbar navbar-light bg-light">
    <a class="navbar-brand" href="#">Booklet</a>
</nav>
<!-- Fin Header -->

<!-- Inicio Contenido -->
<div class="p-3">

    <!-- Inicio Mensajes -->
    <c:if test="${mensaje != null ? true : false}">
        <div class="alert alert-secondary alert-dismissible fade show"
             role="alert">${mensaje}
            <button type="button" class="close" data-dismiss="alert"
                    aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
        </div>
    </c:if>
    <!-- Fin Mensajes -->

    <!-- Botón agregar usuario -->
    <a href="agregarForm" class="btn m-2 btn-success">Agregar libro</a>


    <form method="POST" action="buscar">
        <table>
            <tr>
                <td class="p-2"><label for="imprenta">Buscador:</label></td>
                <td><input class="form-control" type="text"
                           placeholder="Buscador" name="textoBuscado" /></td>
                <td colspan="2"><input type="submit"
                                       class="btn m-2 btn-primary" value="Buscar" /></td>
            </tr>
        </table>
    </form>

    <!-- Inicio Tabla -->
    <table border="1" class="table table-hover">
        <thead class="thead-dark">
        <tr>
            <th scope="col">Título</th>
            <th scope="col">Autor</th>
            <th scope="col">Imprenta</th>
            <th scope="col">Año</th>
            <th scope="col">Disponibilidad</th>
            <th scope="col">Acciones</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${VO.libros}" var="u">
            <tr>
                <td>${u.getTitulo()}</td>
                <td>${u.getAutor()}</td>
                <td>${u.getImprenta()}</td>
                <td>${u.getAnho()}</td>
                <td>${u.getDisponibilidad() == 1 ? 'Si' : 'No'}</td>

                <td><a href="cambiarDisponibilidad?idLibro=${u.getIdLibro()}"
                       class="btn btn-warning
							 btn-sm">Cambiar Disponibilidad</a>
                    <a href="editarForm?idLibro=${u.getIdLibro()}"
                       class="btn btn-primary btn-sm">Editar</a> <a
                            href="eliminar?idLibro=${u.getIdLibro()}"
                            class="btn btn-danger btn-sm">Eliminar</a></td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
    <!-- Fin tabla -->
</div>

<!-- Fin Contenido -->
</body>
</html>