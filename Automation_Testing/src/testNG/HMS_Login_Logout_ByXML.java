package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class HMS_Login_Logout_ByXML {
	public WebDriver driver;

	
  @Test
  public void f() {
	  if(driver.findElement(By.name("username")).isDisplayed()) {
		  System.out.println("Username is available");
		  driver.findElement(By.name("username")).sendKeys("sunny");
	  }else {
		  System.out.println("Username is not available");
	  }
	 driver.get("http:spicejet.com");
	 if(driver.findElement(By.cssSelector("div.css-1dbjc4n.r-zso239")).isSelected()){
		 System.out.println("Oneway radio button is selected");
	 }
	 else {
		 System.out.println("Oneway radio button is not selected"); 		
	 }		
}  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");	
		driver=new FirefoxDriver();
		driver.get("http://seleniumbymahesh.com/HMS");
		driver.manage().window().maximize();
  }
 }
