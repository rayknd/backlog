<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<link href="resources/css/bootstrap.min.css" rel="stylesheet"  />
<link href="resources/css/backlog.css" rel="stylesheet" />
<script src="resources/js/bootstrap.min.js"></script>

</head>

<body>
	
	<br /><br /><br /><br />
	<div class="container">
	<form action ="efetuaLogin" method="post">
		<div class="form-group">
			<div class="col-md-6 offset-md-3">
				<input type="text" name="login" placeholder="Login" required/>	
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-6 offset-md-3">
				<input type="password" name="senha" placeholder="Senha" required/>
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-6 offset-md-3">
				<input type="submit" class="btn btn-primary" value="Entrar"> <br />
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-6 offset-md-3">
				<p>Ainda não é cadastrado? <a href="cadastro" >Cadastre-se</a>
			</div>		
		</div>
		
	</form>
	</div>
	
</body>
</html>