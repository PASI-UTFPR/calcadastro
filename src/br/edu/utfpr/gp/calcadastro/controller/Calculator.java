package br.edu.utfpr.gp.calcadastro.controller;

public class Calculator {
	
	public Calculator(String number1, String number2, String operation){
		switch (operation) {
		case "+":
			return sum(number1, number2);
			break;
		
		case "-":
			return dim(number1, number2);
			break;
			
		case ("/"):
			return div(number1, number2);
			break;
			
		case ("*"):
			return multiply(number1, number2);
			break;

		default:
			break;
		}
	}

	private Object multiply(String number1, String number2) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object div(String number1, String number2) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object dim(String number1, String number2) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object sum(String number1, String number2) {
		// TODO Auto-generated method stub
		return null;
	}

}
