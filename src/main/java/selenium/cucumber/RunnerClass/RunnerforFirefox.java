package selenium.cucumber.RunnerClass;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.CucumberOptions;
import selenium.cucumber.BaseClass.BaseClass;

@CucumberOptions(features = "/src/main/java/selenium/cucumber/Feature/FF/S012",
				glue = "selenium.cucumber.Pages",
				tags = "@Functional and not @SIT")
public class RunnerforFirefox extends BaseClass {
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
	

}
