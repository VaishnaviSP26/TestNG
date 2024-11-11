package TestNG;

import org.testng.ITestListener;
import org.testng.annotations.Test;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
  @Test
  public void onTestStart(ITestResult result) 
  {
	  System.out.print("started ");
  }
  
  public void onTestSuccess(ITestResult result) 
  {
	  System.out.print("success ");
  }
  
  public void onTestFailure(ITestResult result) 
  {
	  
	  System.out.print("failed ");
  }
}