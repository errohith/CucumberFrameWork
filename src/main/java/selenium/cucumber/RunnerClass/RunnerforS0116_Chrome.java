package selenium.cucumber.RunnerClass;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.CucumberOptions;
import selenium.cucumber.BaseClass.BaseClass;

@CucumberOptions(features = "/src/main/java/selenium/cucumber/Feature/S0116",
				glue = "selenium.cucumber.Pages")
public class RunnerforS0116_Chrome extends BaseClass {
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
	

}
