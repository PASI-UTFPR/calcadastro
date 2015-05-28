package br.edu.utfpr.gp.calcadastro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import br.edu.utfpr.gp.calcadastro.model.Person;

/**
 * Servlet implementation class ControllerPerson
 */
@WebServlet("/cadastro")
public class ControllerPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerPerson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("errorReg", "no");
		String address = "/views/register.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(address);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String name  = request.getParameter("name");
		String age = request.getParameter("age");
		String like = request.getParameter("like");
		
		
		if(name.trim().equals("") || age.equals("") || like.trim().equals("")){
			request.setAttribute("errorReg", "yes");
			String address = "/views/register.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(address);
			dispatcher.forward(request, response);	
			out.print("nulo");
		}
		else{
			HttpSession session = request.getSession();
			Integer ageInt = Integer.parseInt(request.getParameter("age"));
			Person person = new Person(name,ageInt,like);
			List<Person> people = (List<Person>)session.getAttribute("people");
			
			if(people == null){
				people = new ArrayList<Person>();
			}
			
			people.add(person);
			session.setAttribute("people", people);
			response.sendRedirect(request.getContextPath()+"/calculadora");
		}	
	}

}
