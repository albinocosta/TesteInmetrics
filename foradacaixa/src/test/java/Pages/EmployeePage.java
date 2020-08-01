package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeePage {
	
	static WebDriver driver;
	
	public EmployeePage(WebDriver driver) {
		this.driver = driver;
	}

	public void createemployee() {
							
		WebElement Newemployee = driver.findElement(By.xpath("//a[contains(text(),'Novo Funcionário')]"));
		Newemployee.click();
		
	}
	
	public String checkmessage() {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div/strong")).getText();
	}
	
	public void selectuser() {
		
		WebElement Search = driver.findElement(By.xpath("//*[@id=\"tabela_filter\"]/label/input"));
		Search.sendKeys("Fulano");	
		
		
		
	}
	
	public void editbutton() {
		
		WebElement Edit = driver.findElement(By.xpath("//*[@id=\"tabela\"]/tbody/tr/td[6]/a[2]/button/span"));
		Edit.click();
	}
	
	public void eraseuser() {
		
		WebElement Erase =driver.findElement(By.xpath("//*[@id=\"delete-btn\"]/span"));
		Erase.click();
	}
	
		
}
