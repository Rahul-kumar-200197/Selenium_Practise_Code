package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HMS_PopUp_WindowHandles2 {
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
    	driver.findElement(By.linkText("Registration")).click();
    	driver.findElement(By.linkText("Perminent Registration")).click();		
	}
	public static void verifyPR() {
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");//selectByValue(null);//selectByIndex(2);
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Rahul");
		driver.findElement(By.name("LAST_NAME")).sendKeys("Kumar");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("123456");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("PAN Card");
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("MCA");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("A+");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Hindi");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");	
		
		
		
		driver.findElement(By.name("DOB")).sendKeys("01-01-1196");
		driver.findElement(By.name("AGE")).sendKeys("23");
		driver.findElement(By.name("ADDRESS1")).sendKeys("cghf");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("7903474536");
		driver.findElement(By.name("ZIP")).sendKeys("801506");		
		driver.findElement(By.name("image")).sendKeys("E:\\New folder (2)\\img.jpg");
		//driver.findElement(By.name("submit")).click();
		
	}
	public static void popUp() {
		driver.findElement(By.linkText("Feedback")).click();		
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows);
		Object[] s=windows.toArray();
		driver.switchTo().window((String) s[1]);    //(s[1].toString());
		driver.findElement(By.id("name")).sendKeys("Rahul");
		driver.findElement(By.id("email")).sendKeys("rky321@gmail.com");
		driver.findElement(By.id("message")).sendKeys("Hello world");
		driver.close();
		driver.switchTo().window(s[0].toString());
		driver.findElement(By.name("ADDRESS2")).sendKeys("patna1");
	}
	
	/* public static void verifyLogout() {
		driver.findElement(By.linkText("Logout")).click();
	}*/

	public static void main(String[] args) {
		openUrl();
		verifyLogin();
		PatientRegstartion();
		verifyPR();
		popUp();
		//verifyLogout();
		//MR_NO PR5640489703
	}

}
