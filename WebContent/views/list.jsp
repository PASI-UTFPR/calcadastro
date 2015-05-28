<jsp:include page="header.jsp"></jsp:include>

<%@page import="br.edu.utfpr.gp.calcadastro.model.Person"%>
<%@page import="java.util.List"%>

<%
		List<Person> people = (List<Person>)session.getAttribute("people");
%>		
		
<div class="panel panel-default">
      <!-- Default panel contents -->
      <div class="panel-heading">Lista de Usários</div>

      <!-- Table -->
      <table class="table">
        <thead>
          <tr>
            <th>#</th>
            <th>Nome</th>
            <th>Idade</th>
            <th>Gostou do que?</th>
          </tr>
        </thead>
        <tbody>
        <%
        if(people != null){
        	int i=1;
	        	for (Person person : people){
	        	out.println("<tr>"
	                    +"<th scope=\"row\">"+i+"</th>"
	                    +"<td>"+ person.getName() +"</td>"
	                    +"<td>"+ person.getAge().toString() +"</td>"
	                    +"<td>"+ person.getLike() +"</td>"
	                  +"</tr>");
	        	i = i+1;
	        	}
	        }
	%>
        </tbody>
      </table>
    </div>

<jsp:include page="footer.jsp"></jsp:include>
