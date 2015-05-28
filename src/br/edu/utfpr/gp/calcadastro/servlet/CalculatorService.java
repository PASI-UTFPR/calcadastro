package br.edu.utfpr.gp.calcadastro.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.edu.utfpr.gp.calcadastro.controller.Calculator;

/**
 * Servlet implementation class CalculatorService
 */
@WebServlet("/calculadora")
public class CalculatorService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("errorCalc", "no");
		request.setAttribute("result", "");
		request.setAttribute("number1", "");
		request.setAttribute("number2", "");
		String address = "/views/calc.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(address);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("number2").trim().equals("0") && request.getParameter("operation").equals("divide")){
			request.setAttribute("errorCalc", "yes");
			request.setAttribute("number1", request.getParameter("number1"));
			request.setAttribute("number2", request.getParameter("number2"));
			request.setAttribute("result", "");
			String address = "/views/calc.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(address);
			dispatcher.forward(request, response);
		}else{
			try {
				String result = Calculator.solve(request.getParameter("number1").trim(), request.getParameter("number2").trim(), request.getParameter("operation"));	
				request.setAttribute("number1", request.getParameter("number1"));
				request.setAttribute("number2", request.getParameter("number2"));
				request.setAttribute("result", result);
				request.setAttribute("errorCalc", "no");
				String address = "/views/calc.jsp";
				RequestDispatcher dispatcher = request.getRequestDispatcher(address);
				dispatcher.forward(request, response);
			} catch (UnsupportedOperationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
