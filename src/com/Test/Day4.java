package com.Test;

import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void Webloginhome() {
		System.out.println("Webloginhome");
	}

// It will wait for 2000ms
	@Test(timeOut = 3000)
	public void MobileLoginhome() {
		System.out.println("MobileLoginhome");
	}

	@Test(groups = { "Smoke" })
	public void APiLoginhome() {
		System.out.println("APiLoginhome");
	}
}
