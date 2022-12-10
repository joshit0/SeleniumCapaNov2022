package automation.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import automation.hooks.TestHooks;
import automation.pages.CartPage;
import automation.pages.CheckoutCompletePage;
import automation.pages.CheckoutOverviewPage;
import automation.pages.CheckoutYourInformationPage;
import automation.pages.LoginPage;
import automation.pages.ProductsPage;

public class SauceDemoTest extends TestHooks {

	@Test
	public void test01() throws Exception {
		LoginPage login = new LoginPage(driver);
		login.ingresarUsuario("standard_user");
		login.ingresarPassword("secret_sauce");
		login.capturarEvidencia();
		login.clickBtnLogin();
		
		ProductsPage products = new ProductsPage(driver);
		products.clickBtnAddSouceLabBackPack();
		products.capturarEvidencia();
		products.clickBtnCarrito();
		
		CartPage cart = new CartPage(driver);
		cart.capturarEvidencia();
		cart.clickBtnCheckout();

		CheckoutYourInformationPage checkoutYourInformation = new CheckoutYourInformationPage(driver);
		checkoutYourInformation.ingresarFirstName("José");
		checkoutYourInformation.ingresarLastName("Quispe");
		checkoutYourInformation.ingresarPostalCode("LIMA15");
		checkoutYourInformation.capturarEvidencia();
		checkoutYourInformation.clicBtnContinue();

		CheckoutOverviewPage checkoutOverview = new CheckoutOverviewPage(driver);
		checkoutOverview.capturarEvidencia();
		checkoutOverview.clicBtnFinish();
		
		CheckoutCompletePage checkoutcomplete = new CheckoutCompletePage(driver);
		checkoutcomplete.capturarEvidencia();
		String resultadoObtenido = checkoutcomplete.obtenerTextoResultado();
		
		assertTrue(resultadoObtenido.equals("GRACIAS"),"El mensaje final es incorrecto");
		
		int monto1 = 10;
		int monto2 = 20;
		
		assertTrue(monto1==monto2,"Los montos no coinciden");
		
		boolean cuentaCreada = true;
		assertTrue(cuentaCreada,"La cuenta no se creó correctamente, porfavor revisar");
		
		//checkoutcomplete.clicBackToHome();
	}
}
