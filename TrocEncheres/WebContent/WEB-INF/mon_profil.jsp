<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
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
		<a href="<%= request.getContextPath() %>/listeencheres" class="navbar-brand">TrocEncheres.org</a>
	</nav>
	<!--  Debut div container -->
	<div class="container">

		<h2 class="text-center">Mon profil</h2>

		
		<form method="post" action="<%= request.getContextPath() %>/monprofil" class="border border-primary">
		
		
			<div class="row justify-content-center">
				<div class="form-group col-sm-5">
					<input type="text" class="form-control" name="pseudo" placeholder="Pseudo" value="${requestScope.pseudo }"/>
				</div> 
				<div class="form-group col-sm-5">
					<input type="text" class="form-control" name="nom" placeholder="Nom" value="${requestScope.nom }"/>
				</div>
			</div>
		
			<div class="row justify-content-center">
				<div class="form-group col-sm-5">
					<input type="text" class="form-control" name="prenom" placeholder="Prenom" value="${requestScope.prenom }"/>
				</div>
				<div class="form-group col-sm-5">
					<input type="text" class="form-control" name="email" placeholder="Email" value="${requestScope.email }"/>
				</div>
			</div>
			
			<div class="row justify-content-center">
				<div class="form-group col-sm-5">		
					<input type="text" class="form-control" name="tel" placeholder="Telephone" value="${requestScope.telephone }"/>
				</div>
				<div class="form-group col-sm-5">
					<input type="text" class="form-control" name="rue" placeholder="Rue" value="${requestScope.rue }"/>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="form-group col-sm-5">
					<input type="text" class="form-control" name="cp" placeholder="Code postal" value="${requestScope.codepostal }"/>
				</div>
				<div class="form-group col-sm-5">
					<input type="text" class="form-control" name="ville" placeholder="Ville" value="${requestScope.ville }"/>
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
				<!-- <div class="form-group col-sm-5">
					<input type="text" class="form-control" name="credit" />
				</div> -->
				<div class="form-group col-sm-5">
					<input type="text" readonly class="form-control-plaintext">
				</div>
			</div>
			
			<div class="row justify-content-center">
				<div class="form-group col-sm-5">
					<button type="submit" class="btn btn-primary">Enregistrer</button>
					<button type="button" class="btn btn-danger">Supprimer compte</button>
					<a href="<%= request.getContextPath() %>/listeencheres" class="navbar-brand"><button type="button" class="btn btn-outline-secondary">Retour</button></a>
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
	<!-- Fin div container -->
</body>
</html>