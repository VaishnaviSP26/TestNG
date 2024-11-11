package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class Retest implements IRetryAnalyzer{
	int retrycount=0;
	int maxcount=3;

public boolean retry(ITestResult result) {
	// TODO Auto-generated method stub
	if(retrycount < maxcount) {
		retrycount ++;
		return true;
	}
	return false;
}
}
