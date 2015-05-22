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
    <link rel="icon" href="../img/calc.png">

    <title>CalCadastro</title>

    <!-- Bootstrap core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    
    <link href="../css/material-fullpalette.min.css" rel="stylesheet">
		
    <link href="../css/roboto.min.css" rel="stylesheet">
	
	<link href="../css/ripples.min.css" rel="stylesheet">
	
    <link href="../css/material.min.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="../css/signin.css" rel="stylesheet">
    
    <link href="../css/style.css" rel="stylesheet">

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
    <div class="navbar-collapse collapse navbar-responsive-collapse">
        <ul class="nav navbar-nav">
            <li><a href="index.jsp"> <span class="glyphicon mdi-action-home"></span> Inicio</a></li>
            <li><a href="register.jsp"><span class="glyphicon mdi-action-assignment-ind"></span> Cadastro</a></li>
            <li><a href="list.jsp"><span class="glyphicon mdi-action-assignment"> </span> Listagem</a></li>
            <li><a href="calc.jsp"><span class="glyphicon mdi-action-credit-card"></span> Calculadora</a></li>
        </ul>
    </div>
</div>