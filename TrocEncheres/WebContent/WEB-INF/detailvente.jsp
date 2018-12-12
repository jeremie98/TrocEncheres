<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="uft-8">
	<!-- lien vers feuille bootstrap -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
		integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
		crossorigin="anonymous">
	
	<!-- lien librarie jQuery et Javascript -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Détail Vente</title>
</head>
<body>

	<!-- Inclusion de la barre de navigation presnete dans fichier navbar.html -->
	<%@ include file="../pages/navbar.jsp" %>
		<!--  Debut div container -->
	<div class="container">
		<h2 class="text-center">Détail Vente</h2>
			
		
			<div class="row justify-content-md-center">
				
					<h5><span class="badge badge-primary">Scouter rose</span></h5>
	    		
	  		</div>
			<div class="row justify-content-center">
			
				<div class="col-sm-3">
					<p>Description : </p>
	    		</div>
				<div class="col-sm-3">
					<p>It's over 9 000</p>
	    		</div>
	  		</div>
	  		
			<div class="row justify-content-center">
				<div class="col-sm-3">
					<p>Meilleure offre : </p>
	    		</div>
				<div class="col-sm-3">
					<p>9 001 points par Kakarot </p>
	    		</div>
	  		</div>
  		
			<div class="row justify-content-center">
				<div class="col-sm-3">
					<p>Mise à prix : </p>
	    		</div>
				<div class="col-sm-3">
					<p>9 000 points</p>
	    		</div>
	  		</div>
	  		
	  		<div class="row justify-content-center">
				<div class="col-sm-3">
					<p>Fin de l'enchère : </p>
	    		</div>
				<div class="col-sm-3">
					<p>13/12/2018</p>
	    		</div>
	  		</div>
  		
	  		<div class="row justify-content-center">
				<div class="col-sm-3">
					<p>Retrait : </p>
	    		</div>
				<div class="col-sm-3">
					<p>10 allée des Flamboyant</p>
					<p>Saint-Francois</p>
	    		</div>
	  		</div>
  		
	  		<div class="row justify-content-center">
				<div class="col-sm-3">
					<p>Veudeur : </p>
	    		</div>
				<div class="col-sm-3">
					<p>Vegeta</p>
	    		</div>
	  		</div>
  		
	  		
  		
	</div>	
	<!--  Fin div container -->
</body>
</html>