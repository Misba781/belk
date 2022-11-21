package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.login_page;

public class login_stepdef extends Config {
    login_page lp = new login_page(driver);


    @And("i click on Sign In")
    public void signIn(){
        lp.login();
    }


    @And("i verify you are a human")
    public void iVerifyYouAreAHuman() {
    lp.humanVerify();
    }
}
