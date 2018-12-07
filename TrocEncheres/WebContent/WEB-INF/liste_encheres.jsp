<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Liste encheres</title>
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

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="<%= request.getContextPath()%>/listeencheres">TrocEnchères.0rg</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="nav navbar-nav ">
      <a href="<%= request.getContextPath() %>/nouvellevente" ><span class="glyphicon glyphicon-log-iout"> Vendre un article</span></a>
      <a href="<%= request.getContextPath() %>/profil" ><span class="glyphicon glyphicon-user "> Mon profil</span></a>
      <a href="<%= request.getContextPath() %>/#" ><span class="glyphicon glyphicon-log-iout"> Déconnexion</span></a>
    </div>
  </div>
</nav>
	<div class="container">
		<h2 class="text-center">Liste des encheres</h2>
<!-- 		Checkboxes de filtre -->
		<div class="form-check">
			<input class="form-check-input" type="checkbox" value="" name="vente">
			<label class="form-check-label" for="defaultCheck1"> Mes ventes</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="checkbox" value="" name="enchere">
			<label class="form-check-label" for="defaultCheck1"> Mes enchères en cours</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="checkbox" value="" name="achat">
			<label class="form-check-label" for="defaultCheck1"> Mes acquisitions</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="checkbox" value="" name="achat">
			<label class="form-check-label" for="defaultCheck1"> Autres enchères</label>
		</div>
		
<!-- 		Barre de recherche -->
		<form class="form-inline">
			<input class="form-control mr-sm-2" type="search" placeholder="Mots clé" aria-label="Search">
			<button class="btn btn-outline-success my-2 my-sm-0 " type="submit">Rechercher</button>
		</form>
		
		<p>Catégories</p>
		<div class="dropdown">
			<button class="btn btn-secondary dropdown-toggle" type="button" 
			id="dropdownMenuButton" data-toggle="dropdown" 
			aria-haspopup="true" aria-expanded="false">Categorie</button>
			<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
			<a class="dropdown-item" href="#">Action</a>
			<a class="dropdown-item" href="#">Another action</a>
			<a class="dropdown-item" href="#">Something else here</a>
			</div>
		</div>	
	</div>
	<!-- Fin div container -->
</body>
</html>