package com.mcp.qa.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mcp.qa.base.TestBase;

public class BankManagerDashboardPage extends TestBase {

	@FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
	WebElement managerloginbuttonn;

	@FindBy(xpath = "//button[contains(text(),'Add Customer')]")
	WebElement addcustomerbutton;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstname;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastname;

	@FindBy(xpath = "//input[@placeholder='Post Code']")
	WebElement postcode;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitbutton;

	@FindBy(xpath = "//button[contains(text(),'Open Account')]")
	WebElement openaccountbutton;

	@FindBy(xpath = "//button[normalize-space()='Process']")
	WebElement processbutton;

	@FindBy(xpath = "(//select[@id='userSelect'])[1]")
	WebElement dropdown;

	@FindBy(xpath = "//select[@id='currency']")
	WebElement dropdown2;

	@FindBy(xpath = "//button[normalize-space()='Customers']")
	WebElement customersbutton;

	@FindBy(xpath = "//input[@placeholder='Search Customer']")
	WebElement searchbox;

	@FindBy(xpath = " (//button[normalize-space()='Delete'])[1]")
	WebElement deletebutton;

	@FindBy(xpath = "//button[normalize-space()='Home']")
	WebElement homebutton;

	public BankManagerDashboardPage() {
		PageFactory.initElements(driver, this);
	}

	public void addCustomer(String fname, String lname, String postc) {

		WebElement visiblemanagerLoginbtn = waitForElementToBeVisible(managerloginbuttonn);
		visiblemanagerLoginbtn.click();
		System.out.println("Manager Login Button is Clicked");

		WebElement visibleaddCustomer = waitForElementToBeVisible(addcustomerbutton);
		visibleaddCustomer.click();
		System.out.println("Add Customer Button is Clicked");

		firstname.sendKeys(fname);
		System.out.println("First Name : Rohit is Added in the field");

		lastname.sendKeys(lname);
		System.out.println("Last Name : RG is Added in the field");

		postcode.sendKeys(postc);
		System.out.println("Post Code : 585105 is Added in the field");

		submitbutton.click();
		System.out.println("Submit Button is Clicked");

		Alert alt = driver.switchTo().alert();
		String altertext1 = alt.getText();
		alt.accept();
		System.out.println(altertext1);

		driver.quit();
	}

	public void openAccount(String fname, String lname, String postc) {
		WebElement visiblemanagerLoginbtn = waitForElementToBeVisible(managerloginbuttonn);
		visiblemanagerLoginbtn.click();
		System.out.println("Manager Login Button is Clicked");

		WebElement visibleaddCustomer = waitForElementToBeVisible(addcustomerbutton);
		visibleaddCustomer.click();
		System.out.println("Add Customer Button is Clicked");

		firstname.sendKeys(fname);
		System.out.println("First Name : Rohit is Added in the field");

		lastname.sendKeys(lname);
		System.out.println("Last Name : RG is Added in the field");

		postcode.sendKeys(postc);
		System.out.println("Post Code : 585105 is Added in the field");

		submitbutton.click();
		System.out.println("Submit Button is Clicked");

		Alert alt = driver.switchTo().alert();
		String altertext1 = alt.getText();
		alt.accept();
		System.out.println(altertext1);

		WebElement visibleopenaccount = waitForElementToBeVisible(openaccountbutton);
		visibleopenaccount.click();
		System.out.println("Open Account Button is Clicked");

		WebElement visibledropdown = waitForElementToBeVisible(dropdown);
		Select sel = new Select(visibledropdown);

		for (int index = 0; index < 7; index++) {
			sel.selectByIndex(index);
			System.out.println("Rohit RG is Selected from the Customer DropDown Menu");
		}

		WebElement visibledropdown2 = waitForElementToBeVisible(dropdown2);
		Select sel2 = new Select(visibledropdown2);

		for (int index = 0; index < 4; index++) {
			sel2.selectByIndex(index);
			System.out.println("Rupee is Selected from the Currency DropDown Menu");
		}

		processbutton.click();
		System.out.println("Process Button is Clicked");

		String altertext2 = alt.getText();
		alt.accept();
		System.out.println(altertext2);

		driver.quit();
	}

