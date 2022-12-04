package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import pageObject.order_pageObject;



public class order_stepdef extends Config {
    order_pageObject mk =new order_pageObject(driver);
    @And("i search on sneaker")
    public void iSearchOnSneaker() {
    mk.sneakersSearch("Sneakers");

    }

    @And("i search on search button")
    public void iSearchOnSearchButton() {
        mk.SearchButton();
    }

    @And("i click on search")
    public void iClickOnSearch() {
     mk.Searc();
    }
}
