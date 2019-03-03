package com.testng.examples;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCases 

{

@Test()
public void addition()
{
	int a=10;
	int b=20;
	System.out.println((a+b));
}

@Test(priority=1)
public void substraction()
{
    int a=10;
    int b=20;
	
	System.out.println((b-a));	
	
	throw new SkipException("exception");
	
	
}
@Test
public void failingTestCase()
{
 Assert.assertTrue(true);	
}
}

