<jsp:include page="header.jsp"></jsp:include>

<div class="container">
	<div>
      <h2 class="form-signin-heading text-center">Calcadastro</h2>
      <div class="card-s card-signin">
        <img class="img-circle profile-img" src="../img/calc.png" alt="">
        <form class="form-signin" action="br/utfpr/gp/calcadastro/controller/Calculator.java" method="post">
          <div class="form-control-wrapper">
          <div class="form-group">
    		<input class="form-control" id="number1" placeholder="N�mero" type="text" name="number1">
		</div>
		
		<div class="form-group">
    		<input class="form-control" id="number2" placeholder="N�mero"  type="text" name="number2">
		</div>
		
		<div class="form-group">
    		<input class="form-control" id="result" placeholder="Resultado"  type="text" name="result">
		</div>
		
		<div class="form-group">
            <label class="col-lg-2 control-label">Opra��o</label>
            
                <div class="radio radio-primary">
                    <label>
                        <input type="radio" name="operation" id="sum" value="sum" checked="">
                        Adi��o
                    </label>
                </div>
                <div class="radio radio-primary">
                    <label>
                        <input type="radio" name="operation" id="minus" value="minus">
                        Subtra��o
                    </label>
                </div>
                <div class="radio radio-primary">
                    <label>
                        <input type="radio" name="operation" id="multiply" value="multiply">
                        Multiplica��o
                    </label>
                </div>
                <div class="radio radio-primary">
                    <label>
                        <input type="radio" name="operation" id="divide" value="divide">
                        Divis�o
                    </label>
                </div>
            </div>
        </div>
		
          <div class="form-group">
          <button class="btn btn-lg btn-primary btn-block" type="reset">Limpar</button>
          <button class="btn btn-lg btn-primary btn-block" type="submit">Calcular</button>
		</div>
		</div>
        </form>
      </div>
	</div>
    </div> <!-- /container -->

<jsp:include page="footer.jsp"></jsp:include>
