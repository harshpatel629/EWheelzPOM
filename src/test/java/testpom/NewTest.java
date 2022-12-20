package testpom;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.pageobjects.AdminLogin;
import base.pageobjects.Homepage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	WebDriver driver=null;
	SoftAssert softAssert;
  @Test
  public void TestAdminLogin() throws InterruptedException {
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  Homepage homepage = new Homepage(driver);
	  homepage.goToAdminLogin();
	  AdminLogin adminLogin = new AdminLogin(driver, "abc", "def");
	  adminLogin.login();
	  String actualURL = driver.getCurrentUrl();
	  String expectedURL = "http://localhost:8080/ewheelz2.0/Validate.jsp?Name=abc&Pwd=def";
	  
	  assertTrue(actualURL.equals(expectedURL));
  }
  
	  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  softAssert = new SoftAssert();
		
		//Installing Ruffle extension for enabling flash content on the webpage
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(".\\extensions\\Ruffle.crx"));

		driver = new ChromeDriver(options);
		driver.get("http://localhost:8080/ewheelz2.0/");
		driver.manage().window().maximize();
		
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
