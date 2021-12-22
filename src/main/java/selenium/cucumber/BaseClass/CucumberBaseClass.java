package selenium.cucumber.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CucumberBaseClass extends DriverFactory {
	
	public static WebDriver browserInstance;
	public static WebDriverWait wait;
	public static JavascriptExecutor js;
	public static Properties prop;
	public static FileInputStream fis;
}