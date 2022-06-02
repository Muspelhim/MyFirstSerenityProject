package org.fasttrackit.features.search;

import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void checkoutTest(){
        loginSteps.doLogin("bustiucr@gmail.com" , "Faringosept1");
        searchSteps.search("necklace");
        productSteps.selectProductFromList("Silver Desert Necklace");
        cartSteps.clickAddToCart();
        cartSteps.verifySuccessMessage("Silver Desert Necklace");

    }
}
