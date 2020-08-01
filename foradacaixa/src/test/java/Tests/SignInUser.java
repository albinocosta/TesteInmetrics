package Tests;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;


public class SignInUser {
	
	static WebDriver driver;
	static LoginPage loginPage;	
	
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
		
	}

	@After
	public void tearDown() throws Exception {
		driver.close();

	}
	
	@Test
	public void test() {
		loginPage.login();			 
		
		
	}

}
