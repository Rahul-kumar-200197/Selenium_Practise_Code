package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
//HMS_Login_Logout_ChangesMetodNameAsPerAplhabeticalOrder_USE_XMLFILES_ToResolve

public class HMS_Login_Logout_USE_XML {
	public  WebDriver driver;
	
  @Test
  public void verfiyLogin() {	
	  
	  System.out.println("login");	  
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
			 
  }
  @Test
  public void signOut() {
	  System.out.println("logout");	 
		 driver.findElement(By.linkText("Logout")).click();		
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("openUrl");
	  System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.get("http://www.seleniumbymahesh.com/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("closeBrowser");
  }

}
