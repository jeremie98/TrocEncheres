<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Liste encheres</title>
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

<%@ include file="../pages/navbar.jsp" %>

	<h2 class="text-center">Liste des encheres</h2>
	<div class="container">
	<!-- /!\/!\ 
	Barre de recherche ne fonctionne pas correctement ! a remplacer !!! 
	/!\/!\ -->
				<input class="form-control" id="myInput" type="text" placeholder="Search..">
				<form method="POST" action="<%= request.getContextPath() %>/listeencheres" class="form-group" >
		<div class="row justify-content-center">
			<!-- Checkboxes de filtre -->
			<div class="col sm">
				<div class="form-check justify-content-center">
					<input class="form-check-input" type="checkbox" value="mesVentes" id="customCheck1" name="mesenchere">
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
			<button type="submit" class="btn btn-success">Filtrer</button>
				
			</div>
		</div>
				</form>
		
			<c:forEach var="vente" items="${requestScope.listVentes}">
			<div class="col sm" id="myDIV">
					
					<div class="row justify-content-around">
						<div class="border rounded border-primary col-6">
							<img name="img.png" src="img.png" class="img-fluid" alt="imageArticle">
							<div class="col">
							
								<p>Article : <a href="<%= request.getContextPath() %>/enchere?noVente=${vente.getNoVente()}" 
										class="badge badge-primary">${vente.getNomArticle() }</a><br>
								Prix : ${vente.getDescription() }<br>
								Fin de l'enchère : ${vente.getDateFinEncheres()}<br>
								Retrait : ${venteManager.selectRetrait(vente.getNoVente()).getRue()}<br>
								Vendeur : ${venteManager.selectPseudoVente(vente.getNoVente()) }</p>

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