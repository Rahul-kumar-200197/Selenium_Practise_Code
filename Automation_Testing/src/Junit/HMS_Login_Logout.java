package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HMS_Login_Logout {

	public static WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.seleniumbymahesh.com/");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void verifyLogin() {		
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();	
	}

	@Test
	public void verifyLogout() {
	    driver.findElement(By.linkText("Logout")).click();		
	}
}
