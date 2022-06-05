package org.fasttrackit.features.search;

import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.steps.serenity.CheckoutSteps;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void checkoutTest(){
        loginSteps.doLogin("bustiucr@gmail.com" , "Faringosept1");
        searchSteps.search("necklace");
        productSteps.selectProductFromList("Silver Desert Necklace");
        cartSteps.clickAddToCart();
        cartSteps.verifySuccessMessage("Silver Desert Necklace");
        cartSteps.proceedToCheckout();
        checkoutSteps.billingDetails();









    }
}
