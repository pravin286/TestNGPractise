package com.testng.examples;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssert 

{

@Test
public void hardAssertion()
{
String name="pravin";
//String Fname="patil";
assertEquals(name,"pravins123");
System.out.println("Proceed to next step");

}
@Test
public void softAssertion()
{
	
	String name="pravin";
	String lname="patil";
	SoftAssert s1= new SoftAssert();
	
	
	s1.assertEquals(name, "patil");
  System.out.println("Able to proceed next step");
  s1.assertEquals(name, "pravin");
  System.out.println("Able to proceed next step");

  s1.assertEquals(lname,"pravin");
  System.out.println("Able to proceed next step");

  s1.assertAll();
}


}
