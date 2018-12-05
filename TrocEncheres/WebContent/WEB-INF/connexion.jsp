<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Acceuil</title>
	<meta charset="utf-8">
	<!-- lien vers feuille bootstrap -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>

<body>

	<div id="header">
		<h1>TrocEncheres.org</h1>
	</div>
	<div id="titre">
		<h2>Connexion</h2>
	</div>
	
	<div id="main">
		<form method="post" action="/connexion">
			<label for="user">Identifiant</label><input type="text" name="user" id="user"/><br>
			<label for ="pass"> Mot de passe</label><input type="password" name="pass" id="pass"/><br>
			<input type="submit" value="Connexion"/>
			<input type="checkbox" name="resetPass" id="resetPass" >Resté connecté<br>
			<a href=#>Mot de passe oublié</a>
		</form>
<!-- 	<form action="get">	 -->
			<a href="<%= request.getContextPath()%>/ServletInscription"><input value="Creer un compte"/></a>
<!-- 	</form> -->
		
	</div>


</body>
</html>