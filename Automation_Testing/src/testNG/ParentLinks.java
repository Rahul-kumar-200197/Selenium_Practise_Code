package testNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class ParentLinks {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  //code for all the links(Visible & invisible)
	/* List<WebElement> links = driver.findElements(By.tagName("a"));
	 System.out.println("Available lins are "+links.size());
	 for(int i=0;i<links.size();i++) {
		 System.out.println(links.get(i).getText());
	 } */
	  //code for only Visible links
	 List<WebElement> links = driver.findElements(By.tagName("a"));
	 System.out.println("Available lins are "+links.size());
	 int count=0;
	 for(int i=0;i<links.size();i++) {
		 if(!links.get(i).getText().isEmpty()) {
		 System.out.println(links.get(i).getText());
		 count++;
	 }
	 }
	 System.out.println("Visible links are "+count);
  }
  @BeforeTest
  
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");	
		driver=new FirefoxDriver();
		driver.get("https://www.seleniumbymahesh.com"); //any site can be taken
		driver.manage().window().maximize();
  }

}
