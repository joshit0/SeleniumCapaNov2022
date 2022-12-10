package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends BasePage{
	public CheckoutCompletePage(WebDriver driver) {
		super(driver);
	}
	
	By backToHome = By.id("back-to-products");
	By lblResultado = By.xpath("//h2[@class='complete-header']");
	
	public void clicBackToHome() {
		clicElemento(backToHome);
	}
	
	public String obtenerTextoResultado() {
		return getTextElemento(lblResultado); //"THANK YOU FOR YOUR ORDER"
	}
	
	
}
