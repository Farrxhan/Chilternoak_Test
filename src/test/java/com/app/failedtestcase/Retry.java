package com.app.failedtestcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class Retry implements IRetryAnalyzer{

	int max_try=3;
	int count=0;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess()) {
			if(count<max_try) {
				count++;
				return true;
			}
		}
		return false;
	}
	

}
