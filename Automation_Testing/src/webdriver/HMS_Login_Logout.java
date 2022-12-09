package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HMS_Login_Logout {
	public static WebDriver driver;
	
	public static void openUrl() {
	 System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");	
	 driver=new FirefoxDriver();
	 driver.get("http://seleniumbymahesh.com");
	 driver.manage().window().maximize();
	}
	public static void verifyLogin() {
	driver.findElement(By.linkText("HMS")).click();
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin");
	 driver.findElement(By.name("submit")).click();
	//OR
	//driver.findElement(By.className("log")).click();
	}
	public static void PatientRegstartion() {
		
	}	
	/* public static void verifyLogout() {
		driver.findElement(By.linkText("Logout")).click();
	}
*/
	public static void main(String[] args) {
		openUrl();
		verifyLogin();
		//verifyLogout();
	}

}
