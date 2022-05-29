package org.fasttrackit.features.search;

import org.junit.Test;

public class CartTest extends BaseTest{

@Test
    public void addProductToCart(){
   loginSteps.doLogin("bustiucr@gmail.com" , "Faringosept1");
   searchSteps.search("necklace");
   productSteps.selectProductFromList("Silver Desert Necklace");
   cartSteps.clickAddToCart();
   cartSteps.verifySuccessMessage("Silver Desert Necklace");
   }
}
