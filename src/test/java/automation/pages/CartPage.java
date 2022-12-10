package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	By btnCheckout = By.id("checkout");
	
	
	public void clickBtnCheckout() {
		clicElemento(btnCheckout);
	}
	
}
