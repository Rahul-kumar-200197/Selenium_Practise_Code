package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowserWithStactic {

	public static WebDriver driver;

	public static void ff() { 
		System.setProperty("webdriver.gecko.driver", "F:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http:\\spicejet.com");
		driver.manage().window().maximize();
	}
	public static void chrome() {
	   System.setProperty("webdriver.chrome.driver","F:\\Library\\chromedriver.exe");		
       driver=new ChromeDriver();
       driver.get("http://google.com");
       driver.manage().window().maximize();
   } 
	public static void IE() { 
		System.setProperty("webdriver.ie.driver","F:\\Library\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	}	

	public static void main(String[] args) {
		ff();
		//chrome();
		IE();

	}

}
