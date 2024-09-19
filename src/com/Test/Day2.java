package com.Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@AfterTest
	public void Third() {
		System.out.println("BYeee");
	}
	
	@BeforeTest
	
	public void preRequisite()
	{
		System.out.println("Execute First");
	}
	
	@Test(groups = { "Smoke" })
	public void Second()
	{
		System.out.println("Hey");
	}
}
