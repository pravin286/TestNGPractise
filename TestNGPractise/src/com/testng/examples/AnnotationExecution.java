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

//Note- BeforeMethod and AfterMethod always Executed grouping   with @Test See the output


public class AnnotationExecution 
{

	@BeforeSuite// Always Execute first
	public void setSystemPropert()
	{
		
		System.out.println("Before Suite Executed First--1");
	}
	
	@BeforeClass//3
	public void enterURL()
		{
		
		System.out.println("BeforeClass Executed--3");
	}
	
@Test
public void verifyHomePageTitle()
{
  System.out.println("Test Executed--5");	

}
@BeforeTest
public void openBrowser()
{
	System.out.println("BeforeTest Executed Second--2");
}
@AfterTest//8
public void closeBrowser()
{
System.out.println("AfterTest Executed --8 ");	
}

@BeforeMethod//4
public void userisOnHomePage()
{
System.out.println("BeforeMethod Executed --4");	
}

@AfterMethod//6
public void HomePagetestVerified()
{
	System.out.println("After Method Executed--6 ");

}
@AfterClass//7
public void nobug()
{
System.out.println("After class Executed ---7");	
}
@Test//5
public void verifyallLinksOnHomePage()
{
	System.out.println("Test Executed--5");
}

@AfterSuite//9
public void cleaBrowserrCookiesAndCatche()
{
System.out.println("AfterSuite Exrcuted--8");	

}


}