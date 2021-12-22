package selenium.cucumber.RunnerClass;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.CucumberOptions;
import selenium.cucumber.BaseClass.BaseClass;

@CucumberOptions(features = "src/main/java/selenium/cucumber/Feature/S012",
				glue = "selenium.cucumber.Pages",
				tags = "@Functional or not @Smoke")
public class RunnerforChrome extends BaseClass {
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
	

}
