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
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	  <a class="navbar-brand" href="<%= request.getContextPath()%>/listeencheres">TrocEnchères.0rg</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
	    <div class="nav navbar-nav ">
	      <a href="<%= request.getContextPath() %>/profil" ><span class="glyphicon glyphicon-user "> Mon profil</span></a>
	      <a href="<%= request.getContextPath() %>/#" ><span class="glyphicon glyphicon-log-iout"> Déconnexion</span></a>
	    </div>
	  </div>
	</nav>
	<!--  Debut div container -->
	<div class="container">
			<h3 class="text-center">Détail Vente</h3>
			
	</div>
	<!--  Fin div container -->
</body>
</html>