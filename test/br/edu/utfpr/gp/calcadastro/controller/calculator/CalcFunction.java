package br.edu.utfpr.gp.calcadastro.controller.calculator;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.junit.*;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class CalcFunction {

	private WebDriver driver;
	private long time = 3000;

	@Before
	public void setup() {
		// Entra na home do sistema
		newInstanceWebDriver(new FirefoxDriver(), "http://localhost:8080/calcacadstro");
	}
	

	// Teste Positivo para a ação soma
	@Test
	public void testSumSuccess() {

		// Botão calculator clicado (Redireciona para a calculadora)
		getDriver().findElement(By.id("calculator")).click();

		double n1 = 25, n2 = 25, resultExpected;
		String result;
		
		// Resupera valores
		getDriver().findElement(By.id("number1")).sendKeys(String.valueOf(n1));
		getDriver().findElement(By.id("number2")).sendKeys(String.valueOf(n2));
				
		getDriver().findElement(By.id("sum")).click();
		
		resultExpected = n1 + n2;
		
		// Soma valores
		result = getDriver().findElement(By.id("result")).getText();
		
		//Asset esperado para o resultado
		assertEquals(String.valueOf(resultExpected), result);
		

		waitTime(time);
	}

	// Teste Positivo para a ação subtração
	@Test
	public void testMinusSuccess() {

		double n1 = 50, n2 = 25, resultExpected;
		String result;
		
		// Resupera valores
		getDriver().findElement(By.id("number1")).sendKeys(String.valueOf(n1));
		getDriver().findElement(By.id("number2")).sendKeys(String.valueOf(n2));
				
		getDriver().findElement(By.id("sum")).click();
		
		resultExpected = n1 - n2;
		
		// Soma valores
		result = getDriver().findElement(By.id("result")).getText();
		
		//Asset esperado para o resultado
		assertEquals(String.valueOf(resultExpected), result);
		

		waitTime(time);

	}

	// Teste Positivo para a ação multiplicação
	@Test
	public void testMultiplySuccess() {

		double n1 = 2, n2 = 25, resultExpected;
		String result;
		
		// Resupera valores
		getDriver().findElement(By.id("number1")).sendKeys(String.valueOf(n1));
		getDriver().findElement(By.id("number2")).sendKeys(String.valueOf(n2));
				
		getDriver().findElement(By.id("sum")).click();
		
		resultExpected = n1 * n2;
		
		// Soma valores
		result = getDriver().findElement(By.id("result")).getText();
		
		//Asset esperado para o resultado
		assertEquals(String.valueOf(resultExpected), result);
		

		waitTime(time);

	}

	// Teste Positivo para a ação divide
	@Test
	public void testDivideSuccess() {

		double n1 = 30, n2 = 2, resultExpected;
		String result;
		
		// Resupera valores
		getDriver().findElement(By.id("number1")).sendKeys(String.valueOf(n1));
		getDriver().findElement(By.id("number2")).sendKeys(String.valueOf(n2));
				
		getDriver().findElement(By.id("sum")).click();
		
		resultExpected = n1 / n2;
		
		// Soma valores
		result = getDriver().findElement(By.id("result")).getText();
		
		//Asset esperado para o resultado
		assertEquals(String.valueOf(resultExpected), result);
		

		waitTime(time);
	}
	
	// Teste Positivo para a ação divide por zero
	@Test
	public void testDivideByZero(){
		
		double n1 = 25, n2 = 0, resultExpected;
		String message_error;
		
		// Resupera valores
		getDriver().findElement(By.id("number1")).sendKeys(String.valueOf(n1));
		getDriver().findElement(By.id("number2")).sendKeys(String.valueOf(n2));
				
		getDriver().findElement(By.id("sum")).click();
		
		message_error = getDriver().findElement(By.id("message")).getText();
		
		// Span de feedback do resultado
		assertEquals("Impossível dividir por zero", message_error);
		
		waitTime(time);
		
	}


	private WebDriver getDriver() {
		return this.driver;
	}

	private void newInstanceWebDriver(RemoteWebDriver navigator, String url) {
		this.driver = navigator;
		this.driver.get(url);
	}

	private WebElement getNewWebElement(String name) {
		WebElement webElement = getDriver().findElement(By.id(name));
		return webElement;
	}

	private void waitTime(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;
	}

	@After
	public void closeDriver() {
		getDriver().close();
	}

}
