package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook_Login_Code2 {
	
	public static WebDriver driver;
	
	public static void openUrl() {
		System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();		
	}
 
	  public static void verfyLogin() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rky2393");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc@123");	
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}	
	public static void main(String[] args) {
		openUrl();
		verfyLogin();
	}

}
