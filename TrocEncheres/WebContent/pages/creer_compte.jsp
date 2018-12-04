<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Créer un compte</title>
	<meta charset="utf-8">
	<!-- lien vers feuille bootstrap -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	
	<!-- lien librarie jQuery et Javascript -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>

	<div id="header">
		<h1>TrocEncheres.org</h1>
	</div>
	<div id="titre">
		<h2>Créer un compte</h2>
	</div>
	
		
	<form action="get">
		<div class="form-group row">
<!-- 			<div class="col-md-6">	 -->
			<label for="pseudo">Pseudo</label><br>
			<label for ="prenom">Prénom</label><input type="text" name="prenom"/><br>
			<label for="tel">Teléphone</label><input type="text" name="tel"/><br>
			<label for ="cp">Code postal</label><input type="text" name="cp"/><br>
			<label for ="pass">Mot de passe</label><input type="password" name="pass"/><br>
			<input type="submit" value="Créer"/>
			</div>
		</form>
			
			<div class="col-md-6">
				<form action="get">
					<label for="nom">Nom</label><input type="text" name="nom"/><br>
					<label for ="mail">Email</label><input type="email" name="mail"/><br>
					<label for="rue">Rue</label><input type="text" name="rue"/><br>
					<label for ="ville">Ville</label><input type="text" name="ville"/><br>
					<label for ="confirm pass">Confirmer</label><input type="password" name="confirm pass"/><br>
					<input type="submit" value="Annuler"/>
				</form>
			</div>

	

</body>
</html>