<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Acceuil</title>
<meta charset="utf-8">
<!-- lien vers feuille bootstrap -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
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
					<div class="col">
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