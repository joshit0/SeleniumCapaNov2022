package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage extends BasePage{
	
	public CheckoutOverviewPage(WebDriver driver) {
		super(driver);
	}
	
	
	By btnFinish = By.name("finish");
	
	public void clicBtnFinish() {
		clicElemento(btnFinish);
	}
}
