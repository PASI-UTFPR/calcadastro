<jsp:include page="/views/header.jsp"/>

<div class="container">
	<div>
      <h2 class="form-signin-heading text-center">Calcadastro</h2>
      <div class="card-s card-signin">
        <img class="img-circle profile-img" src="<%= request.getContextPath() %>/img/calc.png" alt="">
       	<a href="<%= request.getContextPath() %>/cadastro" class="btn btn-primary">Cadastro</a>
		<a href="<%= request.getContextPath() %>/listagem" class="btn btn-primary">Listar</a>
		<a href="<%= request.getContextPath() %>/calculadora" class="btn btn-primary">Calculadora</a>
	</div>
    </div> <!-- /container -->
</div>
	
<jsp:include page="/views/footer.jsp"/>