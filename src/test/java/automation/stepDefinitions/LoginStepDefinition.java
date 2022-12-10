package automation.stepDefinitions;

import automation.pages.LoginPage;
import automation.pages.ProductsPage;
import automation.runners.TestRunner;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class LoginStepDefinition extends TestRunner{

	@Dado("abro la pagina de SauceDemo")
	public void abro_la_pagina_de_sauce_demo() {
		LoginPage login = new LoginPage(driver);
		login.AbrirSouceDemo();
	}

	@Cuando("ingreso usuario {string}")
	public void ingreso_usuario(String usuario) {
		LoginPage login = new LoginPage(driver);
		login.ingresarUsuario(usuario);
	}

	@Cuando("ingreso password {string}")
	public void ingreso_password(String password) {
		LoginPage login = new LoginPage(driver);
		login.ingresarPassword(password);
	}

	@Cuando("doy clic al boton login")
	public void doy_clic_al_boton_login() {
		LoginPage login = new LoginPage(driver);
		login.clickBtnLogin();
	}

	@Entonces("muestra la pantalla productos")
	public void muestra_la_pantalla_productos() {

	}

}
