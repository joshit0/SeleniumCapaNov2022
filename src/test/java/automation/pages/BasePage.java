package automation.pages;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import automation.hooks.TestHooks;

public class BasePage{

	WebDriver driver;
	
	BasePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void sendKeysElemento(By byElement, String texto) {
		driver.findElement(byElement).clear();
		driver.findElement(byElement).sendKeys(texto);
	}
	
	public void clicElemento(By byElement) {
		driver.findElement(byElement).click();
	}
	
	public void capturarEvidencia() throws Exception {
								
		String fileWithPath = "D:\\jose\\automation\\evidencias\\" + generateUniqueFileName() + ".jpg";
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}

	private String generateUniqueFileName() {
		String filename = "";
		long millis = System.currentTimeMillis();
		String datetime = new Date().toGMTString();
		datetime = datetime.replace(" ", "");
		datetime = datetime.replace(":", "");
		filename = "IMG_" + datetime + "_" + millis;
		return filename;
	}
	
	
	public String getTextElemento(By byElement) {
		return driver.findElement(byElement).getText();
	}
	
	public void abrirUrl(String url) {
		driver.get(url);
	}
	
}
