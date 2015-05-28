<jsp:include page="header.jsp"></jsp:include>

<div class="container">
	<% 
		if(request.getAttribute("errorCalc").equals("yes")){
			out.print("<div class=\"alert alert-dismissable alert-danger\">"+
		"<button type=\"button\" class=\"close\" data-dismiss=\"alert\">×</button>"+
		"<strong>Impossível dividir por zero</strong></div>");
			
		}
		
	%>

	<div>
      <h2 class="form-signin-heading text-center">Calcadastro</h2>
      <div class="card-s card-signin">
        <img class="img-circle profile-img" src="<%= request.getContextPath() %>/img/calc.png" alt="">
        <form class="form-signin" action="<%= request.getContextPath() %>/calculadora" method="post">
          <div class="form-control-wrapper">
          <div class="form-group">
          	<label>Número</label>
    		<input class="form-control" id="number1" placeholder="Número" type="text" name="number1" value="<%= request.getAttribute("number1") %> ">
		</div>
		
		<div class="form-group">
			<label>Número</label>
    		<input class="form-control" id="number2" placeholder="Número"  type="text" name="number2" value="<%= request.getAttribute("number2") %> ">
		</div>
		
		<div class="form-group">
			<label>Resultado</label>
    		<input class="form-control" id="result" placeholder="Resultado"  type="text" name="result" disabled="" value="<%= request.getAttribute("result") %> ">
		</div>
		
		<div class="form-group">
            <label class="col-lg-2 control-label">Opração</label>
            	</br>
                <button name="operation" type="submit" class="btn btn-lg btn-primary btn-block" value="sum">Adição</button>
 				<button name="operation" type="submit" class="btn btn-lg btn-primary btn-block" value="minus">Subtração</button>
 				<button name="operation" type="submit" class="btn btn-lg btn-primary btn-block" value="multiply">Multiplicação</button>
 				<button name="operation" type="submit" class="btn btn-lg btn-primary btn-block" value="divide">Divisão</button>
 
        </div>
		
		</div>
		
        </form>
      </div>
	</div>
    </div> <!-- /container -->

<jsp:include page="footer.jsp"></jsp:include>
