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
    <link rel="icon" href="<%= request.getContextPath() %>/img/calc.png">

    <title>CalCadastro</title>

    <!-- Bootstrap core CSS -->
    <link href="<%= request.getContextPath() %>/css/bootstrap.min.css" rel="stylesheet">
    
    <link href="<%= request.getContextPath() %>/css/material-fullpalette.min.css" rel="stylesheet">
		
    <link href="<%= request.getContextPath() %>/css/roboto.min.css" rel="stylesheet">
	
	<link href="<%= request.getContextPath() %>/css/ripples.min.css" rel="stylesheet">
	
    <link href="<%= request.getContextPath() %>/css/material.min.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="<%= request.getContextPath() %>/css/signin.css" rel="stylesheet">
    
    <link href="<%= request.getContextPath() %>/css/style.css" rel="stylesheet">

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
            <li><a href="<%= request.getContextPath() %>/index.jsp"> <span class="glyphicon mdi-action-home"></span> Inicio</a></li>
            <li><a href="<%= request.getContextPath() %>/cadastro"><span class="glyphicon mdi-action-assignment-ind"></span> Cadastro</a></li>
            <li><a href="<%= request.getContextPath() %>/listagem"><span class="glyphicon mdi-action-assignment"> </span> Listagem</a></li>
            <li><a href="<%= request.getContextPath() %>/calculadora"><span class="glyphicon mdi-action-credit-card"></span> Calculadora</a></li>
        </ul>
    </div>
</div>