package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class ByDefaultSelectValue {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	
	  WebElement str = new Select(driver.findElement(By.cssSelector("div.css-1dbjc4n.r-1awozwy.r-18u37iz.r-1wtj0ep"))).getFirstSelectedOption();
	  System.out.println(str.getText());
	  if(str.getText().equalsIgnoreCase("INR"))
	  System.out.println("By default value is :"+str.getText());
	  else
		  System.out.println("By default value is :"+str.getText());
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");	
		driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
  }

}
