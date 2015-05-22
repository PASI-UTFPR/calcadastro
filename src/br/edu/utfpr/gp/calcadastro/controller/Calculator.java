package br.edu.utfpr.gp.calcadastro.controller;

public class Calculator {
	
	public static String solve(String number1, String number2, String operation) throws Exception, UnsupportedOperationException{
		switch (operation) {
			case "+":
				return sum(number1, number2);
			case "-":
				return dim(number1, number2);
			case ("/"):
				return div(number1, number2);
			case ("*"):
				return multiply(number1, number2);
			default:
				throw new UnsupportedOperationException("Operation " + operation + " unknown.");
		}
	}

	private static String sum(String number1, String number2) throws Exception {
		try {
			return String.valueOf(Integer.parseInt(number1) + Integer.parseInt(number2));
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	private static String dim(String number1, String number2) throws Exception {
		try {
			return String.valueOf(Integer.parseInt(number1) - Integer.parseInt(number2));
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	private static String div(String number1, String number2) throws Exception {
		try {
			return String.valueOf(Integer.parseInt(number1) / Integer.parseInt(number2));
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	private static String multiply(String number1, String number2) throws Exception {
		try {
			return String.valueOf(Integer.parseInt(number1) * Integer.parseInt(number2));
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
