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
<div class="p-3">

    <h1>Editar libro</h1>
    <c:if test="${mensaje != null ? true : false}">
        <div class="alert alert-secondary  alert-dismissible fade show"
             role="alert">${mensaje}
            <button type="button" class="close" data-dismiss="alert"
                    aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
        </div>
    </c:if>
    <form action="editar" method="post">
        <input type="hidden" name="idLibro" value="${VO.getIdLibro()}" />
        <table>

            <tr>
                <td class="p-2"><label for="anho">Año:</label></td>
                <td><input class="form-control" type="number" name="anho"
                           placeholder="Año" value="${VO.getAnho()}" /></td>
            </tr>
            <tr>
                <td class="p-2"><label for="titulo">Titulo:</label></td>
                <td><input class="form-control" type="text"
                           placeholder="Titulo" name="titulo" value="${VO.getTitulo()}" /></td>
            </tr>
            <tr>
                <td class="p-2"><label for="autor">Autor:</label></td>
                <td><input class="form-control" type="text"
                           placeholder="Autor" name="autor" value="${VO.getAutor()}" /></td>
            </tr>

            <tr>
                <td class="p-2"><label for="imprenta">Imprenta:</label></td>
                <td><input class="form-control" type="text"
                           placeholder="Imprenta" name="imprenta" value="${VO.getImprenta()}" /></td>
            </tr>

            <tr>
                <td class="p-2"></td>
                <td>

                    <input class="form-check-input" type="checkbox" checked="${VO.getDisponibilidad()}" id="disponibilidad" name="disponibilidad">
                    <label class="form-check-label" for="disponibilidad">
                        Disponible
                    </label>

                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit"
                                       class="btn m-2 btn-success" value="Guardar" /></td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>