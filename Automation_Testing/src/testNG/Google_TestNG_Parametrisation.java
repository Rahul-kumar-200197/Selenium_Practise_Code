package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Google_TestNG_Parametrisation {
	
	public  WebDriver driver;
	
	public void clickLinks(String link) {
		driver.findElement(By.xpath(link)).click();
		driver.findElement(By.linkText("English")).click();
	}
  @Test
  public void googleLanguages() {
	clickLinks("//div[@id='SIvCob']/a[1]");
	clickLinks("//div[@id='SIvCob']/a[2]");
	clickLinks("//div[@id='SIvCob']/a[3]");
	clickLinks("//div[@id='SIvCob']/a[4]");
  }
  @BeforeTest
  public void beforeTest() {	
	System.out.println("openUrl");
    System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
  }
}
