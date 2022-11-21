package stepDef;


import base.Config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.index.qual.LessThan;
import pageObject.signup_page;

public class singup_stepdef extends Config {

    signup_page lp=new signup_page(driver);
    Faker faker = new Faker();

    @Given("i am at belk Homepage")
    public void iAmAtBelkTEKHomepage() {
        lp.verifyHomePageTitle();

    }

    @And("i click on errow")
    public void iclickocrrow() {
        lp.crrow();
    }

    @And("i click on manu bar")
    public void iclickonmanubar() {
        lp.menubar();
    }

    @And("i click on Create Account")
    public void iclickonCreateAccount() {
        lp.CreateAccount();
    }

    @And("i enter first Name")
    public void iEnterFirstName() {
        String fakeFirstName = faker.name().firstName().toLowerCase();
        lp.enterfistName(fakeFirstName);
    }

    @And("i  enter Last Name")
    public void enterLastName() {
        String fakelastname = faker.name().lastName().toLowerCase();
        lp.enterlastName(fakelastname);
    }

    @And("i enter phone Number")
    public void enterphonenumber() {
        //String FakePhoneNumber = faker.phoneNumber().cellPhone();
        //lp.enterPhoneNumber(FakePhoneNumber);
       // lp.enterPhoneNumber("3475534126");
    }

    @And("i enter email")
    public void enterEmail() {
        String firstname = faker.name().firstName().toLowerCase();
        String lastname = faker.name().lastName().toLowerCase();
        String domain = "@gmail.com";
        String email = firstname + lastname + domain;
        lp.enterEmail(email);
    }

    @And("i enter password")
    public void enterPassword() {
       // String fakepassword = faker.internet().password();
       // lp.enterPassword(fakepassword);
        // lp.enterConformPassword(fakepassword);
        lp.enterPassword("My123456");
    }

    @And("i enter conform password")
    public void enterconformPassword() {
        //String fakeconformpassword = faker.internet().password();
      // lp.enterConformPassword(fakeconformpassword);
        lp.enterConformPassword("My123456");
    }


    @When("i click on Create Account button")
    public void iClickOnCreateAccountButton(){
     lp.Account();
    }


    @Then("i should be able to login")
    public void iShouldBeAbleToLogin(){
     lp.verifyHomePageTitle();
    }
  // i enter emailAddress

    @And("i enter emailAddress")
    public void enterEmailAddress() {
        lp.enterEmailAddress("misbauddin1988@gmail.com");

    }

    @And("i enter invalid Email  Formet")
    public void iEnterInvalidEmailFormet() {
        lp.enterEmailAddress("misbauddingmail.com");
    }
}