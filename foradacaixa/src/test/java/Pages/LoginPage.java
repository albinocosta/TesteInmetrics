package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	static WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void gotonewuser() {
		WebElement gotonewuser = driver.findElement(By.linkText("Cadastre-se"));
		gotonewuser.click();
	}
	
	public void login() {
		
		WebElement Usuario = driver.findElement(By.name("username"));
		Usuario.sendKeys("fakeuser");
		
		WebElement Senha = driver.findElement(By.name("pass"));
		Senha.sendKeys("fakepassword");
		
		WebElement Entrar = driver.findElement(By.className("login100-form-btn"));
		Entrar.click();
		
	}
	
}
