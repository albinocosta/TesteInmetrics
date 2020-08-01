package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import Pages.EmployeePage;
import Pages.NewEmployeePage;

public class CreateEditEraseUser {
	
	static WebDriver driver;
	static LoginPage loginPage;
	static EmployeePage employeePage;
	static NewEmployeePage newemployeePage;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
				
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\albin\\eclipse-workspace\\foradacaixa\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.inmrobo.tk/accounts/login/");
		loginPage = new LoginPage(driver);
		employeePage = new EmployeePage(driver);
		newemployeePage = new NewEmployeePage(driver);
		 
	}

	@After
	public void tearDown() throws Exception {
		driver.close();

	}
	
	@Test
	public void test() {
		loginPage.login();
		employeePage.createemployee();
		newemployeePage.fillform();
		assertEquals(employeePage.checkmessage(),"SUCESSO!");
		employeePage.selectuser();
		employeePage.editbutton();
		newemployeePage.edituser();
		assertEquals(employeePage.checkmessage(),"SUCESSO!");
		employeePage.selectuser();
		employeePage.eraseuser();
		assertEquals(employeePage.checkmessage(),"SUCESSO!");
		
	
	}

}

