package com.mcp.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mcp.qa.base.TestBase;
import com.mcp.qa.pages.HomeAndNavigationPage;

public class HomeAndNavigationTest extends TestBase {
	HomeAndNavigationPage homepage;

	public HomeAndNavigationTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homepage = new HomeAndNavigationPage();
	}

	@Test
	public void Homepagefun() {
		homepage.Homepagefunction();

	}
}