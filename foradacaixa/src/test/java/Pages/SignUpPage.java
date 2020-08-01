package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
	
	static WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	public void fillinfields() {
		WebElement Usuario = driver.findElement(By.name("username"));
		Usuario.sendKeys("fakeuser");
		
		WebElement Senha = driver.findElement(By.name("pass"));
		Senha.sendKeys("fakepassword");
		
		WebElement VerSenha = driver.findElement(By.name("confirmpass"));
		VerSenha.sendKeys("fakepassword");
		
		WebElement Cadastrar = driver.findElement(By.className("login100-form-btn"));
		Cadastrar.click();
	}

}
