<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Acceuil</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- lien vers feuille bootstrap -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">	
	<!-- lien librarie jQuery et Javascript -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</head>

<body>

	<nav class="navbar navbar-dark bg-dark">
		<a href="connexion.jsp" class="navbar-brand">TrocEncheres.org</a>
	</nav>
	
	<div class="container">
	
		<h2 class="text-center">Connexion</h2>


		<form method="post" action="<%= request.getContextPath()%>/connexion">
			<div class="row justify-content-center">
				<div class="form-group col-sm-6">
					<input type="text" class="form-control"	name="user" placeholder="identifiant" />
					<input type="password" class="form-control"	name="pass" placeholder="Mot de passe" /><br>
				<div class="row">
					<div class="col-sm">
						<button type="submit" class="btn btn-primary btn-lg">Connexion</button> 
					</div>
					<div class="col">
						<input type="checkbox" name="resetPass" id="resetPass">Resté connecté<br> 
						<a href=#>Mot de passe oublié</a><br>
					</div>
				</div>
				<a href="<%= request.getContextPath() %>/inscription"><button type="button" class="btn btn-outline-primary btn-lg btn-block">Creer un compte</button></a>
					
				</div>
			</div>
		</form>
	</div>
</body>
</html>