package com.mcp.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.mcp.qa.base.TestBase;

public class CustomerDashboardPage extends TestBase {

	@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
	WebElement customerLoginButton;

	@FindBy(xpath = "//button[normalize-space()='Home']")
	WebElement homeButton;

	@FindBy(xpath = "//select[@id='userSelect']")
	WebElement userlistDDM;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginbtn;

	@FindBy(xpath = "//select[@id='accountSelect']")
	WebElement accSelDDM;

	@FindBy(xpath = "//button[normalize-space()='Deposit']")
	WebElement depositBtn;

	@FindBy(xpath = "//button[normalize-space()='Withdrawl']")
	WebElement withdrawalBtn;

	@FindBy(xpath = "//button[normalize-space()='Transactions']")
	WebElement transactionsBtn;

	@FindBy(xpath = "//input[@placeholder='amount']")
	WebElement inputDeposit;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement depositSubmitBtn;

	@FindBy(xpath = "//input[@placeholder='amount']")
	WebElement inputWithdraw;

	@FindBy(xpath = "//button[normalize-space()='Withdraw']")
	WebElement withdrawSubmitBtn;

	@FindBy(xpath = "//button[normalize-space()='Withdraw']")
	WebElement arrowBtn;

	@FindBy(xpath = "//button[normalize-space()='Reset']")
	WebElement resetBtn;

	@FindBy(xpath = "//strong[normalize-space()='1003']")
	WebElement accNumber;

	@FindBy(xpath = "//strong[normalize-space()='0']")
	WebElement accBalance;

	@FindBy(xpath = "//button[normalize-space()='Back']")
	WebElement backBtn;

	@FindBy(xpath = "//input[@id='start']")
	WebElement dateBtn1;

	@FindBy(xpath = "//input[@id='end']")
	WebElement dateBtn2;

	@FindBy(xpath = "//span[contains(text(),'Hermoine Granger')]")
	WebElement text;

	@FindBy(xpath = "(//strong[normalize-space()='Rupee'])[1]")
	WebElement currency;

	@FindBy(xpath = "//button[contains(text(),'Logout')]")
	WebElement Logout;

	public CustomerDashboardPage() {
		PageFactory.initElements(driver, this);
	}

	public void logincustomerinfo() {

		waitForElementToBeVisible(customerLoginButton).click();
		System.out.println("Clicked on Customer Login Button on Home Page and the User is Navigated to the Login Page");

		WebElement visibleuserlistDDM = waitForElementToBeVisible(userlistDDM);
		Select sel = new Select(visibleuserlistDDM);
		for (int index = 0; index < 2; index++) {
			sel.selectByIndex(index);
			System.out.println("User Name is Selected from the DropDown Menu");
		}

		waitForElementToBeVisible(loginbtn).click();
		System.out.println("Clicked on Login Button on Login Page and the User is Navigated to the Customer Dashboard Page");

		WebElement visibleaccSelDDM = waitForElementToBeVisible(accSelDDM);

		Select sel2 = new Select(visibleaccSelDDM);
		for (int index = 0; index < 3; index++) {
			sel2.selectByIndex(index);

			System.out.println("User's Account Number is Selected from the DropDown Menu");

		}
		String S1 = accNumber.getText();
		String S2 = accBalance.getText();
		String S3 = text.getText();
		String S4 = currency.getText();

		Assert.assertEquals(S1, "1003", "Account Number is WRONG.");
		System.out.println("Actual Account Number is : 1003");

		Assert.assertEquals(S2, "0", "Account Balance is WRONG.");
		System.out.println("Actual Account Balance is : 0");

		Assert.assertEquals(S3, "Hermoine Granger", "Customer Name is Wrong");
		System.out.println("Customer Name matched : Hermoine Granger");

		Assert.assertEquals(S4, "Rupee", "Account currency is Wrong");
		System.out.println("Account Currency is Matched : Rupee");
		driver.quit();
	}

