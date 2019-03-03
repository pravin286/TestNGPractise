package com.testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExecution 
{

	@BeforeSuite// Always Execute first
	public void setSystemPropert()
	{
		
		System.out.println("Set Browser Property");
	}
	
	@BeforeClass//3
	public void enterURL()
		{
		
		System.out.println("Url Enter Corrected successfully");
	}
	
@Test
public void verifyHomePageTitle()
{
  System.out.println("Home page title verified Successfully");	

}
@BeforeTest()//2
public void openBrowser()
{
	System.out.println("Browser Open Successfully");
}
@AfterTest//8
public void closeBrowser()
{
System.out.println("Browser close Successfully");	
}

@BeforeMethod//4
public void userisOnHomePage()
{
System.out.println("User is on Home page");	
}

@AfterMethod//6
public void HomePagetestVerified()
{
	System.out.println("Home Page Test Completed Successfully");

}
@AfterClass//7
public void nobug()
{
System.out.println("No Bugs are found");	
}
@Test//5
public void verifyallLinksOnHomePage()
{
	System.out.println("Links Verified Successfully");
}

@AfterSuite//9
public void cleaBrowserrCookiesAndCatche()
{
System.out.println("Catche clear successfully");	

}


}