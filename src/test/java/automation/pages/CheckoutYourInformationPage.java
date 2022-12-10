package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutYourInformationPage extends BasePage{

	
	public CheckoutYourInformationPage(WebDriver driver) {
		super(driver);
	}
	
	By txtFirstName = By.id("first-name");
	By txtLastName = By.id("last-name");
	By txtPostalCode = By.id("postal-code");
	By btnContinue = By.name("continue");
	
	public void ingresarFirstName(String firstName) {
		sendKeysElemento(txtFirstName, firstName);
	}

	public void ingresarLastName(String lastName) {
		sendKeysElemento(txtLastName, lastName);
	}

	public void ingresarPostalCode(String postalCode) {
		sendKeysElemento(txtPostalCode, postalCode);
	}
	
	public void clicBtnContinue() {
		clicElemento(btnContinue);
	}
	


	
	
}
 	 		