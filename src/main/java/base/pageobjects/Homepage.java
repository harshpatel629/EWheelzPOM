package base.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;

	public Homepage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//ruffle-embed[@src='button1.swf']")
	WebElement userLogin;

	@FindBy(xpath = "//ruffle-embed[@src='button2.swf']")
	WebElement adminLogin;

	public void goToUserLogin() {

		userLogin.click();
	}

	public WebElement getUserLogin() {
		return userLogin;
	}

	public WebElement getAdminLogin() {
		return adminLogin;
	}

	public void goToAdminLogin() throws InterruptedException {

		adminLogin.click();
		Thread.sleep(2000);
		adminLogin.click();
		adminLogin.click();

	}

	public void goBack() {

		driver.navigate().to("http://localhost:8080/ewheelz2.0/");
	}

}
