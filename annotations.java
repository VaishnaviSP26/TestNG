package TestNG;
import org.testng.annotations.*;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class annotations {
		ChromeDriver driver = new ChromeDriver();
	 @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
	  }
	@Test
	public void launchweb() {
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
	}
  @Test
  public void logindetails() {
	  //this is test method here we can perform any test operations
	  //here im testing login function in test method
	  String name = "User01";
      String password = "Password1";
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  try
      {
          Thread.sleep(2000);
          driver.findElement(By.id("signin2")).click();
          Thread.sleep(2000);

          driver.findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys(name);
          Thread.sleep(2000);

          driver.findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys(password);
          Thread.sleep(2000);

          driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
          Thread.sleep(2000);

          wait.until(ExpectedConditions.alertIsPresent());
          //String alertMessage = driver.switchTo().alert().getText();
          driver.switchTo().alert().accept();
      }
      catch (InterruptedException e)
      {
          System.out.println("error");
      }
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}
