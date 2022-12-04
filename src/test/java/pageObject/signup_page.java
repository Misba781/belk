package pageObject;

import base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class signup_page extends Config {


    public signup_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[@id='bx-element-1418784-2SqTJKP']/button")
    public WebElement crrowloc;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/header/div[2]/div/div[2]/div/div[2]/sh-nav-item[2]/div/div[1]/a")
    public WebElement menubarLoc;

    @FindBy(how = How.XPATH, using = "//div[@class='unregistered']//sh-button[2]/button")
    public WebElement CreateAccountloc;
    @FindBy(how = How.XPATH, using = "//input[@name='dwfrm_profile_customer_firstname']")
    public WebElement FirstNameLo;


    @FindBy(how = How.XPATH, using = "//input[@id='dwfrm_profile_customer_lastname']")
    public WebElement LastNameLo;

    @FindBy(how = How.XPATH, using = "//input[@id='dwfrm_profile_customer_phone']")
    public WebElement PhoneNumberLoc;

    @FindBy(how = How.XPATH, using = "//input[@name='dwfrm_profile_customer_email']")
    public WebElement emailLoc;

    @FindBy(how = How.ID, using = "reg-pwd-inp")
    public WebElement passwordLoc;

    @FindBy(how = How.XPATH, using = "//input[@class='input-text has-icon password required confirmpassword required floating__input']")
    public WebElement conformPasswordLoc;

    @FindBy(how = How.XPATH, using = "//sh-button[@type='submit']")
    public WebElement AccountLoc;
    // button[name='dwfrm_profile_confirm']

    @FindBy(how = How.CLASS_NAME, using = "account-welcome")
    public WebElement sucssFullyLoc;


    @FindBy(how = How.XPATH, using = "//fieldset[@class='account-login-info']//div[3]/span[1]")
    public WebElement verifyEmailErowLoc;


    @FindBy(how = How.XPATH, using = "//div[contains(@aria-label,'Press & Hold')]/div/p")
    public WebElement HummanLoc;

    public void verifyHomePageTitle() {
        String act = driver.getTitle();
        String exp = "Belk.com - Belk® - Official Site";
        Assert.assertEquals(exp, act);
        System.out.println("Verify I am in login page is success");
    }

    public void crrow() {
        crrowloc.click();
    }

    public void menubar() {
        menubarLoc.click();
    }

    public void CreateAccount() {
        CreateAccountloc.click();
    }

    public void enterfistName(String FirstName) {
        FirstNameLo.sendKeys(FirstName);
    }

    public void enterlastName(String LastName) {
        LastNameLo.sendKeys(LastName);
    }

    public void enterPhoneNumber(String phoneNumber) {
        PhoneNumberLoc.sendKeys(phoneNumber);
    }

    public void enterEmail(String email) {
        emailLoc.sendKeys(email);

    }

    public void enterPassword(String password) {
        passwordLoc.sendKeys(password);
        ;
    }

    public void enterConformPassword(String conformpassword) {
        conformPasswordLoc.sendKeys(conformpassword);
    }

    public void Account() {
        AccountLoc.click();

    }

    //  clickAccountLoc
    public void sussfullAccount() {

        String exp = "account-welcome";
        String act = sucssFullyLoc.getText();
        Assert.assertEquals(act, exp);

    }

    public void enterEmailAddress(String email) {
        emailLoc.sendKeys(email);
        String exp = "Please re‑enter your email address using the correct format (ex: name@email.com).";
        String act = verifyEmailErowLoc.getText();
        Assert.assertEquals(act, exp);
        System.out.println("Verify Error for invalid email Format ");

    }

    public void confirmarehuman() {

        try {
            driver.switchTo().frame(0);
            driver.switchTo().frame(0);
            Robot robot = new Robot();
            Actions act =new Actions(driver);

            WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(30));
             wait.until(ExpectedConditions.elementToBeClickable(HummanLoc));
            act.moveToElement(HummanLoc).perform();
            // Simulate a mouse click
            robot.mousePress(InputEvent.BUTTON1_MASK);
            wait.until(ExpectedConditions.invisibilityOf(HummanLoc));
            Thread.sleep(15000);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);

            // Simulate a key press
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);

        } catch (AWTException HummanLoc) {
            HummanLoc.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



    }