package com.testng.examples;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority=2)
	public void add()
	{
		
		int a=10;
		int b=20;
		System.out.println("Addition of and b is"+ ""+(a+b));
		}
	
	@Test(priority=-1)
	public void  sub()
	{
		int a=20;
		int b=10;
		System.out.println("Substraction of and b is "+ " "+(a-b));
		
	}
	
	@Test(priority=1)
	public void mutiplication()
	{
		int a=10;
		int b=20;
		System.out.println("Multiplication is"+" "+(a*b));
		
	}
@Test(priority=3)
public void div()
{
  System.out.println("This is Div test");	
}

}
