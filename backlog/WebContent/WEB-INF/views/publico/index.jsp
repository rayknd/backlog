<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Boas vindas</title>

<link href="resources/css/bootstrap.min.css" rel="stylesheet"  />
<link href="resources/css/backlog.css" rel="stylesheet" />
<script src="resources/js/bootstrap.min.js"></script>

</head>
<body>
	<h3>Bem vindo ${usuario.nome }</h3>
	<a href="verPerfil?id=${usuario.id}">Meu Perfil</a>
	
</body>
</html>