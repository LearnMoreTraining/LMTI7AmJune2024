package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.TestContext;

public class WikiSteps {

    TestContext context;

    public WikiSteps(TestContext context){
        this.context = context;
    }

    @Given("user extracts the column one value")
    public void columnOne(){


    }

    @When("user extracts the column two value")
    public void userExtractsTheColumnTwoValue() {

        boolean flag = false;
        for(String k:context.pageObjectManager.getWikiPage().getColumnOneValues()){

            if(k.equals("Headquarters")){
                flag = true;
                break;
            }
        }

        Assert.assertTrue(flag);
    }

    @Then("validates the mapping")
    public void validatesTheMapping() {


        Assert.assertEquals("Company type",context.pageObjectManager.getWikiPage().getColumnOneValues().get(2));
        Assert.assertEquals("Public",context.pageObjectManager.getWikiPage().getColumnTwoValues().get(2));
    }


    @Then("user validates the key and value pair relation of share holders and shareholdings")
    public void userValidatesTheKeyAndValuePairRelationOfShareHoldersAndShareholdings() {

        System.out.println(context.pageObjectManager.getWikiPage().getShareHoldingAndStakeHoldersValues().get("Others"));
        Assert.assertEquals(" 0.32%",context.pageObjectManager.getWikiPage().getShareHoldingAndStakeHoldersValues().get("Others"));

    }
}
