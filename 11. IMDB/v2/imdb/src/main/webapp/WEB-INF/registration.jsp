<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


        <title>Registro</title>
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
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item"><a class="nav-link" href="/login">Login</a></li>
                    <li class="nav-item active"><a class="nav-link" href="/registration">Registration<span class="sr-only">(current)</span></a>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <div class="mt-3 text-center">
                <form:errors path="user.*" />
            </div>

            <h1>Register!</h1>
            <form:form method="POST" action="/registration" modelAttribute="user">
                <div class="form-group">
                    <form:label path="username">Nombre de Usuario:</form:label>
                    <form:input path="username" type="text" class="form-control" placeholder="Username" />
                </div>
                <div class="form-group">
                    <form:label path="email">Email:</form:label>
                    <form:input path="email" class="form-control" placeholder="Email" />
                    <small id="emailHelp" class="form-text text-muted">Nunca compartiremos tu correo electrónico con nadie más.</small>
                </div>
                <div class="form-group">
                    <form:label
                        path="password">Password:</form:label>
                    <form:password path="password" class="form-control" placeholder="Password" />
                </div>
                <div class="form-group">
                    <form:label path="passwordConfirmation">Confirmación Password</form:label>
                    <form:password path="passwordConfirmation" class="form-control" placeholder="Password Confirmation" />
                </div>
                <input type="submit" class="btn btn-primary" value="Register!" />
            </form:form>
        </div>


        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>

