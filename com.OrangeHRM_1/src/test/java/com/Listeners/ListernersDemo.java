package com.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.opentelemetry.context.Context;

public class ListernersDemo implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Case"+result.getName()+"started");
		
	}
	public void onTestSuccess(ITestResult result)
	{
		
		System.out.println("Test Case"+result.getName()+"Passed");
	}
	public void onTestFailure(ITestResult result)
	{
		
		System.out.println("Test Case"+result.getName()+"Failed");
	}
	public void onTestSikpped(ITestResult result)
	{
		
		System.out.println("Test Case"+result.getName()+"Sikpped");
	}
	public void onStart(ITestContext context)
	{
		System.out.println("Test "+context.getName()+"started");
		
	}
	public void onFinish(ITestContext context)
	{
		
		System.out.println("Test "+context.getName()+"finished");
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
		
	}

}
