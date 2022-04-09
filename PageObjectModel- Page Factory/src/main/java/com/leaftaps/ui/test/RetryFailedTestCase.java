package com.leaftaps.ui.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCase implements IRetryAnalyzer {

	int retryCount=0;
	
	public boolean retry(ITestResult result) {
		if(retryCount<2) {
			retryCount++;
			return true;
		}
		else {
			return false;
		}
	}

}
