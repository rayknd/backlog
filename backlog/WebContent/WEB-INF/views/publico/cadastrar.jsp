<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tela de cadastro</title>

<link href="resources/css/bootstrap.min.css" rel="stylesheet"  />
<link href="resources/css/backlog.css" rel="stylesheet" />
<script src="resources/js/bootstrap.min.js"></script>


</head>
<body>

	<br /><br /><br /><br />
	<div class="container">
	<form action="adicionarUsuario" method="post">
	
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<input type="text" name="nome" placeholder="Nome" required />	
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<input type="text" name="sobrenome" placeholder="Sobrenome" required />
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<input type="text" name="departamento" placeholder="Departamento" required />
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<input type="text" name="cargo" placeholder="Cargo" required />	
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<input type="text" name="imediato" placeholder="Imediato" required />
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<input type="text" name="login" placeholder="Login" required />
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<input type="text" name="senha" placeholder="Senha" required />
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<input type="hidden" name="ativo" value="1" required />
			</div>
		</div>
		
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3">
				<input type="submit" value="cadastrar" class="btn btn-primary"/>	
			</div>
		</div>
		 
	</form>
	</div>
</body>
</html>