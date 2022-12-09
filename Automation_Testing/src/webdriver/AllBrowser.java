package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowser {
	
	public void ff() {
		System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");		
	   WebDriver driver=new FirefoxDriver();
	   driver.get("http://spicejet.com");
	} 
	/*public void chrome() {
		System.setProperty("webdriver.chrome.driver","F:\\Library\\chromedriver.exe");		
	   WebDriver driver=new ChromeDriver();
	   driver.get("http://google.com");
	   driver.manage().window().maximize();
	} */
	public void ie() {
		System.setProperty("webdriver.ie.driver","F:\\Library\\IEDriverServer.exe");	
	WebDriver driver= new InternetExplorerDriver();	
	driver.get("http://facebook.com");
	driver.manage().window().maximize();
	}	
	
	public static void main(String[] args) {
		AllBrowser a=new AllBrowser();
		a.ff();
		//a.chrome();
		a.ie();
	}
}
