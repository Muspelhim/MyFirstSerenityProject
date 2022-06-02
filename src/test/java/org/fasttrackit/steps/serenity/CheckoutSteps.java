package org.fasttrackit.steps.serenity;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;

public class CheckoutSteps extends ScenarioSteps{
    private HomePage homePage;
    private ProductPage productPage;
    private CartPage cartPage;
    private LoginPage loginPage;
    private LoginSteps loginSteps;
    private SearchSteps searchSteps;
    private ProductSteps productSteps;
    private CheckoutPage checkoutPage;


    @Step
    private void goToCheckoutPage(){
     cartPage.doCheckout();
    }
    @Step
    public void doCheckout(){
        checkoutPage.doCheckout();
    }



}




