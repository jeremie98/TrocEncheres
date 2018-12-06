<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Mon profil</title>
<meta charset="utf-8">
<!-- lien vers feuille bootstrap -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<!-- lien librarie jQuery et Javascript -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

	<nav class="navbar navbar-dark bg-dark">
		<a href="connexion.jsp" class="navbar-brand">TrocEncheres.org</a>
	</nav>
	<!--  Debut div container -->
	<div class="container">

		<h2 class="text-center">Mon profil</h2>

		
		<form method="get" class="border border-primary">
		
		
			<div class="row justify-content-center">
				<div class="form-group col-sm-5">
					<input type="text" class="form-control" name="pseudo" placeholder="Pseudo" />
				</div>
				<div class="form-group col-sm-5">
					<input type="text" class="form-control" name="nom" placeholder="Nom" />
				</div>
			</div>
			
			<div class="row justify-content-center">
				<div class="form-group col-sm-5">
					<input type="text" class="form-control" name="prenom" placeholder="Prenom" />
				</div>
				<div class="form-group col-sm-5">
					<input type="text" class="form-control" name="email" placeholder="Email" />
				</div>
			</div>
			
			<div class="row justify-content-center">
				<div class="form-group col-sm-5">		
					<input type="text" class="form-control" name="tel" placeholder="Telephone" />
				</div>
				<div class="form-group col-sm-5">
					<input type="text" class="form-control" name="rue" placeholder="Rue" />
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="form-group col-sm-5">
					<input type="text" class="form-control" name="cp" placeholder="Code postal" />
				</div>
				<div class="form-group col-sm-5">
					<input type="text" class="form-control" name="ville" placeholder="Ville" />
				</div>
			</div>
				
			<div class="row justify-content-center">
				<div class="form-group col-sm-5">
					<input type="password" class="form-control" name="pass" placeholder="Mot de passe"  />
				</div>
				<div class="form-group col-sm-5">
					<input type="password" class="form-control" name="confPass" placeholder="Confirmer mot de passe" />
				</div>
			</div>
			
			<div class="row justify-content-center">
				<div class="form-group col-sm-5">
					<input type="text" class="form-control" name="credit" />
				</div>
				<div class="form-group col-sm-5">
					<input type="text" readonly class="form-control-plaintext">
				</div>
			</div>
			
			<div class="row justify-content-center">
				<div class="form-group col-sm-5">
					<button type="submit" class="btn btn-primary">Enregistrer</button>
					<button type="submit" class="btn btn-danger">Supprimer compte</button>
					<a href="connexion.jsp" class="navbar-brand"><button type="button" class="btn btn-outline-secondary">Retour</button></a>
				</div>
			</div>
			
		</form>
	</div>
	<!-- Fin div container -->
</body>
</html>