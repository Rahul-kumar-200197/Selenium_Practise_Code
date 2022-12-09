package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Sample {
  @Test
  public void sunny() {
	  System.out.println("sunny");
  }
  @Test
  public void bunny() {
	  System.out.println("bunny");
  }
  @Test
  public void cunny() {
	  System.out.println("cunny");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

}
