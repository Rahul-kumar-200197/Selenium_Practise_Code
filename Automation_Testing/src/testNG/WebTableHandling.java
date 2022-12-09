package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class WebTableHandling {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.findElement(By.cssSelector("input.css-1cwyjr8.r-homxoj.r-ubezar.r-10paoce.r-13qz1uu")).click();
	  String str=driver.findElement(By.cssSelector("div.css-1dbjc4n.r-19yat4t.r-1rt2jqs")).getText();
	  //System.out.println(str.length());
	  System.out.println(str);
	  String[] s=str.split("\n");
	  System.out.println("Number of Tables's value:-"+s.length);
	  for(int i=0; i<s.length;i++) {
		  if(s[i].equalsIgnoreCase("Bengaluru")) 
			  System.out.println(s[i]);
		  else if(s[i].equalsIgnoreCase("HYD"))
			  System.out.println(s[i]);
		  else if(s[i].equalsIgnoreCase("Jaisalmer"))
			  System.out.println(s[i]);			  
		  }
	  }  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("openUrl");
	  System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
  }

}
