package TestNG;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class ParallelExecution {
    
  @Test
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
          
          System.out.println("this is first execution and thread number is : "+Thread.currentThread().getId());
	  }
      catch (Exception e) {

          System.out.println("An error occurred: " + e.getMessage());
      }
  }
  
  @Test
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
         
         System.out.println("this is Second execution and thread number is : "+Thread.currentThread().getId());
      }
      catch (Exception e) {

          System.out.println("An error occurred: " + e.getMessage());
      }
  }
}
