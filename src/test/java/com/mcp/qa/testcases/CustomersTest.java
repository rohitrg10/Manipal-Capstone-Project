package com.mcp.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mcp.qa.base.TestBase;
import com.mcp.qa.pages.BankManagerDashboardPage;

public class CustomersTest extends TestBase{
	
	BankManagerDashboardPage manager;

    public CustomersTest() {
	super();
    }

    @BeforeMethod
    public void setUp() {
	initialization();
	manager = new BankManagerDashboardPage();

    }

    @Test (priority = 1)
    public void managertest() {

	manager.customerInfo(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("postcode"));

}
}
