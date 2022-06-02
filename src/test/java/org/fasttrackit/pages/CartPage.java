package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CartPage extends PageObject {

    @FindBy(css = ".success-msg span")
    private WebElementFacade successMessage;
    @FindBy(css = "body > div > div.page > div.main-container.col1-layout > div > div > div.cart.display-single-price > div.page-title.title-buttons > ul > li > button")
    private WebElementFacade proceedToCheckout;

    public void verifySuccessMessage(String productName){
        successMessage.shouldContainOnlyText(productName +" was added to your shopping cart.");

    }

    public void doCheckout(){
        proceedToCheckout.click();
    }
}
