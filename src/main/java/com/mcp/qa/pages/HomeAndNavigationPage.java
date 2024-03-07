package com.mcp.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.mcp.qa.base.TestBase;

public class HomeAndNavigationPage extends TestBase {

	@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
	WebElement customerLoginButton;

	@FindBy(xpath = "//button[normalize-space()='Home']")
	WebElement homeButton;

	@FindBy(xpath = "(//button[normalize-space()='Bank Manager Login'])[1]")
	WebElement BankManagerBtn;

	public HomeAndNavigationPage() {
		PageFactory.initElements(driver, this);
	}

	public void Homepagefunction() {

		String title = driver.getTitle();
		Assert.assertEquals(title, "XYZ Bank", "The Bank's Title is Wrong");
		System.out.println("Title is Matched : XYZ Bank");

		waitForElementToBeVisible(customerLoginButton).click();
		System.out.println("Clicked on Customer Login Button on Home Page and the User is Navigated to the Login Page");
		
		waitForElementToBeVisible(homeButton).click();
		System.out.println("Clicked on Home Button on Login Page and the User is Navigated back to the Home Page");
		
		waitForElementToBeVisible(BankManagerBtn).click();
		System.out.println("Clicked on Bank Manager Login Button on Home Page and the User is Navigated to the Manager's Dashboard Page");
		
		waitForElementToBeVisible(homeButton).click();
		System.out.println("Clicked on Home Button on Manager's Dashboard Page and the User is Navigated back to the Home Page");
		
		
		driver.quit();

	}

	private WebElement waitForElementToBeVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
}