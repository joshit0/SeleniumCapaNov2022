package automation.hooks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.apache.commons.io.FileUtils;

public class TestHooks {

	public WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		String url = "https://www.saucedemo.com/";
		String rutaDriver = "src/test/resources/drivers/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", rutaDriver);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@BeforeTest
	public void eliminarEvidenciaPrevia() throws IOException {
		File carpetaEvidencia = new File("D:\\jose\\automation\\evidencias\\");
		FileUtils.cleanDirectory(carpetaEvidencia);
	}
	
	
	@AfterTest
	public void quit() {
		//driver.quit();
	}

	
}
