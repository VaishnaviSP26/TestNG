package TestNG;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class Prority {
    
  @Test(priority=1)
  public void Partiallink() 
  {
	  try {
		  System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.demoblaze.com/index.html");
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  
		  //partial link text
          WebElement link = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Nokia")));
          link.click();
	  }
      catch (Exception e) {

          System.out.println("An error occurred: " + e.getMessage());
      }
  }
  
  @Test(priority=0)
  public void second() 
  {
	 try {
		 System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.demoblaze.com/index.html"); 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  //link text
         WebElement link2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Samsung galaxy s7")));
         link2.click();
      }
      catch (Exception e) {

          System.out.println("An error occurred: " + e.getMessage());
      }
  }
  
  @Test(priority=2)
  public void third() 
  {
	  assertEquals("Google","google"); // example to fail the test case
  }
}
