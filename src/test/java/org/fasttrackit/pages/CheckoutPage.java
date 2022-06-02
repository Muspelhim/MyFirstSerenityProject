package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CheckoutPage extends PageObject {

    @FindBy(css = "#billing\\:firstname")
    private WebElementFacade insertFirstName;
    @FindBy(css = "#billing\\:middlename")
    private WebElementFacade insertMiddleName;
    @FindBy(css = "#billing\\:lastname")
    private WebElementFacade insertLastName;
    @FindBy(css = "#billing\\:company")
    private WebElementFacade insertCompany;
    @FindBy(css = "#billing\\:street1")
    private WebElementFacade insertAdress;
    @FindBy(css = "#billing\\:street2")
    private WebElementFacade insertStreet;
    @FindBy(css = "#billing\\:city")
    private WebElementFacade insertCity;
    @FindBy(css = "#billing\\:region_id")
    private WebElementFacade insertRegion;
    @FindBy(css = "#billing\\:postcode")
    private WebElementFacade insertPostcode;
    @FindBy(css = "#billing\\:country_id")
    private WebElementFacade insertCountry;
    @FindBy(css = "#billing\\:telephone")
    private WebElementFacade insertTelephone;
    @FindBy(css = "#billing\\:fax")
    private WebElementFacade insertFax;
    @FindBy(css = "#co-billing-form > div > ul > li:nth-child(2) > label")
    private WebElementFacade chooseShipping;
    @FindBy(css = "#billing-buttons-container > button")
    private WebElementFacade pressContinue;

    private void addFirstName(String name){
       typeInto(insertFirstName, name);

    }
    private void addMidleName(String middleName){
        typeInto(insertMiddleName, middleName);
    }

    private void addLastName(String lastName){
        typeInto(insertLastName, lastName);
    }

    private void addCompany(String company){
        typeInto(insertCompany, company);
    }

    private void addAdress(String adress){
        typeInto(insertAdress, adress);
    }

    private void addStreet(String streetName){
        typeInto(insertStreet , streetName);
    }

    private void addCity(String cityName){
        typeInto(insertCity , cityName);
    }

    private void selectRegion(String regionName){
        selectFromDropdown(insertRegion, regionName);
    }

    private void insertZipCode(String zipcode){
        typeInto(insertPostcode,zipcode);
    }

    private void insertTelephone(String telephoneNumber){
        typeInto(insertTelephone, telephoneNumber);
    }

    private void insertFax(String faxNumber){
        typeInto(insertFax, faxNumber);
    }

    private void chooseShipping(){
        chooseShipping.click();
    }

    private void clickContinue(){
        pressContinue.click();
    }

    public void doCheckout(){
        addFirstName("Razvan");
        addMidleName("C");
        addLastName("Bustiuc");
        addCompany("company");
        addAdress("Ciurea");
        addStreet("Linistei");
        addCity("Iasi");
        selectRegion("Arizona");
        insertZipCode("707080");
        insertTelephone("telephoneNumber");
        insertFax("faxNumber");
        chooseShipping();
        clickContinue();

    }



}


