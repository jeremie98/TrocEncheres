<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Créer un compte</title>
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

	<!-- Inclusion de la barre de navigation presnete dans fichier navbar.html -->
	<%@ include file="../pages/navbar.jsp" %>




	<!--  Debut div container -->
	<div class="container">

		<h2 class="text-center">Créer un compte</h2>

		
		<form method="post" action="<%= request.getContextPath() %>/inscription" class="border border-primary rounded">
		
		
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
					<input type="number" class="form-control" name="tel" placeholder="Telephone" />
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
			
			
			<div class="row justify-content-center col-sm-12">
				<div class="form-group">
					<button type="submit" class="btn btn-primary">Creer</button>
					<a href="<%= request.getContextPath()%>/connexion"><button type="button" class="btn btn-outline-primary">Annuler</button></a>
				</div>
			</div>
			
		</form>
		<div>
			<!-- Affichage des erreurs-->
			<c:if test="${!requestScope.erreurs.isEmpty()}">
				<c:forEach items="${requestScope.erreurs }" var="e">
					<ul>
						<li><c:out value="${e }"></c:out></li>
					</ul>
				</c:forEach>
			</c:if>
			<c:if test="${requestScope.mdpincorrect != null}">
				<c:out value="${requestScope.mdpincorrect}"></c:out>
			</c:if>		
		</div>
	</div>	
	

</body>
</html>