package pageobjects;

import org.openqa.selenium.WebDriver;

public class BabyWishListPage {

    WebDriver driver;

    public BabyWishListPage(WebDriver driver){
        this.driver = driver;
    }
    public String getPageTitle(){

       return driver.getTitle();
    }
}
