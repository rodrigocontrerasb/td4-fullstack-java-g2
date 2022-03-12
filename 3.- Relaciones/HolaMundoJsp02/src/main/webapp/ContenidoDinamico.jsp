<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The real power of JSP</title>
</head>
<body>
	<h2>Bienvenido al desafio :P</h2>
	<% 
		 out.println("<br/>Tu dirección IP es " + request.getRemoteAddr());
		 String userAgent = request.getHeader("user-agent");
		 String browser = "desconocido";
		 String protocolo = "Estas usando el protocolo " + request.getProtocol();
		 String saltoLinea = "<br>";
		 out.print("<br/> estas navegando con ");
		 if (userAgent != null) {
		 	if (userAgent.indexOf("MSIE") > -1) {
		 		browser = "MS Internet Explorer";
		 	} else if (userAgent.indexOf("Firefox") > -1) {
		 		browser = "Mozilla Firefox";
		 	} else if (userAgent.indexOf("Opera") > -1) {
		 		browser = "Opera";
		 	} else if (userAgent.indexOf("Chrome") > -1) {
			 	browser = "Google Chrome";
		 	} else if (userAgent.indexOf("Safari") > -1) {
		 		browser = "Apple Safari";
		 	}
		 }
		 out.println(browser); 
		 out.println(saltoLinea);
		 out.println(protocolo);
		 
	%>
</body>
</html>
