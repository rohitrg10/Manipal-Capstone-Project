package com.mcp.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mcp.qa.base.TestBase;
import com.mcp.qa.pages.CustomerDashboardPage;


public class DepositAndWithdrawalTest extends TestBase {
	CustomerDashboardPage customerLoginPage;

    public DepositAndWithdrawalTest() {
	super();
    }

    @BeforeMethod
    public void setUp() {
	initialization();
	customerLoginPage = new CustomerDashboardPage();
    }

    @Test
    public void testCustomerLoginFlow() {
    	customerLoginPage.depositwithdrawal(prop.getProperty("deposit1"),prop.getProperty("deposit2"),prop.getProperty("deposit3"),prop.getProperty("deposit4"),prop.getProperty("deposit5"),
    	    	prop.getProperty("withdrawal1"),prop.getProperty("withdrawal2"),prop.getProperty("withdrawal3"),prop.getProperty("withdrawal4"),prop.getProperty("withdrawal5"),prop.getProperty("withdrawal6"));
	
    }

}