package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class HMS_Alerts_PopUp {

	public WebDriver driver;
	
	@Test(priority=0)
	public void verifyLogin() {
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
	}
	@Test(priority=1)
	public void PatientRegstartion() {
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Perminent Registration")).click();
	}
	@Test(priority=2)
	public void verifyPR() {
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");//selectByValue(null);//selectByIndex(2);
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
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

		driver.findElement(By.name("PNT_NAME")).sendKeys("Rahul");
		driver.findElement(By.name("LAST_NAME")).sendKeys("Kumar");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("123456");
		driver.findElement(By.name("DOB")).sendKeys("01-01-1196");
		driver.findElement(By.name("AGE")).sendKeys("23");
		driver.findElement(By.name("ADDRESS1")).sendKeys("cghf");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("7903474536");
		driver.findElement(By.name("ZIP")).sendKeys("801506");		
		driver.findElement(By.name("image")).sendKeys("E:\\New folder (2)\\img.jpg");
		driver.findElement(By.name("submit")).click();
	}
	@Test(priority=3)
	public void verifyAlert() {
	String str=driver.switchTo().alert().getText();
	System.out.println(str);
	driver.switchTo().alert().accept(); //.dismiss()
	}
	
	@BeforeTest
	public void beforeTest() {	 
		System.setProperty("webdriver.gecko.driver","F:\\Library\\geckodriver.exe");	
		driver=new FirefoxDriver();
		driver.get("http://seleniumbymahesh.com");
		driver.manage().window().maximize();
	}
}
