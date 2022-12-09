package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Search_Cricketres_Wikipedia {

	public static WebDriver driver;
	 
	public static void openUrl(){
	System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");
	driver= new FirefoxDriver();
	driver.get("http://google.com");
	driver.manage().window().maximize();	
	}
	public static void search_Name() throws Exception {
		driver.findElement(By.name("q")).sendKeys("Mahendra singh dhoni");
		Thread.sleep(5000);
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).click();
	}
	
	
	public static void main(String[] args) throws Exception {
		openUrl();
		search_Name();

	}

}
