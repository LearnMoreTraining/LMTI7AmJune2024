package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.TestContext;

public class AmazonHomePageSteps {

    TestContext context;

    public AmazonHomePageSteps(TestContext context){
        //constructor call
        this.context = context;
    }

    @Given("user clicks the baby wishlist from accounts & Lists")
    public void clickBabyWishList(){

        context.pageObjectManager.getHomePage().clickBabyWish();

    }

    @Then("user verify the navigation")
    public void userVerifyTheNavigation() {

        String actualTitle =context.pageObjectManager.getBabyWishListPage().getPageTitle();
        Assert.assertEquals("abc",actualTitle);


    }


}
