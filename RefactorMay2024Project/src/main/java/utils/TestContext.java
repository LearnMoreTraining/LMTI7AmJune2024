package utils;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContext {


    public WebDriverManager webDriverManager;
    public PageObjectManager pageObjectManager;

    public TestContext() throws IOException {
        //call constr
        webDriverManager = new WebDriverManager(); //instantiate
        pageObjectManager = new PageObjectManager(webDriverManager.getDriverDetails());
    }
}
