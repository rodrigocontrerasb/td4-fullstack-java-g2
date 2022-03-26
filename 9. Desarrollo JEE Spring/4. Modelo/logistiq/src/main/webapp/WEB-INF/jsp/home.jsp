<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.latam.logistiq.modelo.Producto" %>
<%@page import="com.latam.logistiq.vo.ProductoVO" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="charset=ISO-8859-1">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet"
          href="/webjars/bootstrap/4.3.0/css/bootstrap.min.css"/>
    <title>Logistiqal</title>
</head>
<body>
<!-- Inicio Header -->
<nav class="navbar navbar-light bg-light">
    <a class="navbar-brand" href="home">Logistiqal</a>
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

    <!-- Botón agregar producto -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Menú</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item ">
                    <a href="agregarForm" class="btn mr-2 btn-success">Agregar producto</a>
                </li>
                <li class="nav-item">
                    <div class="dropdown">
                        <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenuButton"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Registros por página
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a class="dropdown-item" href="home?registros=5">5</a>
                            <a class="dropdown-item" href="home?registros=10">10</a>
                            <a class="dropdown-item" href="home?registros=15">15</a>
                        </div>
                    </div>

                </li>
            </ul>

            <form method="GET" action="home" class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" name="busqueda" id="busqueda" type="search" placeholder="Buscar producto">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
            </form>
        </div>
    </nav>

    <ul class="pagination pagination-lg justify-content-center m-2">
        <c:forEach items="${paginas}" var="pagina">
            <li class="page-item ${paginaActual == pagina ? 'disabled' : ''}">
                <a class="page-link"
                   href="home?p=${pagina}"
                   tabindex="-1">${pagina}
                </a>
            </li>
        </c:forEach>
    </ul>

    <!-- Inicio Tabla -->
    <table border="1" class="table table-hover">
        <thead class="thead-dark">
        <tr>
            <th scope="col">Código</th>
            <th scope="col">Nombre</th>
            <th scope="col">Precio</th>
            <th scope="col">Stock</th>
            <th scope="col">Acciones</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${VO.productos}" var="u">
            <tr>
                <td>${u.getCodigo()}</td>
                <td>${u.getNombre()}</td>
                <td>${u.getPrecio()}</td>
                <td>${u.getStock()}</td>
                <td>
                    <a href="editarForm?idProducto=${u.getIdProducto()}" class="btn btn-primary btn-sm">Editar</a>
                    <a href="eliminar?idProducto=${u.getIdProducto()}" class="btn btn-danger btn-sm">Eliminar</a>
                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
    <!-- Fin tabla -->
</div>

<!-- Fin Contenido -->
</body>
</html>
