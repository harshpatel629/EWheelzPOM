package base.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogin {

	WebDriver driver;
	String userName;
	String password;

	public AdminLogin(WebDriver driver, String userName, String password) {

		this.driver = driver;
		this.userName = userName;
		this.password = password;
		PageFactory.initElements(driver, this);

	}

	public AdminLogin(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='Name']")
	WebElement userNameBox;

	@FindBy(xpath = "//input[@name='Pwd']")
	WebElement passwordBox;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButton;

	@FindBy(xpath = "//input[@type='reset']")
	WebElement resetButton;

	public WebElement getUserNameBox() {
		return userNameBox;
	}

	public WebElement getPasswordBox() {
		return passwordBox;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getResetButton() {
		return resetButton;
	}

	public void login() {
		
		userNameBox.sendKeys(userName);
		passwordBox.sendKeys(password);
		submitButton.click();
	}

	public void inputUserName(String username) {

		userNameBox.sendKeys(username);
	}

	public void inputPassword(String password) {

		passwordBox.sendKeys(password);
	}

	public void submitForm() {

		submitButton.click();
	}

	public void resetForm() {

		resetButton.click();
	}

}
