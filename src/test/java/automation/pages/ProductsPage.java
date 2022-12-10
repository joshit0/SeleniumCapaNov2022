package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{

	
	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	
	By btnAddSouceLabBackPack = By.id("add-to-cart-sauce-labs-backpack");
	By btnIrCarrito = By.className("shopping_cart_link");
	
	
	public void clickBtnAddSouceLabBackPack() {
		clicElemento(btnAddSouceLabBackPack);
	}
	
	public void clickBtnCarrito() {
		clicElemento(btnIrCarrito);
	}
	
		
}
