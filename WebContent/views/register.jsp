<jsp:include page="header.jsp"></jsp:include>
<div class="container">
	<% 
		
		if(request.getAttribute("errorReg").equals("yes")){
			out.print("<div class=\"alert alert-dismissable alert-danger\">"+
		"<button type=\"button\" class=\"close\" data-dismiss=\"alert\">×</button>"+
		"<strong>Preencha todos os campos</strong></div>");
		}
		
	%>
</div>
	<div>
      <h2 class="form-signin-heading text-center">Cadastro Sistema Calcadastro</h2>
      <div class="card-s card-signin">
        <img class="img-circle profile-img" src="<%= request.getContextPath() %>/img/calc.png" alt="">
        <form class="form-signin" action="<%= request.getContextPath() %>/cadastro" method="post">
          <div class="form-control-wrapper">
          <div class="form-group">
    		<input class="form-control" id="name" placeholder="Usuário" type="text" name="name">
		</div>
		
		<div class="form-group">
    		<input class="form-control" id="age" placeholder="Idade"  type="text" name="age">
		</div>
		<div class="form-group">
    		<input class="form-control" id="like" placeholder="Gostou?"  type="text" name="like">
		</div>
          <div class="form-group">
          <button class="btn btn-lg btn-primary btn-block" type="submit">Confirmar</button>
		
          <button class="btn btn-lg btn-primary btn-block" type="reset">Limpar</button>
          </div>
		</div>
        </form>
      </div>
	</div>
    </div> <!-- /container -->
<jsp:include page="footer.jsp"></jsp:include>
