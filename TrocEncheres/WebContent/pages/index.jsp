<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<div id="header">
		<h1>TrocEncheres.org</h1>
	</div>
	<div id="titre">
		<h2>Connexion</h2>
	</div>
	
	<div id="main">
		<form action="get">
			<label for="user">Identifiant</label>
			<input type="text" name="user"/><br>
			<label for ="user"> Mot de passe</label>
			<input type="password" name="password"/><br>
			<input type="submit" value="Connexion"/>
			<input type="checkbox" name="resetMdp" value="resetMdp">Resté connecté<br>
			<a href="#">Mot de passe oublié</a>
		</form>
		<form>
			<input type="submit" value="Creer un compte"/>
		</form>
		
	</div>


</body>
</html>