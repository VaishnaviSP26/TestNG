package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleSuites {
  @Test
  public void webpage() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
  }
}
