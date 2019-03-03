package com.testNGListeners;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.testNGListeners.ListenersTestDemo.class)

public class MyFirstTestCase 

{

@Test
public void  FailingtestCase()
{
	
int a=10;
Assert.assertEquals(a,20);

}
}