	public void customerInfo(String fname, String lname, String postc) {
		WebElement visiblemanagerLoginbtn = waitForElementToBeVisible(managerloginbuttonn);
		visiblemanagerLoginbtn.click();
		System.out.println("Manager Login Button is Clicked");

		WebElement visibleaddCustomer = waitForElementToBeVisible(addcustomerbutton);
		visibleaddCustomer.click();
		System.out.println("Add Customer Button is Clicked");

		firstname.sendKeys(fname);
		System.out.println("First Name : Rohit is Added in the field");

		lastname.sendKeys(lname);
		System.out.println("Last Name : RG is Added in the field");

		postcode.sendKeys(postc);
		System.out.println("Post Code : 585105 is Added in the field");

		submitbutton.click();
		System.out.println("Submit Button is Clicked");

		Alert alt = driver.switchTo().alert();
		String altertext1 = alt.getText();
		alt.accept();
		System.out.println(altertext1);

		WebElement visibleopenaccount = waitForElementToBeVisible(openaccountbutton);
		visibleopenaccount.click();
		System.out.println("Open Account Button is Clicked");

		WebElement visibledropdown = waitForElementToBeVisible(dropdown);
		Select sel = new Select(visibledropdown);

		for (int index = 0; index < 7; index++) {
			sel.selectByIndex(index);
			System.out.println("Rohit RG is Selected from the Customer DropDown Menu");
		}

		WebElement visibledropdown2 = waitForElementToBeVisible(dropdown2);
		Select sel2 = new Select(visibledropdown2);

		for (int index = 0; index < 4; index++) {
			sel2.selectByIndex(index);
			System.out.println("Rupee is Selected from the Currency DropDown Menu");
		}

		processbutton.click();
		System.out.println("Process Button is Clicked");

		String altertext2 = alt.getText();
		alt.accept();
		System.out.println(altertext2);

		WebElement visiblecustomersbtn = waitForElementToBeVisible(customersbutton);
		visiblecustomersbtn.click();
		System.out.println("Customers Button is Clicked");

		searchbox.sendKeys(fname);
		System.out.println("Rohit is Added in the Search Box");

		WebElement visibledelbtn = waitForElementToBeVisible(deletebutton);
		visibledelbtn.click();
		System.out.println("Rohit RG is Deleted from the Customer Records");

		homebutton.click();
		System.out.println("Home Button is Clicked and Navigated to the Home Page");

		driver.quit();

	}

	public void invalidCustomerDetails(String fname, String lname, String postc) {
		WebElement visiblemanagerLoginbtn = waitForElementToBeVisible(managerloginbuttonn);
		visiblemanagerLoginbtn.click();
		System.out.println("Manager Login Button is Clicked");

		WebElement visibleaddCustomer = waitForElementToBeVisible(addcustomerbutton);
		visibleaddCustomer.click();
		System.out.println("Add Customer Button is Clicked");

		firstname.sendKeys(fname);
		System.out.println("First Name : Raj56@#$%^ is Added in the field");

		lastname.sendKeys(lname);
		System.out.println("Last Name : (*&^Kapoor is Added in the field");

		postcode.sendKeys(postc);
		System.out.println("Post Code : @#%^XYZA is Added in the field");

		submitbutton.click();
		System.out.println("Submit Button is Clicked");

		Alert alt = driver.switchTo().alert();
		String altertext1 = alt.getText();
		alt.accept();
		System.out.println(altertext1);

		driver.quit();

	}

	public void existing(String fname) {
		WebElement visiblemanagerLoginbtn = waitForElementToBeVisible(managerloginbuttonn);
		visiblemanagerLoginbtn.click();
		System.out.println("Manager Login Button is Clicked");

		WebElement visibleopenaccount = waitForElementToBeVisible(openaccountbutton);
		visibleopenaccount.click();
		System.out.println("Open Account Button is Clicked");

		WebElement visibledropdown = waitForElementToBeVisible(dropdown);
		Select sel = new Select(visibledropdown);

		for (int index = 0; index < 2; index++) {
			sel.selectByIndex(index);
			System.out.println("Hermoine Granger Selected from the Customer DropDown Menu");
		}

		WebElement visibledropdown2 = waitForElementToBeVisible(dropdown2);
		Select sel2 = new Select(visibledropdown2);

		for (int index = 0; index < 4; index++) {
			sel2.selectByIndex(index);
			System.out.println("Rupee Selected from the Currency DropDown Menu");
		}

		processbutton.click();
		Alert alt = driver.switchTo().alert();
		String altertext2 = alt.getText();
		alt.accept();
		System.out.println(altertext2);
		WebElement visiblecustomersbtn = waitForElementToBeVisible(customersbutton);
		visiblecustomersbtn.click();
		System.out.println("Customers Button is Clicked");

		searchbox.sendKeys(fname);
		System.out.println("Hermoine is Added in the Search Box");

		homebutton.click();
		System.out.println("Home Button is Clicked and the User Navigated to the Home Page");

		driver.quit();
	}

	protected WebElement waitForElementToBeVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
}