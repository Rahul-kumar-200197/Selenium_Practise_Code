package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome_Language_Changes2 {
	
	public static WebDriver driver;
	
	public static void openUrl() {
		System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();		
	}
 
	  public static void hindi() {
		  driver.findElement(By.xpath("//div[@id='SIvCob']/a[1]")).click();
		  driver.findElement(By.linkText("English")).click();
		
	}
	  public static void bengali() {
		  driver.findElement(By.xpath("//div[@id='SIvCob']/a[2]")).click();
		  driver.findElement(By.linkText("English")).click();
		
	}	
	  public static void telugu() {
		  driver.findElement(By.xpath("//div[@id='SIvCob']/a[3]")).click();
		  driver.findElement(By.linkText("English")).click();
		
	}	
	  public static void marathi() {
		  driver.findElement(By.xpath("//div[@id='SIvCob']/a[4]")).click();
		  driver.findElement(By.linkText("English")).click();
		
	}	
	public static void main(String[] args) {
		openUrl();
		hindi();
	}

}
