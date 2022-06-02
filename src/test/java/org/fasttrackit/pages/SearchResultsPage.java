package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".products-grid.odd")
    private List<WebElementFacade> productsList;

    public boolean checkListForProduct(String productName) {
        for (WebElementFacade element : productsList) {
            if (element.findElement(By.cssSelector("h2.product-name")).getText().equalsIgnoreCase(productName)) ;
            return true;

        }
        return false;
    }

    public void selectProductFromList(String product) {
            for (WebElementFacade element : productsList) {
                if (element.findElement(By.cssSelector("h2.product-name")).getText().equalsIgnoreCase(product));
//                clickOn(element);
                element.findElement(By.cssSelector("#product-collection-image-553")).click();
                break;

            }
        }
    }



