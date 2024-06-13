package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ReadDataFromExcel;

import java.io.IOException;

public class BabyWishListPage {

    WebDriver driver;

    public BabyWishListPage(WebDriver driver){
        this.driver = driver;
    }
    public String getPageTitle(){

       return driver.getTitle();
    }




}
