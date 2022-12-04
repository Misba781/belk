package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class order_pageObject extends Config {
    public order_pageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
        Config.driver = driver;}


    @FindBy(how = How.XPATH, using ="/html/body/div[3]/header/div[3]/belk-search/div/div[1]/input")
    public WebElement SearcLoc;

    @FindBy(how = How.XPATH, using ="/html/body/div[3]/header/div[3]/belk-search/div/div[1]/input")
    public WebElement SnakerLoc;

    @FindBy(how = How.XPATH, using = "//div[@class='quaternary pad-x-little desktop-off']//div[1]/div[1]/button")
    public WebElement searchButtonLoc;

    public void Searc(){
        SearcLoc.click();
    }
    public void sneakersSearch(String Sneakers){
     SnakerLoc.sendKeys(Sneakers);
    }
    public void SearchButton(){
        searchButtonLoc.click();
    }
}
