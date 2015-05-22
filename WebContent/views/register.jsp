<jsp:include page="header.jsp"></jsp:include>
<div class="container">
	<div>
      <h2 class="form-signin-heading text-center">Cadastro Sistema Calcadastro</h2>
      <div class="card-s card-signin">
        <img class="img-circle profile-img" src="../img/calc.png" alt="">
        <form class="form-signin" action="login" method="post">
          <div class="form-control-wrapper">
          <div class="form-group">
    		<input class="form-control" id="name" placeholder="Usuário" type="text" name="name">
		</div>
		
		<div class="form-group">
    		<input class="form-control" id="age" placeholder="Senha"  type="text" name="age">
		</div>
		<div class="form-group">
    		<input class="form-control" id="like" placeholder="Senha"  type="text" name="like">
		</div>
          <div class="form-group">
          <button class="btn btn-lg btn-primary btn-block" type="reset">Limpar</button>
          <button class="btn btn-lg btn-primary btn-block" type="submit">Confirmar</button>
		</div>
		</div>
        </form>
      </div>
	</div>
    </div> <!-- /container -->
<jsp:include page="footer.jsp"></jsp:include>
