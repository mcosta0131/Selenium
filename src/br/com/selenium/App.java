package br.com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App {

		//public static String driverPath = "C:\\Users\\7700658723\\Desktop\\chromedriver_win32";
		public static WebDriver driver;
	 
		public static void main(String []args) throws AWTException, InterruptedException {
			System.out.println("launching chrome browser");
			System.setProperty("webdriver.chrome.driver", "C:/Users/7700658723/Desktop/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("http://uol.com.br");
			
			
			WebElement usuario = driver.findElement(By.id("usuario"));
			WebElement senha = driver.findElement(By.id("senha"));
			WebElement btn = driver.findElement(By.tagName("button"));
			
			WebElement dataInicio = driver.findElement(By.id("dataInicio"));
			WebElement dataFim = driver.findElement(By.name("dataFim"));
			
			
			usuario.sendKeys("77156256");
			senha.sendKeys("homolog01");
			btn.click();
			Thread.sleep(1000);
			driver.navigate().to("http://localhost:4200/relatorios/crl/ultimo-ponto-crl");
			Thread.sleep(1000);
			
			//WebElement select = driver.findElement(By.id("tipoSolic"));
			
			Select dropdown = new Select(driver.findElement(By.tagName("select")));
			WebElement entregas = driver.findElement(By.id("entregas"));
			WebElement btnFil = driver.findElement(By.id("filtrar"));
			dropdown.selectByVisibleText("STD");
			entregas.sendKeys("176056491");
			btnFil.click();
		}
}
