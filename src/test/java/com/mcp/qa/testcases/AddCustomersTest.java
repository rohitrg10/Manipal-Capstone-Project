package com.mcp.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mcp.qa.base.TestBase;
import com.mcp.qa.pages.BankManagerDashboardPage;

public class AddCustomersTest extends TestBase{
	
	BankManagerDashboardPage manager;

    public AddCustomersTest() {
	super();
    }

    @BeforeMethod
    public void setUp() {
	initialization();
	manager = new BankManagerDashboardPage();

    }

    @Test (priority = 1)
    public void customerDetails() {

	manager.addCustomer(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("postcode"));

}
    @Test (priority = 2)
    public void invalidCustomerDetails() {

	manager.invalidCustomerDetails(prop.getProperty("firstnameinvalid"), prop.getProperty("lastnameinvalid"), prop.getProperty("postcodeinvalid"));

}
}
