package utils;

import org.openqa.selenium.WebDriver;
import pageobjects.*;

public class PageObjectManager {

    public BabyWishListPage babyWishListPage;
    public HomePage homePage;
    public WebDriver driver; //null
    public LearnMoreAlertPage learnMoreAlertPage;
    public LearnMoreExplicitPage learnMoreExplicitPage;
    public  WikiPage wikiPage;
    public PageObjectManager(WebDriver driver){
        this.driver = driver; //k
    }

    public BabyWishListPage getBabyWishListPage(){
        babyWishListPage = new BabyWishListPage(driver);
        return babyWishListPage;
    }

    public HomePage getHomePage(){
      homePage = new HomePage(driver);
      return homePage;
    }

    public LearnMoreAlertPage getLearnMoreAlertPage(){
        learnMoreAlertPage = new LearnMoreAlertPage(driver);
        return learnMoreAlertPage;
    }

    public LearnMoreExplicitPage getLearnMoreExplicitPage(){

      learnMoreExplicitPage = new LearnMoreExplicitPage(driver);
      return learnMoreExplicitPage;
    }

    public WikiPage getWikiPage(){
        wikiPage = new WikiPage(driver);
        return wikiPage;
    }

    public LearnMoreLoginPage getLearnMoreLoginPage(){
        LearnMoreLoginPage learnMoreLoginPage = new LearnMoreLoginPage(driver);
        return learnMoreLoginPage;
    }

}