	public void depositwithdrawal(String am1, String am2, String am3, String am4, String am5, String wd1, String wd2,
			String wd3, String wd4, String wd5, String wd6) {
		waitForElementToBeVisible(customerLoginButton).click();

		WebElement visibleuserlistDDM = waitForElementToBeVisible(userlistDDM);
		Select sel = new Select(visibleuserlistDDM);
		for (int index = 0; index < 2; index++) {
			sel.selectByIndex(index);
			System.out.println("User Name is Selected from the DropDown Menu");
		}

		waitForElementToBeVisible(loginbtn).click();
		System.out.println("Clicked on Login Button on Login Page and the User is Navigated to the Customer Dashboard Page");

		WebElement visibleaccSelDDM = waitForElementToBeVisible(accSelDDM);

		Select sel2 = new Select(visibleaccSelDDM);
		for (int index = 0; index < 3; index++) {
			sel2.selectByIndex(index);

			System.out.println("User's Account Number is Selected from the DropDown Menu");

		}
		String S1 = accNumber.getText();
		String S2 = accBalance.getText();
		String S3 = text.getText();
		String S4 = currency.getText();

		Assert.assertEquals(S1, "1003", "Account Number is WRONG.");
		System.out.println("Actual Account Number is : 1003");

		Assert.assertEquals(S2, "0", "Account Balance is WRONG.");
		System.out.println("Actual Account Balance is : 0");

		Assert.assertEquals(S3, "Hermoine Granger", "Customer Name is Wrong");
		System.out.println("Customer Name Matched : Hermoine Granger");

		Assert.assertEquals(S4, "Rupee", "Account currency is Wrong");
		System.out.println("Account Currency Matched : Rupee");

		String[] amounts = { am1, am2, am3, am4, am5 };

		// Loop to iterate through the amounts array
		for (String amount : amounts) {
			WebElement visibledeposit = waitForElementToBeVisible(depositBtn);
			visibledeposit.click();
			System.out.println("Add Customer Button is Clicked :");

			inputDeposit.sendKeys(String.valueOf(amount));
			depositSubmitBtn.click();
			System.out.println(amount + "  is Deposited Successfully");
		}

		String[] withdrawalAmounts = { wd1, wd2, wd3, wd4, wd5, wd6 };

		// Loop to iterate through the withdrawalAmounts array
		for (String amount : withdrawalAmounts) {
			WebElement visiblewithdrawal = waitForElementToBeVisible(withdrawalBtn);
			visiblewithdrawal.click();
			System.out.println("Add Customer Button is Clicked :");

			inputWithdraw.sendKeys(amount);
			withdrawSubmitBtn.click();
			System.out.println(amount + "  is Withdrawn Successfully");
		}

		driver.quit();
	}

	public void transactionsflow(String am1, String am2, String am3, String am4, String am5, String wd1, String wd2,
			String wd3, String wd4, String wd5, String wd6) {
		waitForElementToBeVisible(customerLoginButton).click();

		WebElement visibleuserlistDDM = waitForElementToBeVisible(userlistDDM);
		Select sel = new Select(visibleuserlistDDM);
		for (int index = 0; index < 2; index++) {
			sel.selectByIndex(index);
			System.out.println("User Name is Selected from the DropDown Menu");
		}

		waitForElementToBeVisible(loginbtn).click();
		System.out.println("Clicked on Login Button on Login Page and the User is Navigated to the Customer Dashboard Page");

		WebElement visibleaccSelDDM = waitForElementToBeVisible(accSelDDM);

		Select sel2 = new Select(visibleaccSelDDM);
		for (int index = 0; index < 3; index++) {
			sel2.selectByIndex(index);

			System.out.println("User's Account Number is Selected from the DropDown Menu");

		}
		String S1 = accNumber.getText();
		String S2 = accBalance.getText();
		String S3 = text.getText();
		String S4 = currency.getText();

		Assert.assertEquals(S1, "1003", "Account Number is WRONG.");
		System.out.println("Actual Account Number is : 1003");

		Assert.assertEquals(S2, "0", "Account Balance is WRONG.");
		System.out.println("Actual Account Balance is : 0");

		Assert.assertEquals(S3, "Hermoine Granger", "Customer Name is Wrong");
		System.out.println("Customer Name Matched : Hermoine Granger");

		Assert.assertEquals(S4, "Rupee", "Account currency is Wrong");
		System.out.println("Account Currency Matched : Rupee");

		String[] amounts = { am1, am2, am3, am4, am5 };

		// Loop to iterate through the amounts array
		for (String amount : amounts) {
			WebElement visibledeposit = waitForElementToBeVisible(depositBtn);
			visibledeposit.click();
			System.out.println("Add Customer Button is Clicked :");

			inputDeposit.sendKeys(String.valueOf(amount));
			depositSubmitBtn.click();
			System.out.println(amount + "  is Deposited Successfully");
			
		}

		String[] withdrawalAmounts = { wd1, wd2, wd3, wd4, wd5, wd6 };

		// Loop to iterate through the withdrawalAmounts array
		for (String amount : withdrawalAmounts) {
			WebElement visiblewithdrawal = waitForElementToBeVisible(withdrawalBtn);
			visiblewithdrawal.click();
			System.out.println("Add Customer Button is Clicked :");

			inputWithdraw.sendKeys(amount);
			withdrawSubmitBtn.click();
			System.out.println(amount + "  is Withdrawn Successfully");
		}
		waitForElementToBeVisible(transactionsBtn).click();
		System.out.println("Transaction Button is Clicked");
		
		waitForElementToBeVisible(arrowBtn).click();
		System.out.println("Forward(>) Button is Clicked");
		
		waitForElementToBeVisible(backBtn).click();
		System.out.println("Back Button is Clicked");

		waitForElementToBeVisible(transactionsBtn).click();
		System.out.println("Transaction Button is Clicked");
		
		waitForElementToBeVisible(dateBtn1).click();
		System.out.println("Clicked on Date Picker 1");
		
		waitForElementToBeVisible(dateBtn2).click();
		System.out.println("Clicked on Date Picker 2");
		
		waitForElementToBeVisible(resetBtn).click();
		System.out.println("Clicked on Reset Button");
		
		waitForElementToBeVisible(backBtn).click();
		System.out.println("Clicked on Back Button");
		
		waitForElementToBeVisible(Logout).click();
		System.out.println("Clicked on Logout Button and the user is Navigated to the login Page");
		
		
		driver.quit();

	}

	private WebElement waitForElementToBeVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
}