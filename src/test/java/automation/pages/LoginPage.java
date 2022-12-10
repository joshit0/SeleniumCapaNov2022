package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//Mapeo de elementos
	By txtUsuario = By.id("user-name");
	By txtPassword = By.name("password");
	By btnLogin  = By.xpath("//input[@data-test='login-button']");
	
	public void AbrirSouceDemo() {
		abrirUrl("https://www.saucedemo.com/");
	}
	
	//Acciones
	public void ingresarUsuario(String usuario) {
		sendKeysElemento(txtUsuario, usuario);
	}
	
	public void ingresarPassword(String password) {
		sendKeysElemento(txtPassword, password);
	}
	
	public void clickBtnLogin() {
		clicElemento(btnLogin);
	}

}
