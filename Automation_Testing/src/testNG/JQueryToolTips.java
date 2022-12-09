package testNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class JQueryToolTips {
	public WebDriver driver;
  @Test
  public void f() {
	  
	  List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	  System.out.println("Number of rames:- "+frames.size());
	 // driver.switchTo().frame(0);
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	  
	  String tooltip1 = driver.findElement(By.linkText("Tooltips")).getAttribute("title");
	  System.out.println(tooltip1);
	  String tooltip2 = driver.findElement(By.linkText("ThemeRoller")).getAttribute("title");
	  System.out.println(tooltip2);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");	
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/tooltip/"); 
		driver.manage().window().maximize();
  }

}
