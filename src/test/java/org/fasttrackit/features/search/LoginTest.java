package org.fasttrackit.features.search;
import org.junit.Test;


public class LoginTest extends BaseTest{


            @Test
    public void loginWithCredetianlsTest(){
                loginSteps.navigateToHomepage();
                loginSteps.navigateToLogin();
                loginSteps.setCredetials("bustiucr@gmail.com", "Faringosept1");
                loginSteps.clickLogin();
                loginSteps.verifyUsernameMessage("Razvan C Bustiuc");
            }

}
