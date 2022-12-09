package testNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class ValidateDropdown {
	
	public WebDriver driver;
	  
  @Test(enabled=false)
  public void f() {
	
	  List<WebElement> str=new Select(driver.findElement(By.id("reg_mothertongue"))).getOptions();
	  System.out.println("Numbers of value in the dropdown: "+str.size());
	  /* for (int i=1;i<str.size();i++) { //i=1 for ignore starting 'Select button'
		  System.out.println(str.get(i).getText()); */
	  
	  /* for (int i=1;i<str.size();i++) { //i=1 for ignore starting 'Select button'
		  if(str.get(i).getText().equalsIgnoreCase("HINDI"))
		  System.out.println(str.get(i).getText());
		  
	  } */
	   for (int i=1;i<str.size();i++) { //i=1 for ignore starting 'Select button'
		  if(!str.get(i).getText().equalsIgnoreCase("HINDI"))
		  System.out.println(str.get(i).getText()); 
		  
	  } 
} 


//2nd method to get above all

	   @Test	   
	   public void tagName() {
		   
		  WebElement header = driver.findElement(By.id("reg_mothertongue"));
		  List<WebElement> ddValues = header.findElements(By.tagName("option"));		  
		  System.out.println("Numbers of values in DD "+ddValues.size());
		  for(int i=1;i<ddValues.size();i++) {
			  System.out.println(ddValues.get(i).getText());
		  }	
}  
 
	  
  
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");	
		driver=new FirefoxDriver();
		driver.get("https://www.eenadupellipandiri.net/");
		driver.manage().window().maximize();
	}
  }


