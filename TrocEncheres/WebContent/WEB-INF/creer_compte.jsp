<%@ page language="java" contentType="text/html; charset=utf-8"

	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Créer un compte</title>
<meta charset="utf-8">
<!-- lien vers feuille bootstrap -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<!-- lien librarie jQuery et Javascript -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>

	<div id="header">
		<h1>TrocEncheres.org</h1>
	</div>
	
	<div class="container">
	<div id="titre">
		<h2>Créer un compte</h2>
	</div>


	<form method="post" action="<%= request.getContextPath() %>/inscription">
			<div class="row">
				<div class="col-sm-6">

					<div class="form-group row">
						<label for="pseudo" class="col-4 col-form-label">Pseudo</label>
						<div class="col-md">
							<input type="text" id="materialLoginFormPassword" name="pseudo" />
						</div>
					</div>

					<div class="form-group row">
						<label for="prenom" class="col-4 col-form-label">Prénom</label>
						<div class="col-md">
							<input type="text" name="prenom" />
						</div>
					</div>

					<div class="form-group row">
						<label for="tel" class="col-4 col-form-label">Teléphone</label>
						<div class="col-md">
							<input type="text" name="tel" />
						</div>
					</div>

					<div class="form-group row">
						<label for="cp" class="col-4 col-form-label">Code postal</label>
						<div class="col-md">
							<input type="text" name="cp" />
						</div>
					</div>

					<div class="form-group row">
						<label for="pass" class="col-4 col-form-label">Mot de passe</label>
						<div class="col-md">
							<input type="password" name="pass" /><br>
						</div>
					</div>


				</div>


				<div class="col">

					<div class="form-group row">
						<label for="nom" class="col-4 col-form-label">Nom</label>
						<div class="col-md">
							<input type="text" name="nom" />
						</div>
					</div>

					<div class="form-group row">
						<label for="email" class="col-4 col-form-label">Email</label>
						<div class="col-md">
							<input type="text" name="email" />
						</div>
					</div>

					<div class="form-group row">
						<label for="rue" class="col-4 col-form-label">Rue</label>
						<div class="col-md">
							<input type="text" name="rue" />
						</div>
					</div>

					<div class="form-group row">
						<label for="ville" class="col-4 col-form-label">Ville</label>
						<div class="col-md">
							<input type="text" name="ville" />
						</div>
					</div>

					<div class="form-group row">
						<label for="confPass" class="col-4 col-form-label">Confirmation</label>
						<div class="col-md">
							<input type="password" name="confPass" /><br>
						</div>
					</div>
				</div>
			</div>
				<input type="submit" class="btn btn-primary btn-lg" value="Créer" />
				
		</form>
		
		<a href="<%= request.getContextPath()%>/connexion"><input type="button" class="btn btn-secondary btn-lg" value="Annuler" />
		
		</div>

</body>
</html>