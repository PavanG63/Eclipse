package TestNgapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test
  public void App() {
	  System.out.println("Run testng");
	  
	  WebDriver driver = new EdgeDriver();
	  String URL = "https://mail.rediff.com/cgi-bin/login.cgi";
	  driver.get(URL);
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
