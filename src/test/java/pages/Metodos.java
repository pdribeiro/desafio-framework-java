package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	WebDriver driver;
	
	public void abrirNavegador (String site, String descricaoPasso) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);		
		driver.manage().window().maximize();
		
	}
	
	public void escrever (String texto, By elemento) {
		
		driver.findElement(elemento).sendKeys(texto);
		
		
	}
	
	public void submit(By elemento) {
		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			System.err.println("---------- Error ao clicar no elemento ----------" + e.getMessage());
			System.err.println("---------- Causa do erro ----------" + e.getCause());
		}
	}
	
	public void clicar(By elemento) {
		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("---------- Error ao clicar no elemento ----------" + e.getMessage());
			System.err.println("---------- Causa do erro ----------" + e.getCause());
		}
	}
	
	public void validadeTexto(String textoEsperado, By elemento) {
		
		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, texto);
		
		
	}
	
	public void fecharNavegador () {
		driver.quit();
	}
	
	public void Sleep() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.err.println("------- erro de Timeout -------- " + e.getMessage());
			System.err.println("---------- Causa do erro ----------" + e.getCause());
		}
	}
	
	public void screnShot(String nomeEvidencia) {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./src/Evidencias/" + nomeEvidencia + ".png");
			FileUtils.copyFile(scrFile, destFile);
		} catch (Exception e) {
			System.err.println("---------- Error ao tirar screnShot ----------" + e.getMessage());
			System.err.println("---------- Causa do erro ----------" + e.getCause());
		}
	}

}
