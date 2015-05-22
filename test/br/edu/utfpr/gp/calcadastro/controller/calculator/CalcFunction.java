package br.edu.utfpr.gp.calcadastro.controller.calculator;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.junit.*;

public class CalcFunction {
	
	private WebDriver driver;
	private long time = 3000;
	
	@Before
	public void setup(){
		//Entra na home do sistema
		newInstanceWebDriver(new FirefoxDriver(), "http://localhost:8080/calcadatro");

	}
	
	//Teste Positivo para a ação soma
	@Test
	public void testSumSuccess(){
		
		//Botão calculator clicado (Redireciona para a calculadora)
		getDriver().findElement(By.id("calculator")).click();
		
		String n1, n2;
		//Resupera valores
		n1 = getDriver().findElement(By.id("number1")).getText();
		n2 = getDriver().findElement(By.id("number2")).getText();
		
		//Soma valores
		getNewWebElement("result").sendKeys(String.valueOf(Integer.valueOf(n1)+Integer.valueOf(n2)));
		getDriver().findElement(By.id("sum")).click();
		
		//Span de feedback do resultado
		assertEquals("Resultado correto!", getDriver().findElement(By.id("message")).getText());
		waitTime(time);
	}
	
	   //Teste Positivo para a ação subtração
		@Test
		public void testMinusSuccess(){
			
			String n1, n2;
			//Resupera valores
			n1 = getDriver().findElement(By.id("number1")).getText();
			n2 = getDriver().findElement(By.id("number2")).getText();
			
			//Soma valores
			getNewWebElement("result").sendKeys(String.valueOf(Integer.valueOf(n1)-Integer.valueOf(n2)));
			getDriver().findElement(By.id("sum")).click();
			
			//Span de feedback do resultado
			assertEquals("Resultado correto!", getDriver().findElement(By.id("message")).getText());
			waitTime(time);
		}
		
		//Teste Positivo para a ação multiplicação
		@Test
		public void testMultiplySuccess(){
			
			String n1, n2;
			//Resupera valores
			n1 = getDriver().findElement(By.id("number1")).getText();
			n2 = getDriver().findElement(By.id("number2")).getText();
			
			//Soma valores
			getNewWebElement("result").sendKeys(String.valueOf(Integer.valueOf(n1)*Integer.valueOf(n2)));
			getDriver().findElement(By.id("sum")).click();
			
			//Span de feedback do resultado
			assertEquals("Resultado correto!", getDriver().findElement(By.id("message")).getText());
			waitTime(time);
		}

	
	private WebDriver getDriver(){
		return this.driver;
	}
	
	private void newInstanceWebDriver(RemoteWebDriver navigator, String url){
		this.driver = navigator; 
		this.driver.get(url);
	}
	
	private WebElement getNewWebElement(String name){
		WebElement webElement = getDriver().findElement(By.id(name));
	    return webElement;
	}
	
	private void waitTime(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
	
	@After
	public void closeDriver(){
		getDriver().close();
	}

}
