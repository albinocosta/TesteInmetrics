package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewEmployeePage {
	
	static WebDriver driver;
	
	public NewEmployeePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillform() {
		
		WebElement Name = driver.findElement(By.id("inputNome"));
		Name.sendKeys("Fulano");
		
		WebElement CPF = driver.findElement(By.id("cpf"));
		CPF.sendKeys("634.560.872-68");
		
		WebElement Sexo = driver.findElement(By.id("slctSexo"));
		Sexo.click();
		
		WebElement Masc = driver.findElement(By.xpath("//*[@id=\"slctSexo\"]/option[4]"));
		Masc.click();
		
		WebElement Admissao = driver.findElement(By.id("inputAdmissao"));
		Admissao.sendKeys("27/03/1900");
		
		WebElement Position = driver.findElement(By.id("inputCargo"));
		Position.sendKeys("QA Engineer");
		
		WebElement Salary = driver.findElement(By.id("dinheiro"));
		Salary.sendKeys("500,00");
		
		WebElement Contract = driver.findElement(By.id("pj"));
		Contract.click();
		
		WebElement Submit = driver.findElement(By.className("cadastrar-form-btn"));
		Submit.click();
		
	}
	
	public void edituser() {
		
		WebElement CLT = driver.findElement(By.id("clt"));
		CLT.click();
		
		WebElement Submit = driver.findElement(By.className("cadastrar-form-btn"));
		Submit.click();
		
	}

}
