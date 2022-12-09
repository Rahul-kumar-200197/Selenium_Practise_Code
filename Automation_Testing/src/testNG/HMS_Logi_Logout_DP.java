package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class HMS_Logi_Logout_DP {
	
	public WebDriver driver;
	
  @Test(dataProvider = "Authentication")
  public void f(String uname, String pwd) throws InterruptedException {
	  System.out.println("login");	  
		//driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
  }

  @DataProvider (name="Authentication") //line 13 & 17 name must be same
  public Object[][] credentails() { //method name can be anything
    return new Object[][] {{"admin","admin"},{"mahesh","mahesh"},{"sunny","sunny"}};    
    
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");	
		driver=new FirefoxDriver();
		driver.get("http://seleniumbymahesh.com/HMS");
		driver.manage().window().maximize();
  }

}
