package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class ValidationCommands {
	public WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");	
		driver=new FirefoxDriver();
		driver.get("http://seleniumbymahesh.com/HMS");
		driver.manage().window().maximize();
  }

}
