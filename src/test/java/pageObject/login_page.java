package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class login_page extends Config {

    public login_page(WebDriver driver){
        PageFactory.initElements(driver, this);
        Config.driver = driver;}


    @FindBy(how = How.XPATH, using = "//div[@class='unregistered']//sh-button[1]/button[1]")
    public WebElement loginLoc;

    @FindBy(how = How.CSS, using = "input[id='login-username']")
    public WebElement loginEmailLoc;

    public void LoginEmail(String Email){
        loginEmailLoc.sendKeys(Email);
    }

    public void login(){
        loginLoc.click();
        String act = driver.getTitle();
        String exp = "Access to this page has been denied.";
        Assert.assertEquals(exp, act);
        System.out.println("I am in human Verify Page ");
    }
}
