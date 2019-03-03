package com.testng.examples;

import org.testng.annotations.Test;

public class PatientModule 

{

@Test(priority=2)
public void patientadd()
{
System.out.println("Patient Added in Hospital");	
}

@Test()

public void patientdiagnosis()
{
	System.out.println("Patient diagnosis with Maleria");	

}

}
