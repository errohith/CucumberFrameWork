package selenium.cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import selenium.cucumber.BaseClass.CucumberBaseClass;



public class LoginPage extends CucumberBaseClass {
	
	@Given("Enter Username as {string}")
	public LoginPage enterUsername(String LoginID) {
		getWait().until(ExpectedConditions.titleContains("Login"));
		getDriver().findElement(By.id("username")).sendKeys(LoginID);		
		return this;
	}
	@And("Enter Password as {string}")
	public LoginPage enterPassword(String Password) throws InterruptedException {
		Thread.sleep(1000);
		getDriver().findElement(By.id("password")).sendKeys(Password);
		return this;	
	}
	@And("Click Login Button")
	public HomePage clickLoginButton() throws InterruptedException {
		getWait().until(ExpectedConditions.elementToBeClickable(By.id("Login")));
		Thread.sleep(1000);
		getDriver().findElement(By.id("Login")).click();
		return new HomePage();
	}
	
}
