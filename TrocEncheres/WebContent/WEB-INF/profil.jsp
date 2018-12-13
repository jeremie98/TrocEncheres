<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Profil</title>
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

	<!--  Debut div container -->
	<div class="container">

		<h2 class="text-center">Profil</h2>
			
		<div class="border border-primary">
			<div class="row justify-content-center">
				<div class="form-group col-sm-2">
					<div class="d-inline-flex p-3">Pseudo :</div>
				</div>
				<div class="form-group col-sm-1">
					<div class="d-inline-flex p-2"><c:out value="${requestScope.pseudo }"/></div>
				</div>
			</div>
			
			<div class="row justify-content-center">
				<div class="form-group col-sm-2">
					<div class="d-inline-flex p-2">Nom :</div>
				</div>
				<div class="form-group col-sm-2">
					<div class="d-inline-flex p-2"><c:out value="${requestScope.nom }"/></div>
				</div>
			</div>
			
			<div class="row justify-content-center">
				<div class="form-group col-sm-2">
					<div class="d-inline-flex p-2">Prénom :</div>
				</div>
				<div class="form-group col-sm-2">
					<div class="d-inline-flex p-2"><c:out value="${requestScope.prenom }"/></div>
				</div>
			</div>
				
			<div class="row justify-content-center">
				<div class="form-group col-sm-2">
					<div class="d-inline-flex p-2">Email :</div>
				</div>
				<div class="form-group col-sm-2">
					<div class="d-inline-flex p-2"><c:out value="${requestScope.email }"/></div>
				</div>
			</div>
			
			<div class="row justify-content-center">
				<div class="form-group col-sm-2">
					<div class="d-inline-flex p-2">Telephone :</div>
				</div>
				<div class="form-group col-sm-2">
					<div class="d-inline-flex p-2"><c:out value="${requestScope.telephone }"/></div>
				</div>
			</div>
			
			<div class="row justify-content-center">
				<div class="form-group col-sm-2">
					<div class="d-inline-flex p-2">Rue :</div>
				</div>
				<div class="form-group col-sm-2">
					<div class="d-inline-flex p-2"><c:out value="${requestScope.rue }"/></div>
				</div>
			</div>
			
			<div class="row justify-content-center">
				<div class="form-group col-sm-2">
					<div class="d-inline-flex p-2">Code postal :</div>
				</div>
				<div class="form-group col-sm-2">
					<div class="d-inline-flex p-2"><c:out value="${requestScope.codepostal }"/></div>
				</div>
			</div>
			
			<div class="row justify-content-center">
				<div class="form-group col-sm-2">
					<div class="d-inline-flex p-2">Ville :</div>
				</div>
				<div class="form-group col-sm-2">
					<div class="d-inline-flex p-2"><c:out value="${requestScope.ville }"/></div>
				</div>
			</div>
			
			<div class="row justify-content-center col-sm-12">
				<div class="form-group">
				<!-- Si propriétaire du compte, possibilité de modifier -->
				<a href="<%= request.getContextPath() %>/monprofil" class="navbar-brand"><button type="button" class="btn btn-primary">Modifier</button></a>
				<a href="<%= request.getContextPath() %>/listeencheres" class="navbar-brand"><button type="button" class="btn btn-outline-secondary">Retour</button></a>
					
				</div>
			</div>
		</div>
			
	</div>	
</body>
</html>