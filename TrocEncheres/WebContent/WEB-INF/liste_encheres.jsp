<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<h2 class="text-center">Liste des encheres</h2>
	<div class="container">
	<!-- /!\/!\ 
	Barre de recherche ne fonctionne pas correctement ! a remplacer !!! 
	/!\/!\ -->
				<input class="form-control" id="myInput" type="text" placeholder="Search..">
		<div class="row justify-content-center">
			<!-- Checkboxes de filtre -->
			<div class="col sm">
				<div class="form-check justify-content-center">
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
					<input class="form-check-input" type="checkbox" value="" name="autre">
					<label class="form-check-label" for="defaultCheck1"> Autres enchères</label>
				</div>
			</div>
		</div>
			<c:forEach var="vente" items="${requestScope.listVentes}">
			<div class="col sm" id="myDIV">
					
					<div class="row justify-content-around">
						<div class="border rounded border-primary col-6">
							<img name="img.png" src="img.png" class="img-fluid" alt="imageArticle">
							<div class="col">
							
								<p>Article : ${vente.getNomArticle() }<br>
								Prix : ${vente.getDescription() }<br>
								Fin de l'enchère : ${vente.getDateFinEncheres()}<br>
								Retrait : <br>
								Vendeur : </p>

							
							
							</div>
						</div>
						
				<!-- </span> -->
				</div>
				
			</div>
			</c:forEach>
			
			<!-- javascript permetant la recherche -->
			<script>
			$(document).ready(function(){
			  $("#myInput").on("keyup", function() {
			    var value = $(this).val().toLowerCase();
			    $("#myDIV *").filter(function() {
			      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
			    });
			  });
			});
			</script>
	</div>
	<!-- Fin div container -->
</body>
</html>