package TestNgapp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test
  public void App() {
	  System.out.println("Run testng");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Stop meeting");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Start the meeting");
  }

}
