package org.fasttrackit.features.search;


import org.junit.Test;



public class SearchTest extends BaseTest{


    @Test
    public void searchProductTest(){
        loginSteps.doLogin("bustiucr@gmail.com","Faringosept1");
        searchSteps.search("necklace");
        searchSteps.verifyProductInResults("Silver Desert Necklace");
    }
}
