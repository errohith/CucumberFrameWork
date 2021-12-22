package selenium.cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.And;
import selenium.cucumber.BaseClass.CucumberBaseClass;

public class SalesPage extends CucumberBaseClass {
	
	
	public SalesPage clickMore() {
		getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='More']")));
		getJSExecutor().executeScript("arguments[0].click();",getDriver().findElement(By.xpath("//span[text()='More']"))); 
		return this;
	}
	public CasesPage selectCaseFromDropDown() {
		getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'slds-dropdown')]//span[text()='Cases']")));
		getJSExecutor().executeScript("arguments[0].click();",getDriver().findElement(By.xpath("//div[contains(@class,'slds-dropdown')]//span[text()='Cases']")));
		return new CasesPage();
	}
	@And("Click Accounts Tab")
	public AccountsPage clickAccountsTab() {
		WebElement el = getDriver().findElement(By.xpath("//span[@class='slds-truncate' and text()='Accounts']"));
		getJSExecutor().executeScript("arguments[0].click();",el);
		return new AccountsPage();
	}

}
