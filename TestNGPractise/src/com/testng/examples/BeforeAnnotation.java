package com.testng.examples;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAnnotation

{

@BeforeTest
public void add()
{
System.out.println("beforetest");	
}
	
	@BeforeMethod
public void openBrowser()
{
	System.out.println("open Browser");
}



@Test
public void test1()
{
  System.out.println("my test");	

}
@Test
public void test2()
{
  System.out.println("my test");	

}
@Test
public void test3()
{
  System.out.println("my test");	

}
@Test
public void test4()
{
  System.out.println("my test");	

}
@Test
public void test5()
{
System.out.println("my test");	
}


}
