<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Nouvelle vente</title>
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
  <a class="navbar-brand" href="connexion.jsp">TrocEnchères.0rg</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="nav navbar-nav">
      <a class="nav-item nav-link" href="<%= request.getContextPath()%>/profil"><span class="glyphicon glyphicon-user"></span> Mon profil</a>
      <a class="nav-item nav-link" href="<%= request.getContextPath()%>/#"><span class="glyphicon glyphicon-log-iout"></span> Déconnexion</a>
    </div>
  </div>
</nav>
	<div class="container">
		<h2 class="text-center">Nouvelle vente</h2>
		<div class="row">
			<div class="col-1">
				<img id="image"/>
				<!-- javascript permetant l'appercu de l'image uploadé -->
				<script>
					var loadFile = function(event) {
						var output = document.getElementById('image');
						output.src = URL.createObjectURL(event.target.files[0]);
					};
				</script>
			</div>
			
			<div class="col-11">
				<div class="row justify-content-center">
					<div class="form-group col-sm-2">
						<p>Article</p>
					</div>
					<div class="form-group col-sm-4">
						<input type="text" class="form-control" name="article" />
					</div>
				</div>
					
				<div class="row justify-content-center">
					<div class="form-group col-sm-2">
						<p>Description</p>
					</div>
					<div class="form-group col-sm-4">
						<textarea rows="4" cols="60" class="form-control" name="description"></textarea>
					</div>
				</div>
				
				<div class="row justify-content-center">
					<div class="form-group col-sm-2">
						<p>Photo article</p>
					</div>
					<div class="input-group input-file col-sm-4">
						<input type="file" accept="image/*" onchange="loadFile(event)">
					</div>
				</div>
				
				<div class="row justify-content-center">
					<div class="form-group col-sm-3">
						<p>Mise à prix</p>
					</div>
					<div class="form-group col-sm-3">
						<input type="number" min="0" class="form-control" name="prix" />
					</div>
				</div>
				
				<div class="row justify-content-center">
					<div class="form-group col-sm-3">
						<p>Fin de l'enchère</p>
					</div>
					<div class="form-group col-sm-3">
						<input type="date" class="form-control" name="dateLimite" />
					</div>
				</div>
				
				<div class="row justify-content-center">
					<div class="form-group col-sm-2">
						<p>Retrait</p>
					</div>
					<div class="form-group col-sm-4">
						
					</div>
				</div>
				
				<div class="row justify-content-center">
					<div class="form-group col-sm-3">
						<p>Rue</p>
					</div>
					<div class="form-group col-sm-3">
						<input type="text" class="form-control" name="rue" />
					</div>
				</div>
				
				<div class="row justify-content-center">
					<div class="form-group col-sm-3">
						<p>Code postal</p>
					</div>
					<div class="form-group col-sm-3">
						<input type="text" class="form-control" name="codeP" />
					</div>
				</div>
				
				<div class="row justify-content-center">
					<div class="form-group col-sm-3">
						<p>Ville</p>
					</div>
					<div class="form-group col-sm-3">
						<input type="text" class="form-control" name="ville" />
					</div>
				</div>
						<div class="row justify-content-center">
					<div class="form-group col-sm-6">
		
					<button type="submit" class="btn btn-primary">Enregistrer</button>
					<a href="<%= request.getContextPath()%>/listeencheres" class="navbar-brand"><button type="button" class="btn btn-outline-secondary">Retour</button></a>
				</div>
				</div>
			</div>
		</div>
		
	<!-- Fin div container -->
	</div>
</body>
</html>