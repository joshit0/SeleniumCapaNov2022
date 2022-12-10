package automation.runners;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
		features = {"src/test/resources/features"}, 
		glue = {"automation.stepDefinitions"},
		tags = "@Login",
		plugin = {"json:target/cucumber-reports/CucumberTestReport.json", 
				"html:target/cucumber.html"}
	)
public class TestRunner extends AbstractTestNGCucumberTests{

	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		String rutaDriver = "src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", rutaDriver);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	
	
	
	
}
