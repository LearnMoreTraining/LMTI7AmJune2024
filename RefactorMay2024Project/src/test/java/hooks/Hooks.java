package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.TestContext;

import java.io.IOException;

public class Hooks {

    TestContext testContext;
    public Hooks(TestContext testContext){
        this.testContext = testContext;
    }

    @After()
    public void closeBrowser(){
        testContext.webDriverManager.getDriverDetails().quit();
    }

    @AfterStep()
    public void captureSceenshot(Scenario scenario)
    {
        TakesScreenshot takesScreenshot = (TakesScreenshot)testContext.webDriverManager.getDriverDetails();
      byte[] byteData =  takesScreenshot.getScreenshotAs(OutputType.BYTES);
        scenario.attach(byteData,"image/png",scenario.getName());

    }
}
