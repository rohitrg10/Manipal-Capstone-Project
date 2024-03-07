package com.mcp.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mcp.qa.base.TestBase;
import com.mcp.qa.pages.BankManagerDashboardPage;

public class OpenAccountTest extends TestBase {
	
	BankManagerDashboardPage manager;

    public OpenAccountTest() {
	super();
    }

    @BeforeMethod
    public void setUp() {
	initialization();
	manager = new BankManagerDashboardPage();

    }

    @Test (priority = 1)
    public void managertest() {

	manager.openAccount(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("postcode"));

}

}
