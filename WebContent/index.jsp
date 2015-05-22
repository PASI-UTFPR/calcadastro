<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="img/calc.png">

    <title>NoExcel</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    
    <link href="css/material-fullpalette.min.css" rel="stylesheet">
		
    <link href="css/roboto.min.css" rel="stylesheet">
	
	<link href="css/ripples.min.css" rel="stylesheet">
	
    <link href="css/material.min.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
    
    <link href="css/style.css" rel="stylesheet">

  </head>

  <body class=" hasGoogleVoiceExt">
 <div class="navbar navbar-default shadow-z-2">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="javascript:void(0)"><img alt="Calcadastro" src="<%= request.getContextPath() %>/img/calc.png" class="logo"></a>
    </div>
</div>
<div class="container">
	<div>
      <h2 class="form-signin-heading text-center">Login no Sistema Calcadastro</h2>
      <div class="card-s card-signin">
        <img class="img-circle profile-img" src="img/calc.png" alt="">
        <form class="form-signin" action="login" method="post">
          <div class="form-control-wrapper">
          <div class="form-group">
    		<input class="form-control" id="userInput" placeholder="Usuário" type="text" name="username">
		</div>
		
		<div class="form-group">
    		<input class="form-control" id="pswdInput" placeholder="Senha"  type="password" name="password">
		</div>
          <div class="form-group">
          <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
		</div>
		</div>
        </form>
      </div>
	</div>
    </div> <!-- /container -->
    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/ripples.min.js"></script>
    <script src="js/material.min.js"></script>
    <script src="js/app.js"></script>
</body>
</html>