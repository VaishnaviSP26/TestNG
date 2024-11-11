package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FailedTest {
  @Test(retryAnalyzer=Retest.class)
  public void f() {
	  ChromeDriver driver = new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
	  driver.get("https://www.google.com");
	  String title = driver.getTitle();
	  assertEquals(title,"google");
  }
}
