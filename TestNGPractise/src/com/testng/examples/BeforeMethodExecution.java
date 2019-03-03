package com.testng.examples;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodExecution 

{

@BeforeMethod
public void SetProperty()
{
  System.out.println("Browser opening");
  

}
@Test(groups={"smoke","regression"})
public void titletest()
{
  
	String name="manoj";
	Assert.assertEquals("manoj1", name);
	System.out.println("Title printed");	

}

@AfterMethod
public void closeBrowser()
{
  System.out.println("Browser gets closed");	
}

@Test(groups={"smoke"})
public void logtest()
{
	System.out.println("log executed");
	
					
	
	
}
}
