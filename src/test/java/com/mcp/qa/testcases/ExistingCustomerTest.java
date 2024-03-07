package com.mcp.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mcp.qa.base.TestBase;
import com.mcp.qa.pages.BankManagerDashboardPage;

public class ExistingCustomerTest extends TestBase {
	
	BankManagerDashboardPage manager;
	
	public ExistingCustomerTest() {
		super();
	    }
	
	 @BeforeMethod
	    public void setUp() {
		initialization();
		manager = new BankManagerDashboardPage();

	    }
	 
	@Test
	public void existingtest() {
		  manager.existing(prop.getProperty("AccontExistUser")); 
		  
	}

}
