<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Meu perfil</title>

<link href="resources/css/bootstrap.min.css" rel="stylesheet"  />
<link href="resources/css/backlog.css" rel="stylesheet" />
<script src="resources/js/bootstrap.min.js"></script>

</head>
<body>
	
	<br /><br /><br /><br />
	<h2 class="col-md-6 offset-md-3">Alterar Perfil</h2>
	
	<div class="container">
	<form action="alterarUsuario" method="post">
	
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<input type="hidden" name="id" value="${usuario.id}" required />	
			</div>
		</div>
	
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<label>Nome:</label><br />
				<input type="text" name="nome" value="${usuario.nome}" required />	
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<label>Sobrenome:</label><br />
				<input type="text" name="sobrenome" value="${usuario.sobrenome}" required />
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<label>Departamento:</label><br />
				<input type="text" name="departamento" value="${usuario.departamento}" required />
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<label>Cargo:</label><br />
				<input type="text" name="cargo" value="${usuario.cargo}" required />	
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<label>Imediato:</label><br />
				<input type="text" name="imediato" value="${usuario.imediato}" required />
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<label>Login:</label><br />
				<input type="text" name="login" value="${usuario.login}" required />
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<label>Senha:</label><br />
				<input type="text" name="senha" placeholder="Senha" required />
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3"> 
				<input type="text" name="senha2" placeholder="Confirme a senha" required />
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-6 offset-md-3">
				<input type="submit" value="salvar" class="btn btn-primary"/>
					
			</div>
		</div>
	</form>
		<a href="desativaUsuario?id=${usuario.id}" class="col-md-6 offset-md-4"><input type="submit" value="desativar" class="btn btn-danger" /></a>
	</div>
</body>
</html>