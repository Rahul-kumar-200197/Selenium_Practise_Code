package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login_Logout2 {
	
	public static WebDriver driver;
	
	public static void openUrl() {
		System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();		
	}
 
	  public static void verfyLogin() {
		 driver.findElement(By.id("identifierId")).sendKeys("rky239371");
		 driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
	}
	
	
	public static void main(String[] args) {
		openUrl();
		verfyLogin();
	}

}
