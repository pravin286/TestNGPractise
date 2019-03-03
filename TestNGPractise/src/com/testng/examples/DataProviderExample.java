package com.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample 

{
    public WebDriver driver;
@BeforeMethod
public void setup()
{
	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");

}
	
	
@Test(dataProvider="getdata")
public void dataTest(String uname, String upass)
{
	
driver.findElement(By.id("email")).sendKeys(uname);
System.out.println(uname);

driver.findElement(By.id("pass")).sendKeys(upass);
System.out.println(upass);
		}
	
@DataProvider
public Object[][] getdata()
{
Object[][] data=new Object[3][2];
data[0][0]="pravinpatil";
data[0][1]="admin@123";

data[1][0]="sameerpatil";
data[1][1]="sam123";

data[2][0]="rahul";
data[2][1]="rahul@123";
return data;

}

@AfterMethod
public void tearDown() throws InterruptedException
{
  Thread.sleep(3000);
	driver.close();	

}




}
