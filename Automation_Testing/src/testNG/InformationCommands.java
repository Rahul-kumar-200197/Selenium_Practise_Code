package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class InformationCommands {
	
	public WebDriver driver;
	
	@Test
	public void f() {
		String str=driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(str);
		String str1=driver.findElement(By.name("btnI")).getAttribute("aria-label");
		System.out.println(str1);
		
		driver.navigate().to("http://spicejet.com"); 
		//driver.get("http://spicejet.com"); diiference b/w navigate.to() & get() 
		String str2=driver.findElement(By.cssSelector("div.css-76zvg2.r-c20mna.r-n6v787.r-1kfrs79.r-1n0xq6e")).getText();
		System.out.println(str2); 
	}
	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");	
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}

}
