package br.edu.utfpr.calcadastro.controller.cadastro;


import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;



public class CadastroFunctionalTest {
	private WebDriver driver;
	private String baseUrl;
	
	@Before
	public void setup() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080/Calcadastro/cadastro";		
	}
	
	@Test
	public void TestCadastroOk() {
		driver.get(baseUrl + "/");
		driver.findElement(By.id("name")).sendKeys("Gustavo");
		driver.findElement(By.id("age")).sendKeys("25");
		driver.findElement(By.id("like")).sendKeys("Sim");
		driver.findElement(By.id("save")).click();
		
		assertEquals("ok",driver.findElement(By.id("error")).getText());
	}
	
	@Test
	public void TestCadastroNaoOk() {
		driver.get(baseUrl + "/");
		driver.findElement(By.id("name")).sendKeys("Gustavo");
		driver.findElement(By.id("save")).click();
		
		assertEquals("all fields are required",driver.findElement(By.id("error")).getText());
	}
	
	
}
