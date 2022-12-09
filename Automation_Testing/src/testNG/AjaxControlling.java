package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class AjaxControlling {
	public WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  Thread.sleep(5000);
	  String str=driver.findElement(By.xpath("//ul[@class='erkvQe']")).getText();
	 // String str=driver.findElement(By.cssSelector("ul.erkvQe")).getText();
	  System.out.println(str);
	  String[] s= str.split("\n");
	  for(int i=0;i<s.length;i++) {
		  if(s[i].equalsIgnoreCase("selenium webdriver")) {
			  driver.findElement(By.name("q")).clear();
			  driver.findElement(By.name("q")).sendKeys(s[i]);
			  driver.findElement(By.name("btnK")).click();
		  }
	  }	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("openUrl");
	  System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
  }
}
