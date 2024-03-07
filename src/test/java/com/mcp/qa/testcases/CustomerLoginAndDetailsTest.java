package com.mcp.qa.testcases;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mcp.qa.base.TestBase;
import com.mcp.qa.pages.CustomerDashboardPage;


public class CustomerLoginAndDetailsTest extends TestBase {

    CustomerDashboardPage customerLoginPage;

    public CustomerLoginAndDetailsTest() {
	super();
    }

    @BeforeMethod
    public void setUp() {
	initialization();
	customerLoginPage = new CustomerDashboardPage();
    }

    @Test
    public void testCustomerLoginFlow() {
    	customerLoginPage.logincustomerinfo();

	
    }
}