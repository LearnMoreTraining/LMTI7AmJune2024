package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.TestContext;

import java.io.IOException;

public class AmazonHomePageSteps {

    TestContext context;

    public AmazonHomePageSteps(TestContext context){
        //constructor call
        this.context = context;
    }

    @Given("user clicks the baby wishlist from accounts & Lists")
    public void clickBabyWishList() throws IOException {
        context.pageObjectManager.getHomePage().enterProductName("login",0,0);
        context.pageObjectManager.getHomePage().clickBabyWish();

    }

    @Then("user verify the navigation")
    public void userVerifyTheNavigation() {

        String actualTitle =context.pageObjectManager.getBabyWishListPage().getPageTitle();
        Assert.assertEquals("abc",actualTitle);


    }


}
