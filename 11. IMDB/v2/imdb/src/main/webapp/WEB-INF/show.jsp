<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Detalle de Show</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="/">Shows de TV</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse"
                 id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item mr-5"><a class="nav-link" href="/shows/new">Agregar Show</a></li>
                    <li class="nav-item">
                        <form id="logoutForm" method="POST" action="/logout">
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                            <input type="submit" value="Logout" class="btn btn-link text-secondary" />
                        </form>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container mt-3">
            <h1>Title: ${show.showTitle}</h1>

            <h2>Network: ${show.showNetwork}</h2>
            <h2 class="font-weight-bold">Usuarios que calificaron este programa</h2>
            <table class="table table-dark">
                <thead>
                    <tr>
                        <th scope="col">Nombre</th>
                        <th scope="col">Clasificación</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="row" items="${showRatings}">
                        <tr>
                            <td scope="row">${row.user.username}</td>
                            <td>${row.rating}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <c:if test="${currentUser.id == creatorShow.id }">
                <a href="/shows/${show.id}/edit" class="btn btn-info">Edtar</a>
            </c:if>
            <br /> <br />
            <form:form method="POST" action="/shows/${show.id}/add" modelAttribute="addRating">
                <form:hidden path="user" value="${currentUser.id}" />
                <form:hidden path="shows" value="${show.id}" />
                <div class="form-inline">
                    <form:label path="rating">Dejar Calificación: </form:label>
                        <div class="mx-3">
                        <form:input type="number" min="1" max="5" path="rating" class="form-control" />
                        <form:errors path="rating" />
                    </div>
                    <div class="">
                        <input type="submit" value="Rate!" class="btn btn-primary" />
                    </div>
                </div>
            </form:form>
            <div class="mt-5 pb-5">
                <a href="/shows" class="btn btn-dark">Ir Atras</a>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>