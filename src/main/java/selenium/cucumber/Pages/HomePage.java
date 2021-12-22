package selenium.cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.And;
import selenium.cucumber.BaseClass.CucumberBaseClass;

public class HomePage extends CucumberBaseClass {
	
	@And("Click ToggleMenu")
	public HomePage clickToggleMenu() throws InterruptedException {
		getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='slds-icon-waffle']")));
		Thread.sleep(1000);
		getDriver().findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
		
	}
	@And("Click ViewAll Button")
	public HomePage clickViewAll() {
		getJSExecutor().executeScript("arguments[0].scrollIntoView();",getDriver().findElement(By.xpath("//button[text()='View All']")));
		getDriver().findElement(By.xpath("//button[text()='View All']")).click();
		return this;
	}
	@And("Enter Search Key")
	public HomePage enterSearchKey() {
		getDriver().findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
		return this;
	}
	@And("Click Sales")
	public SalesPage clickSales() {
		getDriver().findElement(By.xpath("//div[@class='slds-truncate']//p[contains(text(),'Manage your sales')]")).click();
		return new SalesPage();
	}
	

}
