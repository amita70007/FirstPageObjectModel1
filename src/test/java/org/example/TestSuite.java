package org.example;

import org.testng.annotations.Test;
import java.io.IOException;

public class TestSuite extends BaseTest {
    HomePage homepage = new HomePage();
    RegisterPage register = new RegisterPage();
    ProductSearch product = new ProductSearch();
    Currency currency = new Currency();
    AddToCart element = new AddToCart();
    NewOnlineStore onlineStore = new NewOnlineStore();
    PopUpCheck popup = new PopUpCheck();
    FacebookLogin facebook = new FacebookLogin();

    public TestSuite() throws IOException {    }

    @Test
    public void user_should_be_able_to_register_successfully() throws InterruptedException, IOException {
        homepage.clickOnRegisterButton();
        register.fillRegistrationForm();
        register.registrationSuccessfull();
    }

    @Test
    public void user_should_be_able_to_Search_Prodct_successfully() throws InterruptedException {
        product.productName();
        product.productVerify();
    }

    @Test
    public void user_should_be_able_to_Change_Currency() throws IOException {
        //verifying currency symbol
        currency.verifyCurrencySymbolFromEachPrice();
        //click on currency field
        currency.clickOnCurrencyField();
        //verifying currency symbol
        currency.verifyCurrencySymbolFromEachPrice();
    }

    @Test
    public void verify_addCartButton_present_in_all_product() throws InterruptedException {
        element.clickOnSoftware();
        element.verifyAddToCartButtonPresent();
    }

    @Test
    public void verify_Add_Comment () throws InterruptedException, IOException {
        onlineStore.enterComment();
        onlineStore.commentSuccess();
        onlineStore.verifyAddedComment();
    }
    @Test
    public void to_verify_alert_should_have_this_text()
    {
        popup.popUpVerify();
    }

    @Test
    public void verify_facebook_login_button () throws InterruptedException {
        facebook.facebookLoginButtonVerify();

    }
}
