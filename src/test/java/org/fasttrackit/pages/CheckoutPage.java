package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CheckoutPage extends PageObject {

    @FindBy(css = "#co-billing-form > div > ul > li:nth-child(3) > label")
    private WebElementFacade chooseSameAdress;
    @FindBy(css = "#billing-buttons-container > button")
    private WebElementFacade hitContinue;
    @FindBy(css = "#checkout-shipping-method-load > dl > dd:nth-child(2) > ul > li > label")
    private WebElementFacade chooseFreeShipping;
    @FindBy(css = "#shipping-method-buttons-container > button")
    private WebElementFacade nextContinue;
    @FindBy(css = " #payment-buttons-container > button")
    private WebElementFacade lastContinueButton;
    @FindBy(css = "#review-buttons-container > button")
    private WebElementFacade reviewOrder;




    public void chooseSameAdress(){
        chooseSameAdress.click();

    }
    public void hitContinueButton(){
        hitContinue.click();
    }
    public void hitChooseFreeShipping(){
        chooseFreeShipping.click();
    }
    public void hitNextContinue(){
        nextContinue.click();
    }
    public void hitLastContinueButton(){
        lastContinueButton.click();
    }
    public void hitPlaceOrder(){
        reviewOrder.click();
    }





    public void enterDetails(){
        chooseSameAdress();
        hitContinueButton();
        hitChooseFreeShipping();
        hitNextContinue();
        hitLastContinueButton();
        hitPlaceOrder();



    }



}


