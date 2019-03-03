package com.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestExecution 
{
WebDriver driver;
@Parameters("myBrowser")
@BeforeMethod
	public void openBrowser(String myBrowser)
	{
	if(myBrowser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		
		driver=new ChromeDriver();
		}
	else if(myBrowser.equalsIgnoreCase("firefox"))
		{
		
		System.setProperty("webdriver.gecko.driver","D://geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	
	}
	
	
	@Test(priority=0)
public void test_case_1()
{
	
driver.get("http://www.google.com");
driver.findElement(By.name("q")).sendKeys("Selenium");


}
@Test(priority=1)
public void testcase_2()
{
System.out.println("Second Test Case");	
}
@AfterMethod
public void closeBrowser()
{
 driver.close();
}

}