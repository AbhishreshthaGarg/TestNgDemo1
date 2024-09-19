package com.Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void WebCarlogin() {
		System.out.println("WebCarlogin");
	}

//mobileCarlogin depends on WebCarLogin So webcarlogin will execute first. 
	@Test(dependsOnMethods = { "WebCarlogin" })
	public void MobileCarLogin() {
		System.out.println("MobileCarLogin");
	}

// If we dont want to run any method or method having bug in that so we use enable false at that time.
	@Test(enabled = false)

	public void AndroiCarLogin() {
		System.out.println("AndroiCarLogin");
	}

	@BeforeSuite

	public void BeforeSuit() {
		System.out.println("I am number 1");
	}

// we want want to run testcase of our choices then we make groups so that we can run only those testcases.
	@Test(groups = { "Smoke" })
	public void APiCarLogin() {
		System.out.println("APiCarLogin");
	}
}
