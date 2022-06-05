package org.fasttrackit.steps.serenity;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;

public class CheckoutSteps extends ScenarioSteps{

    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private LoginPage loginPage;


   @Step
    public void billingDetails(){
        checkoutPage.enterDetails();
   }



   }








